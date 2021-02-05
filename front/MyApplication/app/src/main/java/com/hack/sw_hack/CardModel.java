package com.hack.sw_hack;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CardModel implements Serializable {

        private String wish, author;
        private String image;
        public Map<Object, String> stars = new HashMap<>();
        public CardModel(String wish, String author, String image){
            this.wish= wish;
            this.author = author;
            this.image = image;
        }
        public CardModel(){}

        public Map<Object, String> toMap(){
            Map<Object, String> result = new HashMap<>();
            result.put("author", this.author);
            result.put("wish", this.wish);
            result.put("images", this.image);
            return result;
        }

}
