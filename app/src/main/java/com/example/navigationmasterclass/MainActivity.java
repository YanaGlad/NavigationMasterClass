package com.example.navigationmasterclass;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import com.example.navigationmasterclass.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Навигация и передача данных между activity
        binding.activityNav.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            intent.putExtra(TEXT_KEY, "Hello World");
            startActivity(intent);
        });

        // Fragment Navigation
        getSupportFragmentManager().beginTransaction()
                .add(R.id.nav_host_fragment, FirstFragment.class, null)
                .commit();
    }

    public static final String TEXT_KEY = "text";
}
