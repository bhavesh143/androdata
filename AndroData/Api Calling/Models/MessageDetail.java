package com.example.yamiitsolution.quotesandstatus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MessageDetail {

    @SerializedName("message_id")
    @Expose
    private String messageId;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("category_name")
    @Expose
    private String categoryName;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
