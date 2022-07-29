package facci.pilligua.Examen2parcial.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import facci.pilligua.Examen2parcial.ActivityView;
import facci.pilligua.Examen2parcial.R;
import facci.pilligua.Examen2parcial.models.ModelTest;

public class TestAdapter extends BaseAdapter {

    private Context context;
    private List<ModelTest> list;

    public TestAdapter(Context context, List<ModelTest> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {return list.size();}

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        if(convertView == null){
            convertView = View.inflate(context,  R.layout.list_person, null);
        }

        TextView id = convertView.findViewById(R.id.txtId);
        TextView nom1 = convertView.findViewById(R.id.txtName);
        TextView ape = convertView.findViewById(R.id.txtApe);
        TextView com = convertView.findViewById(R.id.txtCompleto);
        TextView tit = convertView.findViewById(R.id.txtTitulo);
        TextView fam = convertView.findViewById(R.id.txtFami);
        ImageView img = convertView.findViewById(R.id.image);
        Button btnView = convertView.findViewById(R.id.btnView);

        ModelTest modelTest = list.get(position);

        Glide.with(context).load(modelTest.getImg()).into(img);
        id.setText(modelTest.getId());
        nom1.setText(modelTest.getNom1());
        ape.setText(modelTest.getApe());
        com.setText(modelTest.getCom());
        tit.setText(modelTest.getTit());
        fam.setText(modelTest.getFam());
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(context, ActivityView.class).putExtra("_id" , modelTest.getId()));
            }

        });

        return convertView;
    }
}