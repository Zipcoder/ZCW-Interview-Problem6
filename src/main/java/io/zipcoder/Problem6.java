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
            if(character.equalsIgnoreCase("p")){
                int hours = Integer.parseInt(time.substring(0,1));
                hours = hours+12;
                returnTime = hours + time.substring(2 ,time.toString().length()-2);
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

        int firstNum = Integer.parseInt(time.substring(0,2));
        int secondNum = Integer.parseInt(time.substring(1, 2));
        int thirdNum = Integer.parseInt(time.substring(2,3));
        int fourthNum = Integer.parseInt(time.substring(time.length()-1));

        if(firstNum < 10 && fourthNum == 0) timeToReturn += words[0] + " " + words[firstNum] + " " + hundreds + " and " + tens[thirdNum];
        if(firstNum < 10 && fourthNum > 0) timeToReturn += words[0] + " " + words[firstNum] + " " + hundreds + " and " + words[thirdNum+10];
        if(firstNum > 10 && fourthNum > 0) timeToReturn += words[firstNum] + " " + hundreds + " and " + tens[thirdNum] + " " + words[fourthNum];
        if(firstNum > 10 && fourthNum == 0) timeToReturn += words[firstNum] + " " + hundreds + " and " + tens[thirdNum];
        if(firstNum == 10) timeToReturn += words[firstNum] + " " + hundreds + " " + words[secondNum] + " " + words[fourthNum];

        return timeToReturn + " Hours";
    }
}
//        firstTime = "1:30pm";
//        secondTime = "1:30am";
//        thirdTime = "2:22pm";
//        fourthTime = "2:11am";
//        fifthTime = "10:02am";