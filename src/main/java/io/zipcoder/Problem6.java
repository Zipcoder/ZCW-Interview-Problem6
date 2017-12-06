package io.zipcoder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Problem6 {
    //Step 1: convert given 12 hour numerical format into 24 hours format
    //use SimpleDateFormat to format input to 24 hours

    String[] units = {"Zero", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty"};
    public String convertTo24Hours(String input) {
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm a");
        Date date = null;
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
    public String[] splitHourMinute(String input){
        String formattedInput = convertTo24Hours(input);
        return formattedInput.split(":");
    }
    public String convertHour(String input){
        String hour = splitHourMinute(input)[0];
        int numHour = Integer.parseInt(hour);
        String word="";
        if(numHour<10){
            word+=units[0]+" "+units[numHour];
        }
        if(numHour<20 && numHour>=10){
            word+=units[numHour];
        }
        if(numHour>=20){
            if(numHour%10==0){
                word+=tens[numHour/10];
            }
            else {
                word += tens[numHour / 10] + " " + units[numHour % 10];
            }
        }
        return word;
    }
    public String convertMinute(String input){
        String minute = splitHourMinute(input)[1];
        int numMinute= Integer.parseInt(minute);
        String word="";
        if(numMinute<10){
            word+=units[0]+" "+units[numMinute];
        }
        if(numMinute<20 && numMinute>=10){
            word+=units[numMinute];
        }
        if(numMinute>=20){
            if(numMinute%10==0){
                word+=tens[numMinute/10];
            }
            else {
                word += tens[numMinute / 10] + " " + units[numMinute % 10];
            }
        }
        return word;
    }
    public String convert(String input) {
        return convertHour(input) + " Hundred and " + convertMinute(input) + " Hours";
    }
}
