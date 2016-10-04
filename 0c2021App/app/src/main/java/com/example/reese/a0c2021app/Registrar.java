package com.example.reese.a0c2021app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Registrar extends AppCompatActivity {

    String nombre;
    String apellido;
    String genero;
    String rol;
    int edad;
    int cedula;
    String correo;
    String telefono;
    String provincia;
    String canton;
    String distrito;
    String detalle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        ArrayAdapter<String> myAdapterGenero= new
                ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.listaGenero));

        Spinner listaAdaptadorGenero =
                (Spinner) findViewById(R.id.spinnerGeneroR);
        listaAdaptadorGenero.setAdapter((myAdapterGenero));

        ArrayAdapter<String> myAdapterRol= new
                ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.listaUser));

        Spinner listaAdaptadorRol =
                (Spinner) findViewById(R.id.spinnerRolR);
        listaAdaptadorRol.setAdapter((myAdapterRol));
    }
}
