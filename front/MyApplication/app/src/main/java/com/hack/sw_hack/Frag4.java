package com.hack.sw_hack;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static android.view.View.GONE;


public class Frag4 extends Fragment {

    private View view;
    TextView gara01, gara02, gara03, gara04, gara05, gara06;
    TextView gara_Button, like_Button , gara_Button2, like_Button2;
    boolean[] array = {false, false, false, false, false, false};
    LinearLayout linearLayout01, linearLayout02, linearLayout03, linearLayout04, linearLayout05, linearLayout06;
    TextView t1;
    LinearLayout l1, l2;
    ScrollView scrollView_gara, scrollView_like;
    ImageView imageView1, imageView2, imageView3, imageView4;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag4, container, false);

        gara_Button = (TextView) view.findViewById(R.id.frag4_left);
        gara_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //가라사대
                Toast.makeText(view.getContext(), " <<input like Button ", Toast.LENGTH_SHORT).show();
                l1 = (LinearLayout) view.findViewById(R.id.l1);
                l1.setVisibility(View.VISIBLE);
                l2 = (LinearLayout) view.findViewById(R.id.l2);
                l2.setVisibility(GONE);
                scrollView_gara = (ScrollView) view.findViewById(R.id.scrollView_gara);
                scrollView_gara.setVisibility(View.VISIBLE);
                scrollView_like = (ScrollView) view.findViewById(R.id.scrollView_like);
                scrollView_like.setVisibility(GONE);
            }
        });
        gara_Button2 = (TextView) view.findViewById(R.id.frag4_left2);
        gara_Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //가라사대
                Toast.makeText(view.getContext(), " <<input like Button ", Toast.LENGTH_SHORT).show();
                l1 = (LinearLayout) view.findViewById(R.id.l1);
                l1.setVisibility(View.VISIBLE);
                l2 = (LinearLayout) view.findViewById(R.id.l2);
                l2.setVisibility(GONE);
                scrollView_gara = (ScrollView) view.findViewById(R.id.scrollView_gara);
                scrollView_gara.setVisibility(View.VISIBLE);
                scrollView_like = (ScrollView) view.findViewById(R.id.scrollView_like);
                scrollView_like.setVisibility(GONE);
            }
        });

        like_Button = (TextView) view.findViewById(R.id.setting_like_button);
        like_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//좋아요
                Toast.makeText(view.getContext(), " >>input like Button ", Toast.LENGTH_SHORT).show();
                l1 = (LinearLayout) view.findViewById(R.id.l1);
                l1.setVisibility(GONE);
                l2 = (LinearLayout) view.findViewById(R.id.l2);
                l2.setVisibility(View.VISIBLE);
                scrollView_gara = (ScrollView) view.findViewById(R.id.scrollView_gara);
                scrollView_gara.setVisibility(GONE);
                scrollView_like = (ScrollView) view.findViewById(R.id.scrollView_like);
                scrollView_like.setVisibility(View.VISIBLE);
            }
        });
        like_Button2 = (TextView) view.findViewById(R.id.setting_like_button2);
        like_Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {//좋아요
                Toast.makeText(view.getContext(), " >>input like Button ", Toast.LENGTH_SHORT).show();
                l1 = (LinearLayout) view.findViewById(R.id.l1);
                l1.setVisibility(GONE);
                l2 = (LinearLayout) view.findViewById(R.id.l2);
                l2.setVisibility(View.VISIBLE);
                scrollView_gara = (ScrollView) view.findViewById(R.id.scrollView_gara);
                scrollView_gara.setVisibility(GONE);
                scrollView_like = (ScrollView) view.findViewById(R.id.scrollView_like);
                scrollView_like.setVisibility(View.VISIBLE);
            }
        });
        gara01 = (TextView) view.findViewById(R.id.frag4_01);
        gara02 = (TextView) view.findViewById(R.id.frag4_02);
        gara03 = (TextView) view.findViewById(R.id.frag4_03);
        gara04 = (TextView) view.findViewById(R.id.frag4_04);
        gara05 = (TextView) view.findViewById(R.id.frag4_05);
        gara06 = (TextView) view.findViewById(R.id.frag4_06);
        t1 = (TextView) view.findViewById(R.id.t1);
        l1 = (LinearLayout) view.findViewById(R.id.l1);
        gara01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(array[0]){
                   t1.setVisibility(GONE);
                   l1.setVisibility(GONE);
                   linearLayout01 = (LinearLayout) view.findViewById(R.id.linearLayout01);
                   linearLayout01.setVisibility(View.VISIBLE);
                   array[0] = !array[0];
               }else{
                   t1.setVisibility(View.VISIBLE);
                   l1.setVisibility(View.VISIBLE);
                   linearLayout01 = (LinearLayout) view.findViewById(R.id.linearLayout01);
                   linearLayout01.setVisibility(GONE);
                   array[0] = !array[0];
               }
            }
        });
        gara02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(array[1]){
                    t1.setVisibility(GONE);
                    l1.setVisibility(GONE);
                    linearLayout02 = (LinearLayout) view.findViewById(R.id.linearLayout02);
                    linearLayout02.setVisibility(View.VISIBLE);
                    array[1] = !array[1];
                }else{
                    t1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    linearLayout02 = (LinearLayout) view.findViewById(R.id.linearLayout02);
                    linearLayout02.setVisibility(GONE);
                    array[1] = !array[1];
                }
            }
        });
        gara03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(array[2]){
                    t1.setVisibility(GONE);
                    l1.setVisibility(GONE);
                    linearLayout03 = (LinearLayout) view.findViewById(R.id.linearLayout03);
                    linearLayout03.setVisibility(View.VISIBLE);
                    array[2] = !array[2];
                }else{
                    t1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    linearLayout03 = (LinearLayout) view.findViewById(R.id.linearLayout03);
                    linearLayout03.setVisibility(GONE);
                    array[2] = !array[2];
                }
            }
        });
        gara04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(array[3]){
                    t1.setVisibility(GONE);
                    l1.setVisibility(GONE);
                    linearLayout04 = (LinearLayout) view.findViewById(R.id.linearLayout04);
                    linearLayout04.setVisibility(View.VISIBLE);
                    array[3] = !array[3];
                }else{
                    t1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    linearLayout04 = (LinearLayout) view.findViewById(R.id.linearLayout04);
                    linearLayout04.setVisibility(GONE);
                    array[3] = !array[3];
                }
            }
        });
        gara05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(array[4]){
                    t1.setVisibility(GONE);
                    l1.setVisibility(GONE);
                    linearLayout05 = (LinearLayout) view.findViewById(R.id.linearLayout05);
                    linearLayout05.setVisibility(View.VISIBLE);
                    array[4] = !array[4];
                }else{
                    t1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    linearLayout05 = (LinearLayout) view.findViewById(R.id.linearLayout05);
                    linearLayout05.setVisibility(GONE);
                    array[4] = !array[4];
                }
            }
        });
        gara06.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(array[5]){
                    t1.setVisibility(GONE);
                    l1.setVisibility(GONE);
                    linearLayout06 = (LinearLayout) view.findViewById(R.id.linearLayout06);
                    linearLayout06.setVisibility(View.VISIBLE);
                    array[5] = !array[5];
                }else{
                    t1.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    linearLayout06 = (LinearLayout) view.findViewById(R.id.linearLayout06);
                    linearLayout06.setVisibility(GONE);
                    array[5] = !array[5];
                }
            }
        });


        /*gara_Button = (TextView) view.findViewById(R.id.tt1);   //가라시대
        gara_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1 = (TextView) view.findViewById(R.id.t1);
                l1 = (LinearLayout) view.findViewById(R.id.l1);
                t1.setVisibility(View.GONE);
                l1.setVisibility(View.GONE);
            }
        });
*/
        imageView1 = (ImageView) view.findViewById(R.id.view1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), CardInfoActivity.class));
            }
        });
        imageView2 = (ImageView) view.findViewById(R.id.view2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), CardInfoActivity.class));
            }
        });
        imageView3 = (ImageView) view.findViewById(R.id.view3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), CardInfoActivity2.class));
            }
        });
        imageView4 = (ImageView) view.findViewById(R.id.view4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(view.getContext(), CardInfoActivity2.class));
            }
        });
        return view;
    }
}
