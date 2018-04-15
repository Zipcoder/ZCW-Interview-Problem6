package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Problem6 {

    String[] words = {"Zero One", "Zero Two", "Zero Three", "Zero Four",
            "Zero Five", "Zero Six", "Zero Seven", "Zero Eight", "Zero Nine",
            "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen", "Twenty", "Twenty One",
            "Twenty Two", "Twenty Three", "Twenty Four","Twenty Five", "Twenty Six",
            "Twenty Seven", "Twenty Eight", "Twenty Nine", "Thirty", "Thirty One", "Thirty Two",
            "Thirty Three", "Thirty Four", "Thirty Five", "Thirty Six", "Thirty Seven", "Thirty Eight",
            "Thirty Nine", "Forty", "Forty One", "Forty Two", "Forty Three", "Forty Four", "Forty Five", "Forty Six",
            "Forty Seven", "Forty Eight", "Forty Nine", "Fifty", "Fifty One", "Fifty Two", "Fifty Three", "Fifty Four",
            "Fifty Five", "Fifty Six", "Fifty Seven", "Fifty Eight", "Fifty Nine", "Sixty"};


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

    public String convertIndexToWord(String input){
        int inputAsNumber = Integer.parseInt(input);
        String actualWord = words[inputAsNumber-1];
        return actualWord;
    }


    public String formatWords(String hundreds, String Hours){
        StringBuilder sb = new StringBuilder();
        sb.append(hundreds);
        sb.append(" ");
        sb.append("Hundred and ");
        sb.append(Hours);
        sb.append(" ");
        sb.append("Hours");
        return sb.toString();
    }

    public String seeIfWholeThingWorks(String input){
        String convert = timeConverter(input);
        String[] split = splitTime(convert);
        String indexOne = convertIndexToWord(split[0]);
        String indexTwo = convertIndexToWord(split[1]);
       return formatWords(indexOne, indexTwo);
    }

}
