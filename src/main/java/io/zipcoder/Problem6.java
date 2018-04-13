package io.zipcoder;

public class Problem6 {

    // Count hours
    // am = 0, pm = 12

    public String parse(String input) {
        Integer hours = 0;
        Integer minutes = 0;
        String ret = "";
        String[] colonSplit = input.split(":");
        hours += Integer.parseInt(colonSplit[0]);
        minutes += Integer.parseInt(colonSplit[1].substring(0, 2));
        if (colonSplit[1].charAt(2)=='p') {
            hours += 12;
        }
        if (hours < 10) {
            ret += "Zero ";
        }
        ret += hoursToWords(hours);
        ret += " Hundred ";
        if (colonSplit[1].charAt(0)!='0') {
            ret += "and ";
        } else {
            ret += "Zero ";
        }
        ret += minutesToWords(minutes);
        ret += " Hours";
        return ret;
    }

    public String hoursToWords(Integer hours) {
        String ret = "";
        return ret;
    }

    public String minutesToWords(Integer minutes) {
        String ret = "";
        return ret;
    }

    public Integer testMethod(String string) {
        Integer ret = Integer.parseInt(string.substring(0, 2));
        return ret;
    }

}
