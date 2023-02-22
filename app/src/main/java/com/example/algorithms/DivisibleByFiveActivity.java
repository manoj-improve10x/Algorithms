package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.algorithms.databinding.ActivityDivisibleByFiveBinding;

public class DivisibleByFiveActivity extends AppCompatActivity {

    private ActivityDivisibleByFiveBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDivisibleByFiveBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        isDivisibleByFive();
    }

    private void isDivisibleByFive() {
        binding.checkButton.setOnClickListener(v -> {
            String inputNumber = binding.inputNumberTxt.getText().toString();
            int number = Integer.parseInt(inputNumber);
            if(number / 5 == 0){
                binding.outputTxt.setText("the number is divisible by five");
            }else {
                binding.outputTxt.setText("the number is not divisible by five");
            }
        });
    }
}