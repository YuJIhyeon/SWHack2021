package com.hack.sw_hack;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderCardv extends RecyclerView.ViewHolder {
    TextView wish, writer;
    ImageView image;

    public ViewHolderCardv(@NonNull View itemView){
        super(itemView);

        wish = itemView.findViewById(R.id.wish_saying_text);
        writer = itemView.findViewById(R.id.writer_id);

        image = itemView.findViewById(R.id.imageView2);
    }

    public void onBind(CardvModel data){
        wish.setText(data.getWish());
        writer.setText(data.getWriter());
        image.setImageResource(data.getImage());

    }
}
