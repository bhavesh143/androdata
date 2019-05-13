package com.example.yamiitsolution.quotesandstatus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Category {


    @SerializedName("category_detail")
    @Expose
    private List<CategoryDetail> categoryDetail = null;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<CategoryDetail> getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(List<CategoryDetail> categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }
/*
    int Category_image_id;
    String Category_name;

    public Category(int Category_image_id , String Category_name)
    {
        this.Category_image_id = Category_image_id;
        this.Category_name = Category_name;
    }

    public int getCategory_image_id()
    {
        return Category_image_id;
    }
    public String getCategory_name()
    {
        return Category_name;
    }

    public void setCategory_image_id(int Category_image_id)
    {
        this.Category_image_id = Category_image_id;
    }
    public void setCategory_name(String Category_name)
    {
        this.Category_name = Category_name;
    }*/

}
