package com.example.reese.a0c2021app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ReporCarbonoNeutralidad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repor_carbono_neutralidad);

        ArrayAdapter<String> myAdapter= new
                ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.CarbonoNeutralidad));

        Spinner listaAdaptador =
                (Spinner) findViewById(R.id.spinnerCarbonoNeu);
        listaAdaptador.setAdapter((myAdapter));

    }
}
