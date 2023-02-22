package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.algorithms.databinding.ActivityConvertsMinutesToSecondsBinding;

public class ConvertsMinutesToSecondsActivity extends AppCompatActivity {

    private ActivityConvertsMinutesToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvertsMinutesToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        convertsMinutesIntoSeconds();
    }

    private void convertsMinutesIntoSeconds() {
        binding.checkButton.setOnClickListener(v -> {
            String num = binding.inputNumber.getText().toString();
            int number = Integer.parseInt(num);
            int seconds = convertMinutesIntoSeconds(number);
            binding.outputTxt.setText(String.valueOf(seconds));
        });
    }

    private static int convertMinutesIntoSeconds(int minutes) {
        int seconds = 0;
        seconds = minutes * 60;
        System.out.println(seconds);
        return seconds;
    }
}