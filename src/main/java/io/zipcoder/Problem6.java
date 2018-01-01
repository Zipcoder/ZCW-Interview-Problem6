package io.zipcoder;

public class Problem6 {

    public String convertTimeNumerically(String time){
        String newTime[] = time.split("");
        String returnTime = "";

        for(String character : newTime){
            if(character.equalsIgnoreCase("a") && newTime.length < 7){
                returnTime = "0" + time.substring(0, 1) + time.substring(2 ,time.toString().length()-2);
            }
            if(character.equalsIgnoreCase("a") && newTime.length >= 7){
                returnTime = time.substring(0, 2) + time.substring(3 ,time.length()-2);
            }
            if(character.equalsIgnoreCase("p") && newTime.length < 7){
                int hours = Integer.parseInt(time.substring(0,1));
                hours = hours+12;
                returnTime = hours + time.substring(2 ,time.length()-2);
            }
            if(character.equalsIgnoreCase("p") && newTime.length >= 7){
                int hours = Integer.parseInt(time.substring(0,2));
                hours = hours+12;
                returnTime = hours + time.substring(3 ,time.length()-2);
            }
        }
        return returnTime;
    }

    public String convertTimeToWord(String time){
        String[] words = { "Zero", "One", "Two", "Three",
                "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
                "Seventeen", "Eighteen", "Nineteen"};

        String[] tens = {"" ,"" ,"Twenty", "Thirty", "Forty",
                "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        String hundreds = "Hundred";

        String timeToReturn = "";

        int veryFirstNum = Integer.parseInt(time.substring(0, 1));
        int firstNums = Integer.parseInt(time.substring(0,2));
        int secondNum = Integer.parseInt(time.substring(1, 2));
        int thirdNum = Integer.parseInt(time.substring(2,3));
        int fourthNum = Integer.parseInt(time.substring(time.length()-1));

        if(firstNums < 10 && fourthNum == 0) timeToReturn += words[0] + " " + words[firstNums] + " " + hundreds + " and " + tens[thirdNum];
        if(firstNums < 10 && fourthNum > 0) timeToReturn += words[0] + " " + words[firstNums] + " " + hundreds + " and " + words[thirdNum+10];
        if(firstNums > 10 && firstNums < 20 && fourthNum > 0) timeToReturn += words[firstNums] + " " + hundreds + " and " + tens[thirdNum] + " " + words[fourthNum];
        if(firstNums > 10 && firstNums >= 20 && fourthNum > 0) timeToReturn += tens[veryFirstNum] + " " + words[secondNum] + " and " + tens[thirdNum] + " " + words[fourthNum];
        if(firstNums > 10 && fourthNum == 0) timeToReturn += words[firstNums] + " " + hundreds + " and " + tens[thirdNum];
        if(firstNums == 10) timeToReturn += words[firstNums] + " " + hundreds + " " + words[secondNum] + " " + words[fourthNum];

        return timeToReturn + " Hours";
    }
}