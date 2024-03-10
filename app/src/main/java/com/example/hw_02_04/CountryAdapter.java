package com.example.hw_02_04;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.hw_02_04.databinding.ItemCountryBinding;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {
    private ArrayList<String> countryList;

    public CountryAdapter(ArrayList<String> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(ItemCountryBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false)) ;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.onBind(countryList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}
class CountryViewHolder extends RecyclerView.ViewHolder {
    private ItemCountryBinding binding;
    public CountryViewHolder(@NonNull ItemCountryBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }
    public void onBind(String country){
        binding.tvCountry.setText(country);
    }
}