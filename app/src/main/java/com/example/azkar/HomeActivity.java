package com.example.azkar;


import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        Button mybutton11=findViewById(R.id.button11);
        mybutton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openruquia();
            }
        });
        Button mybutton14=findViewById(R.id.button14);
        mybutton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentsbe7();
            }
        });

        Button mybutton = findViewById(R.id.button10);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openazkar();
            }
        });

        Button mybutton13=findViewById(R.id.button13);
        mybutton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmissed();
            }
        });

        Button mybutton5=findViewById(R.id.button5);
        mybutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openelhegwelumrah();
            }
        });
        Button mybutton3 = findViewById(R.id.button3);
        mybutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDua();
            }
        });

    }

    public void openazkar()
    {
        Intent intent= new Intent(HomeActivity.this, MainActivity_azkar.class);
        startActivity(intent);
    }

    public void openDua()
    {
        Intent intent= new Intent(HomeActivity.this, MainActivity_Dua.class);
        startActivity(intent);
    }
    public void openelhegwelumrah()
    {
        Intent intent= new Intent(HomeActivity.this, elheg_w_elumrah.class);
        startActivity(intent);
    }

    public void openmissed()
    {
        Intent intent= new Intent(HomeActivity.this, missed.class);
        startActivity(intent);
    }

    public void opentsbe7()
    {
        Intent intent= new Intent(HomeActivity.this, tsbe7.class);
        startActivity(intent);
    }

    public void openruquia()
    {
        Intent intent= new Intent(HomeActivity.this, elruquiya.class);
        startActivity(intent);
    }
}