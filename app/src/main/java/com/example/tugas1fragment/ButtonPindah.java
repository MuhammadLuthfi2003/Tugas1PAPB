package com.example.tugas1fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ButtonPindah} factory method to
 * create an instance of this fragment.
 */
public class ButtonPindah extends Fragment {

    public ButtonPindah() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View rootView = inflater.inflate(R.layout.fragment_button_pindah, container, false);
        Button pindahButton = rootView.findViewById(R.id.button_fragment);

        boolean isInDesc = false;

        pindahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView description = rootView.findViewById(R.id.Description);

                if (isInDesc) {

                }
                else {
                    
                }
            }
        });

        return rootView;
    }
}