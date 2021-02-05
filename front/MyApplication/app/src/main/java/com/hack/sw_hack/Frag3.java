package com.hack.sw_hack;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< HEAD
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
=======
>>>>>>> parent of ef87ba4... .

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Frag3 extends Fragment {

    private View view;
<<<<<<< HEAD
    ImageButton btn;
    ImageView iv;
    String[] items = {"글귀", "태그", "분야"};
    Spinner spinner;
=======

>>>>>>> parent of ef87ba4... .
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag3, container, false);
<<<<<<< HEAD
        iv = (ImageView) view.findViewById(R.id.view1);
        btn = (ImageButton) view.findViewById(R.id.button);
        spinner = (Spinner) view.findViewById(R.id.since_spinner);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //iv.setVisibility(View.VISIBLE);
                iv.setImageResource(R.drawable.result);
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,items );

        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        // 스피너에 어댑터 설정
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
=======
>>>>>>> parent of ef87ba4... .

        return view;
    }
}
