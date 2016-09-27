package com.example.reese.a0c2021app;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    String nombre = "ed";
    String nombre1 = "edw";
    String nombre2 = "edwi";
    String id = "123";

    String tipoUsuario = "Juez";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Registrar.class);
                startActivity(intent);
            }
        });

        ArrayAdapter<String> myAdapter= new
                ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,
                getResources().getStringArray(R.array.listaUser));

        Spinner listaAdaptador =
                (Spinner) findViewById(R.id.spinnerUserType);
        listaAdaptador.setAdapter((myAdapter));

//        listaAdaptador.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                tipoUsuario = getResources().getStringArray(R.array.listaUser)[position];
//            }
//        });

        Button btnJuez = (Button) findViewById(R.id.btnJuez);
        btnJuez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.txtUser);
                String user = et.getText().toString();
                if (user.equals("Juez")) {
                    Intent intent = new Intent(MainActivity.this, Juez.class);
                    startActivity(intent);
                }
            }
        });

        Button btnOficial = (Button) findViewById(R.id.btnOficial);
        btnOficial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.txtUser);
                String user = et.getText().toString();
                if (user.equals("Oficial")) {
                    Intent intent = new Intent(MainActivity.this, Oficial.class);
                    startActivity(intent);
                }
            }
        });

        Button btnGuardian = (Button) findViewById(R.id.btnGuardian);
        btnGuardian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText et = (EditText) findViewById(R.id.txtUser);
                String user = et.getText().toString();
                if (user.equals("Guardián")) {
                    Intent intent = new Intent(MainActivity.this, Guardian.class);
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
