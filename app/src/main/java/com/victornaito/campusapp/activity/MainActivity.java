package com.victornaito.campusapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.victornaito.campusapp.R;
import com.victornaito.campusapp.model.Noticia;

import java.util.List;

import com.victornaito.campusapp.data.BD;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imgView);

       List<Noticia> noticiaList =  BD.getNoticia();
        /*  */

        Glide.with(this)
                .load(R.drawable.splashscreen)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
