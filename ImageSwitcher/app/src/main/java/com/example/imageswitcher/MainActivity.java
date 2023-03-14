package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnPrev(View view) {
        Log.d("MainActivity", "Prev button Click!");
    }

    public void OnBtnNext(View view) {
        Log.d("MainActivity", "Next button Click!");
    }
}