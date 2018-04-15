package io.zipcoder;

import java.util.*;

public class MilitaryTimeConverter {

    private List<String> time = Arrays.asList("Zero", "Zero One", "Zero Two", "Zero Three", "Zero Four", "Zero Five", "Zero Six", "Zero Seven", "Zero Eight", "Zero Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
            "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four", "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
            "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine",
            "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine",
            "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four", "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine");


    public String convertTime(String input) {
        StringBuilder builder = new StringBuilder();
        int hours = getHours(input);
        int minutes = getMinutes(input);
        return  builder.append(time.get(hours)).append(" Hundred and ").append(time.get(minutes)).append(" Hours").toString();
    }

    public int getHours(String input) {
        int hours = Integer.parseInt(input.substring(0, input.indexOf(":")));
        if (isPm(input) && hours != 12) {
            return hours + 12;
        }
        return hours;
    }

    public boolean isPm(String input) {
        return input.toLowerCase().contains("pm");
    }

    public int getMinutes(String input) {
        return Integer.parseInt(input.substring(input.indexOf(":") + 1, input.indexOf(":") + 3));
    }
}