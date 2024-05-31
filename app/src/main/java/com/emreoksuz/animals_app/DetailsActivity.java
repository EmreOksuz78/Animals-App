package com.emreoksuz.animals_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreoksuz.animals_app.desert.Desert;
import com.emreoksuz.animals_app.forest.Forest;
import com.emreoksuz.animals_app.glacier.Glacier;
import com.emreoksuz.animals_app.meadow.Meadow;
import com.emreoksuz.animals_app.ocean.Ocean;
import com.emreoksuz.animals_app.savannah.Savannah;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);




    }

    public void savannah(View view){
        Intent intent = new Intent(DetailsActivity.this, Savannah.class);
        startActivity(intent);
    }

    public void desert(View view){
        Intent intent = new Intent(DetailsActivity.this, Desert.class);
        startActivity(intent);
    }
    public void meadow(View view){
        Intent intent = new Intent(DetailsActivity.this, Meadow.class);
        startActivity(intent);
    }
    public void forest(View view){
        Intent intent = new Intent(DetailsActivity.this, Forest.class);
        startActivity(intent);
    }
    public void glacier(View view){
        Intent intent = new Intent(DetailsActivity.this, Glacier.class);
        startActivity(intent);
    }

    public void ocean(View view){
        Intent intent = new Intent(DetailsActivity.this, Ocean.class);
        startActivity(intent);

    }
}