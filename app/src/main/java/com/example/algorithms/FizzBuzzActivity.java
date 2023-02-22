package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityFizzBuzzBinding;

public class FizzBuzzActivity extends AppCompatActivity {

    private ActivityFizzBuzzBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFizzBuzzBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findFizzBuzz();
    }

    private void findFizzBuzz() {
        binding.checkButton.setOnClickListener(v -> {
           String num = binding.numberTxt.getText().toString();
           int number = Integer.valueOf(num);
           String name = findFizzBuzz(number);
            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();

        });
    }

    private static String findFizzBuzz(int number) {
        String result = "name";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result = Integer.toString(number);
        }
        System.out.println(result);
        return result;
    }
}