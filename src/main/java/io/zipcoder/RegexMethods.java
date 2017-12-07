package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMethods {
    private static Pattern pattern;
    private static Matcher matcher;

     public static String findPattern(String regex, String input) {
        pattern = Pattern.compile(regex);
        matcher = pattern.matcher(input);
        String matchFound;

        if (matcher.find()) {
             matchFound = matcher.group(0);
             return matchFound;
        }
        return null;
    }

}
