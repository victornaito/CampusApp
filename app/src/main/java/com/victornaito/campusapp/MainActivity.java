package com.victornaito.campusapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView;
        imageView = (ImageView) findViewById(R.id.imgView);

        Glide.with(this)
                .load(R.drawable.splashscreen)
                .asGif()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
