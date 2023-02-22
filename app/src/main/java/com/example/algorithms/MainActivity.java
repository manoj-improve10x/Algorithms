package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.algorithms.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findButtons();
        divisibleByFive();
        minutesIntoSeconds();
    }

    private void findButtons() {
        binding.fizzBuzz.setOnClickListener(view -> {
            Intent intent = new Intent(this,FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void divisibleByFive() {
        Intent intent = new Intent(this, DivisibleByFiveActivity.class);
        startActivity(intent);
    }

    private void minutesIntoSeconds() {
        Intent intent = new Intent(this, ConvertsMinutesToSecondsActivity.class);
        startActivity(intent);
    }
}