package com.example.luis.pruebasrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by luis on 14/11/2017.
 */

public class MiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    TextView tv_nombre;
    TextView tv_apellido;
    TextView tv_telefono;
    Button btn_llamar;
    public MiViewHolder(View itemView) {//La vista que recibe es el del layout creado para mostrar contactos
        super(itemView);
        tv_nombre= itemView.findViewById(R.id.tv_nombre);
        tv_apellido= itemView.findViewById(R.id.tv_apellido);
        tv_telefono= itemView.findViewById(R.id.tv_telefono);
        btn_llamar=itemView.findViewById(R.id.btn_llamar);
        btn_llamar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Log.v("DESDE MiViewHolder:",String.valueOf(getAdapterPosition()));
    }
}
