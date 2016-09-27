package com.example.reese.a0c2021app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Juez extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juez);

        Button btnConsulDenun = (Button) findViewById(R.id.btnConsulDenunJuez);
        btnConsulDenun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Juez.this, ConsulDenuncia.class);
                startActivity(intent);
            }
        });

        Button btnConfirSolu = (Button) findViewById(R.id.btnConfirSolucionJuez);
        btnConfirSolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Juez.this, JuezConfirmarDenuncia.class);
                startActivity(intent);
            }
        });

    }
}
