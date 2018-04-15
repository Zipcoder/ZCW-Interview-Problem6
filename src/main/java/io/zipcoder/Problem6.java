package io.zipcoder;

import java.util.Arrays;


public class Problem6 {

    public static String[] militaryNum = new String[]{"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
            "Nineteen", "Twenty", "Thirty", "Forty", "Fifty"};


    public String militaryConverter(String time) {
        Integer[] fullClock = splitHourAndMinutes(time);
        return militaryPhrasing(fullClock);
    }

    public Integer[] splitHourAndMinutes(String time) {
        String[] clockGroup = time.split(":");
        String amOrPm = clockGroup[1].substring(2);

        int hours = Integer.parseInt(clockGroup[0]);
        if (hours != 12) {
            if (amOrPm.equals("pm")) {
                hours += 12;
            }
        } else {
            if (amOrPm.equals("am")) {
                hours -= 12;
            }
        }
        int minutes = Integer.parseInt(clockGroup[1].substring(0, 2));

        Integer[] fullClock = new Integer[2];
        fullClock[0] = hours;
        fullClock[1] = minutes;

        return fullClock;
    }

    public String militaryPhrasing(Integer[] fullClock){
        int hours = fullClock[0];
        int minutes = fullClock[1];
        StringBuilder stringBuilder = new StringBuilder();

        if (hours < 10){
            stringBuilder.append(militaryNum[0] + " ");
        }
        if (hours <= 20){
            stringBuilder.append(militaryNum[hours] + " ");
        }
        else{
          stringBuilder.append(militaryNum[20] + (militaryNum[hours - 20])  + " ");
        }
        stringBuilder.append("Hundred ");

        if (minutes > 0) {
            stringBuilder.append("and ");
            if (minutes <= 20) {
                if (minutes < 10) {
                    stringBuilder.append(militaryNum[0] + " ");
                }
                stringBuilder.append(militaryNum[minutes] + " ");
            } else {
                int tenBase = minutes / 10;
                int oneBase = minutes - tenBase * 10;
                stringBuilder.append(militaryNum[18 + tenBase] + " ");

                if (oneBase > 0) {
                    stringBuilder.append(militaryNum[oneBase] + " ");
                }
            }
        }
        stringBuilder.append("Hours");
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Problem6 test = new Problem6();

        String time = "1:35am";
        test.splitHourAndMinutes(time);
        System.out.println(Arrays.toString(test.splitHourAndMinutes(time)));
        System.out.println(militaryNum[20]);

    }
}
//1:30pm
//1 = index[0]
//30pm = index[1] substring(2) = pm
//30 = index[1] substring(0,2)

