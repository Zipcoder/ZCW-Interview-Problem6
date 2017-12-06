package io.zipcoder;

public class Problem6 {

    public String convertGivenTimeToMilitaryTime(String givenTime) {
        String[] splitInput = givenTime.split(":");
        int hour = Integer.parseInt(splitInput[0]);
        int minute = Integer.parseInt(splitInput[1].substring(0, 2));
        String meridian = splitInput[1].substring(2);

        if (meridian.equals("pm")) {
            hour += 12;
        }

        String hourName = convertNumberToWord(hour);
        String minuteName = convertNumberToWord(minute);

        if(minute == 0){
            return hourName + " Hundred Hours";
        }
        if(minute < 10){
            return hourName + " Hundred " + minuteName + " Hours";
        } else {
            return hourName + " Hundred and " + minuteName + " Hours";
        }
    }

    public static String convertNumberToWord(int number) {
        String[] lessThanTwenty = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty"};

        if (number < 20) {
            if (number < 10 && number > 0) {
                return lessThanTwenty[0] + " " + lessThanTwenty[number];
            } else {
                return lessThanTwenty[number];
            }
        } else if (number % 10 == 0) {
            return tens[number / 10];
        } else {
            String output = tens[(int) Math.floor(number / 10)];
            return output += " " + lessThanTwenty[(int) (number - (Math.floor(number / 10) * 10))];
        }
    }
}
//violates SRP will make better I promise.