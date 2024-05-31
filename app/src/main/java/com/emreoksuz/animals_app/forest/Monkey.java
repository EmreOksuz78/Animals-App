package com.emreoksuz.animals_app.forest;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Monkey extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monkey);

        mediaPlayer = MediaPlayer.create(this,R.raw.monkey);
    }

    public void sound(View view){
        mediaPlayer.start();
    }
}