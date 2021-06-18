package com.example.coffeeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {
TextView title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        title = findViewById(R.id.titleProduct);
        String productName = getIntent().getStringExtra("PRODUCT_NAME");
        title.setText(productName);
    }
}