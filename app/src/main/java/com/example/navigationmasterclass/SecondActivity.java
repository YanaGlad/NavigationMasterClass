package com.example.navigationmasterclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.example.navigationmasterclass.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Bundle arguments = getIntent().getExtras();
        String subtitle = arguments.get(MainActivity.TEXT_KEY).toString();
        binding.subtitle.setText(subtitle);
    }
}
