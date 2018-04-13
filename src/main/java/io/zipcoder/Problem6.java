package io.zipcoder;

public class Problem6 {

    public String buildString(String input) {
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

    private String hoursToWords(Integer hours) {
        String ret = "";
        ret += TimeEnum.parseToWord(hours);
        return ret;
    }

    private String minutesToWords(Integer minutes) {
        String ret = "";
        ret += TimeEnum.parseToWord(minutes);
        return ret;
    }

}
