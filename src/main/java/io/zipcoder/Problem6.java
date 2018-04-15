package io.zipcoder;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {
    //Calendar is a singleton and you HAVE to call .getInstance *protected constructor*
    private Calendar calendar = Calendar.getInstance();
    private String hour;
    private String minute;

    public String convertToMilitary(String input) {
        //Separate Hour & Minute
        calendar.set(Calendar.HOUR, Integer.parseInt(input.substring(0, input.indexOf(":"))));
        calendar.set(Calendar.MINUTE,
                //if it is a double digit hour then you index at 5 else index at 4
                Integer.parseInt(input.substring(input.indexOf(":") + 1 , calendar.get(Calendar.HOUR)>9?5:4)));
        //If I want to check seconds, too - I would need to change the formatter to reflect HH:mm:ss
        //calendar.set(Calendar.SECOND, 00);

        //Check if AM or PM
        calendar.set(Calendar.AM_PM, input.substring(input.length() - 2).equalsIgnoreCase("am") ? Calendar.AM : Calendar.PM);

        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
        return formatter.format(calendar.getTime());

    }

    public Map<Integer, String> minuteMap = new HashMap<Integer, String>(){
        {
            put(1, "One"); put(2, "Two"); put(3, "Three"); put(4, "Four"); put(5, "Five");
            put(6, "Six"); put(7, "Seven"); put(8, "Eight"); put(9, "Nine"); put(10, "Ten");
            put(11, "Eleven"); put(12, "Twelve"); put(13, "Thirteen"); put(14, "Fourteen");
            put(15, "Fifteen"); put(16, "Sixteen"); put(17, "Seventeen"); put(18, "Eighteen");
            put(19, "Nineteen"); put(20, "Twenty"); put(21, "Twenty One"); put(22, "Twenty Two");
            put(23, "Twenty Three"); put(24, "Twenty Four"); put(25, "Twenty Five");put(26, "Twenty Six");
            put(27, "Twenty Seven"); put(28, "Twenty Eight"); put(29, "Twenty Nine"); put(30, "Thirty");
            put(31, "Thirty One");  put(32, "Thirty Two"); put(33, "Thirty Three"); put(34, "Thirty Four");
            put(35, "Thirty Five"); put(36, "Thirty Six"); put(37, "Thirty Seven"); put(38, "Thirty Eight");
            put(39, "Thirty Nine"); put(40, "Forty"); put(41, "Forty One"); put(42, "Forty Two");
            put(43, "Forty Three"); put(44, "Forty Four"); put(45, "Forty Five");put(46, "Forty Six");
            put(47, "Forty Seven"); put(48, "Forty Eight"); put(49, "Forty Nine"); put(50, "Fifty");
            put(51, "Fifty One"); put(52, "Fifty Two"); put(53, "Fifty Three"); put(54, "Fifty Four");
            put(55, "Fifty Five");put(56, "Fifty Six"); put(57, "Fifty Seven"); put(58, "Fifty Eight"); put(59, "Fifty Nine");
        }
    };

    public Map<Integer, String> hourMap = new HashMap<Integer, String>(){
        {
            put(1, "Zero One"); put(2, "Zero Two"); put(3, "Zero Three"); put(4, "Zero Four"); put(5, "Zero Five");
            put(6, "Zero Six"); put(7, "Zero Seven"); put(8, "Zero Eight"); put(9, "Zero Nine"); put(10, "Ten");
            put(11, "Eleven"); put(12, "Twelve"); put(13, "Thirteen"); put(14, "Fourteen");
            put(15, "Fifteen"); put(16, "Sixteen"); put(17, "Seventeen"); put(18, "Eighteen");
            put(19, "Nineteen"); put(20, "Twenty"); put(21, "Twenty One"); put(22, "Twenty Two");
            put(23, "Twenty Three"); put(24, "Twenty Four");
        }
    };

    public String parseToString(String input) {
        String[] time = convertToMilitary(input).split(":");
        time[1] = minuteMap.get(calendar.get(Calendar.MINUTE));
        time[0] = hourMap.get(calendar.get(Calendar.HOUR_OF_DAY));
        return time[0] + " Hundred and " + time[1] + " Hours";
    }
}