package com.example.lab5ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MediaPlayer azansound;
    int playing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button x=findViewById(R.id.button);
        TextView txt =findViewById(R.id.txt);

        azansound = MediaPlayer.create(this, R.raw.azan);
        playing = 0;

        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (playing){

                    case 0: azansound.start(); playing=1;
                    txt.setText("Azan is started"); break;

                    case 1: azansound.pause(); playing=0;
                    txt.setText("Azan is paused"); break;
                }
            }
        });

    }
}