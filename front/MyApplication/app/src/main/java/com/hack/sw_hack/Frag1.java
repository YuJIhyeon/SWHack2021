package com.hack.sw_hack;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Frag1 extends Fragment{
/*
    private View view;
    RecyclerView recyclerView1;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);

        recyclerView1 = (RecyclerView) view.findViewById(R.id.recyclerview1);
        recyclerView1.setHasFixedSize(true);

        ArrayList<SingleItemModel> list = new ArrayList<>();
        for (int i=0; i<10; i++) {
            SingleItemModel m = new SingleItemModel("ss"+i,"dd"+i);
            list.add(m) ;
        }

        // 리사이클러뷰에 LinearLayoutManager 객체 지정.
        recyclerView1.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.HORIZONTAL, false)) ;

        // 리사이클러뷰에 SimpleTextAdapter 객체 지정.
        MovieAdapter adapter = new MovieAdapter(list) ;
        recyclerView1.setAdapter(adapter);

        return view;
    }

 */

    private View view;
    ArrayList<SectionDataModel> allSampleData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag1, container, false);



        allSampleData = new ArrayList<SectionDataModel>();


        createDummyData();


        RecyclerView my_recycler_view = (RecyclerView) view.findViewById(R.id.my_recycler_view);

        my_recycler_view.setHasFixedSize(true);

        RecyclerViewDataAdapter adapter = new RecyclerViewDataAdapter(this.getContext(), allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));

        my_recycler_view.setAdapter(adapter);

        return view;
    }

    public void createDummyData() {
        String[] t = {"영화 속 가라사대", "위인들의 가라사대", "만화속의 가라사대"};
        for (int i = 0; i <= 2; i++) {

            SectionDataModel dm = new SectionDataModel();

            dm.setHeaderTitle(t[i]);//가로 리사이클러뷰 제목

            ArrayList<SingleItemModel> singleItem = new ArrayList<SingleItemModel>();
            singleItem.add(new SingleItemModel("될 되로 ", R.mipmap.logo_ver2));   //내부 리사이클러뷰 글, 이미
            singleItem.add(new SingleItemModel("명언2", R.mipmap.logo_ver2));
            singleItem.add(new SingleItemModel("명언3", R.mipmap.logo_ver2));

            dm.setAllItemsInSection(singleItem);

            allSampleData.add(dm);

        }
    }
}
