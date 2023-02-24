package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.algorithms.databinding.ActivityConvertHoursToSecondsBinding;

public class ConvertHoursToSecondsActivity extends AppCompatActivity {

    private ActivityConvertHoursToSecondsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityConvertHoursToSecondsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ConvertHoursAndMinutesIntoSeconds");
        convertHoursIntoSeconds();
    }

    private void convertHoursIntoSeconds() {
        binding.submitBtn.setOnClickListener(v -> {
            String hoursTxt = binding.hoursTxt.getText().toString();
            String minutesTxt = binding.minutesTxt.getText().toString();
            int hours = Integer.parseInt(hoursTxt);
            int minutes = Integer.parseInt(minutesTxt);
            int seconds = convertHoursAndMinutesIntoSeconds(hours, minutes);
            binding.secondTxt.setText(String.valueOf(seconds));
        });
    }

    private static int convertHoursAndMinutesIntoSeconds(int hours, int minutes) {
        int seconds = 0;
        int hour = hours * 3600;
        int minute = minutes * 60;
        seconds = hour + minute;
        return seconds;
    }
}