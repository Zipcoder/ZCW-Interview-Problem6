package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public String militaryTime(String time){
    return null;
    }
    public boolean patternMatcherName(String rawItem) throws TimeParseException {
        Pattern timePattern = Pattern.compile("(^[0-9]+:+[0-9]+[a-z]+[a-z])");
        Matcher matchTime = timePattern.matcher(rawItem);

        return matchTime.find();

    }

    private static final String[] numNames = {
            " Zero",
            " One",
            " Two",
            " Three",
            " Four",
            " Five",
            " Six",
            " Seven",
            " Eight",
            " Nine",
            " Ten",
            " Eleven",
            " Twelve",
            " Thirteen",
            " Fourteen",
            " Fifteen",
            " Sixteen",
            " Seventeen",
            " Eighteen",
            " Nineteen",
            " Twenty",
            " Thirty",
            " Forty",
            " Fifty",
    };

}
