package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputReader {

    public  String hourRegex(String input ) {
        String hours = null;
        Pattern pattern = Pattern.compile("\\d*");
        Matcher m = pattern.matcher(input);
        if(m.find()) {
            hours = m.group(0);
        }
        return hours;
    }

    public String minuteRegex(String input){
        String minutes = null;
        Pattern pattern = Pattern.compile(":\\d+");
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            minutes = matcher.group(0);
        }
        minutes = minutes.substring(1);
        return minutes;
    }

    public String amPmRegex(String input){
        String amPm = null;
        Pattern pattern = Pattern.compile("[p|a]m", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);
        if(matcher.find()){
            amPm = matcher.group(0);
        }
        return amPm;
    }
}
