package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class elheg_w_elumrah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elheg_welumrah);

        Button mybutton8=findViewById(R.id.button8);
        mybutton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhej();
            }
        });
        Button mybutton12=findViewById(R.id.button12);
        mybutton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUmrah();
            }
        });

    }
    public void openhej()
    {
        Intent intent= new Intent(elheg_w_elumrah.this, Heg.class);
        startActivity(intent);
    }
    public void openUmrah()
    {
        Intent intent= new Intent(elheg_w_elumrah.this, Umrah.class);
        startActivity(intent);
    }
}