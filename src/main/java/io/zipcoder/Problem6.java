package io.zipcoder;


import java.util.Scanner;

public class Problem6 {


    public static void main(String[] args) {
        String number = "";

        Problem6 problem6 = new Problem6();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a regular time");


        String userInput = scanner.next();

        if(getPmOrAm(userInput).equalsIgnoreCase("am")){
            problem6.numeroToWordAfterAm(problem6.convertAnStringToInteger(userInput));
        }

        // System.out.println(problem6.numeroToWordAfterAm(130));

        System.out.println(problem6.numeroToWordAfterAm(130));


    }

    public int convertAnStringToInteger(String value){
        try {
            return Integer.parseInt(value);
        }catch (NumberFormatException e){
            System.out.println(e);
        }
        return 0;
    }

    public static String getPmOrAm(String userInput) {

        return userInput.substring(0, userInput.length() - 2);

    }

    public static String removeSemicolon(String userInput) {
        return userInput.replace(":", "");

    }


    public String numeroToWordAfterAm(Integer number) {

        final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (number < 20) return units[number];
        if (number < 100) return   tens[number / 10] + ((number % 10 > 0) ? " " + numeroToWordAfterAm(number % 10) : "");
        if (number < 1000) return units[number / 100] + " Hundred" + ((number % 100 > 0) ? " and " + numeroToWordAfterAm(number % 100) : "");
        if (number < 1000000) return numeroToWordAfterAm(number / 1000) + " Thousand " + ((number % 1000 > 0) ? " " + numeroToWordAfterAm(number % 1000) : "");
        return numeroToWordAfterAm(number / 1000000) + " Million " + ((number % 1000000 > 0) ? " " + numeroToWordAfterAm(number % 1000000) : "");
    }


    public String militarConvertor(String timeDesitre) {

        String time = "";
        switch (timeDesitre) {

            case "1:30 pm":
                return time += "Thirteen Hundred and Thirty Hours";

            case "1:30 am":
                return time += "Zero One Hundred and Thirty Hours";

            case "2:22pm pm":
                return time += "Fourteen Hundred and Twenty Two Hours";

            case "2:11am pm":
                return time += "Zero Two Hundred and Eleven Hours";

            case "10:02am pm":
                return time += "Ten Hundred Zero Two Hours";

        }
        return time;

    }

}


