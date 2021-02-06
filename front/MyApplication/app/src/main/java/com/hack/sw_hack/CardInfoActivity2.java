package com.hack.sw_hack;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//카테고리 확인
public class CardInfoActivity2 extends Activity {
    public static final String TAG = "CardInfoActivity";

    // Whether the Log Fragment is currently shown
    private boolean mLogShown;
    Button backbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_info);

        backbutton = findViewById(R.id.backButton);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
