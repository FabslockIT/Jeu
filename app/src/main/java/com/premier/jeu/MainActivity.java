package com.premier.jeu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View image = findViewById(R.id.des1);
        Button boutonJouer = findViewById(R.id.jouer);

        boutonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        //R.layout.activity_main;
        //R.string.app_name;
    }
}