package io.zipcoder;

import javafx.beans.binding.IntegerBinding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {

    private HashMap<String, String> hours = new HashMap<String, String>();
    private HashMap<String, String> minutes = new HashMap<String, String>();
    private HashMap<String, String> multiplesOfTen = new HashMap<String, String>();
    private String[] input = {};

    public Problem6(){
        populateHours();
        populateMinutes();
        populateMultiplesOfTen();
    }

    public String convertToMilitaryTime(String input) {
        this.input = splitTime(input);

        if(inTheMorning(this.input)){
            return getHourInMilitaryAM(this.input[0]) +
                   " Hundred and " + getMinutesInMilitary(this.input[1]) +
                   " Hours";
        } else {
            return getHourInMilitaryPM(this.input[0]) +
                    " Hundred and " + getMinutesInMilitary(this.input[1]) +
                    " Hours";
        }
    }

    private void populateHours(){
        hours.put("0", "Zero Zero");
        hours.put("1", "Zero One");
        hours.put("2", "Zero Two");
        hours.put("3", "Zero Three");
        hours.put("4", "Zero Four");
        hours.put("5", "Zero Five");
        hours.put("6", "Zero Six");
        hours.put("7", "Zero Seven");
        hours.put("8", "Zero Eight");
        hours.put("9", "Zero Nine");
        hours.put("10", "Ten");
        hours.put("11", "Eleven");
        hours.put("12", "Twelve");
        hours.put("13", "Thirteen");
        hours.put("14", "Fourteen");
        hours.put("15", "Fifteen");
        hours.put("16", "Sixteen");
        hours.put("17", "Seventeen");
        hours.put("18", "Eighteen");
        hours.put("19", "Nineteen");
        hours.put("20", "Twenty");
        hours.put("21", "Twenty One");
        hours.put("22", "Twenty Two");
        hours.put("23", "Twenty Three");
    }

    private void populateMinutes(){
        minutes.put("1", "One");
        minutes.put("2", "Two");
        minutes.put("3", "Three");
        minutes.put("4", "Four");
        minutes.put("5", "Five");
        minutes.put("6", "Six");
        minutes.put("7", "Seven");
        minutes.put("8", "Eight");
        minutes.put("9", "Nine");
    }

    private void populateMultiplesOfTen(){
        multiplesOfTen.put("10", "Ten");
        multiplesOfTen.put("20", "Twenty");
        multiplesOfTen.put("30", "Thirty");
        multiplesOfTen.put("40", "Forty");
        multiplesOfTen.put("50", "Fifty");
    }

    // Splits input into array // example: {10, 45, am}
    private String[] splitTime(String time){
        String[] splitTimes = time.split(":");
        String[] endSplitTime = {
                                 splitTimes[0],
                                 splitTimes[1].substring(0, 2),
                                 time.substring(time.length() - 2)
                                };
        return endSplitTime;
    }

    // Checks if the input contains (am) - morning time
    private boolean inTheMorning(String[] testArray){
        return (testArray[2].equalsIgnoreCase("am"));
    }

    // Checks what number the minutes starts with and feeds to getMinutesInMilitary
    private String minuteNumberStartsWith(String[] timeArray){
        String firstMinuteNumber = "";
        for(int i = 0; i < 6; i++){
            if(timeArray[1].substring(0, 1).equals(String.valueOf(i))){
                firstMinuteNumber += String.valueOf(i + "0");
                break;
            }
        }
        return firstMinuteNumber;
    }

    public String getHourInMilitaryAM(String hour){
        if(Integer.parseInt(hour) == 12){
            return hours.get("0");
        } else {
            return hours.get(hour);
        }
    }

    public String getHourInMilitaryPM(String hour){
        Integer pmHour = Integer.parseInt(hour) + 12;
        if(Integer.parseInt(hour) == 12){
            return hours.get("12");
        } else {
            return hours.get(String.valueOf(pmHour));
        }
    }

    // Converts standard minutes to military minutes
    public String getMinutesInMilitary(String inputMinutes){

        if (Integer.parseInt(inputMinutes.substring(0, 2)) < 10) {
            return hours.get(inputMinutes.substring(inputMinutes.length() - 1));
        } else if (Integer.parseInt(inputMinutes.substring(0, 2)) < 20){
            return hours.get(inputMinutes);
        } else if (Integer.parseInt(inputMinutes.substring(0, 2)) % 10 == 0) {
            return multiplesOfTen.get(minuteNumberStartsWith(this.input));
        } else {
            return multiplesOfTen.get(minuteNumberStartsWith(this.input))
                   + " " + minutes.get(inputMinutes.substring(inputMinutes.length() - 1));
        }
    }

    public static void main(String[] args) {
        Problem6 problem6 = new Problem6();
        String testTime = "11:32am";
        System.out.println(problem6.convertToMilitaryTime(testTime));
        //String[] time = {"1", "45", "am"};
        //System.out.println(problem6.convertTime(time));

    }
}
