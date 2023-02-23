package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityEqualityOfThreeValuesBinding;

public class EqualityOfThreeValuesActivity extends AppCompatActivity {

    private ActivityEqualityOfThreeValuesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEqualityOfThreeValuesBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findEqualValue();
    }

    private void findEqualValue() {
        binding.button.setOnClickListener(v -> {
            String valueOneTxt = binding.valueOne.getText().toString();
            String valueTwoTxt = binding.valueTwo.getText().toString();
            String valueThreeTxt = binding.valueThree.getText().toString();
            int valueOne = Integer.parseInt(valueOneTxt);
            int valueTwo = Integer.parseInt(valueTwoTxt);
            int valueThree = Integer.parseInt(valueThreeTxt);
            int equalityValue = equalityOfThreeValues(valueOne, valueTwo, valueThree);
            Toast.makeText(this, "Equality value is: " + equalityValue, Toast.LENGTH_SHORT).show();
        });
    }

    private static int equalityOfThreeValues(int a, int b, int c) {
        int result = 0;
        if (a == b && b == c && a == c) {
            result = 3;
        } else if (a == b || b == c || a == c) {
            result = 2;
        }
        System.out.println(result);
        return result;
    }
}