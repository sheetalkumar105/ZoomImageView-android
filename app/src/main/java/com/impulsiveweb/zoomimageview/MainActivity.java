package com.impulsiveweb.zoomimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.impulsive.zoomimageview.ZoomImageView;

public class MainActivity extends AppCompatActivity {

    ZoomImageView zoomImageView1, zoomImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomImageView1 = findViewById(R.id.zoomImageView1);
        zoomImageView2 = findViewById(R.id.zoomImageView2);
        findViewById(R.id.btnReset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                zoomImageView1.resetImage();
                zoomImageView2.resetImage();
            }
        });
    }
}
