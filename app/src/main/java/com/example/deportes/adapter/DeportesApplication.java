package com.example.deportes.adapter;

import android.app.Application;

import com.example.deportes.Deportes;
import com.example.deportes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que inicializa la lista de deportes
 * (Clase Repositorio.)
 */

public class DeportesApplication extends Application {

    private ArrayList<Deportes> listaDeportes = new ArrayList<Deportes>();

    @Override
    public void onCreate() {
        super.onCreate();
        saveDeporte(new Deportes(getResources().getString(R.string.american_fooball), R.drawable.icon_american_football,false));
        saveDeporte(new Deportes(getResources().getString(R.string.australian_rules), R.drawable.icon_australian_rules,false));
        saveDeporte(new Deportes(getResources().getString(R.string.bandy), R.drawable.icon_bandy,false));
        saveDeporte(new Deportes(getResources().getString(R.string.baseball), R.drawable.icon_baseball,false));
        saveDeporte(new Deportes(getResources().getString(R.string.basketball), R.drawable.icon_basketball,false));
        saveDeporte(new Deportes(getResources().getString(R.string.beach_soccer), R.drawable.icon_beach_soccer,false));
        saveDeporte(new Deportes(getResources().getString(R.string.boxing), R.drawable.icon_boxing,false));
        saveDeporte(new Deportes(getResources().getString(R.string.chess), R.drawable.icon_chess,false));
        saveDeporte(new Deportes(getResources().getString(R.string.cricket), R.drawable.icon_cricket,false));
        saveDeporte(new Deportes(getResources().getString(R.string.curling), R.drawable.icon_american_football,false));
        saveDeporte(new Deportes(getResources().getString(R.string.cycling), R.drawable.icon_curling,false));
        saveDeporte(new Deportes(getResources().getString(R.string.darts), R.drawable.icon_darts,false));
        saveDeporte(new Deportes(getResources().getString(R.string.daughts), R.drawable.icon_daughts,false));
        saveDeporte(new Deportes(getResources().getString(R.string.floorball), R.drawable.icon_floorball,false));
        saveDeporte(new Deportes(getResources().getString(R.string.gaelic_football), R.drawable.icon_gaelic_football,false));
        saveDeporte(new Deportes(getResources().getString(R.string.golf), R.drawable.icon_golf,false));
        saveDeporte(new Deportes(getResources().getString(R.string.handball), R.drawable.icon_handball,false));
        saveDeporte(new Deportes(getResources().getString(R.string.icehockey), R.drawable.icon_icehockey,false));
        saveDeporte(new Deportes(getResources().getString(R.string.motor), R.drawable.icon_motor,false));
        saveDeporte(new Deportes(getResources().getString(R.string.motorbike), R.drawable.icon_motorbike,false));
        saveDeporte(new Deportes(getResources().getString(R.string.snooker), R.drawable.icon_snooker,false));
        saveDeporte(new Deportes(getResources().getString(R.string.soccer), R.drawable.icon_soccer,false));
        saveDeporte(new Deportes(getResources().getString(R.string.table_tenis), R.drawable.icon_table_tennis,false));
        saveDeporte(new Deportes(getResources().getString(R.string.tennis), R.drawable.icon_tennis,false));
        saveDeporte(new Deportes(getResources().getString(R.string.trotting), R.drawable.icon_trotting,false));
        saveDeporte(new Deportes(getResources().getString(R.string.fighting), R.drawable.icon_ultimate_fighting,false));
        saveDeporte(new Deportes(getResources().getString(R.string.volleyBall), R.drawable.icon_volleyball,false));

    }

    private void saveDeporte(Deportes deporte) {
        listaDeportes.add(deporte);
    }

    public List<Deportes> getListaDeportes() {
        return listaDeportes;
    }
}
