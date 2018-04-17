package io.zipcoder;

public class Problem6 {

    private String militaryHour;
    private String militaryMinute;

    private String[] hoursArray = {"Zero Hundred ", "Zero One Hundred ", "Zero Two Hundred ", "Zero Three Hundred ",
            "Zero Four Hundred ", "Zero Five Hundred ", "Zero Six Hundred ", " Zero Seven Hundred ",
            "Zero Eight Hundred ", "Zero Nine Hundred ", "Ten Hundred ", "Eleven Hundred ",
            "Twelve Hundred ", "Thirteen Hundred ", "Fourteen Hundred ", "Fifteen Hundred ",
            "Sixteen Hundred ", "Seventeen Hundred ", "Eighteen Hundred ", "Nineteen Hundred ",
            "Twenty Hundred ", "Twenty One Hundred ", "Twenty Two Hundred ", "Twenty Three Hundred ",
            "Twenty Four Hundred "};
    private String[] minutesArray = {"", "and One", "and Two", "and Three", "and Four", "and Five", "and Six", "and Seven", "and Eight", "and Nine", "and Ten",
            "and Eleven", "and Twelve", "and Thirteen", "and Fourteen", "and Fifteen", "and Sixteen", "and Seventeen", "and Eighteen", "and Nineteen", "and Twenty",
            "and Twenty One", "and Twenty Two", "and Twenty Three", "and Twenty Four", "and Twenty Five", "and Twenty Six", "and Twenty Seven", "and Twenty Eight", "and Twenty Nine", "and Thirty",
            "and Thirty One", "and Thirty Two", "and Thirty Three", "and Thirty Four", "and Thirty Five", "and Thirty Six", "and Thirty Seven", "and Thirty Eight", "and Thirty Nine", "and Fourty",
            "and Fourty One", "and Fourty Two", "and Fourty Three", "and Fourty Four", "and Fourty Five", "and Fourty Six", "and Fourty Seven", "and Fourty Eight", "and Fourty Nine", "and Fifty",
            "and Fifty One", "and Fifty Two", "and Fifty Three", "and Fifty Four", "and Fifty Five", "and Fifty Six", "and Fifty Seven", "and Fifty Eight", "and Fifty Nine"};

    public String[] splitTime(String timeInput) {
        String[] splitHourAndMinute = timeInput.split(":");
        return splitHourAndMinute;
    }

    public Integer parseForHour(String timeInput) {
        String[] hour = splitTime(timeInput);
        Integer intHour = Integer.parseInt(hour[0]);

        if (hour[1].contains("p") || hour[1].contains("P")) {
            return intHour += 12;
        } else {
            return intHour;
        }
    }

    public Integer parseForMinute(String timeInput) {
        String[] minute = splitTime(timeInput);
        String minutePortion = minute[1];

        //Using Stringbuilder to append minute without the am or pm
        StringBuilder noAmOrPm = new StringBuilder();
        noAmOrPm.append(minutePortion.charAt(0));
        noAmOrPm.append(minutePortion.charAt(1));

        //StringBuilder to String
        String minuteToString = noAmOrPm.toString();

        //String parsed to Integer
        Integer minuteOnly = Integer.parseInt(minuteToString);

        return minuteOnly;
    }

    public String getMilitaryHour(Integer hour) {
        militaryHour = hoursArray[hour];
        return militaryHour;
    }

    public String getMilitaryMinute(Integer minute) {
        militaryMinute = minutesArray[minute];
        return militaryMinute;

    }

    //Testing this method in main method below
    public String getFullMilitaryTime(String hour, String minute) {
        return militaryHour + "Hundred " + militaryMinute + " Hours";
    }

    public static void main(String[] args)
    {
        String timeInput = "1:30pm";
        String militaryHour;
        String militaryMinutes;

        Problem6 problem6 = new Problem6();
        militaryHour = problem6.getMilitaryHour(problem6.parseForHour(timeInput));
        militaryMinutes = problem6.getMilitaryMinute(problem6.parseForMinute(timeInput));
        problem6.getFullMilitaryTime(militaryHour, militaryMinutes);
        System.out.println(problem6.getFullMilitaryTime(militaryHour, militaryMinutes));
    }

}



























