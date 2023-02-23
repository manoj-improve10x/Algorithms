package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityTwoMakesTenBinding;

public class TwoMakesTenActivity extends AppCompatActivity {

    private ActivityTwoMakesTenBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityTwoMakesTenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("TwoMakesTen");
        twoMakesTen();
    }

    private void twoMakesTen(){
        binding.checkButtonBtn.setOnClickListener(v -> {
            String valueOneTxt = binding.valueOneTxt.getText().toString();
            String valueTwoTxt = binding.valueTwoTxt.getText().toString();
            int valueOne = Integer.parseInt(valueOneTxt);
            int valueTwo = Integer.parseInt(valueTwoTxt);
            boolean result = makesTen(valueOne, valueTwo);
            Toast.makeText(this, String.valueOf(result), Toast.LENGTH_SHORT).show();
        });
    }

    private static boolean makesTen(int a, int b) {
        boolean result = false;
        if (a == 10 || b == 10 || a + b == 10) {
            result = true;
        }
        System.out.println(result);
        return result;
    }

}