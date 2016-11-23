package com.example.deportes;

import android.widget.CheckBox;
import android.widget.ImageView;

/**
 * Created by lourdes on 23/11/16.
 */

public class Deportes {
    private String name;
    private int imagen;
    private boolean meGusta;

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getMeGusta() {
        return meGusta;
    }

    public void setMeGusta(boolean meGusta) {
        this.meGusta = meGusta;
    }

    public Deportes(String name, int imagen, boolean meGusta) {
        this.name = name;
        this.imagen = imagen;
        this.meGusta = meGusta;
    }
}
