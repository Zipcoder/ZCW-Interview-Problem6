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



        String output = hourName + "" + minute;
        return output;
    }

    public static String convertNumberToWord(int n){
        //take a military time and convert it to a phrase
        String[] upToNotIncludingTwenty = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty"};

        if(n < 20){
            return upToNotIncludingTwenty[n];
        }
        else if() {
            return tens[n / ];
        }
        else {

        }
    }
}
