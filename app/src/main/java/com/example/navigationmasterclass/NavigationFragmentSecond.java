package com.example.navigationmasterclass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationmasterclass.databinding.FragmentNavigationSecondBinding;

public class NavigationFragmentSecond extends Fragment {

    FragmentNavigationSecondBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentNavigationSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.backButton.setOnClickListener(view1 -> {
            NavController navController = Navigation.findNavController(binding.getRoot());
            navController.navigate(NavigationFragmentSecondDirections.actionNavigationFragmentSecondToNavigationFragment());
        });
    }
}
