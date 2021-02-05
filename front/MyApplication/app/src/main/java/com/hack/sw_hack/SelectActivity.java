package com.hack.sw_hack;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener {
    Boolean[] selectButton = new Boolean[6];
    ArrayList<ImageButton> buttonList = new ArrayList<>();
    final int[] buttonIndex = {R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6};
    Button nextButton = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);
        nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(this);
        for(int i = 0; i<6; i++){
            buttonList.add((ImageButton) findViewById(buttonIndex[i]));
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
                    buttonList.get(0).setBackgroundResource(R.mipmap.select01);
                }else{
                    selectButton[0] = true;
                    buttonList.get(0).setBackgroundResource(R.mipmap.press_select01);
                }
                break;
            case R.id.button2:  //비지니스
                if(selectButton[1]){
                    selectButton[1] = false;
                    buttonList.get(1).setBackgroundResource(R.mipmap.select02);
                }else{
                    selectButton[1] = true;
                    buttonList.get(1).setBackgroundResource(R.mipmap.press_select02);
                }
                break;
            case R.id.button3:  //자기관리
                if(selectButton[2]){
                    selectButton[2] = false;
                    buttonList.get(2).setBackgroundResource(R.mipmap.select03);

                }else{
                    selectButton[2] = true;
                    buttonList.get(2).setBackgroundResource(R.mipmap.press_select03);

                }
                break;
            case R.id.button4:  //시간관리
                if(selectButton[3]){
                    selectButton[3] = false;
                    buttonList.get(3).setBackgroundResource(R.mipmap.select04);
                }else{
                    selectButton[3] = true;
                    buttonList.get(3).setBackgroundResource(R.mipmap.press_select04);
                }
                break;
            case R.id.button5:  //인간관계
                if(selectButton[4]){

                    selectButton[4] = false;
                    buttonList.get(4).setBackgroundResource(R.mipmap.select05);
                }else{
                    selectButton[4] = true;
                    buttonList.get(4).setBackgroundResource(R.mipmap.press_select05);
                }
                break;
            case R.id.button6:  //자산관리
                if(selectButton[5]){

                    selectButton[5] = false;
                    buttonList.get(5).setBackgroundResource(R.mipmap.select06);
                }else{
                    selectButton[5] = true;
                    buttonList.get(5).setBackgroundResource(R.mipmap.press_select06);
                }
                break;
            case R.id.next:
                finish();
                startActivity(new Intent(SelectActivity.this, MainActivity.class));
        }
    }
}