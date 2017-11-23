package com.example.luis.pruebasrecyclerview;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List lista=new ArrayList();
        setContentView(R.layout.activity_main);
        RecyclerView rec=(RecyclerView)findViewById(R.id.recycler);
        Contacto c1=new Contacto("Ana", "Perez","955657878");
        Contacto c2=new Contacto("Jose", "Gil","55445787");
        Contacto c3=new Contacto("Rosa", "Sanchez","955657878");
        lista.add(c1);
        lista.add(c3);
        lista.add(c2);
        rec.setLayoutManager(new LinearLayoutManager(this));
        View.OnClickListener oyente=new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
        rec.setAdapter(new MiRecycler(lista, oyente));

    }
}
