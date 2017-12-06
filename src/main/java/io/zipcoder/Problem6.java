package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Problem6 {

    // Given a time given as a String in numerical format, convert that value into its military time phrase.

/*  First Breakdown:

 1:30 pm to Thirteen Hundred and Thirty Hours
 1:30 am to Zero One Hundred and Thirty Hours
 2:22 pm to Fourteen Hundred and Twenty Two Hours

 1  - one o'clock (1:00) when it is "am" OR thirteen o clock (13:00) when it is a "pm"

 :  -  convert to "and"
 30 - minutes, only output name for the number
 pm - indicates if one(1) or thirteen(13), or another two(2) or fourteenth(14)

add "Hours" at the end of the output string

string to int

     Second Breakdown:
found SimpleDateFormat class

1:30 pm to 13:30 -  Thirteen Hundred and Thirty Hours
if "am" do nothing to it just make it into and int
1:30 am to 1:30 - Zero One Hundred and Thirty Hours
2:22 pm to 14:22 - Fourteen Hundred and Twenty Two Hours
2:11 am to 2:11 - Zero Two Hundred and Eleven Hours

convert from standard to military time                  1:30 pm to 13:30
//"13:30" to "13"
then convert military time in numbers to word           1 to Thirteen , 30 to Thirty
split number in front of : into a new variable          String hour;
the number after the split put into a new variable      String minutes;

                                                        String hundredWord = "Hundred
then add "and"  after the words split                   String andWord = "and" or just concatenate later
add "Hours" at the end of the output string             String wordHour = "Hours"


                                                output: Thirteen Hundred and Thirty Hours
*/

    public static void main(String[] args) throws Exception {

        System.out.println(convertToMilitaryTime("1:30 pm"));
        //System.out.println(convertToMilitaryTimeInWords(convertToMilitaryTime("1:30 pm")));
    }

    public static String convertToMilitaryTime(String standardTime) {
        DateFormat parseStandardTime = new SimpleDateFormat("hh:mm a");
        Date d = null;

        try {
            d = parseStandardTime.parse(standardTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        DateFormat displayMilitaryTime = new SimpleDateFormat("HH:mm");
        String militaryOutputString = displayMilitaryTime.format(d);
        return militaryOutputString;
    }

    public static int parseMilitaryHour(String militaryOutputString) {

        String hourString = militaryOutputString.substring(0, 2);
        int hourInt = Integer.parseInt(hourString);
        return hourInt;
    }

    public static int parseMilitaryMinutes(String militaryOutputString) {
        String minutesString = militaryOutputString.substring(3);
        int minutesInt = Integer.parseInt(minutesString);
        return minutesInt;
    }

    public static String convertHourToWord(int hourInt) {

        String hourWord = "";

        for (MilitaryHour m : MilitaryHour.values())
            if (hourInt == m.hourToMatch)
                hourWord = m.toString();

        return hourWord;
    }


    public static String convertMinuteToWord(int minutesInt) {
        String minuteWord = "";

        for (MilitaryMinute m : MilitaryMinute.values())
            if (minutesInt == m.minutesToMatch)
                minuteWord = m.toString();

        return minuteWord;
    }


    public static String convertToMilitaryTimeInWords(String hourWord, String minuteWord) {
        String hundredWord = "Hundred";
        String andWord = "and";
        String hoursWord = "Hours";

        return hourWord + " " + hundredWord + " " + andWord + " " +  minuteWord + " " + hoursWord;


    }

}