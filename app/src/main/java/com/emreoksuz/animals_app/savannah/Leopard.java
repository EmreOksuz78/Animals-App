package com.emreoksuz.animals_app.savannah;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Leopard extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leopard);

        mediaPlayer = MediaPlayer.create(this,R.raw.leopard);
    }

    public void sound(View view){
        mediaPlayer.start();
    }
}