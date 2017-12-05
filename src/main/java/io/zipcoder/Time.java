
package io.zipcoder;

public class Time {
    private int hour;
    private int minute;
    private String amORpm;
    Time(int hour,int minute,String amORpm){
        this.hour = hour;
        this.minute = minute;
        this.amORpm = amORpm;
    }

    public void setHour(int newHour){
        this.hour = newHour;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getAmORpm() {
        return amORpm;
    }

    @Override
    public String toString(){
        return "Hour => "+hour+"\nMinute => "+minute;
    }
}