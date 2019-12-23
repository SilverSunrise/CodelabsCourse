package com.example.twoactivitieschallenge;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String count = getIntent().getStringExtra("count");
        TextView textView = findViewById(R.id.showCoundSecond);
        textView.setText(count);


    }
}
