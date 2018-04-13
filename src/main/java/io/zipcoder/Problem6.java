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
            System.out.println(matcher.group(1));
            hour = Integer.parseInt(matcher.group(1));
            System.out.println(matcher.group(2));
            minute = Integer.parseInt(matcher.group(2));
            System.out.println(matcher.group(3));
            meridiem = matcher.group(3);
        }
        if (meridiem.equals("p")){
            hour += 12;
        }
        String stringHour = parseHour(hour);
        result += stringHour;
        return result;
    }

    private String parseHour(int number){
        String result = "";
        if (number < 10){
            result += "Zero ";
        }
        result += parseNumber(number);
        return result;
    }

    private String parseNumber(int number){
        String numberResult = "";
        switch (number){
            case 1:
                numberResult += "One";
                break;
            case 2:
                numberResult += "Two";
                break;
            case 3:
                numberResult += "Three";
                break;
            case 4:
                numberResult += "Four";
                break;
        }
        return numberResult;
    }
}
