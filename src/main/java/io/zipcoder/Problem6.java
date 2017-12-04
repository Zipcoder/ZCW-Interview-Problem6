package io.zipcoder;

public class Problem6 {

    public String convertGivenTimeToMilitaryTime(String givenTime){
        StringBuilder militaryTime = new StringBuilder().append(givenTime);

        int hour = Integer.parseInt(givenTime.substring(0,2));
        String amPM = givenTime.substring(8,10);

        if (amPM.equals("am") && hour == 12)
            militaryTime.replace(0, 2, "00");
        else if (amPM.equals("pm") && hour < 12) {
            militaryTime.replace(0, 2, String.valueOf(hour + 12));
        }
        militaryTime.replace(8, 10, "");
        return militaryTime.toString();
    }

//    public String convertMilitaryTimeToPhrase(){
//    }
}
