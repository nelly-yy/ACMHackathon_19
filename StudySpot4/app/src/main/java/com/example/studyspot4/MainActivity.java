package com.example.studyspot4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void toLibrary(View v){
        startActivity(new Intent(MainActivity.this, Library.class));
    }
    public void toOtherSpots(View v){
        startActivity(new Intent(MainActivity.this, OtherSpots.class));
    }
}
