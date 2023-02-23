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
        handleFizzBuzzBtn();
        handleDivisibleByFive();
        handleMinutesIntoSeconds();
        handleFindDiscount();
        handleLessThenHundred();
        handleIntegerRange();
        handleEqualityBtn();
    }

    private void handleFizzBuzzBtn() {
        binding.fizzBuzz.setOnClickListener(view -> {
            Intent intent = new Intent(this,FizzBuzzActivity.class);
            startActivity(intent);
        });
    }

    private void handleDivisibleByFive() {
        binding.divisibleButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, DivisibleByFiveActivity.class);
            startActivity(intent);
        });
    }

    private void handleMinutesIntoSeconds() {
        binding.minutesButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConvertsMinutesToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void handleFindDiscount() {
        binding.discount.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindTheDiscountActivity.class);
            startActivity(intent);
        });
    }

    private void handleLessThenHundred() {
        binding.lessThenHundred.setOnClickListener(v -> {
            Intent intent = new Intent(this, LessThenHundredActivity.class);
            startActivity(intent);
        });
    }

    private void handleIntegerRange() {
        binding.integerRangeBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, IntegerInRangeActivity.class);
            startActivity(intent);
        });
    }

    private void handleEqualityBtn() {
        binding.equalityButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, EqualityOfThreeValuesActivity.class);
            startActivity(intent);
        });
    }
}