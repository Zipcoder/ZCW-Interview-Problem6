package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem6 {
    public String toMilitaryTimeConvertor(String input) {


        return hourToMilitaryHourConversion(input) + " " + minuteToMilitaryMinuteConversion(input);
    }

    public String getHourString(String input) {
        String output = "";

        // String[] numArrayPm = {};
        String[] splitedHour = input.split(":");
        String hourString = splitedHour[0];
        return hourString;
    }

    public Boolean toMilitaryPeriodConversion(String input) {

        String[] splitedHour = input.split(":");
        String period = Character.toString(splitedHour[1].charAt(2));

        return (period.equalsIgnoreCase("a"));


    }


    public String hourToMilitaryHourConversion(String input) {

        Map<String, String> hourMap = new HashMap<String, String>();
        String[] hourArray = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Eleven" ,
                "Thirteen" , "Fourteen" , "Fifteen" , "Sixsteen" , "Seventeen" , "Eighteen" , "Nineteen" , "Twenty" , "Twenty One" , "Twenty Two" , "Twenty Three"};
        for (int i = 0; i < hourArray.length; i++) {

            hourMap.put("" + i , hourArray[i]);
        }
        String hours = getHourString(input);
        String milHour = "";

        if (toMilitaryPeriodConversion(input) && hourMap.containsKey(hours)) {
            if (hours.length() == 1) {
                milHour = "Zero " + hourMap.get(hours) + " Hundred";
            } else
                milHour = hourMap.get(hours) + " Hundred";
        } else {
            hours = "" + (Integer.parseInt(getHourString(input)) + 11);
            milHour = hourMap.get(hours) + " Hundred";
        }


        return milHour;

    }

    public String getMinute(String input) {

        String[] splitedHour = input.split(":");
        String minutString = splitedHour[1].split("p|a")[0];

        if (minutString.split("")[0].equalsIgnoreCase("0")) {
            minutString = minutString.split("")[1];
        }


        return minutString;


    }

//    public String getFormatedMinute(String input) {
//
//        Map<String, String> separtedMinuteMap = new HashMap<String, String>();
//        Map<String, String> separtedMinuteMap2 = new HashMap<String, String>();
//        String[] minuteArray = { "Twenty" ,"Thirty" , "Fourty" , "Fifty"};
//        String[] minute2Array = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine"};
//        for (int i = 2; i < minuteArray.length; i++) {
//
//            separtedMinuteMap.put("" + i , minuteArray[i]);
//        }
//        for (int i = 0; i < minute2Array.length; i++) {
//
//            separtedMinuteMap2.put("" + i , minute2Array[i]);
//        }
//
//        String minutString = getMinute(input);
//        String subminute1 = minutString.split("")[0];
//        String subminute2 = minutString.split("")[1];
//
//        return separtedMinuteMap.get(subminute1) + " " + separtedMinuteMap2.get(subminute2) + " Hours";
//
//
//    }

    public String minuteToMilitaryMinuteConversion(String input) {

        Map<String, String> minuteMap = new HashMap<String, String>();
        String[] minuteArray = {"Zero" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" , "Eight" , "Nine" , "Ten" , "Eleven" ,
                "Thirteen" , "Fourteen" , "Fifteen" , "Sixsteen" , "Seventeen" , "Eighteen" , "Nineteen" , "Twenty" ,
                "Thirty" , "Fourty" , "Fifty"};
        for (int i = 0; i < minuteArray.length; i++) {

            minuteMap.put("" + i , minuteArray[i]);
        }
        String minutes = getMinute(input);

        String milMinute = "";
        if (minuteMap.containsKey(minutes)) {
            if (minutes.length() == 1) {
                milMinute = "Zero " + minuteMap.get(minutes) + " Hours";
            } else
                milMinute = " and " + minuteMap.get(minutes) + " Hours";
        }
        return milMinute;
    }


}
