package io.zipcoder;

public class NumberRepresentation {

    public static String numberToWord = "";
    public static String intToWord = "";

    public static String getHundred(String s) {
        switch (s) {
            case "00": numberToWord = "Zero"; break;
            case "01": numberToWord = "Zero One"; break;
            case "02": numberToWord = "Zero Two"; break;
            case "03": numberToWord = "Zero Three"; break;
            case "04": numberToWord = "Zero Four"; break;
            case "05": numberToWord = "Zero Five"; break;
            case "06": numberToWord = "Zero Six"; break;
            case "07": numberToWord = "Zero Seven"; break;
            case "08": numberToWord = "Zero Eight"; break;
            case "09": numberToWord = "Zero Nine"; break;
            case "10": numberToWord = "Ten"; break;
            case "11": numberToWord = "Eleven"; break;
            case "12": numberToWord = "Twelve"; break;
            case "13": numberToWord = "Thirteen"; break;
            case "14": numberToWord = "Fourteen"; break;
            case "15": numberToWord = "Fifteen"; break;
            case "16": numberToWord = "Sixteen"; break;
            case "17": numberToWord = "Seventeen"; break;
            case "18": numberToWord = "Eighteen"; break;
            case "19": numberToWord = "Nineteen"; break;
            case "20": numberToWord = "Twenty"; break;
            case "21": numberToWord = "Twenty One"; break;
            case "22": numberToWord = "Twenty Two"; break;
            case "23": numberToWord = "Twenty Three";break;
            case "24": numberToWord = "Twenty Four"; break;
            }
        return numberToWord;
    }

    public static String getHours(int i) {
        switch (i) {
            case 0: {
                intToWord = "Zero";
                break;
            }
            case 1: {
                intToWord = " One";
                break;
            }
            case 2: {
                intToWord = " Two";
                break;
            }
            case 3: {
                intToWord = " Three";
                break;
            }
            case 4: {
                intToWord = " Four";
                break;
            }
            case 5: {
                intToWord = " Five";
                break;
            }
            case 6: {
                intToWord = " Six";
                break;
            }
            case 7: {
                intToWord = " Seven";
                break;
            }
            case 8: {
                intToWord = " Eight";
                break;
            }
            case 9: {
                intToWord = " Nine";
                break;
            }
        }
        return intToWord;
    }
}
