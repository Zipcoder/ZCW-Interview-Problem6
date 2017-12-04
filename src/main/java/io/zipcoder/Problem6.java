package io.zipcoder;

import java.util.ArrayList;

public class Problem6 {

    private ArrayList<String> hoursArrayList = new ArrayList<>();
    private ArrayList<String> minutesArrayList = new ArrayList<>();

    public Problem6() {
        populateHours();
        populateMinutes();
    }

    public String convertToMilitaryTime(String input) {
        String militaryTime = "";

        boolean isPm = checkIfPm(input);
        Integer hours = getHours(input);
        Integer minutes = getMinutes(input);

        militaryTime += convertHoursToString(hours, isPm);
        militaryTime += " Hundred ";
        militaryTime += convertMinutesToString(minutes);
        militaryTime += " Hours";

        return militaryTime;
    }

    public boolean checkIfPm(String input) {
        input = input.toLowerCase();
        return input.contains("pm");
    }

    public Integer getHours(String input) throws NumberFormatException{
        String[] splitAtColon = input.split(":");
        String hoursString = splitAtColon[0];
        return verifyValidInput(hoursString);
    }

    public Integer getMinutes(String input) throws NumberFormatException {
        String[] splitAtColon = input.split(":");
        String minutesString = splitAtColon[1].substring(0,2);
        return verifyValidInput(minutesString);
    }

    public Integer verifyValidInput(String input) throws  NumberFormatException {
        Integer returnInteger;
        try {
            returnInteger = Integer.parseInt(input);
            return returnInteger;
        }
        catch (NumberFormatException e) {
            throw new NumberFormatException();
        }
    }

    public void populateHours() {
        hoursArrayList.add("Nothing");
        hoursArrayList.add("One");
        hoursArrayList.add("Two");
        hoursArrayList.add("Three");
        hoursArrayList.add("Four");
        hoursArrayList.add("Five");
        hoursArrayList.add("Six");
        hoursArrayList.add("Seven");
        hoursArrayList.add("Eight");
        hoursArrayList.add("Nine");
        hoursArrayList.add("Ten");
        hoursArrayList.add("Eleven");
        hoursArrayList.add("Twelve");
        hoursArrayList.add("Thirteen");
        hoursArrayList.add("Fourteen");
        hoursArrayList.add("Fifteen");
        hoursArrayList.add("Sixteen");
        hoursArrayList.add("Seventeen");
        hoursArrayList.add("Eighteen");
        hoursArrayList.add("Nineteen");
        hoursArrayList.add("Twenty");
        hoursArrayList.add("Twenty One");
        hoursArrayList.add("Twenty Two");
        hoursArrayList.add("Twenty Three");
        hoursArrayList.add("Twenty Four");
    }

    public void populateMinutes() {
        for (String hour : hoursArrayList) {
            minutesArrayList.add(hour);
        }
        minutesArrayList.add("Twenty Five");
        minutesArrayList.add("Twenty Six");
        minutesArrayList.add("Twenty Seven");
        minutesArrayList.add("Twenty Eight");
        minutesArrayList.add("Twenty Nine");
        minutesArrayList.add("Thirty");
        minutesArrayList.add("Thirty One");
        minutesArrayList.add("Thirty Two");
        minutesArrayList.add("Thirty Three");
        minutesArrayList.add("Thirty Four");
        minutesArrayList.add("Thirty Five");
        minutesArrayList.add("Thirty Six");
        minutesArrayList.add("Thirty Seven");
        minutesArrayList.add("Thirty Eight");
        minutesArrayList.add("Thirty Nine");
        minutesArrayList.add("Forty");
        minutesArrayList.add("Forty One");
        minutesArrayList.add("Forty Two");
        minutesArrayList.add("Forty Three");
        minutesArrayList.add("Forty Four");
        minutesArrayList.add("Forty Five");
        minutesArrayList.add("Forty Six");
        minutesArrayList.add("Forty Seven");
        minutesArrayList.add("Forty Eight");
        minutesArrayList.add("Forty Nine");
        minutesArrayList.add("Fifty");
        minutesArrayList.add("Fifty One");
        minutesArrayList.add("Fifty Two");
        minutesArrayList.add("Fifty Three");
        minutesArrayList.add("Fifty Four");
        minutesArrayList.add("Fifty Five");
        minutesArrayList.add("Fifty Six");
        minutesArrayList.add("Fifty Seven");
        minutesArrayList.add("Fifty Eight");
        minutesArrayList.add("Fifty Nine");
    }

    public ArrayList<String> getHoursArrayList() {
        return hoursArrayList;
    }

    public ArrayList<String> getMinutesArrayList() {
        return minutesArrayList;
    }

    public String convertHoursToString(Integer hour, boolean isPm) {
        String hours = "";
        if (!isPm && hour < 10) {
            hours += "Zero ";
        }
        if (isPm) {
            return hours + hoursArrayList.get(hour + 12);
        }
        return hours + hoursArrayList.get(hour);
    }

    public String convertMinutesToString(Integer minute) {
        String minutes = "";
        if (minute < 10) {
            minutes += "Zero ";
        }
        else {
            minutes += "and ";
        }
        return minutes + minutesArrayList.get(minute);
    }
}
