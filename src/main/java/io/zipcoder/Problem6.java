package io.zipcoder;

public class Problem6 {

    public String timeConverter(String timeToConvert){
        boolean isAm = amChecker(timeToConvert);
        String[] timeArray = timeSplitter(timeToConvert);
        int[] timeAsIntArray = intParser(timeArray);
        timeAsIntArray = add12IfPM(timeAsIntArray,isAm);
        StringBuilder returnString = new StringBuilder();
        returnString.append(hourChecker(timeAsIntArray));
        returnString.append(minuteChecker(timeArray));
        return returnString.toString();
    }

    public boolean amChecker(String timeToCheck){
        if (timeToCheck.contains("am") && !(timeToCheck.substring(0,2).equals("12"))){
            return true;
        } else if (timeToCheck.contains("pm") && timeToCheck.substring(0,2).equals("12")) {
            return true;
        } else {
            return false;
        }
    }

    public String[] timeSplitter(String timeToSplit){
        String removeEnding = timeToSplit.substring(0, timeToSplit.length()-2);
        return removeEnding.split(":");
    }

    public int[] intParser(String[] arrayToParse){
        int[] intArray = new int[2];
        intArray[0] = Integer.parseInt(arrayToParse[0]);
        intArray[1] = Integer.parseInt(arrayToParse[1]);
        return intArray;
    }

    public int[] add12IfPM(int[] timeArray, boolean isAm){
        if (!isAm){
            timeArray[0] += 12;
            return timeArray;
        } else {
            return timeArray;
        }
    }

    public String hourChecker(int[] timeArray){
        String stringToReturn = "";
        switch (timeArray[0]){
            case 1:
                stringToReturn = "Zero One Hundred";
                break;
            case 2:
                stringToReturn = "Zero Two Hundred";
                break;
            case 3:
                stringToReturn = "Zero Three Hundred";
                break;
            case 4:
                stringToReturn = "Zero Four Hundred";
                break;
            case 5:
                stringToReturn = "Zero Five Hundred";
                break;
            case 6:
                stringToReturn = "Zero Six Hundred";
                break;
            case 7:
                stringToReturn = "Zero Seven Hundred";
                break;
            case 8:
                stringToReturn = "Zero Eight Hundred";
                break;
            case 9:
                stringToReturn = "Zero Nine Hundred";
                break;
            case 10:
                stringToReturn = "Ten Hundred";
                break;
            case 11:
                stringToReturn = "Eleven Hundred";
                break;
            case 12:
                stringToReturn = "Twelve Hundred";
                break;
            case 13:
                stringToReturn = "Thirteen Hundred";
                break;
            case 14:
                stringToReturn = "Fourteen Hundred";
                break;
            case 15:
                stringToReturn = "Fifteen Hundred";
                break;
            case 16:
                stringToReturn = "Sixteen Hundred";
                break;
            case 17:
                stringToReturn = "Seventeen Hundred";
                break;
            case 18:
                stringToReturn = "Eighteen Hundred";
                break;
            case 19:
                stringToReturn = "Nineteen Hundred";
                break;
            case 20:
                stringToReturn = "Twenty Hundred";
                break;
            case 21:
                stringToReturn = "Twenty-One Hundred";
                break;
            case 22:
                stringToReturn = "Twenty-Two Hundred";
                break;
            case 23:
                stringToReturn = "Twenty-Three Hundred";
                break;
            case 24:
                stringToReturn = "Zero Hundred";
                break;
        }
        return stringToReturn;
    }

    public String minuteChecker(String[] timeArray){
        String tens = timeArray[1].substring(0,1);
        String ones = timeArray[1].substring(1);
        String stringToReturn = "";
        if (timeArray[1].equals("00")){
            return stringToReturn + " Hours";
        } else if (tens.equals("0")){
            stringToReturn = " And " + onesChecker(ones) + " Hours";
        } else if (tens.equals("1")){
            stringToReturn = " And " + teensChecker(timeArray[1]) + " Hours";
        } else {
            stringToReturn = " And " + tensChecker(tens) + " " + onesChecker(ones) + " Hours";
        }
        return stringToReturn;
    }

    public String onesChecker(String ones){
        String stringToReturn = "";
        switch (ones){
            case "1":
                stringToReturn = "One";
                break;
            case "2":
                stringToReturn = "Two";
                break;
            case "3":
                stringToReturn = "Three";
                break;
            case "4":
                stringToReturn = "Four";
                break;
            case "5":
                stringToReturn = "Five";
                break;
            case "6":
                stringToReturn = "Six";
                break;
            case "7":
                stringToReturn = "Seven";
                break;
            case"8":
                stringToReturn = "Eight";
                break;
            case "9":
                stringToReturn = "Nine";
                break;
        }
        return stringToReturn;
    }

    public String tensChecker(String tens){
        String stringToReturn = "";
        switch (tens){
            case "2":
                stringToReturn = "Twenty";
                break;
            case "3":
                stringToReturn = "Thirty";
                break;
            case "4":
                stringToReturn = "Forty";
                break;
            case "5":
                stringToReturn = "Fifty";
                break;
        }
        return stringToReturn;
    }

    public String teensChecker(String teen){
        String stringToReturn = "";
        switch (teen){
            case "10":
                stringToReturn = "Ten";
                break;
            case "11":
                stringToReturn = "Eleven";
                break;
            case "12":
                stringToReturn = "Twelve";
                break;
            case "13":
                stringToReturn = "Thirteen";
                break;
            case "14":
                stringToReturn = "Fourteen";
                break;
            case "15":
                stringToReturn = "Fifteen";
                break;
            case "16":
                stringToReturn = "Sixteen";
                break;
            case "17":
                stringToReturn = "Seventeen";
                break;
            case "18":
                stringToReturn = "Eighteen";
                break;
            case "19":
                stringToReturn = "Nineteen";
                break;
        }
        return stringToReturn;
    }
}
