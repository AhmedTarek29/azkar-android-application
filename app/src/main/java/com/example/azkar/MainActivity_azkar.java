package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_azkar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_azkar);

        Button Mybutton = findViewById(R.id.button);
        Button mybutton2 = findViewById(R.id.button2);
        Button mybutton6 = findViewById(R.id.button6);
        Button mybutton7 = findViewById(R.id.button7);

        mybutton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeveningaudio();
            }
        });
        mybutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmorningaudio();
            }
        });
        Mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openazkarelsaba7();
            }
        });
        mybutton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openazkarelmasa2();
            }
        });
    }

    public void openazkarelsaba7() {
        Intent intent = new Intent(MainActivity_azkar.this, MainActivity_azkarelsaba7.class);
        startActivity(intent);
    }

    public void openazkarelmasa2() {
        Intent intent = new Intent(MainActivity_azkar.this, MainActivity_azkarelmasa2.class);
        startActivity(intent);
    }

    public void openmorningaudio() {
        Intent intent = new Intent(MainActivity_azkar.this, morningaudio.class);
        startActivity(intent);
    }

    public void openeveningaudio() {
        Intent intent = new Intent(MainActivity_azkar.this, eveningaudio.class);
        startActivity(intent);
    }
}
