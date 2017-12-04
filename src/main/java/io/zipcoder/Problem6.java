package io.zipcoder;

public class Problem6 {

    public String convertGivenTimeToMilitaryTime(String givenTime){
        String[] splitInput = givenTime.split(":");
        int hour = Integer.parseInt(splitInput[0]);
        int minute = Integer.parseInt(splitInput[1].substring(0,2));
        String meridian = splitInput[1].substring(2);

        if(meridian.equals("pm")) {
            hour += 12;
        }

        String hourName = convertNumberToWord(hour);
        String minuteName = convertNumberToWord(minute);

        String output = hourName + " Hundred " + "and " + minuteName + " Hours";

        return output;
    }

    public static String convertNumberToWord(int n){
        //take a military time and convert it to a phrase
        String[] upToNotIncludingTwenty = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty"};

        if(n < 20){
            return upToNotIncludingTwenty[n];
        }
        else  {
            return tens[5 / n];
        }
    }
}
