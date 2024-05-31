package com.emreoksuz.animals_app.glacier;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Glacier extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glacier);
    }
    public void bear(View view){
        Intent intent = new Intent(this, PolarBear.class);
        startActivity(intent);
    }
    public void penguin(View view){
        Intent intent = new Intent(this, Penguin.class);
        startActivity(intent);
    }
    public void reindeer(View view){
        Intent intent = new Intent(this, Reindeer.class);
        startActivity(intent);
    }
    public void seal(View view){
        Intent intent = new Intent(this, Seal.class);
        startActivity(intent);
    }
}