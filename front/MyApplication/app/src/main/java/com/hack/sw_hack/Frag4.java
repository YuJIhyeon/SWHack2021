package com.hack.sw_hack;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag4 extends Fragment {

    private View view;
    TextView gara01, gara02, gara03, gara04, gara05, gara06;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag4, container, false);

        gara01 = (TextView) view.findViewById(R.id.garalist01);
        gara02 = (TextView) view.findViewById(R.id.garalist02);
        gara03 = (TextView) view.findViewById(R.id.garalist03);
        gara04 = (TextView) view.findViewById(R.id.garalist04);
        gara05 = (TextView) view.findViewById(R.id.garalist05);
        gara06 = (TextView) view.findViewById(R.id.garalist06);
        gara01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });
        return view;
    }
}
