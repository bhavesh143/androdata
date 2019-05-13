package com.example.yamiitsolution.quotesandstatus.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Message {


    @SerializedName("message_detail")
    @Expose
    private List<MessageDetail> messageDetail = null;
    @SerializedName("success")
    @Expose
    private Integer success;

    public List<MessageDetail> getMessageDetail() {
        return messageDetail;
    }

    public void setMessageDetail(List<MessageDetail> messageDetail) {
        this.messageDetail = messageDetail;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }
/*
    String MessageText;

    public Message(String MessageText)
    {
        this.MessageText = MessageText;
    }

    public String getMessageText ()
    {
        return MessageText;
    }

    public void setMessageText(String MessageText)
    {
        this.MessageText = MessageText;
    }*/
}
