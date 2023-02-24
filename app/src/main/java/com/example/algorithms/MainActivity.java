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
        handleThreeProgrammersBtn();
        findSentenceBtn();
        handleEvenNumberBtn();
        twoMakesTen();
        convertHoursIntoSeconds();
        getWordCount();
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

    private void handleThreeProgrammersBtn() {
        binding.threeProgrammersBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ThreeProgrammersActivity.class);
            startActivity(intent);
        });
    }

    private void findSentenceBtn() {
        binding.findSentenceBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, FindSentenceActivity.class);
            startActivity(intent);
        });
    }

    private void handleEvenNumberBtn() {
        binding.evenNumberBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, EvenNumberActivity.class);
            startActivity(intent);
        });
    }

    private void twoMakesTen() {
        binding.twoMakesTenBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, TwoMakesTenActivity.class);
            startActivity(intent);
        });
    }

    private void convertHoursIntoSeconds() {
        binding.hoursIntoSecondsBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, ConvertHoursToSecondsActivity.class);
            startActivity(intent);
        });
    }

    private void getWordCount() {
        binding.wordCountBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this, GetWordCountActivity.class);
            startActivity(intent);
        });
    }
}