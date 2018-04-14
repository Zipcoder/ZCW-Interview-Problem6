package io.zipcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem6 {


    Map<Integer, String> myMap = new HashMap<Integer, String>();
    String[] numberString = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen", "Twenty"};

    public Map<Integer, String> populateMap() {
        for (int i = 0; i < numberString.length; i++) {
            myMap.put(i, numberString[i]);
        }
        myMap.put(21, "Twenty One");
        myMap.put(22, "Twenty Two");
        myMap.put(23, "Twenty Three");
        myMap.put(30, "Thirty");
        myMap.put(40, "Forty");
        myMap.put(50, "Fifty");
        return myMap;
    }

    public String militaryTimeConverter(String input) {
        myMap = populateMap();
        String outPut = "";
        String inputTime="";
        if(input.contains("am")){
            inputTime += input.replace("am", "");
        }else{
            inputTime+=input.replace("pm","");
        }

        String[] inputTimeArray = inputTime.split(":");
        int[] convertedToInt = stringToIntConverter(inputTimeArray);
        if(input.contains("am")){
            outPut+=amTimeFormat(convertedToInt[0],convertedToInt[1],myMap);
        }else{
            outPut+=pmTimeFormat(convertedToInt[0],convertedToInt[1],myMap);
        }

        return outPut;
    }

    public int[] stringToIntConverter(String[] input) {
        int[] intArray = new int[0];
        for (int i = 0; i < input.length; i++) {
            intArray = Arrays.copyOf(intArray, intArray.length + 1);
            intArray[i] = Integer.parseInt(String.valueOf(input[i]));
        }
        return intArray;
    }

    public String pmTimeFormat(int inputHour,int inputMinutes, Map<Integer, String> inputMap) {
        String outPut = "";
        int divisionByTen = inputMinutes / 10;
        int modulus = inputMinutes % 10;
        if (inputHour == 12) {
            outPut += inputMap.get(inputHour);
        } else {
            outPut += inputMap.get(12 + inputHour);
        }

        if (inputMinutes < 24) {
            outPut += " Hundred ";
            if(inputMinutes<10){
                outPut+="Zero ";
            }
            outPut += myMap.get(inputMinutes);
            outPut += " Hours";
        } else {
            outPut += " Hundred and ";
            outPut += myMap.get(10 * divisionByTen);
            if (modulus != 0) {
                outPut += " " + myMap.get(modulus);
            }
            outPut += " Hours";
        }

        return outPut;
    }

    public String amTimeFormat(int inputHour,int inputMinute, Map<Integer, String> inputMap) {
        String outPut = "";
        int divisionByTen = inputMinute / 10;
        int modulus = inputMinute% 10;
        if (inputHour< 10) {
            outPut += "Zero ";
            outPut+= inputMap.get(inputHour);
        }else if(inputHour==12){
            outPut+="Zero ";
            outPut+=inputMap.get(0);
        }else{
            outPut += inputMap.get(inputHour);
        }
        if (inputMinute< 24) {
            outPut += " Hundred and ";
            if(inputMinute<10){
                outPut+="Zero ";
            }
            outPut += myMap.get(inputMinute);
            outPut += " Hours";
        } else {
            outPut += " Hundred and ";
            outPut += myMap.get(10 * (divisionByTen));
            outPut += " ";
            if (modulus != 0) {
                outPut += myMap.get(modulus);
            }
            outPut += " Hours";

        }
        return outPut;
    }

}
