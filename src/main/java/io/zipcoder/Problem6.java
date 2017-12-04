package io.zipcoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Problem6 {

    /*
    1 convert string to 24 hr time.
    2. grab hours then split at : use regex
    3. create string to convert hours/mins into long text


    */

    public static Date timeConverter(String timeOrig) throws ParseException {
//            SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mma");
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mma");
        Date date = parseFormat.parse(timeOrig);

        // Date date1 = formatter.format(date);


        return date;
    }

    public static Integer splitTime(String time) {
        String[] timeSplit = time.split(":");
        int dayNight = Integer.parseInt(timeSplit[1]);


        String milHour ="";

        switch (dayNight) {
            case 1:  milHour ="Zero One Hundred and";
            break;
            case 2:  milHour ="Zero Two Hundred and";
                break;
            case 3:  milHour ="Zero Three Hundred and";
                break;
            case 4:  milHour ="Zero Four Hundred and";
                break;
            case 5:  milHour ="Zero Five Hundred and";
                break;
            case 6:  milHour ="Zero Six Hundred and";
                break;
            case 7:  milHour ="Zero Seven Hundred and";
                break;
            case 8:  milHour ="Zero Eight Hundred and";
                break;
            case 9:  milHour ="Zero Nine Hundred and";
            break;
            case 10:  milHour =" Ten Hundred and";
                break;
            case 11:  milHour =" Eleven Hundred and";
                break;
            case 12:  milHour ="Twelve Hundred and";
                break;
            case 13:  milHour ="Thirteen Hundred and";
                break;
            case 14:  milHour ="Fourteen Hundred and";
                break;
            case 15:  milHour ="Fifteen Hundred and";
                break;
            case 16:  milHour ="Sixteen Hundred and";
                break;
            case 17:  milHour ="Seventeen Hundred and";
                break;
            case 18:  milHour ="Eightteen Hundred and";
                break;
            case 19:  milHour ="Nineteen Hundred and";
                break;
            case 20:  milHour ="Twenty Hundred and";
                break;
            case 21:  milHour ="TwentyOne Hundred and";
                break;
            case 22:  milHour ="TwentyTwo Hundred and";
                break;
            case 23:  milHour ="TwentyThree Hundred and";
                break;
            case 24:  milHour ="TwentyFour Hundred and";
                break;
        }
        return dayNight;
        }



    }


