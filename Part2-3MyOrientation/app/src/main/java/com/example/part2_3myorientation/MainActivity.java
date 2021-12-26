package com.example.part2_3myorientation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String name;
    EditText editText;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showToast("onCreate hochool!");

        editText = findViewById(R.id.editText);
        textView2 = findViewById(R.id.textView2);

        Button button = findViewById(R.id.button);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (editText != null) {
                        name = editText.getText().toString();
                        showToast(name);
                    }
                }
            });
        }

        if(savedInstanceState != null){
            if(textView2 != null){
                name = savedInstanceState.getString("name");
                textView2.setText(name);

                showToast(name);
            }
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);

        outState.putString("name", name);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        showToast("onDestroy hochool!");
    }

    public void showToast(String data){
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}