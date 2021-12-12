package com.example.reto2.ui.sucursales;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.reto2.databinding.FragmentSucursalesBinding;

public class SucursalesFragment extends Fragment {

    private SucursalesViewModel sucursalesViewModel;
    private FragmentSucursalesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        sucursalesViewModel =
                new ViewModelProvider(this).get(SucursalesViewModel.class);

        binding = FragmentSucursalesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


}


