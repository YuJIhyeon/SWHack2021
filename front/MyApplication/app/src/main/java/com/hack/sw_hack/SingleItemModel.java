package com.hack.sw_hack;

import android.widget.ImageView;

public class SingleItemModel {

    private String wise_saying;
    private String writer;
    private Integer img;


    public SingleItemModel() {
    }

    public SingleItemModel(String wise_saying, String writer,  Integer img) {
        this.wise_saying = wise_saying;
        this.writer = writer;
        this.img = img;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Integer getImg() {
        return R.drawable.logo_ver1;
    }

    public void setImg(Integer img) {
        this.img = R.drawable.logo_ver1;
    }

    public String getWise_saying() {
        return wise_saying;
    }

    public void setWise_saying(String wise_saying) {
        this.wise_saying = wise_saying;
    }


}
