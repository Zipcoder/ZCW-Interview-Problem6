package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Problem6 {

    String[] indexOneWords = {"Zero One", "Zero Two", "Zero Three", "Zero Four",
            "Zero Five", "Zero Six", "Zero Seven", "Zero Eight", "Zero Nine",
            "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen", "Twenty", "Twenty One",
            "Twenty Two", "Twenty Three", "Twenty Four"};
    //"Twenty Five", "Twenty Six",
    //        "Twenty Seven", "Twenty ight", "twenty nine",

    public String timeConverter(String inputTime){
        DateFormat inputString= new SimpleDateFormat("hh:mmaa");
        DateFormat outputString = new SimpleDateFormat("HH:mm");
        try {
            String date = outputString.format(inputString.parse(inputTime));
            return date;
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String[] splitTime(String inputTime){
        String[] timeIsSplit = inputTime.split(":");
        return timeIsSplit;
    }

    public String convertIndexOneToWord(String input){
        int inputAsNumber = 
      String word;
      switch (input){

      }
        return null;
    }

    public String convertIndexTwoToWord(String input){
        //do switch statement
        return null;
    }

    public String formatWords(String hundreds, String Hours){
        return null;
    }

}
