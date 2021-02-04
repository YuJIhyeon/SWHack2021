package com.hack.sw_hack;

import android.widget.ImageView;

public class SingleItemModel {

    private String wise_saying;
    private Integer img;


    public SingleItemModel() {
    }

    public SingleItemModel(String wise_saying, Integer img) {
        this.wise_saying = wise_saying;
        this.img = img;
    }


    public Integer getImg() {
        return img;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    public String getWise_saying() {
        return wise_saying;
    }

    public void setWise_saying(String wise_saying) {
        this.wise_saying = wise_saying;
    }


}
