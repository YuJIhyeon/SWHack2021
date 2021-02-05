package com.hack.sw_hack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<CardvModel> list = new ArrayList<>();


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardv, parent, false);
        return new ViewHolderCardv(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolderCardv)holder).onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
    void addItem(CardvModel cm){
        list.add(cm);
    }
}
