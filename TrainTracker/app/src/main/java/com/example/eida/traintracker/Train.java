package com.example.eida.traintracker;

public class Train {

    public String title, code, sms_code;

    public Train(){

    }

    public Train(String title, String code,String sms_code ){

        this.title = title;
        this.code = code;
        this.sms_code = sms_code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSms_code() {
        return sms_code;
    }

    public void setSms_code(String sms_code) {
        this.sms_code = sms_code;
    }
}


