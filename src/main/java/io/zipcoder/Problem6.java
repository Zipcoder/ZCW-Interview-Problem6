package io.zipcoder;

import java.util.StringJoiner;

public class Problem6 {

    public String convertTimeToMilitaryTimePhrase(String time) {
        Integer[] hoursAndMinutes = splitIntoHoursAndMinutes(time);
        return createMilitaryPhrase(hoursAndMinutes);
    }

    public Integer[] splitIntoHoursAndMinutes(String time) {
        String[] timeParts = time.split(":");
        String amOrPm = timeParts[1].substring(2);
        int hours = Integer.parseInt(timeParts[0]);
        if(hours != 12) {
            if ("pm".equals(amOrPm)) {
                hours += 12;
            }
        }
        else {
            if("am".equals(amOrPm)) {
                hours -= 12;
            }
        }
        int minutes = Integer.parseInt(timeParts[1].substring(0, 2));

        Integer[] hoursAndMinutes = new Integer[2];
        hoursAndMinutes[0] = hours;
        hoursAndMinutes[1] = minutes;

        return hoursAndMinutes;
    }

    public String createMilitaryPhrase(Integer[] hoursAndMinutes) {
        int hours = hoursAndMinutes[0];
        int minutes = hoursAndMinutes[1];

        StringJoiner stringJoiner = new StringJoiner(" ");
        if(hours < 10) {
            stringJoiner.add(numAsString[0]);
        }

        if(hours <= 20) {
            stringJoiner.add(numAsString[hours]);
        }
        else {
            stringJoiner.add(numAsString[20] + numAsString[hours - 20]);
        }

        stringJoiner.add("Hundred");
        stringJoiner.add("and");

        if(minutes <= 20) {
            if(minutes < 10) {
                stringJoiner.add(numAsString[0]);
            }
            stringJoiner.add(numAsString[minutes]);
        }
        else {
            int tens = minutes/10;
            int ones = minutes - tens*10;
            stringJoiner.add(numAsString[18 + tens]);
            if(ones > 0) {
                stringJoiner.add(numAsString[ones]);
            }
        }

        stringJoiner.add("Hours");
        return stringJoiner.toString();
    }

    public String[] numAsString = {
            "Zero",
            "One",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Eleven",
            "Twelve",
            "Thirteen",
            "Fourteen",
            "Fifteen",
            "Sixteen",
            "Seventeen",
            "Eighteen",
            "Nineteen",
            "Twenty",
            "Thirty",
            "Forty",
            "Fifty"
    };
}
