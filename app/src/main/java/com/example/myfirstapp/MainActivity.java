package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.pushMeBTN);
        btn.setOnClickListener(this);

//        TextView tv = findViewById(R.id.snumTextView);
//        tv.setText("Just Loaded");
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pushMeBTN:

                break;
            case R.id.snumTextView:
                TextView tv = findViewById(R.id.snumTextView);
                tv.setText("BTN ON!");
                break;
        }
    }
}