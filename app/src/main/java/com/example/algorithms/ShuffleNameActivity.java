package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.algorithms.databinding.ActivityShuffleNameBinding;

public class ShuffleNameActivity extends AppCompatActivity {

    private ActivityShuffleNameBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityShuffleNameBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Shuffle Name");
        getShuffleName();
    }

    private void getShuffleName() {
        binding.submitBtn.setOnClickListener(v -> {
            String inputName = binding.inputName.getText().toString();
            String shuffleName = shuffleName(inputName);
            binding.shuffleName.setText(shuffleName);
        });
    }

    private static String shuffleName(String name) {
        String[] names = name.split(" ");
        String word = names[1] + " " + names[0];
        System.out.println(word);
        return word;
    }

}