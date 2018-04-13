package io.zipcoder;

public class HigherMinuteConverter {


    public static String tenToTwenty(int i){
        String teens = "";
        switch (i){
            case 10 : teens = "Ten"; break;
            case 11 : teens = "Eleven"; break;
            case 12 : teens = "Twelve"; break;
            case 13 : teens = "Thirteen"; break;
            case 14 : teens = "Fourteen"; break;
            case 15 : teens = "Fifteen"; break;
            case 16 : teens = "Sixteen"; break;
            case 17 : teens = "Seventeen"; break;
            case 18 : teens = "Eighteen"; break;
            case 19 : teens = "Nineteen"; break;
        }
        return teens;
    }


    public static String higherMinutes(int i){
        String higherNumbers = "";

        if(i == 20 || i == 30 || i == 40 || i == 50) {
                higherNumbers = "";
            }
        else if(i == 21 || i == 31 || i == 41 || i == 51) {
            higherNumbers = "one";
        }
        else if(i == 22 || i == 32 || i == 42 || i == 52) {
            higherNumbers = "two";
        }
        else if(i == 23 || i == 33 || i == 43 || i == 53) {
            higherNumbers = "three";
        }
        else if(i == 24 || i == 34 || i == 44 || i == 54) {
            higherNumbers = "four";
        }
        else if(i == 25 || i == 35 || i == 45 || i == 55) {
            higherNumbers = "five";
        }
        else if(i == 26|| i == 36 || i == 46 || i == 56) {
            higherNumbers = "six";
        }
        else if(i == 27 || i == 37 || i == 47 || i == 57) {
            higherNumbers = "seven";
        }
        else if(i == 28 || i == 38 || i == 48 || i == 58) {
            higherNumbers = "eight";
        }
        else if(i == 29 || i == 39 || i == 49 || i == 59) {
            higherNumbers = "nine";
        }
        return higherNumbers;
        }

    }


