package com.hack.sw_hack;

import android.content.Context;
import android.graphics.Movie;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.transition.Hold;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    private ArrayList<MovieItem> mData = null ;

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView1,textView2;

        ViewHolder(View itemView) {
            super(itemView) ;

            // 뷰 객체에 대한 참조. (hold strong reference)

            textView1 = itemView.findViewById(R.id.textView);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }

    // 생성자에서 데이터 리스트 객체를 전달받음.
    MovieAdapter(ArrayList<MovieItem> list) {
        mData = list ;
    }

    @NonNull
    @Override
    public MovieAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext() ;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) ;

        View view = inflater.inflate(R.layout.movie_item, parent, false) ;
        MovieAdapter.ViewHolder vh = new MovieAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.ViewHolder holder, int position) {
        String name = mData.get(position).getName() ;
        holder.textView1.setText(name);
        String mobile = mData.get(position).getMoblie() ;
        holder.textView2.setText(mobile);
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }
}
