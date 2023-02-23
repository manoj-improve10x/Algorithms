package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityThreeProgrammersBinding;

public class ThreeProgrammersActivity extends AppCompatActivity {

    private ActivityThreeProgrammersBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThreeProgrammersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findAveragePaid();
    }

    private void findAveragePaid() {
        binding.checkBtn.setOnClickListener(v -> {
            String paidOneTxt = binding.paidOne.getText().toString();
            String paidTwoTxt = binding.paidTwo.getText().toString();
            String paidThreeTxt = binding.paidThree.getText().toString();
            int paidOne = Integer.parseInt(paidOneTxt);
            int paidTwo = Integer.parseInt(paidTwoTxt);
            int paidThree = Integer.parseInt(paidThreeTxt);
            int averagePaid = findDifferanceOfMaxAndMin(paidOne, paidTwo,paidThree);
            Toast.makeText(this, "Differance is: "+averagePaid, Toast.LENGTH_SHORT).show();
        });
    }

    private static int findDifferanceOfMaxAndMin(int pay1, int pay2, int pay3) {
        int differance = 0;
        int maxPay = 0;
        int minPay = 0;
        if (pay1 > pay2 && pay1 > pay3) {
            maxPay = pay1;
            if (pay2 < pay3) {
                minPay = pay2;
            } else {
                minPay = pay3;
            }
        } else if (pay2 > pay3) {
            maxPay = pay2;
            if (pay1 < pay2) {
                minPay = pay1;
            } else {
                minPay = pay2;
            }
        } else {
            maxPay = pay3;
            if (pay1 < pay2) {
                minPay = pay1;
            } else {
                minPay = pay2;
            }
        }
        differance = maxPay - minPay;
        System.out.println(differance);
        return differance;
    }
}