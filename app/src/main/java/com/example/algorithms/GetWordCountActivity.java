package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityGetWordCountBinding;

public class GetWordCountActivity extends AppCompatActivity {

    private ActivityGetWordCountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityGetWordCountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Get Word Count");
        findWordCount();
    }

    private void findWordCount() {
        binding.submitBtn.setOnClickListener(v -> {
            String inputTxt = binding.inputTxt.getText().toString();
            int wordCount = getWordCount(inputTxt);
            Toast.makeText(this, String.valueOf(wordCount), Toast.LENGTH_SHORT).show();
        });
    }

    private static int getWordCount(String names) {
        String[] wordCount = names.split(" ");
        return wordCount.length;
    }

}