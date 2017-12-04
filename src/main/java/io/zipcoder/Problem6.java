package io.zipcoder;


import java.util.Scanner;

public class Problem6 {


    public static void main(String[] args) {
        String number = "";

        Problem6 problem6 = new Problem6();

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a regular time");


        String userInput = scanner.next();




        // System.out.println(problem6.numToWord(130));

    }

    public static String getPmOrAm(String userInput) {

        return userInput.substring(0, userInput.length() - 2);

    }

    public static String removeSemicolon(String userInput) {
        return userInput.replace(":", "");

    }


    public String numToWord(Integer i) {

        final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

        if (i < 20) return units[i];
        if (i < 100) return tens[i / 10] + ((i % 10 > 0) ? " " + numToWord(i % 10) : "");
        if (i < 1000) return units[i / 100] + " Hundred" + ((i % 100 > 0) ? " and " + numToWord(i % 100) : "");
        if (i < 1000000) return numToWord(i / 1000) + " Thousand " + ((i % 1000 > 0) ? " " + numToWord(i % 1000) : "");
        return numToWord(i / 1000000) + " Million " + ((i % 1000000 > 0) ? " " + numToWord(i % 1000000) : "");
    }

    public void afterNoon(int number){


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


