package com.example.task1challenge;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView ShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ShowCount = (TextView) findViewById(R.id.ShowCount);
    }

    public void btnToast(View view) {
        Toast toast = Toast.makeText(this,"HelloToast",Toast.LENGTH_SHORT);
        toast.show();
    }

    public void btnCount(View view) {
        mCount++;
        if(ShowCount != null){
            ShowCount.setText(Integer.toString(mCount));
        }
    }
}
