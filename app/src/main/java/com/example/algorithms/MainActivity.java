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
        findDiscount();
    }

    private void findButtons() {
        binding.fizzBuzz.setOnClickListener(view -> {
            Intent intent = new Intent(this,FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void divisibleByFive() {
        binding.divisibleButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleByFiveActivity.class);
            startActivity(intent);
        });
    }

    private void minutesIntoSeconds() {
        binding.minutesButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConvertsMinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void findDiscount() {
        binding.discount.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheDiscountActivity.class);
            startActivity(intent);
        });
    }
}