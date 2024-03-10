package com.example.hw_02_04;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hw_02_04.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}