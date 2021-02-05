package com.hack.sw_hack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
    //More버튼 눌렀을때
public class MoreActivity extends AppCompatActivity {
    CardvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);
        init();
        getData();
    }

    private void init(){
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        adapter = new CardvAdapter();
        recyclerView.setAdapter(adapter);
    }

        private void getData(){
            CardvModel data = new CardvModel("명언명언명언", "아이언맨",R.mipmap.setting_ex_01);
            adapter.addItem(data);
            data = new CardvModel("토르", "스파이더맨",R.mipmap.setting_ex_01);
            adapter.addItem(data);
            data = new CardvModel("토르", "블랙팬서",R.mipmap.setting_ex_01);
            adapter.addItem(data);
            data = new CardvModel("토르", "닥터스트레인지",R.mipmap.setting_ex_01);
            adapter.addItem(data);
            data = new CardvModel("토르", "헐크",R.mipmap.setting_ex_01);
            adapter.addItem(data);
            data = new CardvModel("토르", "토르",R.mipmap.setting_ex_01);
            adapter.addItem(data);
        }
}