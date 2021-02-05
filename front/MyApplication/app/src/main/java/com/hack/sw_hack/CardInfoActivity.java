package com.hack.sw_hack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

//카테고리 확인
public class CardInfoActivity extends Activity {
    public static final String TAG = "CardInfoActivity";

    // Whether the Log Fragment is currently shown
    private boolean mLogShown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
