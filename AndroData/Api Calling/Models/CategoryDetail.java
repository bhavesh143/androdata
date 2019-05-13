package com.example.yamiitsolution.quotesandstatus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoryDetail {


    @SerializedName("category_id")
    @Expose
    private String categoryId;
    @SerializedName("category_name")
    @Expose
    private String categoryName;
    @SerializedName("category_imageurl")
    @Expose
    private String categoryImageurl;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryImageurl() {
        return categoryImageurl;
    }

    public void setCategoryImageurl(String categoryImageurl) {
        this.categoryImageurl = categoryImageurl;
    }

}
