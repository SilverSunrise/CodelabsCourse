package com.example.twoactivitieschallenge;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Intent intent  = new Intent(this, SecondActivity.class);
        intent.putExtra("count", mShowCount.getText().toString());
        startActivity(intent);
    }

    public void CountUp(View view) {
        mCount++;
        if (mShowCount!= null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
