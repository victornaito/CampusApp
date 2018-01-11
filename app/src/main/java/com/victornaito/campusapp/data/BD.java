package com.victornaito.campusapp.data;

import android.os.Parcel;

import com.victornaito.campusapp.model.Noticia;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by victornaito on 02/01/18.
 */

public class BD {
    static List<Noticia> noticias = new ArrayList<Noticia>();

    public static List<Noticia> getNoticia() {

        noticias.add(new Noticia(0,"Noticia1"));
        noticias.add(new Noticia(1,"Noticia2"));
        noticias.add(new Noticia(2,"Noticia3"));

        return noticias;
    }
}