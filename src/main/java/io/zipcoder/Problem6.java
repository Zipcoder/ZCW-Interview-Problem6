package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public String militaryTime(String inputTime){
        String result = "";
        String regexFormula = "([0-9]*):([0-9]{2})([ap])";
        Pattern pattern = Pattern.compile(regexFormula);
        Matcher matcher = pattern.matcher(inputTime);
        int hour = 0;
        int minute = 0;
        String meridiem = "";
        while (matcher.find()) {
            hour = Integer.parseInt(matcher.group(1));
            minute = Integer.parseInt(matcher.group(2));
            meridiem = matcher.group(3);
        }
        if (meridiem.equals("p")){
            hour += 12;
        }
        result += parseHour(hour);
        result += "Hundred ";
        result += parseMinute(minute);
        result += " Hours";
        return result;
    }

    private String parseHour(int number){
        String result = "";
        if (number < 10){
            result += "Zero ";
        }
        result += NumberToWords.convert(number) + " ";
        return result;
    }

    private String parseMinute(int minute){
        String result = "";
        if (minute < 10){
            result += "Zero ";
        } else {
            result += "and ";
        }
        result += NumberToWords.convert(minute);
        return result;
    }

}
