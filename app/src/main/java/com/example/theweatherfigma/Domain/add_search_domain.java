package com.example.theweatherfigma.Domain;

public class add_search_domain {
    private String txt_nhietdo, txt_H, txt_L, txt_location, txt_status, img_weather;

    public add_search_domain(String txt_nhietdo, String txt_H, String txt_L, String txt_location, String txt_status, String img_weather) {
        this.txt_nhietdo = txt_nhietdo;
        this.txt_H = txt_H;
        this.txt_L = txt_L;
        this.txt_location = txt_location;
        this.txt_status = txt_status;
        this.img_weather = img_weather;
    }

    public String getTxt_nhietdo() {
        return txt_nhietdo;
    }

    public void setTxt_nhietdo(String txt_nhietdo) {
        this.txt_nhietdo = txt_nhietdo;
    }

    public String getTxt_H() {
        return txt_H;
    }

    public void setTxt_H(String txt_H) {
        this.txt_H = txt_H;
    }

    public String getTxt_L() {
        return txt_L;
    }

    public void setTxt_L(String txt_L) {
        this.txt_L = txt_L;
    }

    public String getTxt_location() {
        return txt_location;
    }

    public void setTxt_location(String txt_location) {
        this.txt_location = txt_location;
    }

    public String getTxt_status() {
        return txt_status;
    }

    public void setTxt_status(String txt_status) {
        this.txt_status = txt_status;
    }

    public String getImg_weather() {
        return img_weather;
    }

    public void setImg_weather(String img_weather) {
        this.img_weather = img_weather;
    }

}
