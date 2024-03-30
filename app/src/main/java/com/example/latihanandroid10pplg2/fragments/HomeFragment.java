package com.example.latihanandroid10pplg2.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.latihanandroid10pplg2.KalkulatorActivity;
import com.example.latihanandroid10pplg2.R;
import com.example.latihanandroid10pplg2.RecViewActivity;

public class HomeFragment extends Fragment implements View.OnClickListener {

    private ImageButton btnKalkulator, btnRecView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        btnKalkulator = rootView.findViewById(R.id.kalkulator_btn);
        btnRecView = rootView.findViewById(R.id.recyclerview_btn);

        btnKalkulator.setOnClickListener(this);
        btnRecView.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        Intent kalkulatorActivity = new Intent(requireActivity(), KalkulatorActivity.class);
        Intent recViewActivity = new Intent(requireActivity(), RecViewActivity.class);

        if (v.getId() == R.id.kalkulator_btn) {
            startActivity(kalkulatorActivity);
        } else if (v.getId() == R.id.recyclerview_btn) {
            startActivity(recViewActivity);
        }
    }
}
