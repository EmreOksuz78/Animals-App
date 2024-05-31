package com.emreoksuz.animals_app.glacier;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Penguin extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penguin);

        mediaPlayer = MediaPlayer.create(this,R.raw.penguin);
    }

    public void sound(View view){
        mediaPlayer.start();
    }
}