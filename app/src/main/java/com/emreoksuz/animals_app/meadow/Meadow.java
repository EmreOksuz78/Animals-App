package com.emreoksuz.animals_app.meadow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Meadow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meadow);
    }

    public void horse(View view){
        Intent intent = new Intent(this, Horse.class);
        startActivity(intent);
    }
    public void rabbit(View view){
        Intent intent = new Intent(this, Rabbit.class);
        startActivity(intent);
    }
    public void sheep(View view){
        Intent intent = new Intent(this, Sheep.class);
        startActivity(intent);
    }
}