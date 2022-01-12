package com.example.problem2_4_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GuestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guest);

        Button logButton = findViewById(R.id.toLoginButton);
        Button menuButton = findViewById(R.id.toMenuButton);

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("message", "GuestActivity");
                intent.putExtra("menu", "PassingMenu");
                setResult(-1, intent);
                finish();
            }
        });

        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("message", "GuestActivity");
                intent.putExtra("message", "Non-PassingMenu");
                setResult(100, intent);
                finish();
            }
        });
    }
}