package com.example.hello_constraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView show_count;
    private Button button_zero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show_count = (TextView) findViewById(R.id.show_count);
        button_zero = (Button) findViewById(R.id.button_zero);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,"Hello Toast", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void ShowZero(View view) {
        show_count.setText("0");
        mCount = 0;
        button_zero.setBackgroundColor(Color.rgb(133, 133, 133));
    }

    public void upCount(View view) {
        mCount++;
        button_zero.setBackgroundColor(Color.rgb(231, 84, 128));
        if(show_count != null) {
            show_count.setText(Integer.toString(mCount));
        }
    }
}
