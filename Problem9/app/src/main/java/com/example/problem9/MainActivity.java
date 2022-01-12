package com.example.problem9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InfoInsert infoInsert = new InfoInsert();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, infoInsert).commit();
    }
}
