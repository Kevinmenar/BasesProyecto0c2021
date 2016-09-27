package com.example.reese.a0c2021app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Oficial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oficial);

        Button btnConsulDenunConfir = (Button) findViewById(R.id.btnConsulDenunConfirOficial);
        btnConsulDenunConfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Oficial.this, ConsulDenuncia.class);
                startActivity(intent);
            }
        });
    }
}
