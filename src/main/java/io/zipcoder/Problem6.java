package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Problem6 {

    private String militaryTimeHour;
    private String militaryTimeOfMinutes;

    private String[] hours = {"","One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
        "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four"};
    private String[] bigMinutes = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty"};


    public String[] splitString(String input) {
        return input.split(":");
        }

    public Integer parseIntoHour(String input) {
        String[] getHour = splitString(input);
        Integer hour = Integer.parseInt(getHour[0]);
        if(getHour[1].contains("p")) {
           return hour += 12;
        } else {
            return hour;
        }
    }
    public String getMilitaryHour(Integer input) {
        if (input < 10) {
            militaryTimeHour = hours[input];
            return "Zero " + militaryTimeHour;
        } else
        return militaryTimeHour = hours[input];
    }

    public Integer parseMinutes(String input) {
       String[] getMinutes = splitString(input);
       String minutes = getMinutes[1];
       StringBuilder justMinutes = new StringBuilder();
            justMinutes.append(minutes.charAt(0));
            justMinutes.append(minutes.charAt(1));
        String newMinutes = justMinutes.toString();
        return Integer.parseInt(newMinutes);
    }

    public String getMilitaryMinutes(Integer input) {
        if(input == 0) {
            return militaryTimeOfMinutes = bigMinutes[0];
        } else if (input < 10) {
            return militaryTimeOfMinutes = "Zero " + hours[input];
        } else if (input < 21) {
            return militaryTimeOfMinutes = hours[input];
        } else {
            String minuteString = Integer.toString(input);
            String[] highMinutes = minuteString.split("");
            Integer first = Integer.parseInt(highMinutes[0]);
            Integer second = Integer.parseInt(highMinutes[1]);
            return militaryTimeOfMinutes = bigMinutes[first] + " " + hours[second];
        }
    }

    public String getMilitaryTime(String input, String input2) {
        return militaryTimeHour + " Hundred and " + militaryTimeOfMinutes + " Hours";
    }

}
