package io.zipcoder;

public class TimeParser {
    private String hours;
    private String minutes;
    private String amOrPm;

    public TimeParser(String input) {
        parseHours(input);
        parseMinutes(input);
        parseAmOrPm(input);
    }

    private void parseHours(String input) {
        this.hours = RegexMethods.findPattern("\\d{2}|\\d(?=:)", input);
    }

    private void parseMinutes(String input) {
        this.minutes = RegexMethods.findPattern("[0-5]\\d(?!:)", input);
    }

    private void parseAmOrPm(String input) {
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