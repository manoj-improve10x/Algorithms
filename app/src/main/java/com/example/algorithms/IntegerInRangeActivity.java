package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityIntegerInRangeBinding;

public class IntegerInRangeActivity extends AppCompatActivity {

    private ActivityIntegerInRangeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntegerInRangeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("FindIntegerRange");
        findIntegerInRange();
    }

    private void findIntegerInRange() {
        binding.submitButton.setOnClickListener(v -> {
            String inputNumberTxt = binding.inputNumber.getText().toString();
            int inputNumber = Integer.parseInt(inputNumberTxt);
            String lowerBoundTxt = binding.lowerBound.getText().toString();
            int lowerBound = Integer.parseInt(lowerBoundTxt);
            String upperBoundTxt = binding.upperBound.getText().toString();
            int upperBound = Integer.parseInt(upperBoundTxt);
            boolean result = findIntegerRange(inputNumber, lowerBound, upperBound);
            Toast.makeText(this, "result is: " + result, Toast.LENGTH_SHORT).show();
        });
    }

    private static boolean findIntegerRange(int n, int lowerBound, int upperBound) {
        boolean result = false;
        if (n >= lowerBound && n < upperBound) {
            result = true;
        }
        System.out.println(result);
        return result;
    }
}