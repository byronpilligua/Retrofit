package facci.pilligua.Examen2parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import facci.pilligua.Examen2parcial.adapter.AdapterTest;
import facci.pilligua.Examen2parcial.adapter.TestAdapter;
import facci.pilligua.Examen2parcial.models.ModelTest;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    TestAdapter testAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_person);
        listUser();
    }

    public void listUser(){
        AdapterTest adapterTest = new AdapterTest();
        Call<List<ModelTest>> call = adapterTest.getData();
        call.enqueue(new Callback<List<ModelTest>>() {
            @Override
            public void onResponse(Call<List<ModelTest>> call, Response<List<ModelTest>> response) {
                List<ModelTest> list = response.body();
                for(ModelTest modelTest : list){
                    modelTest.getId();
                }
                testAdapter = new TestAdapter(MainActivity.this, list);
                listView.setAdapter(testAdapter);
            }

            @Override
            public void onFailure(Call<List<ModelTest>> call, Throwable t) {
                Log.e("ERROR", "Error xd");
                Toast.makeText(MainActivity.this, "Fail app", Toast.LENGTH_SHORT).show();
            }
        });
    }
}