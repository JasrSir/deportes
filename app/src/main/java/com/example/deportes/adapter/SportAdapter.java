package com.example.deportes.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deportes.Deportes;
import com.example.deportes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jasrsir on 23/11/16.
 */

public class SportAdapter extends ArrayAdapter<Deportes> {

    private sportHolder sportHolder;
    /**
     * Se pasa como tercer parámetro en la llamada super un nuevo arrayList de productos con los elementos del repositorio
     * Se tiene una copia local diferente al repositorio
     * @param context
     */
    public SportAdapter(Context context) {
        super(context, R.layout.sport, ((DeportesApplication)context.getApplicationContext()).getListaDeportes());
    }

    /**
     * Metodo que obtiene la vista de los deportes
     * @param position Posicion del deporte
     * @param convertView Vista a convertir que toque
     * @param parent Padre del view
     * @return la vista hecha para el array list
     */
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View vista = convertView;
        if (vista == null) {
            LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vista = layoutInflater.inflate(R.layout.sport, null);

            sportHolder = new sportHolder();
            sportHolder.sportImage = (ImageView) vista.findViewById(R.id.imagenDeporte);
            sportHolder.nameSport = (TextView) vista.findViewById(R.id.nombreDeporte);
            sportHolder.megusta = (CheckBox) vista.findViewById(R.id.ckbElegido);
            vista.setTag(sportHolder);

        } else {
            sportHolder = (sportHolder) vista.getTag();
            sportHolder.sportImage.setImageResource(getItem(position).getImagen());
            sportHolder.nameSport.setText(getItem(position).getName());
            sportHolder.megusta.setChecked(getItem(position).getMeGusta());
        }
        notifyDataSetChanged();
        return vista;
    }

    class sportHolder {
        ImageView sportImage;
        TextView nameSport;
        CheckBox megusta;

    }

}
