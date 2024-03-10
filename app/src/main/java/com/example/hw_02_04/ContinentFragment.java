package com.example.hw_02_04;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.hw_02_04.databinding.FragmentContinentBinding;

import java.util.ArrayList;


public class ContinentFragment extends Fragment implements OnItemClick {

    private FragmentContinentBinding binding;
    private ArrayList<String> countryList = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();

        ContinentAdapter adapter = new ContinentAdapter(countryList, this);
        binding.rvContinent.setAdapter(adapter);
    }

    private void loadData() {
        countryList.add("Eurasia");
        countryList.add("Africa");
        countryList.add("North America");
        countryList.add("South America");
        countryList.add("Australia");
    }

    @Override
    public void onClick(int position) {
        Bundle bundle = new Bundle();
        String continent = countryList.get(position);
        bundle.putString("key1", continent);
        CountryFragment secondFragment = new CountryFragment();
        secondFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, secondFragment).addToBackStack(null).commit();
    }
}