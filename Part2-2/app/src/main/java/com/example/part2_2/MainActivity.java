package com.example.part2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    ImageView imageView2;

    int imageIndex = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView3);
        imageView2 = findViewById(R.id.imageView4);
    }

    public void onButton1Clicked(View v){
        changeImage();
    }
    public void changeImage(){
        if (imageIndex==0){
            imageView.setVisibility(View.VISIBLE);
            imageView2.setVisibility(View.INVISIBLE);
            imageIndex = 1;
        } else{
            imageView2.setVisibility(View.VISIBLE);
            imageView.setVisibility(View.INVISIBLE);
            imageIndex = 0;
        }
    }
}