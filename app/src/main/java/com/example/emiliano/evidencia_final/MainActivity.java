package com.example.emiliano.evidencia_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Curp cur = getIntent().getParcelableExtra("cur");

        ((TextView)findViewById(R.id.nombre)).setText(cur.nombre());
        ((TextView)findViewById(R.id.apellido1)).setText(cur.apellido1());
        ((TextView)findViewById(R.id.apellido2)).setText(cur.apellido2());
        ((TextView)findViewById(R.id.sex)).setText(cur.sex());
        ((TextView)findViewById(R.id.fecha)).setText(cur.fecha());
        ((TextView)findViewById(R.id.entidad)).setText(cur.entidad());
    }
    @Override
    public boolean onCreateOptionsMenu(menu menu) {
        menuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
}
