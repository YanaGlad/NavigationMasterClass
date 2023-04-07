package com.example.navigationmasterclass;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationmasterclass.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    FragmentFirstBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.addButton.setOnClickListener(view1 -> {
            getParentFragmentManager().beginTransaction()
                    .add(R.id.nav_host_fragment, SecondFragment.class, null)
                    .commit();
        });

        binding.replaceButton.setOnClickListener(view1 -> {
                    getParentFragmentManager().beginTransaction()
                            .replace(R.id.nav_host_fragment, SecondFragment.class, null)
                            .commit();
                }
        );
    }
}
