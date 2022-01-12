package com.example.problem9;

import androidx.annotation.NonNull;

public class Information {
    String name;
    int age;
    String birth;

    public Information(String name, int age, String birth){
        this.age = age;
        this.name = name;
        this.birth = birth;
    }

    public Information(){
        this.name = "Mike";
        this.age = 20;
        this.birth = "2020.12.01";
    }

    @NonNull
    @Override
    public String toString() {
        return "age: "+ Integer.toString(age) + ", name: "+name+", birth: "+birth;
    }
}
