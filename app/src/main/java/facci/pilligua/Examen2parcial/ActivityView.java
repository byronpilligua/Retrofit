package facci.pilligua.Examen2parcial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityView extends AppCompatActivity {

        TextView idView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            idView = findViewById(R.id.idView);

            String id = getIntent().getStringExtra("_id");

            idView.setText("Hola  ID # " + id);
        }
    }