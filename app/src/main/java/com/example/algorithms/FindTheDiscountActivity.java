package com.example.algorithms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.algorithms.databinding.ActivityFindTheDiscountBinding;

public class FindTheDiscountActivity extends AppCompatActivity {

    private ActivityFindTheDiscountBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFindTheDiscountBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        findTheDiscount();
    }

    private void findTheDiscount() {
        binding.submitButton.setOnClickListener(v -> {
            String price = binding.originalPrice.getText().toString();
            String discount = binding.discountPers.getText().toString();
            int originalPrice = Integer.parseInt(price);
            int discountPrs = Integer.parseInt(discount);
            double finalPrice = discount(originalPrice, discountPrs);
            Toast.makeText(this, "Final Price: "+String.valueOf(finalPrice), Toast.LENGTH_LONG).show();
        });
    }

    private static double discount(int price, int percentage) {
        double original = 0;
        double dP = price * percentage / 100;
        original = price - dP;
        System.out.println(original);
        return original;
    }
}