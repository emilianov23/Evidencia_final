package com.example.emiliano.evidencia_final;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Curp_data extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_curp);

        Curp curp = getIntent().getParcelableExtra("curp");


        ((TextView)findViewById(R.id.disname)).setText(curp.getName());
        ((TextView)findViewById(R.id.disapellidopater)).setText(curp.getApellidopater()));
        ((TextView)findViewById(R.id.disapellidoMater)).setText(curp.getApellidomater());
        ((TextView)findViewById(R.id.disEstado)).setText(curp.getEstado());
        ((TextView)findViewById(R.id.discumpleaños)).setText(curp.getcumple());
        ((TextView)findViewById(R.id.dissexo)).setText(curp.getSexo());
        ((TextView)findViewById(R.id.discurp).setText (curp.getcurp());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuBack:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
