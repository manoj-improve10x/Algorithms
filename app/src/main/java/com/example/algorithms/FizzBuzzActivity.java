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
           if(number%3==0 && number%5==0){
               Toast.makeText(this, "FizzBuzz", Toast.LENGTH_SHORT).show();
           } else if (number%3==0){
               Toast.makeText(this, "Fizz", Toast.LENGTH_LONG).show();
           } else if(number%5==0){
               Toast.makeText(this, "Buzz", Toast.LENGTH_LONG).show();
           }else {
               Toast.makeText(this, String.valueOf(number), Toast.LENGTH_SHORT).show();
           }
        });
    }
}