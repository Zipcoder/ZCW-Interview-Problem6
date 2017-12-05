package io.zipcoder;

public class Time {
    private String hours;
    private String minutes;
    private String amOrPm;

    public Time(String input) {
        setHours(input);
        setMinutes(input);
        setAmOrPm(input);
    }

    public void setHours(String input) {
        this.hours = RegexMethods.findPattern("\\d{2}|\\d(?=:)", input);
    }

    public void setMinutes(String input) {
        this.minutes = RegexMethods.findPattern("[0-5]\\d(?!:)", input);
    }

    public void setAmOrPm(String input) {
        this.amOrPm = RegexMethods.findPattern("[aA|pP][mM]", input);
    }

    public String getHours() {
        return hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public String getAmOrPm() {
        return amOrPm;
    }
}