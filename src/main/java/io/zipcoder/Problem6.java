package io.zipcoder;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public static void main(String[] args) {
        String test = determineTime("3:30am");
        System.out.println(test);
    }

    public static String getPeriodOfDay(String input){
        String periodOfDayRegex = ".m";
        String ampm = null;

        Pattern pattern = Pattern.compile(periodOfDayRegex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            ampm = matcher.group(0);
        }

        return ampm;
    }

    public static String getTime(String input){
        String timeRegex = ".*\\d:\\d\\d";
        String time = null;

        Pattern pattern = Pattern.compile(timeRegex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.find()){
            time = matcher.group(0);
        }

        return time;
    }

    public static String determineTime(String input){
        String time = getTime(input);
        String periodOfDay = getPeriodOfDay(input);

        Integer hours = 0;
        Integer minutes;

        if(periodOfDay.equals("pm")){
            hours += 12;
        }

        String[] hourMinute = time.split(":");

        hours += Integer.parseInt(hourMinute[0]);
        minutes = Integer.parseInt(hourMinute[1]);

        String timeWritten = hoursWrittenOut(hours) + " and " + minutesWrittenOut(minutes);

        return timeWritten;
    }

    public static String hoursWrittenOut(Integer hours){
        String output = "";
        switch (hours){
            case 0:
                output = "Zero Hundred";
                break;
            case 1:
                output = "Zero One Hundred";
                break;
            case 2:
                output = "Zero Two Hundred";
                break;
            case 3:
                output = "Zero Three Hundred";
                break;
            case 4:
                output = "Zero Four Hundred";
                break;
            case 5:
                output = "Zero Five Hundred";
                break;
            case 6:
                output = "Zero Six Hundred";
                break;
            case 7:
                output = "Zero Seven Hundred";
                break;
            case 8:
                output = "Zero Eight Hundred";
                break;
            case 9:
                output = "Zero Nine Hundred";
                break;
            case 10:
                output = "Ten Hundred";
                break;
            case 11:
                output = "Eleven Hundred";
                break;
            case 12:
                output = "Twelve Hundred";
                break;
            case 13:
                output = "Thirteen Hundred";
                break;
            case 14:
                output = "Fourteen Hundred";
                break;
            case 15:
                output = "Fifteen Hundred";
                break;
            case 16:
                output = "Sixteen Hundred";
                break;
            case 17:
                output = "Seventeen Hundred";
                break;
            case 18:
                output = "Eighteen Hundred";
                break;
            case 19:
                output = "Nineteen Hundred";
                break;
            case 20:
                output = "Twenty Hundred";
                break;
            case 21:
                output = "Twenty One Hundred";
                break;
            case 22:
                output = "Twenty Two Hundred";
                break;
            case 23:
                output = "Twenty Three Hundred";
                break;
        }
        return output;
    }

    public static String minutesWrittenOut(Integer minutes){
        String output = "";
        switch (minutes){
            case 1:
                output = "Zero One ";
                break;
            case 2:
                output = "Zero Two ";
                break;
            case 3:
                output = "Zero Three ";
                break;
            case 4:
                output = "Zero Four ";
                break;
            case 5:
                output = "Zero Five ";
                break;
            case 6:
                output = "Zero Six ";
                break;
            case 7:
                output = "Zero Seven ";
                break;
            case 8:
                output = "Zero Eight ";
                break;
            case 9:
                output = "Zero Nine ";
                break;
            case 10:
                output = "Ten ";
                break;
            case 11:
                output = "Eleven ";
                break;
            case 12:
                output = "Twelve ";
                break;
            case 13:
                output = "Thirteen ";
                break;
            case 14:
                output = "Fourteen ";
                break;
            case 15:
                output = "Fifteen ";
                break;
            case 16:
                output = "Sixteen ";
                break;
            case 17:
                output = "Seventeen ";
                break;
            case 18:
                output = "Eighteen ";
                break;
            case 19:
                output = "Nineteen ";
                break;
            case 20:
                output = "Twenty ";
                break;
            case 21:
                output = "Twenty One ";
                break;
            case 22:
                output = "Twenty Two ";
                break;
            case 23:
                output = "Twenty Three ";
                break;
            case 24:
                output = "Twenty Four ";
                break;
            case 25:
                output = "Twenty Five ";
                break;
            case 26:
                output = "Twenty Six ";
                break;
            case 27:
                output = "Twenty Seven ";
                break;
            case 28:
                output = "Twenty Eight ";
                break;
            case 29:
                output = "Twenty Nine ";
                break;
            case 30:
                output = "Thirty ";
                break;
            case 31:
                output = "Thirty One ";
                break;
            case 32:
                output = "Thirty Two ";
                break;
            case 33:
                output = "Thirty Three ";
                break;
            case 34:
                output = "Thirty Four ";
                break;
            case 35:
                output = "Thirty Five ";
                break;
            case 36:
                output = "Thirty Six ";
                break;
            case 37:
                output = "Thirty Seven ";
                break;
            case 38:
                output = "Thirty Eight ";
                break;
            case 39:
                output = "Thirty Nine ";
                break;
            case 40:
                output = "Forty ";
                break;
            case 41:
                output = "Forty One ";
                break;
            case 42:
                output = "Forty Two ";
                break;
            case 43:
                output = "Forty Three ";
                break;
            case 44:
                output = "Forty Four ";
                break;
            case 45:
                output = "Forty Five ";
                break;
            case 46:
                output = "Forty Six ";
                break;
            case 47:
                output = "Forty Seven ";
                break;
            case 48:
                output = "Forty Eight ";
                break;
            case 49:
                output = "Forty Nine ";
                break;
            case 50:
                output = "Fifty ";
                break;
            case 51:
                output = "Fifty One ";
                break;
            case 52:
                output = "Fifty Two ";
                break;
            case 53:
                output = "Fifty Three ";
                break;
            case 54:
                output = "Fifty Four ";
                break;
            case 55:
                output = "Fifty Five ";
                break;
            case 56:
                output = "Fifty Six ";
                break;
            case 57:
                output = "Fifty Seven ";
                break;
            case 58:
                output = "Fifty Eight ";
                break;
            case 59:
                output = "Fifty Nine ";
                break;
        }
        output += "Hours";
        return output;
    }

}
