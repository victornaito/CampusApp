package com.victornaito.campusapp.model;

import android.os.Parcel;
import android.os.Parcelable;
/**
 * Created by victornaito on 02/01/18.
 */

public class Noticia implements Parcelable {
    private Integer id;
    private String descricao;


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.descricao);
    }

    public Noticia(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    protected Noticia(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.descricao = in.readString();
    }

    public static final Creator<Noticia> CREATOR = new Creator<Noticia>() {
        @Override
        public Noticia createFromParcel(Parcel source) {
            return new Noticia(source);
        }

        @Override
        public Noticia[] newArray(int size) {
            return new Noticia[size];
        }
    };
}
