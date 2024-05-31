package com.emreoksuz.animals_app.forest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Forest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forest);


    }

    public void monkey(View view){
        Intent intent= new Intent(this, Monkey.class);
        startActivity(intent);
    }
    public void turtle(View view){
        Intent intent= new Intent(this, Turtle.class);
        startActivity(intent);
    }
    public void parrot(View view){
        Intent intent= new Intent(this, Parrot.class);
        startActivity(intent);
    }
    public void snake(View view){
        Intent intent= new Intent(this, Snake.class);
        startActivity(intent);
    }
}