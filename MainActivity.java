package com.example.activitynavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.buttonMore);
    }
    public void buttonMoreClicked(View view){

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
}