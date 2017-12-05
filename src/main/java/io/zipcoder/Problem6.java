package io.zipcoder;

import java.util.HashMap;

public class Problem6 {

    InputReader inputTime = new InputReader();

    public String hourTable(String hour){
        HashMap<String, String> hourMap = new HashMap<String, String>();
        hourMap.put("0", "Zero Zero");
        hourMap.put("1", "Zero One Hundred");
        hourMap.put("2", "Zero Two Hundred");
        hourMap.put("3","Zero Three Hundred");
        hourMap.put("4", "Zero Four Hundred");
        hourMap.put("5", "Zero Five Hundred");
        hourMap.put("6", "Zero Six Hundred");
        hourMap.put("7", "Zero Seven Hundred");
        hourMap.put("8", "Zero Eight Hundred");
        hourMap.put("9", "Zero Nine Hundred");
        hourMap.put("10", "Ten Hundred");
        hourMap.put("11", "Eleven Hundred");
        hourMap.put("12", "Twelve Hundred");
        hourMap.put("13", "Thirteen Hundred");
        hourMap.put("14", "Fourteen Hundred");
        hourMap.put("15", "Fifteen Hundred");
        hourMap.put("16", "Sixteen Hundred");
        hourMap.put("17", "Seventeen Hundred");
        hourMap.put("18", "Eighteen Hundred");
        hourMap.put("19", "Nineteen Hundred");

        String hourTxt = hourMap.get(hour);
        return hourTxt;
    }

    public String minutesTable(String minute){
        HashMap<String, String> minutesMap = new HashMap<String, String>();
        minutesMap.put("01", "Zero One");
        minutesMap.put("02", "Zero Two");
        minutesMap.put("03", "Zero Three");
        minutesMap.put("11", "Eleven");
        minutesMap.put("30", "Thirty");
        minutesMap.put("22", "Twenty Two");

        String minuteTxt = minutesMap.get(minute);
        return minuteTxt;
    }

    public String inputHour(String input){
        String hour = inputTime.hourRegex(input);
        String hourVariable = hourTable(hour);
        return hourVariable;
    }

    public String inputMinute(String input){
        String minute = inputTime.minuteRegex(input);
        String minuteVariable = minutesTable(minute);
        return minuteVariable;
    }


    public String timeIntoWords(String input)throws NumberFormatException{
        if (inputTime.minuteRegex(input).equals("00") ){
            String minutesZero = inputHour(input) + " Hours";
            return minutesZero;
        }
        else{
            String minutesNotZero = inputHour(input) + " and " + inputMinute(input) + " Hours";
            return minutesNotZero;

        }
    }

}


