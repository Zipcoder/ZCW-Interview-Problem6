package io.zipcoder;

//Given a time given as a String in numerical format,
// convert that value into its military time phrase.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    private String time;

    public Problem6(String time) {
        this.time = time;
    }



    public String convertToMilitaryTimePhrase() {
        String timePattern = "(1[012]|[1-9]):([0-5][0-9])(am|pm)";

        Pattern pattern = Pattern.compile(timePattern);
        Matcher matcher = pattern.matcher(time);


        String[] minutesDigitsZeroToFiftyNine = {
                "zero", "zero one", "zero two", "zero three", "zero four", "zero five",
                "zero six", "zero seven", "zero eight", "zero nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen","eighteen", "nineteen","twenty",
                "twenty one", "twenty two", "twenty three","twenty four", "twenty five",
                "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty",
                "thirty one" ,"thirty two", "thirty-three", "thirty four", "thirty five",
                "thirty six", "thirty seven", "thirty eight", "thirty nine", "forty",
                "forty one", 	"forty two", "forty three", "forty four", "forty five",
                "forty six", "forty seven", "forty eight", "forty nine", "fifty",
                "fifty one", "fifty two", "fifty three", "fifty four", "fifty five",
                "fifty six", "fifty seven", "fifty eight", "fifty nine"};




        int hourNumber = 0;
        int minutesNumber = 0;
        String amOrPm = "";
        if(matcher.find()){
            hourNumber += Integer.valueOf(matcher.group(1));
            minutesNumber+= Integer.valueOf(matcher.group(2));
            amOrPm+=(matcher.group(3));
        }

        if(amOrPm.equals("pm")){
            hourNumber+=12;
        }

        String newTime ="";
        if(minutesNumber< 10){
           newTime = minutesDigitsZeroToFiftyNine[hourNumber] + " hundred " + minutesDigitsZeroToFiftyNine[minutesNumber] + " hours";

        }
        else {
            newTime = minutesDigitsZeroToFiftyNine[hourNumber] + " hundred and " + minutesDigitsZeroToFiftyNine[minutesNumber] + " hours";
        }
        return camelCaseSentence(newTime);

    }

    public String camelCaseSentence(String str){
        String [] temp = str.split(" ");
        StringBuilder sentence = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            sentence.append(temp[i].substring(0,1).toUpperCase());
            sentence.append(temp[i].substring(1));
            sentence.append(" ");
        }
        sentence.trimToSize();
        String finalSentence = sentence.toString();
        return finalSentence.replaceAll("[A|a][n][d]", "and");

    }

}
