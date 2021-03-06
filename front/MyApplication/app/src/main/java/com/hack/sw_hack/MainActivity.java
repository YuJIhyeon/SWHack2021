package com.hack.sw_hack;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Frag1 frag1;
    private Frag2 frag2;
    private Frag3 frag3;
    private Frag4 frag4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomNavi);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.action_home:
                        setFrag(0);
                        break;
                    case R.id.action_add:
                        setFrag(1);
                        break;
                    case R.id.action_find:
                        setFrag(2);
                        break;
                    case R.id.action_setting:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });
        frag1 = new Frag1();
        frag2 = new Frag2();
        frag3 = new Frag3();
        frag4 = new Frag4();
        setFrag(0); //첫화면 지정

    }

    private void setFrag(int n){

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n){
            case 0: //home
                ft.replace(R.id.main_frame, frag1);
                ft.commit();
                break;
            case 1: //add
                ft.replace(R.id.main_frame, frag2);
                ft.commit();
                break;
            case 2: //find
                ft.replace(R.id.main_frame, frag3);
                ft.commit();
                break;
            case 3: //setting
                ft.replace(R.id.main_frame, frag4);
                ft.commit();
                break;
        }

    }
}