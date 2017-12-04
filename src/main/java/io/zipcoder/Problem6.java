package io.zipcoder;

import sun.font.CompositeGlyphMapper;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {
    private static ArrayList <String> amStrings = new ArrayList <String>(Arrays.asList("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve"));


    public String breakInput(String input) {

        String regexPattern = "^([0-9]|0[0-9]|1[0-9]|2[0-3]):[0-5][0-9][AaPp][Mm]$";

        ArrayList <String> time = new ArrayList <String>();
        Pattern checkRegex = Pattern.compile(regexPattern);
        Matcher regexMatcher = checkRegex.matcher(input);

        if (regexMatcher.find()) {

            int index = regexMatcher.start();
            int end = regexMatcher.end();

            String HH = input.substring(index, end - 5);
            String MM = input.substring(index + 3, end - 2);
            String meridiem = input.substring(index + 5, end);

            String newHHString = createMilitaryTimeHH(HH, meridiem);
            String newMMString = createMilitaryTimeMM(MM);

            return newHHString+newMMString;


        } else {
            System.out.println("INVALID");
            return null;
        }


    }



    public String createMilitaryTimeHH(String input, String meridiem) {
        ArrayList <String> pmStrings = new ArrayList <String>(Arrays.asList("", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty", "Twentyone", "Twentytwo", "TwentyThree", "Twentyfour"));
        StringBuilder stringBuilder = new StringBuilder();


        if (meridiem.equalsIgnoreCase("am")) {
            if (Integer.valueOf(input) < 10) stringBuilder.append(amStrings.get(0) + " ");

            stringBuilder.append(amStrings.get(Integer.valueOf(input)) + " ");
        } else {
            stringBuilder.append(pmStrings.get(Integer.valueOf(input)) + " ");
        }

        stringBuilder.append("Hundred");

        return stringBuilder.toString();
    }

    private String createMilitaryTimeMM(String mm) {
        ArrayList<String> minutes = new ArrayList <String>(Arrays.asList("","Twenty","Thirty","Fourty","Fifty"));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" and ");
        if (Integer.valueOf(mm)< 10) stringBuilder.append("Zero ");

        char[] chars = mm.toCharArray();

        
        if(mm.charAt(0) == '2'){
            stringBuilder.append(minutes.get(1));
        }
        if(mm.charAt(0) == '3'){
            stringBuilder.append(minutes.get(2));
        }
        if(mm.charAt(0) == '4'){
            stringBuilder.append(minutes.get(3));
        }
        if(mm.charAt(0) == '5'){
            stringBuilder.append(minutes.get(4));
        }







        stringBuilder.append(" Hours");
        return stringBuilder.toString();
    }
}
