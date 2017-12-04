package io.zipcoder;

import java.util.HashMap;

public class Problem6 {

    public String normalToMilitaryTime(String input) {
        return convertToString(militarizeTime(input));
    }

    String convertToString(String militarizedTime) {
        String hours = twoDigitToString(militarizedTime.substring(0,2));
        String minutes = twoDigitToString(militarizedTime.substring(3));
        return String.format("%s Hundred and %s Hours",hours,minutes);
    }

    String twoDigitToString(String twoDigit) {
        String output = "";
        String first = twoDigit.substring(0,1);
        String second = twoDigit.substring(1);

        HashMap<String, String> teens = new HashMap<String, String>(){{
            put("0","Ten");
            put("1", "Eleven");
            put("2", "Twelve");
            put("3", "Thirteen");
            put("4", "Fourteen");
            put("5", "Fifteen");
            put("6", "Sixteen");
            put("7", "Seventeen");
            put("8", "Eighteen");
            put("9", "Nineteen");
        }};

        if("1".equals(first)){
            output += teens.get(second);
            return output;
        }

        HashMap<String, String> tens = new HashMap<String, String>(){{
            put("0","Zero");
            put("2", "Twenty");
            put("3", "Thirty");
            put("4", "Forty");
            put("5", "Fifty");
        }};

        output += tens.get(first);

        HashMap<String, String> ones = new HashMap<String, String>(){{
            put("0","");
            put("1", " One");
            put("2", " Two");
            put("3", " Three");
            put("4", " Four");
            put("5", " Five");
            put("6", " Six");
            put("7", " Seven");
            put("8", " Eight");
            put("9", " Nine");
        }};

        output += ones.get(second);

        return output;
    }

    String militarizeTime(String normalTime){
        String output = "";
        int colonIndex = normalTime.indexOf(':');
        if(normalTime.matches(".*pm")){
            int hours = Integer.parseInt(normalTime.substring(0, colonIndex))+12;
            if(hours == 24){
                output = "00"+normalTime.substring(colonIndex, colonIndex+3);
            } else {
                output = hours + normalTime.substring(colonIndex, colonIndex+3);
            }
        } else {
            output = normalTime.substring(0, colonIndex+3);
        }
        if(output.indexOf(':') == 1){
            output = "0"+output;
        }
        return output;
    }

}
