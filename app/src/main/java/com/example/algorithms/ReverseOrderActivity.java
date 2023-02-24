package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityReverseOrderBinding;

public class ReverseOrderActivity extends AppCompatActivity {

    private ActivityReverseOrderBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityReverseOrderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("ReverseOrderOfString");
        getReverseOrderString();
    }

    private void getReverseOrderString() {
        binding.submitBtn.setOnClickListener(v -> {
            String inputText = binding.inputTxt.getText().toString();
            String output = getReverseOrderOfString(inputText);
            binding.outputTxt.setText(output);
        });
    }

    private static String getReverseOrderOfString(String words) {
        String stsRv = "";
        for (int i = words.length() - 1; i >= 0; i--)
            stsRv += words.charAt(i);
        System.out.println(stsRv);
        return stsRv;
    }
}