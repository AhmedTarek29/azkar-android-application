package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tsbe7 extends AppCompatActivity {
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsbe7);
    }
    public void onClick(View v)
    {
        TextView text= findViewById(R.id.textView1000);
        text.setText("العداد:  "+counter );
        counter++;
    }

}