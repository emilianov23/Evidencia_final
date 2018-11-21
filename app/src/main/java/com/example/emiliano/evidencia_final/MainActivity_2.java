package com.example.emiliano.evidencia_final;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String ape = intent.getStringExtra(MainActivity.apellido1);
        String ape2 = intent.getStringExtra(MainActivity.apellido2);
        String name=intent.getStringExtra(MainActivity.nombre);
        String ent=intent.getStringExtra(MainActivity.entidad);
        int fe = intent.getIntExtra(MainActivity.fecha,0);

        TextView apellido1=(TextView) findViewById(R.id.apellido1);
        TextView apellido2=(TextView) findViewById(R.id.apellido2);
        TextView nombre=(TextView) findViewById(R.id.nombre);
        TextView fecha=(TextView) findViewById(R.id.fecha);
        TextView entidad=(TextView) findViewById(R.id.entidad);
        TextView Cur = (TextView) findViewById(R.id.Cur);
        nombre.setText(name);
        apellido1.setText(ape);
        apellido2.setText(ape2);
        fecha.setText( fe);
        entidad.setText(ent);
    }

}
