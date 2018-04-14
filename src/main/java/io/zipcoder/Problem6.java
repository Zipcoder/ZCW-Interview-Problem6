package io.zipcoder;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Problem6 {

    public String timeConverter(String inputTime){
        DateFormat inputString= new SimpleDateFormat("hh:mmaa");
        DateFormat outputString = new SimpleDateFormat("HH:mm");
        try {
            String date = outputString.format(inputString.parse(inputTime));
            return date;
        }catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


}
