package io.zipcoder;

import java.util.HashMap;

public class Militarizer {
    private  HashMap<String,String> teens = new HashMap<>();
    private HashMap<String,String> firstDigits = new HashMap<>();
    private HashMap<String,String> secondDigits = new HashMap<>();

    public Militarizer(){
       buildTeensMap();
       buildFirstDigitsMap();
       buildSecondDigitsMap();
    }


    public  String speaker(String input){
        if(teens.containsKey(input)){
            return teens.get(input);
        }
        else if (input.charAt(1) == '0'){
            return firstDigits.get(input.substring(0,1));
        }
        else{
            return firstDigits.get(input.substring(0,1)) + " " + secondDigits.get(input.substring(1));
        }
    }



    private void buildTeensMap(){
        teens.put("10", "Ten");
        teens.put("11", "Eleven");
        teens.put("12", "Twelve");
        teens.put("13", "Thirteen");
        teens.put("14", "Fourteen");
        teens.put("15", "Fifteen");
        teens.put("16", "Sixteen");
        teens.put("17", "Seventeen");
        teens.put("18", "Eighteen");
        teens.put("19", "Nineteen");
    }

    private void buildFirstDigitsMap(){
        firstDigits.put("0", "Zero");
        firstDigits.put("2","Twenty");
        firstDigits.put("3","Thirty");
        firstDigits.put("4","Forty");
        firstDigits.put("5","Fifty");
    }

    private void buildSecondDigitsMap(){
        secondDigits.put("0", "");
        secondDigits.put("1", "One");
        secondDigits.put("2", "Two");
        secondDigits.put("3", "Three");
        secondDigits.put("4", "Four");
        secondDigits.put("5", "Five");
        secondDigits.put("6", "Six");
        secondDigits.put("7", "Seven");
        secondDigits.put("8", "Eight");
        secondDigits.put("9", "Nine");









    }

}
