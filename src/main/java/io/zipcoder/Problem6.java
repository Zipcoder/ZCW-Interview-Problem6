package io.zipcoder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public String convertToMilitaryTime(String input) throws Exception {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mma");
        Date date = parseFormat.parse(input);
        return convertToWordMilitaryTime(displayFormat.format(date));
    }

    public String convertToWordMilitaryTime(String format) {
        StringBuilder sb = new StringBuilder();
        Map<String, String> hours = new HashMap<String, String>(); //need to populate my map more efficently....
        hours.put("01", "Zero One Hundred");
        hours.put("02", "Two");
        hours.put("03", "Three");
        hours.put("04", "Four");
        hours.put("05", "Five");
        hours.put("06", "Six");
        hours.put("07", "Seven");
        hours.put("08", "Eight");
        hours.put("09", "Nine");
        hours.put("10", "Ten");
        hours.put("11", "Eleven");
        hours.put("12", "Twelve");
        //need 13 to 24....plus will get annoying

        Map<String, String> mins = new HashMap<String, String>();
        mins.put("00", "Zero Zero");
        mins.put("01", "Zero One Hours");
        mins.put("02", "Zero Two Hours");
        mins.put("03", "Zero Three Hours");
        mins.put("04", "Zero Four Hours");
        mins.put("05", "Zero Five Hours");
        mins.put("06", "Zero Six Hours");
        mins.put("07", "Zero Seven Hours");
        mins.put("08", "Zero Eight Hours");
        mins.put("09", "Zero Nine Hours");
        mins.put("10", "Zero Ten Hours");
        mins.put("11", "Eleven Hours");
        mins.put("12", "Twelve Hours");
        //etc....but this wil get annoying

        String regex = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):([0-5][0-9])$";
        Pattern regexPattern = Pattern.compile(regex);
        Matcher regexMatcher = regexPattern.matcher(format);
        if (regexMatcher.find()) {
            for (Map.Entry<String, String> entryHour : hours.entrySet()) {
                if (regexMatcher.group(1).equals(entryHour.getKey())) {
                    sb.append(entryHour.getValue() + " and");
                }
            }
            //does not want to append this part....
            for (Map.Entry<String, String> entryMin: mins.entrySet()) {
                if (regexMatcher.group(2).equals(entryMin.getKey())) {
                    sb.append(entryMin.getValue() + "Hours");
                }
            }
        }
        return sb.toString();
    }
}