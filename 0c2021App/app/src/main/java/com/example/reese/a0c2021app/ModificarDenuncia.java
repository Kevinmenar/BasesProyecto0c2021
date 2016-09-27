package com.example.reese.a0c2021app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ModificarDenuncia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_denuncia);

        Button btnRenunciaTemp = (Button) findViewById(R.id.btnRenunciaTemp);
        btnRenunciaTemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModificarDenuncia.this, Denuncia.class);
                startActivity(intent);
            }
        });
    }
}
