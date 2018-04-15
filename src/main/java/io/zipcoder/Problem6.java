package io.zipcoder;

public class Problem6 {

    public Problem6() {

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

    public String writeTimeAsMilitary(String timeString) {
        return null;
    }

    public String writeHourAsMilitary(String hourString) {
        int hourStringToDigits = Integer.parseInt(hourString);
        return digitsToString(hourStringToDigits);
    }

    public String writeMinutesAsMilitary(String minutesString) {
        int minutesStringToDigits = Integer.parseInt(minutesString);
        return digitsToString(minutesStringToDigits);
    }

    public String digitsToString(int digitsToFind) {
        for (Digits digits : Digits.values()) {
            if (digitsToFind == digits.toInt()) {
                return digits.toString();
            }
        }
        return "Digits not found";
    }



}
