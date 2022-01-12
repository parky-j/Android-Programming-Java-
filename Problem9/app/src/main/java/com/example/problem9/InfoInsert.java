package com.example.problem9;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class InfoInsert extends Fragment {

    Information information;
    int age;
    String name;
    String birth;.

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.info_insert, container, false);

        EditText editText = rootView.findViewById(R.id.editText1);
        EditText editText2 = rootView.findViewById(R.id.editText2);
        EditText editText3 = rootView.findViewById(R.id.editText3);
        Button button = rootView.findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(editText.getText().toString() != null && editText2.getText().toString() != null && editText3.getText().toString() != null){
                    age = Integer.parseInt(editText.getText().toString());
                    name = editText2.getText().toString();
                    birth = editText3.getText().toString();

                    information = new Information(name, age, birth);
                }else{
                    information = new Information();
                }

                Toast.makeText(getActivity(), information.toString(), Toast.LENGTH_LONG).show();
            }
        });

        return rootView;
    }

    public Information getInfo(Information info){
        return info;
    }
}
