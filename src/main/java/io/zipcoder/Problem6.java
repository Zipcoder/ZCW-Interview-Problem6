package io.zipcoder;

public class Problem6 {
    private String[] upToNineteen = { "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
            "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
            "Eighteen", "Nineteen" };

    private String[] aboveTwenty = {"", "","Twenty","Thirty","Forty","Fifty","Sixty"};

    private String convertTime(int time) {
        if (time < 20) {
            return upToNineteen[time];
        }

        else if (time <= 60) {
            return aboveTwenty[time / 10] + ((time % 10 != 0) ? " " : "") + upToNineteen[time % 10];
        }
        return null;
    }

    private Integer numericalMilitaryHours(String input) {
        return Integer.parseInt(input.split(":")[0]);
    }

    private Integer numericalMilitaryMinutes(String input) {
        String backEnd = input.split(":")[1];
        if (backEnd.substring(0,1).equalsIgnoreCase("0")) {
            Integer aInt = Integer.parseInt(backEnd.substring(1,2));
            return aInt;
        }
        else {
            return Integer.parseInt(backEnd.substring(0,2));
        }
    }

    private String amOrPm(String input) {
        return input.split(":")[1].substring(2,4);
    }

    public String numericalMilitaryTime(String input) {
        Integer hours = numericalMilitaryHours(input);
        Integer minutes = numericalMilitaryMinutes(input);
        String nightOrDay = amOrPm(input);
        Integer militaryHours;
        if (nightOrDay.equalsIgnoreCase("pm")) {
            militaryHours = hours + 12;
        }
        else {
            militaryHours = hours;
        }

        String stringMinutes = "";
        if (minutes<10) {
            stringMinutes += "0"+minutes;
        }
        else {
            stringMinutes += minutes;
        }

        String militaryNumericalTime = militaryHours + ":" + stringMinutes;
        return militaryNumericalTime;
    }

    public String wordFromOfMilitaryTime(String input) {
        String militaryTimeString = numericalMilitaryTime(input);
        Integer hours = numericalMilitaryHours(militaryTimeString);
        Integer minutes = numericalMilitaryMinutes(militaryTimeString);
        String militaryHoursWordForm;
        String militaryMinutesWordForm;
        if (hours<10){
            militaryHoursWordForm = "Zero "+ convertTime(hours);
        }
        else {
            militaryHoursWordForm = convertTime(hours);
        }
        if (minutes<10) {
            militaryMinutesWordForm = "Zero "+ convertTime(minutes);
        }
        else {
            militaryMinutesWordForm = convertTime(minutes);
        }

        String wordOfMilitaryTime = militaryHoursWordForm+" Hundred and "+ militaryMinutesWordForm+" Hours";
        return wordOfMilitaryTime;
    }



}
