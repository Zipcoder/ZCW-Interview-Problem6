package io.zipcoder;

public class Problem6 {

    public String normalToMilitaryTime(String input) {
        String militarizedTime = militarizeTime(input);
        return convertToString(militarizedTime);
    }

    String convertToString(String militarizedTime) {
        String output = "";
        String hours = twoDigitToString(militarizedTime.substring(0,2));
        String minutes = twoDigitToString(militarizedTime.substring(3));
        output = String.format("%s Hundred and %s Hours",hours,minutes);
        return output;
    }

    String twoDigitToString(String twoDigit) {
        String output = "";
        String first = twoDigit.substring(0,1);
        String second = twoDigit.substring(1);

        if("1".equals(first)){
            switch(second){
                case "0":
                    output += "Ten";
                    break;
                case "1":
                    output += "Eleven";
                    break;
                case "2":
                    output += "Twelve";
                    break;
                case "3":
                    output += "Thirteen";
                    break;
                case "4":
                    output += "Fourteen";
                    break;
                case "5":
                    output += "Fifteen";
                    break;
                case "6":
                    output += "Sixteen";
                    break;
                case "7":
                    output += "Seventeen";
                    break;
                case "8":
                    output += "Eighteen";
                    break;
                case "9":
                    output += "Nineteen";
                    break;
            }
            return output;
        }

        switch(first){
            case "0":
                output += "Zero";
                break;
            case "2":
                output += "Twenty";
                break;
            case "3":
                output += "Thirty";
                break;
            case "4":
                output += "Forty";
                break;
            case "5":
                output += "Fifty";
                break;
        }

        switch(second){
            case "0":
                output += "";
                break;
            case "1":
                output += " One";
                break;
            case "2":
                output += " Two";
                break;
            case "3":
                output += " Three";
                break;
            case "4":
                output += " Four";
                break;
            case "5":
                output += " Five";
                break;
            case "6":
                output += " Six";
                break;
            case "7":
                output += " Seven";
                break;
            case "8":
                output += " Eight";
                break;
            case "9":
                output += " Nine";
                break;
        }

        return output;
    }

    String militarizeTime(String normalTime){
        String output = "";
        int colonIndex = normalTime.indexOf(':');
        if(normalTime.matches(".*pm")){
            int hours = Integer.parseInt(normalTime.substring(0, colonIndex))+12;
            if(hours == 24){
                output = "00"+normalTime.substring(colonIndex, colonIndex+3);
            } else {
                output = hours + normalTime.substring(colonIndex, colonIndex+3);
            }
        } else {
            output = normalTime.substring(0, colonIndex+3);
        }
        if(output.indexOf(':') == 1){
            output = "0"+output;
        }
        return output;
    }

}
