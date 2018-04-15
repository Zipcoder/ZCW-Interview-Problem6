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
            "Thirty Nine", "Forty"};


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
      String word="";
      switch (inputAsNumber){
          case 1:  word = words[0];
              break;
          case 2:  word = words[1];
              break;
          case 3:  word = words[2];
              break;
          case 4:  word = words[3];
              break;
          case 5:  word = words[4];
              break;
          case 6:  word = words[5];
              break;
          case 7:  word = words[6];
              break;
          case 8:  word = words[7];
              break;
          case 9:  word = words[8];
              break;
          case 10: word = words[9];
              break;
          case 11: word = words[10];
              break;
          case 12: word = words[11];
              break;
          case 13: word = words[12];
              break;
          case 14: word = words[13];
              break;
          case 15: word+= words[14];
              break;
          case 16: word = words[15];
              break;
          case 17: word = words[16];
              break;
          case 18: word = words[17];
              break;
          case 19: word = words[18];
              break;
          case 20: word = words[19];
              break;
          case 21: word = words[20];
              break;
          case 22: word = words[21];
              break;
          case 23: word = words[22];
              break;
          case 24: word = words[23];
              break;
          case 25:  word = words[24];
              break;
          case 26:  word = words[25];
              break;
          case 27:  word = words[26];
              break;
          case 28:  word = words[27];
              break;
          case 29:  word = words[28];
              break;
          case 30:  word = words[29];
              break;
          case 31:  word = words[30];
              break;
          case 32:  word = words[31];
              break;
          case 33:  word = words[32];
              break;
          case 34: word = words[33];
              break;
          case 35: word = words[34];
              break;
          case 36: word = words[35];
              break;
          case 37: word = words[36];
              break;
          case 38: word = words[37];
              break;
          case 39: word = words[38];
              break;
          case 40: word = words[39];
              break;
          default: word = "Invalid input";
              break;

      }
        return word;
    }


    public String formatWords(String hundreds, String Hours){
        StringBuilder sb = new StringBuilder();
        sb.append(hundreds);
        sb.append(" ");
        sb.append("Hundred ");
        sb.append("and ");
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
