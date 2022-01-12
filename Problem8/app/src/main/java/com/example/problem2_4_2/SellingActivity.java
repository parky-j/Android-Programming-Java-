package com.example.problem2_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SellingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selling);

        Button logButton = findViewById(R.id.toLoginButton_selling);
        Button menuButton = findViewById(R.id.toMenuButton_selling);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("message", "SellingActivity");
                intent.putExtra("menu", "PassingMenu");
                setResult(-1, intent);
                finish();
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("message", "SellingActivity");
                intent.putExtra("message", "Non-PassingMenu");
                setResult(100, intent);
                finish();
            }
        });
    }
}