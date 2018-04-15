package io.zipcoder;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem6 {

    private String[] digitsAsMilitaryWords = {
            "Zero Zero", "Zero One", "Zero Two", "Zero Three", "Zero Four",
            "Zero Five", "Zero Six", "Zero Seven", "Zero Eight", "Zero Nine",
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
            "Twenty", "Twenty One", "Twenty Two", "Twenty Three", "Twenty Four",
            "Twenty Five", "Twenty Six", "Twenty Seven", "Twenty Eight", "Twenty Nine",
            "Thirty", "Thirty One", "Thirty Two", "Thirty Three", "Thirty Four",
            "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight", "Thirty Nine",
            "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four",
            "Forty Five", "Forty Six", "Forty Seven", "Forty Eight", "Forty Nine",
            "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four",
            "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine"
    };

    public Problem6() {
    }

    public String[] getDigitsAsMilitaryWords() {
        return digitsAsMilitaryWords;
    }

    public String writeTimeAsMilitary(String timeString) {
        char timeOfDay = isTimeAmOrPm(timeString);
        String[] timeStringArray = timeStringToStringArray(timeString);

        String hourDigitsAsString = timeStringArray[0];
        int hourDigits = Integer.parseInt(hourDigitsAsString);
        if ((timeOfDay == 'p') && (hourDigits != 12)) {
            hourDigits += 12;
        }
        String minutesDigitsAsString = timeStringArray[1];
        int minutesDigits = Integer.parseInt(minutesDigitsAsString);

        StringBuilder sb = new StringBuilder();

        sb.append(digitsAsMilitaryWords[hourDigits]);
        sb.append(" Hundred and ");
        sb.append(digitsAsMilitaryWords[minutesDigits]);
        sb.append(" Hours");

        return sb.toString();
    }

    public char isTimeAmOrPm(String timeString) {
        int stringLength = timeString.length();
        return timeString.charAt(stringLength - 2);
    }

    public String[] timeStringToStringArray(String timeString) {
        return removeLastTwoChars(timeString).split(":");
    }

    public String removeLastTwoChars(String timeString) {
        return timeString.substring(0, timeString.length() - 2);
    }

    public String digitsToStringFromDigitsEnum(int digitsToFind) {
        for (Digits digits : Digits.values()) {
            if (digitsToFind == digits.toInt()) {
                return digits.toString();
            }
        }
        return "Digits not found";
    }

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        String time = "3:28pm";
        System.out.println(time);
        System.out.println(problem6.writeTimeAsMilitary(time));
    }

}
