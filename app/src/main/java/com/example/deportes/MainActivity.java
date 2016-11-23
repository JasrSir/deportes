package com.example.deportes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

import com.example.deportes.adapter.DeportesApplication;
import com.example.deportes.adapter.SportAdapter;
import com.example.deportes.preferences.SportPreferences;
import com.example.deportes.settings.AccountPreferences;

public class MainActivity extends AppCompatActivity {

    private ListView listaDeportes;
    private ViewGroup layout;
    private Deportes miDeporte;
    private SportAdapter adapterDeportes;
    SportPreferences preferncia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        restorePreferences();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    //restauramos preferencias
    private void restorePreferences() {
    }

    //Para inflar el menú creado
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    //inicializamos las variables, liosta, adapter, etc..
    private void init() {
        listaDeportes = (ListView) findViewById(R.id.lista);
        layout = (ViewGroup) findViewById(R.id.activity_main);
        adapterDeportes = new SportAdapter(MainActivity.this);
        listaDeportes.setAdapter(adapterDeportes);
        adapterDeportes.notifyDataSetChanged();
    }

    //Guardar persistencia de datos
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        for (int i = 0; i < listaDeportes.getCount(); i++) {
            if (((Deportes)listaDeportes.getItemAtPosition(i)).getMeGusta())
                outState.putBoolean(((Deportes)listaDeportes.getItemAtPosition(i)).getName(), true);
        }

    }

    //reestablecer datos
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        for (int i = 0; i < listaDeportes.getCount(); i++) {
            if (savedInstanceState.getBoolean(((Deportes)listaDeportes.getItemAtPosition(i)).getName()))
                ((Deportes) listaDeportes.getItemAtPosition(i)).setMeGusta(true);
        }
    }
}
