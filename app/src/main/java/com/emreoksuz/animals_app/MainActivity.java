package com.emreoksuz.animals_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mediaPlayer = MediaPlayer.create(this,R.raw.aslan);

    }

    public void start(View view){
        Intent intent = new Intent(this,DetailsActivity.class);
        startActivity(intent);

    }
    public void sound(View view){
        mediaPlayer.start();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.language,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.first_language){
            Toast.makeText(MainActivity.this,"Already Using",Toast.LENGTH_SHORT).show();

        } else if (item.getItemId()==R.id.second_language) {
            Toast.makeText(MainActivity.this,"Coming Soon",Toast.LENGTH_SHORT).show();

        }else if (item.getItemId()==R.id.third_language){
            Toast.makeText(MainActivity.this,"Coming Soon",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}