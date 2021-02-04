package com.hack.sw_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
    Boolean[] selectButton = new Boolean[6];
    ArrayList<Button> buttonList = new ArrayList<>();
    final int[] buttonIndex = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6};
    Button nextButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(this);
        for(int i = 0; i<6; i++){
            buttonList.add((Button) findViewById(buttonIndex[i]));
            buttonList.get(i).setOnClickListener(this);
            selectButton[i] = false;
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:  //연예
                if(selectButton[0]){
                    selectButton[0] = false;
                }else{
                    selectButton[0] = true;
                }
                break;
            case R.id.button2:  //비지니스
                if(selectButton[1]){

                }else{

                }
                break;
            case R.id.button3:  //자기관리
                if(selectButton[2]){

                }else{

                }
                break;
            case R.id.button4:  //시간관리
                if(selectButton[3]){

                }else{

                }
                break;
            case R.id.button5:  //인간관계
                if(selectButton[4]){

                }else{

                }
                break;
            case R.id.button6:  //자산관리
                if(selectButton[5]){

                }else{

                }
                break;
            case R.id.next:
                finish();
                startActivity(new Intent(SelectActivity.this, MainActivity.class));
        }
    }
}