package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private int page = 1;
    private ImageView mainImageView;
    private TextView pageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView mainImageView = findViewById(R.id.mainImageView);
        TextView pageTextView = findViewById(R.id.pageTextView);

        setPage(1);
    }

    public void OnBtnPrev(View view) {
        Log.d(TAG, "Prev button Click!");
        setPage(page - 1);
    }

    public void OnBtnNext(View view) {
        Log.d(TAG, "Next button Click!");
        setPage(page + 1);
    }

    private static final int[] IMG_RES_IDS = new int[] {
            R.mipmap.card_as,
            R.mipmap.card_2c,
            R.mipmap.card_3d,
            R.mipmap.card_4h,
            R.mipmap.card_5s,
            R.mipmap.card_qh,
            R.mipmap.card_kd,
            R.mipmap.card_jc,
            R.mipmap.card_blue_back,
    };

    private void setPage(int page) {
        if(page < 1 || page > IMG_RES_IDS.length) return;

        int resId = IMG_RES_IDS[page - 1];
        mainImageView.setImageResource(resId);
        pageTextView.setText(page + " / " + IMG_RES_IDS.length);
        
        this.page = page;
    }
}