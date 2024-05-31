package com.emreoksuz.animals_app.savannah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.R;

public class Savannah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savannah);
    }
    public void lion(View view){
        Intent intent = new Intent(this, Lion.class);
        startActivity(intent);
    }
    public void leopard(View view){
        Intent intent = new Intent(this, Leopard.class);
        startActivity(intent);
    }
    public void elephant(View view){
        Intent intent = new Intent(this, Elephant.class);
        startActivity(intent);
    }
    public void zebra(View view){
        Intent intent = new Intent(this, Zebra.class);
        startActivity(intent);
    }

}