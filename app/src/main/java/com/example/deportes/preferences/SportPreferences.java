package com.example.deportes.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.PorterDuff;

/**
 * Created by lourdes on 23/11/16.
 */

public class SportPreferences {
    private int MODO = Context.MODE_PRIVATE;

    private static SportPreferences sportPreferences;
    private SharedPreferences sharedPreferences;

    //singleton
    public static SportPreferences getInstance(Context context) {
        if (sportPreferences == null)
            sportPreferences = new SportPreferences();
        return sportPreferences;
    }


    private SharedPreferences.Editor getEditor() {
        return sharedPreferences.edit();
    }
}
