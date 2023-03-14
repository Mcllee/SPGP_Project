package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnBtnPrev(View view) {
        Log.d(TAG, "Prev button Click!");
        ImageView mainImageView = findViewById(R.id.mainImageView);
        mainImageView.setImageResource(R.mipmap.card_2c);
    }

    public void OnBtnNext(View view) {
        Log.d(TAG, "Next button Click!");
        ImageView mainImageView = findViewById(R.id.mainImageView);
        mainImageView.setImageResource(R.mipmap.card_3d);
    }
}