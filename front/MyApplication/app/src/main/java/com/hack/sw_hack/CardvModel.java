package com.hack.sw_hack;

public class CardvModel {
    String wish;
    String writer;
    int image;

    public CardvModel(String wish, String writer, int image){
        this.wish = wish;
        this.writer = writer;
        this.image = image;
    }

    public String getWish() {
        return wish;
    }

    public void setWish(String wish) {
        this.wish = wish;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
