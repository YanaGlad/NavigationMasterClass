package com.example.navigationmasterclass;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.navigationmasterclass.databinding.ActivityNavigationBinding;

public class NavigationActivity extends AppCompatActivity {

    ActivityNavigationBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}