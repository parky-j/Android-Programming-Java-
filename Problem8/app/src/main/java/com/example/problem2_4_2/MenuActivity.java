package com.example.problem2_4_2;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_CUSTOMER = 201;
    public static final int REQUEST_CODE_REVENUE = 202;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (data != null) {
            if (requestCode == REQUEST_CODE_CUSTOMER) {
                String message = data.getStringExtra("message");
                if(resultCode == -1){
                    setResult(101, data);
                    finish();
                }
                else{
                    if (message != null) {
                        showToast("고객관리 응답, result code : " + resultCode + ", message : " + message);
                    }
                }
            } else if (requestCode == REQUEST_CODE_REVENUE) {
                String message = data.getStringExtra("message");
                if(resultCode == -1){
                    setResult(101, data);
                    finish();
                }
                else{
                    if (message != null) {
                        showToast("고객관리 응답, result code : " + resultCode + ", message : " + message);
                    }
                }
            }
        }
    }
    public void showToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button guestButton = findViewById(R.id.button);
        Button sellingButton = findViewById(R.id.button2);

        Intent mainIntent = getIntent();
        String id = mainIntent.getStringExtra("id");
        String password = mainIntent.getStringExtra("password");

        guestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GuestActivity.class);
                intent.putExtra("username", id);
                intent.putExtra("password", password);
                startActivityForResult(intent, REQUEST_CODE_CUSTOMER);
            }
        });

        sellingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),GuestActivity.class);
                intent.putExtra("username", id);
                intent.putExtra("password", password);
                startActivityForResult(intent, REQUEST_CODE_REVENUE);
            }
        });

    }
}