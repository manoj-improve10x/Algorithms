package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityEvenNumberBinding;

public class EvenNumberActivity extends AppCompatActivity {

    private ActivityEvenNumberBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityEvenNumberBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("Even Number");
        findEvenNumber();
    }

    private void findEvenNumber() {
        binding.checkBtn.setOnClickListener(v -> {
            String inputNumberTxt = binding.inputNumberTxt.getText().toString();
            int inputNumber = Integer.parseInt(inputNumberTxt);
            int evenNumber = findNthEvenNumber(inputNumber);
            Toast.makeText(this, "EvenNumber is: "+evenNumber, Toast.LENGTH_SHORT).show();
        });
    }

    private static int findNthEvenNumber(int number) {
        int evenNumber = 0;
        evenNumber = 2 * (number - 1);
        System.out.println(evenNumber);
        return evenNumber;
    }
}