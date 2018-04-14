package io.zipcoder;

public class Problem6 {

    public String convertToMilitaryTime(String aTime) {

        String asMilitary = "";

        if (isPm(aTime)) {
            asMilitary += getHoursPm(aTime);
        } else {
            asMilitary += getHoursAm(aTime);
        }

        return asMilitary += getMinutes(aTime);
    }



    // look below at your own risk




    protected boolean isPm(String aTime) {
        if (aTime.charAt(aTime.length() - 2) == 'p') {
            return true;
        } else {
            return false;
        }
    }

    protected String[] splitHoursAndMinutes(String aTime) {
        return aTime.split(":");
    }

    protected String getHoursAm(String aTime) {

        String hours = splitHoursAndMinutes(aTime)[0];
        String militaryHours = "";

        if (hours.length() == 1) {
            militaryHours += "Zero ";

            switch (hours.charAt(0)) {
                case '1':
                    militaryHours += "One";
                    break;
                case '2':
                    militaryHours += "Two";
                    break;
                case '3':
                    militaryHours += "Three";
                    break;
                case '4':
                    militaryHours += "Four";
                    break;
                case '5':
                    militaryHours += "Five";
                    break;
                case '6':
                    militaryHours += "Six";
                    break;
                case '7':
                    militaryHours += "Seven";
                    break;
                case '8':
                    militaryHours += "Eight";
                    break;
                case '9':
                    militaryHours += "Nine";
                    break;
                default:
                    break;
            }
        } else {
            switch (hours.charAt(1)) {
                case '0':
                    militaryHours += "Ten";
                    break;
                case '1':
                    militaryHours += "Eleven";
                    break;
                case '2':
                    militaryHours += "Zero";
                    break;
                default:
                    break;
            }
        }

        return militaryHours += " Hundred";

    }

    protected String getHoursPm(String aTime) {

        String hours = splitHoursAndMinutes(aTime)[0];
        String militaryHours = "";

        if (hours.length() == 1) {

            switch (hours.charAt(0)) {
                case '1':
                    militaryHours += "Thirteen";
                    break;
                case '2':
                    militaryHours += "Fourteen";
                    break;
                case '3':
                    militaryHours += "Fifteen";
                    break;
                case '4':
                    militaryHours += "Sixteen";
                    break;
                case '5':
                    militaryHours += "Seventeen";
                    break;
                case '6':
                    militaryHours += "Eighteen";
                    break;
                case '7':
                    militaryHours += "Nineteen";
                    break;
                case '8':
                    militaryHours += "Twenty";
                    break;
                case '9':
                    militaryHours += "Twenty One";
                    break;
                default:
                    break;
            }
        } else {
            switch (hours.charAt(1)) {
                case '0':
                    militaryHours += "Twenty Two";
                    break;
                case '1':
                    militaryHours += "Twenty Three";
                    break;
                case '2':
                    militaryHours += "Twelve";
                    break;
                default:
                    break;
            }
        }

        return militaryHours += " Hundred";

    }

    protected String getMinutes(String aTime) {
        String minutesInput = splitHoursAndMinutes(aTime)[1];
        String minutes = "";

        if (minutesInput.charAt(0) != '0') {
            minutes += " and ";
        }

        if (minutesInput.charAt(0) == '0') {
            minutes += " Zero ";
        }

        if (minutesInput.charAt(0) == '2') {
            minutes += "Twenty ";
        }

        if (minutesInput.charAt(0) == '3') {
            minutes += "Thirty ";
        }

        if (minutesInput.charAt(0) == '4') {
            minutes += "Forty ";
        }

        if (minutesInput.charAt(0) == '5') {
            minutes += "Fifty ";
        }

        if (minutesInput.charAt(0) == '1') {

            switch (minutesInput.charAt(1)) {
                case '0':
                    minutes += "Ten ";
                    break;
                case '1':
                    minutes += "Eleven ";
                    break;
                case '2':
                    minutes += "Twelve ";
                    break;
                case '3':
                    minutes += "Thirteen ";
                    break;
                case '4':
                    minutes += "Fourteen ";
                    break;
                case '5':
                    minutes += "Fifteen ";
                    break;
                case '6':
                    minutes += "Sixteen ";
                    break;
                case '7':
                    minutes += "Seventeen ";
                    break;
                case '8':
                    minutes += "Eighteen ";
                    break;
                case '9':
                    minutes += "Nineteen ";
                    break;
                default:
                    break;
            }

        } else {

            switch (minutesInput.charAt(1)) {
                case '0':
                    minutes += "";
                    break;
                case '1':
                    minutes += "One ";
                    break;
                case '2':
                    minutes += "Two ";
                    break;
                case '3':
                    minutes += "Three ";
                    break;
                case '4':
                    minutes += "Four ";
                    break;
                case '5':
                    minutes += "Five ";
                    break;
                case '6':
                    minutes += "Six ";
                    break;
                case '7':
                    minutes += "Seven ";
                    break;
                case '8':
                    minutes += "Eight ";
                    break;
                case '9':
                    minutes += "Nine ";
                    break;
                default:
                    break;
            }

        }

        return minutes += "Hours";

    }


}
