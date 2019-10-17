package com.example.dam206.asteroidesbeatrizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lanzarAcercaDe(View view){
        Intent i = new Intent(this, AcercaDeActivity.class);
        startActivity(i);
    }

    public void terminarAplicacion(View v){
        finish();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch(id){

        case R.id.acercaDe:
            lanzarAcercaDe(null);
            break;
            default:
                Toast mensa = Toast.makeText(this, "Opción en construccion",
                        Toast.LENGTH_SHORT);
                mensa.show();
                        break;
        }     return super.onOptionsItemSelected(item);
    }
}
