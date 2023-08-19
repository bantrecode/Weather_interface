package com.example.theweatherfigma.Domain;

public class hourly_domain {
    private String txt_gio_hourly;
    private String img_weather_hourly;
    private String txt_nhietdo_hourly;

    public hourly_domain(String txt_gio_hourly, String img_weather_hourly, String txt_nhietdo_hourly) {
        this.txt_gio_hourly = txt_gio_hourly;
        this.img_weather_hourly = img_weather_hourly;
        this.txt_nhietdo_hourly = txt_nhietdo_hourly;
    }

    public hourly_domain() {
    }

    public String getTxt_gio_hourly() {
        return txt_gio_hourly;
    }

    public void setTxt_gio_hourly(String txt_gio_hourly) {
        this.txt_gio_hourly = txt_gio_hourly;
    }

    public String getImg_weather_hourly() {
        return img_weather_hourly;
    }

    public void setImg_weather_hourly(String img_weather_hourly) {
        this.img_weather_hourly = img_weather_hourly;
    }

    public String getTxt_nhietdo_hourly() {
        return txt_nhietdo_hourly;
    }

    public void setTxt_nhietdo_hourly(String txt_nhietdo_hourly) {
        this.txt_nhietdo_hourly = txt_nhietdo_hourly;
    }
}
