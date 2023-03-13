package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity_Dua extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dua);

        Button mybutton = findViewById(R.id.button4);
        Button mybutton5 = findViewById(R.id.button9);
        Button mybutton6 = findViewById(R.id.button7);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openduaaftersalah();
            }
        });


        mybutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDaily();
            }
        });


        mybutton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open_40_dua();
            }
        });
    }

    public void openduaaftersalah()
    {
        Intent intent= new Intent(this, MainActivity_Dua_after_salah.class);
        startActivity(intent);
    }

    public void openDaily()
    {
        Intent intent= new Intent(this, MainActivity_Daily_essential_dua.class);
        startActivity(intent);
    }

    public void open_40_dua()
    {
        Intent intent= new Intent(MainActivity_Dua.this, MainActivity_40_dua_beginwith_Rabbana.class);
        startActivity(intent);
    }
}