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
 1:30 am to One Hundred and Thirty Hours
 2:22 pm Fourteen Hundred and Twenty Two Hours

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

        System.out.println(convertToMilitaryTimeInWords(convertToMilitaryTime("1:30 pm")));

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

    public static int parseMilitaryHour(String militaryTime) {
        //if passing 13:30 or 01:30
        //use substring to get (0,1) if it is 0 return Zero, if not get substring(0,2) and convert to Thirteen
//or split military time into hours and minutes



        String hour = "";
//13 to Thirteen



        return hour;
    }


    public static int parseMilitaryMinutes(String militaryTime) {

        String minutes = "";



        return minutes;
    }





    public static String convertToMilitaryTimeInWords(int hour, int minutes) {
//        String hundredWord = "Hundred";
//        String andWord = "and";
//        String hoursWord = "Hours";

        return null;
//        return hour + hundredWord + andWord + minutes + hoursWord;
//        output: Thirteen Hundred and Thirty Hours
    }
}

