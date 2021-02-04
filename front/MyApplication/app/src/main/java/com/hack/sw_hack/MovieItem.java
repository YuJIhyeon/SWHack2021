package com.hack.sw_hack;

public class MovieItem {

    String name;
    String moblie;

    public MovieItem(String name, String moblie) {
        this.name = name;
        this.moblie = moblie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoblie() {
        return moblie;
    }

    public void setMoblie(String moblie) {
        this.moblie = moblie;
    }
}
