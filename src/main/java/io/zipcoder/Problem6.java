package io.zipcoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem6 {
    //Step 1: convert given 12 hour numerical format into 24 hours format
    //use SimpleDateFormat to format input to 24 hours
    public String convertTo24Hours(String input){
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
        Date date= null;
        try {
            date = parseFormat.parse(input);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return displayFormat.format(date);
    }
    //Step 2: convert the 24 hour format into military time phrase in string format
    //after the first two digit, add "Hundred and" to the end
    //add Hours at the end of each string
    public String convert(String input){

        String[] units= { "Zero", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight", "Nine","Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
                "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"};
        String formattedInput = convertTo24Hours(input);
        String[] splitFormattedInput = formattedInput.split(":");
        for(int i=0;i<splitFormattedInput.length;i++){
            int num= Integer.parseInt(splitFormattedInput[i]);
            if(num<20){
                splitFormattedInput[i]=units[i];
            }
            else{
                splitFormattedInput[i]=tens[i];
            }
        }
        return splitFormattedInput[0]+" Hundred and "+splitFormattedInput[1]+" Hours";
    }
}
