package io.zipcoder;

public class App {

    public static void main(String[] args) {
        String input = "9:30pm";
        String militaryTimeHour;
        String militaryTimeOfMinutes;

        Problem6 p6 = new Problem6();
        militaryTimeHour = p6.getMilitaryHour(p6.parseIntoHour(input));
        militaryTimeOfMinutes = p6.getMilitaryMinutes(p6.parseMinutes(input));
        p6.getMilitaryTime(militaryTimeHour, militaryTimeOfMinutes);
        System.out.println(p6.getMilitaryTime(militaryTimeHour, militaryTimeOfMinutes));
    }
}
