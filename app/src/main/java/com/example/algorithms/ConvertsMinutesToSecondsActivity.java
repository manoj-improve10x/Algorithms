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

    }
}