package com.example.ssfan.notebook.models;

import android.graphics.Bitmap;

public class ContactContent {

    private Bitmap avatar;
    private String name;
    private String phoneNumber;
    private String email;

    public ContactContent(Bitmap avatar, String name, String phoneNumber, String email) {
        this.avatar = avatar;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Bitmap getAvatar() {
        return avatar;
    }

    public void setAvatar(Bitmap avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
