package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btn = findViewById(R.id.pushMeBTN);
//        btn.setOnClickListener(pushMeButtonListener);
//        btn = findViewById(R.id.helloBTN);
//        btn.setOnClickListener(helloButtonListener);
    }

    public void onButtonPushMe(View view) {
        TextView tv = findViewById(R.id.snumTextView);
        tv.setText("BTN ON!");
    }

    public void OnButtonHello(View view) {
        TextView tv = findViewById(R.id.snumTextView);
        tv.setText("Hello?");
    }
}