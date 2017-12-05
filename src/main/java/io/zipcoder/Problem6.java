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

        else if (time >= 20) {
            return aboveTwenty[time / 10] + ((time % 10 != 0) ? " " : "") + upToNineteen[time % 10];
        }
        return null;
    }

    private Integer numericalMilitaryHours(TimeParser input) {
        Integer militaryHours = Integer.parseInt(input.getHours());
        if (input.getAmOrPm().equalsIgnoreCase("pm")) {
            militaryHours = militaryHours + 12;
            return militaryHours;
        }
        else {
            return militaryHours;
        }
    }

    private Integer numericalMilitaryMinutes(TimeParser input) {
        return Integer.parseInt(input.getMinutes());
    }

    public String wordFromOfMilitaryTime(TimeParser input) {
        Integer hours = numericalMilitaryHours(input);
        Integer minutes = numericalMilitaryMinutes(input);

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
