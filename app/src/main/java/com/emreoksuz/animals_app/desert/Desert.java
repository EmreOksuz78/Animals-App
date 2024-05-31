package com.emreoksuz.animals_app.desert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Desert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);
    }
    public void camel(View view){
        Intent intent = new Intent(this, Camel.class);
        startActivity(intent);
    }
    public void fox(View view){
        Intent intent = new Intent(this, DesertFox.class);
        startActivity(intent);
    }
    public void scorpion(View view){
        Intent intent = new Intent(this, Scorpion.class);
        startActivity(intent);
    }
    public void iguana(View view){
        Intent intent = new Intent(this, Iguana.class);
        startActivity(intent);
    }
}