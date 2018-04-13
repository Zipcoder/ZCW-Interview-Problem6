package io.zipcoder;

import static java.lang.Integer.parseInt;

public class TimeConverter {

    public static String[] splitTime(String time){
       String[] stepOne = time.split(":");
       String[] stepTwo = {stepOne[1].substring(0,2), stepOne[1].substring(2)};
       String[] output = {stepOne[0],stepTwo[0],stepTwo[1]};
       if(output[0].length()==1){
           output[0] = "0" + output[0];
       }

        return output;
    }

    public static String[] convertTime(String [] input){
        if(input[2].equals("pm")){
            Integer workingInt = parseInt(input[0]);
            workingInt +=12;
            String[] output = {workingInt.toString(),input[1]};
            return output;
        }

        else{
            String[] output = {input[0],input[1]};
            return output;
        }
    }

}
