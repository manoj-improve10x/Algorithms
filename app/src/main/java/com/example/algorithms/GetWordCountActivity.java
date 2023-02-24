package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GetWordCountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_word_count);
        getSupportActionBar().setTitle("Get Word Count");
    }
}