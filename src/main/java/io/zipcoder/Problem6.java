package io.zipcoder;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Problem6 {

    public String militaryTimeConverter(String input){
        String[] splitHoursAndMin = input.split(":");

        if (!isAM(input)){
           Integer addTwelve = Integer.parseInt(splitHoursAndMin[0]) + 12;
           splitHoursAndMin[0] = Integer.toString(addTwelve);
        }

        String hoursRaw = splitHoursAndMin[0];
        String minutesRaw = splitHoursAndMin[1].substring(0,2);

        String hoursConverted = militaryTimeHourConverter(hoursRaw);
        String minutesConverted = militaryTimeMinuteConverter(minutesRaw);

        return hoursConverted + " Hundred and " + minutesConverted + " Hours";
    }

    public String militaryTimeHourConverter(String hoursRaw){

        if (hoursRaw.length()==1){
            return "Zero" + mapDigitToString(hoursRaw);
        }

        if (hoursRaw.equals("12")){
            return "Zero";
        }

        if (hoursRaw.equals("24")){
            return mapDigitToString("12");
        }

        return mapDigitToString(hoursRaw);
    }

    public String militaryTimeMinuteConverter(String minutesRaw){

        if(minutesRaw.substring(0,1).equals("0")){
            return "Zero " + mapDigitToString(minutesRaw.substring(1,2));
        }else
        if(minutesRaw.substring(0,1).equals("1")){
            return mapDigitToString(minutesRaw.substring(0,2));
        }else {
            if(minutesRaw.substring(1,2).equals("0")){
                return mapDigitToString(minutesRaw.substring(0,2));
            }else{
                String tensColumn = mapDigitToString(minutesRaw.substring(0,1) + "0");
                String onesColumn = mapDigitToString(minutesRaw.substring(1,2));
                return tensColumn + "-" + onesColumn;
            }

        }

    }

    public String mapDigitToString(String input) {

        Map<String, String> hourMap = new HashMap<String, String>();

        hourMap.put("1", "One");
        hourMap.put("2", "Two");
        hourMap.put("3", "Three");
        hourMap.put("4", "Four");
        hourMap.put("5", "Five");
        hourMap.put("6", "Six");
        hourMap.put("7", "Seven");
        hourMap.put("8", "Eight");
        hourMap.put("9", "Nine");
        hourMap.put("10", "Ten");
        hourMap.put("11", "Eleven");
        hourMap.put("11", "Eleven");
        hourMap.put("12", "Twelve");
        hourMap.put("13", "Thirteen");
        hourMap.put("14", "Fourteen");
        hourMap.put("15", "Fifteen");
        hourMap.put("16", "Sixteen");
        hourMap.put("17", "Seventeen");
        hourMap.put("18", "Eighteen");
        hourMap.put("19", "Nineteen");
        hourMap.put("20", "Twenty");
        hourMap.put("21", "Twenty-One");
        hourMap.put("22", "Twenty-Two");
        hourMap.put("23", "Twenty-Three");
        hourMap.put("24", "Twenty-Four");
        hourMap.put("24", "Twenty-Four");
        hourMap.put("30", "Thirty");
        hourMap.put("40", "Forty");
        hourMap.put("50", "Fifty");

        return hourMap.get(input);
    }

    public boolean isAM(String input){
        return (input.substring(4,5).equals("a")||input.substring(5,6).equals("a"));

    }


}
