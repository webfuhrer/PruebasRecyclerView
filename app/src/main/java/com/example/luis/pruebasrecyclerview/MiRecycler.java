package com.example.luis.pruebasrecyclerview;

import android.support.v7.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by luis on 14/11/2017.
 */

public class MiRecycler extends RecyclerView.Adapter<MiViewHolder> {
    private List<Contacto> contactos;
    private View.OnClickListener oyente;

    @Override
    public MiViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.layout_contactos, parent, false);

        // set the view's size, margins, paddings and layout parameters

        MiViewHolder vh = new MiViewHolder(v);//Le paso la vista
        return vh;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.tv_nombre.setText(contactos.get(position).getNombre());
        holder.tv_apellido.setText(contactos.get(position).getApellido());
        holder.tv_telefono.setText(contactos.get(position).getTelefono());
        //holder.btn_llamar.setOnClickListener(oyente);
    }

    public MiRecycler(List<Contacto> contactos, View.OnClickListener oyente) {
        this.contactos=contactos;
        this.oyente=oyente;
    }



    @Override
    public int getItemCount() {
        return contactos.size();
    }
}
