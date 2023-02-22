package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityLessThenHundredBinding;

public class LessThenHundredActivity extends AppCompatActivity {
    
    private ActivityLessThenHundredBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLessThenHundredBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("LessThenHundred");
        isLessThenHundred();
    }

    private void isLessThenHundred() {
        binding.submitButton.setOnClickListener(v -> {
            String numberOneTxt = binding.numberOne.getText().toString();
            String numberTwoTxt = binding.numberTwo.getText().toString();
            int numberOne = Integer.parseInt(numberOneTxt);
            int numberTwo = Integer.parseInt(numberTwoTxt);
            boolean result = isLessThenHundred(numberOne, numberTwo);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }
    private static boolean isLessThenHundred(int a, int b) {
        boolean result = false;
        int sum = a + b;
        if (sum < 100) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}