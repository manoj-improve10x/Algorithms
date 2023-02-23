package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityFindSentenceBinding;

public class FindSentenceActivity extends AppCompatActivity {

    private ActivityFindSentenceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindSentenceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setTitle("FindTheBomb");
        findTheBombWord();
    }

    private void findTheBombWord() {
        binding.checkBtn.setOnClickListener(v -> {
            String inputSentence = binding.inputTxt.getText().toString();
            String output =findTheSentence(inputSentence);
            Toast.makeText(this, output, Toast.LENGTH_SHORT).show();
        });
    }

    private static String findTheSentence(String sentence) throws NullPointerException {
        try {
            String result = "Relax, there's no Bomb";
            String sentences = sentence.toUpperCase();
            if (sentences.contains("BOMB")) {
                result = "Bomb";
            }
            return result;
        } catch (Exception exception) {
            exception.printStackTrace();
            throw new NullPointerException();
        }
    }
}