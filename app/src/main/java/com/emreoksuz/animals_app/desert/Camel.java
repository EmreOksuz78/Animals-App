package com.emreoksuz.animals_app.desert;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Camel extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camel);
        mediaPlayer = MediaPlayer.create(this,R.raw.camel);
    }
    public void sound(View view){
        mediaPlayer.start();
    }
}