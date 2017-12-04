package io.zipcoder;

public class Time {
    int hour;
    int minute;
    String amORpm;
    Time(int hour,int minute,String amORpm){
        this.hour = hour;
        this.minute = minute;
        this.amORpm = amORpm;
    }

    @Override
    public String toString(){
        return "Hour => "+hour+"\nMinute => "+minute;
    }
}
