package com.emreoksuz.animals_app.ocean;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Ocean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocean);
    }
    public void shark(View view){
        Intent intent = new Intent(this, Shark.class);
        startActivity(intent);
    }
    public void whale(View view){
        Intent intent = new Intent(this, Whale.class);
        startActivity(intent);
    }
    public void lobster(View view){
        Intent intent = new Intent(this, Lobster.class);
        startActivity(intent);
    }
    public void octopus(View view){
        Intent intent = new Intent(this, Octopus.class);
        startActivity(intent);
    }
}