package io.zipcoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problem6 {

    private StringJoiner militaryString = new StringJoiner(" ", "", "");
    private ArrayList<String> valuesAsStrings = new ArrayList<>();

    public String convertToMilitaryString(String timeInput){
        Integer[] timeValues = stringSplit(timeInput);

        if(timeValues[0] < 10){
            militaryString.add(valuesAsStrings.get(0));

        }else if(timeValues[0] > 10 && timeValues[0] < 13){
            militaryString.add(valuesAsStrings.get(timeValues[0]));

        }else if(timeValues[0] > 10 && timeValues[0] <= 20) {
            militaryString.add(valuesAsStrings.get(timeValues[0]));

        }else if(timeValues[0] > 20){
            militaryString.add(valuesAsStrings.get(20));
        }

        System.out.println(militaryString);
        return militaryString.toString();
    }

//    public String convertAMorPM(String timeInput){
//        Pattern amPattern = Pattern.compile("(am)\\w", Pattern.CASE_INSENSITIVE);
//        Matcher amMatcher = amPattern.matcher(timeInput);
//        return null;
//    }
//
//    public String convertMinutes(String timeInput){
//        Pattern singleDigitMinutePattern = Pattern.compile("[:][0][\\d]");
//        Pattern twoDigitMinutePattern = Pattern.compile("[:][\\d][\\d]");
//        Matcher singleDigitMinuteMatcher = singleDigitMinutePattern.matcher(timeInput);
//        Matcher twoDigitMinuteMatcher = twoDigitMinutePattern.matcher(timeInput);
//
//        return null;
//    }
//    public String convertHours(String timeInput){
//        Pattern singleDigitHourPattern = Pattern.compile("[\\d][:]");
//        Pattern twoDigitHourPattern = Pattern.compile("[\\d][\\d][:]");
//        Matcher singleDigitHourMatcher = singleDigitHourPattern.matcher(timeInput);
//        Matcher twoDigitHourMatcher = twoDigitHourPattern.matcher(timeInput);
//        if(singleDigitHourMatcher.find()){
//        }
//        return null;
//    }

    public Integer[] stringSplit(String input){
        String[] timeString = input.split(":");
        String amOrPm = timeString[1].substring(2);
        Integer hours = Integer.parseInt(timeString[0]);
        Integer minutes = Integer.parseInt(timeString[1].substring(0,2));
        Integer[] timeAsValues = new Integer[2];

        if(hours != 12) {

            if (amOrPm.contains("pm"))
                hours += 12;
        }

        timeAsValues[0] = hours;
        timeAsValues[1] = minutes;
        System.out.println(timeAsValues[0]);
        System.out.println(timeAsValues[1]);

       return timeAsValues;
    }

    public Problem6(){
        valuesAsStrings.add("Zero");//0
        valuesAsStrings.add("One");//1
        valuesAsStrings.add("Two");//2
        valuesAsStrings.add("Three");//3
        valuesAsStrings.add("Four");//4
        valuesAsStrings.add("Five");//5
        valuesAsStrings.add("Six");//6
        valuesAsStrings.add("Seven");//7
        valuesAsStrings.add("Eight");//8
        valuesAsStrings.add("Nine");//9
        valuesAsStrings.add("Ten");//10
        valuesAsStrings.add("Eleven");//11
        valuesAsStrings.add("Twelve");//12
        valuesAsStrings.add("Thirteen");//13
        valuesAsStrings.add("Fourteen");//14
        valuesAsStrings.add("Fifteen");//15
        valuesAsStrings.add("Sixteen");//16
        valuesAsStrings.add("Seventeen");//17
        valuesAsStrings.add("Eighteen");//18
        valuesAsStrings.add("Nineteen");//19
        valuesAsStrings.add("Twenty");//20
        valuesAsStrings.add("Thirty");//21
        valuesAsStrings.add("Forty");//22
        valuesAsStrings.add("Fifty");//23
    }

    public static void main(String[] args){
        Problem6 problem6 = new Problem6();
       // problem6.stringSplit("11:30pm");
        problem6.convertToMilitaryString("10:30pm");
    }
}
