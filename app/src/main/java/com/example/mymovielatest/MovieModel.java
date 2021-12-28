package com.example.mymovielatest;

public class MovieModel {
    private String category_name, category_imgURL;

    public String getImgURL(){
        return category_imgURL;
    }

    public void setImgURL(String imgURL){
        this.category_imgURL = imgURL;
    }

    public String getName() {
        return category_name;
    }

    public void setName(String name) {
        this.category_name = name;
    }


}
