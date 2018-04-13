package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public String militaryTime(String input) {

        String standardTimePattern = "(1[012]|[1-9]):([0-5][0-9])(am|pm)";
        Pattern pattern = Pattern.compile(standardTimePattern);
        Matcher matcher = pattern.matcher(input);


        String[] minutesAndHours = {"Zero Zero", "Zero One", "Zero Two","Zero Three","Zero Four","Zero Five","Zero Six","Zero Seven", "Zero Eight", "Zero Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
                "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine", "Forty", "Forty One", "Forty Two", "Fourty Three", "Forty Four",
                "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine", "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four", "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine"};


        Integer[] intArray = new Integer[2];
        if(matcher.find()){
            if(matcher.group(3).equals("pm")){
                intArray[0] = Integer.valueOf(matcher.group(1)) + 12;
            } else {
                intArray[0] = Integer.valueOf(matcher.group(1));
            }
            intArray[1] = Integer.valueOf(matcher.group(2));
        }

        String militaryTime ="";
        if(intArray[1] < 10){
            militaryTime = minutesAndHours[intArray[0]] + " Hundred " + minutesAndHours[intArray[1]]+ " Hours";

        }
        else {
            militaryTime= minutesAndHours[intArray[0]] + " Hundred and " + minutesAndHours[intArray[1]] + " Hours";
        }
        return militaryTime;

    }

}
