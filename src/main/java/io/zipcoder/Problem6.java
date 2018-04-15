package io.zipcoder;

public class Problem6 {

    public Problem6() {

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

        sb.append(digitsToString(hourDigits));
        sb.append(" Hundred and ");
        sb.append(digitsToString(minutesDigits));
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

    public String digitsToString(int digitsToFind) {
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
