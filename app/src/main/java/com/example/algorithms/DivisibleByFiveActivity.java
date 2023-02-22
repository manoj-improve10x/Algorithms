package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

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
            boolean result = isDivisibleByFive(number);
            binding.outputTxt.setText(String.valueOf(result));
        });
    }

    private static boolean isDivisibleByFive(int num) {
        boolean result = false;
        if (num % 5 == 0) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}