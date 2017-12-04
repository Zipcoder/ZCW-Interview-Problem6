package io.zipcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem6 {

    public String[] timeBreakup(String time) {
        String pattern = "([1-9]?[0-9]):([0-9][0-9])([p|a][m])";
        Pattern t = Pattern.compile(pattern);
        Matcher m = t.matcher(time);

        String[] brokenUp = new String[3];

        if (m.find()) {
            brokenUp[0] = m.group(1);
            brokenUp[1] = m.group(2);
            brokenUp[2] = m.group(3);
        }
        return brokenUp;
    }

    public int[] militaryConvert(String[] stringTimes) {
        int hour;
        int min;

        if ("pm".equals(stringTimes[2])&&!stringTimes[0].equals("12")) {
            hour = Integer.parseInt(stringTimes[0]) + 12;
        } else hour = Integer.parseInt(stringTimes[0]);
        if (hour == 12&&"am".equals(stringTimes[2]))
            hour=0;

        min = Integer.parseInt(stringTimes[1]);

        return new int[]{hour, min};
    }

    public String getMilitary(String time) {


        String[] timeGroups = timeBreakup(time);
        int[] milTime = militaryConvert(timeGroups);

        String finalTime = "";


        if (milTime[0] < 10)
            finalTime += "Zero "+underTen(milTime[0]) + " ";
        else if(milTime[0]<20)
            finalTime += underTwenty(milTime[0]) + " ";
        else {
            finalTime += overTwenty(milTime[0] / 10) + " ";
            finalTime += underTwenty(milTime[0] % 10) + " ";
        }

        finalTime += "Hundred and ";

        if (milTime[1] < 10)
            finalTime += "Zero " +underTen(milTime[1]) + " ";
        else if(milTime[1]<20)
                finalTime += underTwenty(milTime[1]) + " ";
         else {
            finalTime += overTwenty(milTime[1] / 10) + " ";
            finalTime += (milTime[1] % 10==0?"":underTen(milTime[1] % 10)+" ");
        }
        return finalTime + "Hours";
    }

    private String overTwenty(int num) {
        switch (num) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            default:
                return "";
        }
    }

    public String underTen(int num) {

        switch (num) {
            case 0:
                return "Zero";

            case 1:
                return "One";

            case 2:
                return "Two";

            case 3:
                return "Three";

            case 4:
                return "Four";

            case 5:
                return "Five";

            case 6:
                return "Six";

            case 7:
                return "Seven";

            case 8:
                return "Eight";

            case 9:
                return "Nine";
            default:
                return "";
        }
    }

        public String underTwenty(int num) {

        switch(num){
            case 10:
                return "Ten";

            case 11:
                return "Eleven";

            case 12:
                return "Twelve";

            case 13:
                return "Thirteen";

            case 14:
                return "Fourteen";

            case 15:
                return "Fifteen";

            case 16:
                return "Sixteen";

            case 17:
                return "Seventeen";

            case 18:
                return "Eighteen";

            case 19:
                return "Nineteen";
            default:
                return "";
        }

    }
}
