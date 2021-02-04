package com.hack.sw_hack;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Frag1 extends Fragment{

    private View view;
    RecyclerView recyclerView;
/*
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        //cardView Test Start
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview1);
        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext(), LinearLayoutManager.HORIZONTAL, false);

        MovieAdapter movieAdapter = new MovieAdapter(getContext());
        movieAdapter.addItem(new MovieItem("ssss","ssss"));

        recyclerView.setAdapter(movieAdapter);

        return view;
    }

    */

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerview1);
        recyclerView.setHasFixedSize(true);

        ArrayList<MovieItem> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            MovieItem m = new MovieItem("ss"+i,"dd"+i);
            list.add(m) ;
        }

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false)) ;

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        MovieAdapter adapter = new MovieAdapter(list) ;
        recyclerView.setAdapter(adapter) ;

        return view;
    }
}
