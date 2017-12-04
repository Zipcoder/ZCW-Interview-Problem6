package io.zipcoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static String bootCampTime(String input) {

        // Convert String in numerical format, convert that value into its military time phrase
        Integer group1;
        Integer group2;
        String group3;

        Pattern regex = Pattern.compile("(\\d|\\d{2}):(\\d{2})([a|p][m])");
        Matcher matcher = regex.matcher(input);
        Formatter formatter = new Formatter();

        if(matcher.matches()) {
            group1 = Integer.parseInt(matcher.group(1));
            group2 = Integer.parseInt(matcher.group(2));
            group3 = matcher.group(3);

            if(matcher.group(3).equalsIgnoreCase("pm")) {
                group1 += 12;
            }
        }
        else {
            return "Invalid Input";
        }
        return formatTimeString(group1, group2);
    }

    private static String nameOfNumber(Integer num) {
        String[] numbers = {"Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven","Eight","Nine",
                "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen" ,"Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"","", "Twenty", "Thirty", "Forty", "Fifty",};

        if(num <= 19) {
            if(num <= 9) {
                return numbers[0] + " " + numbers[num];
            }
            else {
                return numbers[num];
            }
        }
        else if(num >= 20 && num <= 59) {
            // I know this is bad, I just don't want to do it the hard way
            if(num % 10 == 0) {
                return tens[(int)Math.floor(num/10)];
            }
            else {
                String output = tens[(int)Math.floor(num/10)];
                return output += " " + numbers[num - (Arrays.asList(tens).indexOf(output) * 10)];
            }
        }
        else {
            return null;
        }
    }

    private static String formatTimeString(Integer group1, Integer group2) {
        if(group2 <= 9) {
            return nameOfNumber(group1) + " Hundred " + nameOfNumber(group2) + " Hours";
        }
        else {
            return nameOfNumber(group1) + " Hundred and " + nameOfNumber(group2) + " Hours";
        }
    }

}
