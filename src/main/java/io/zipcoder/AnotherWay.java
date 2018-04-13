package io.zipcoder;

public class AnotherWay {

    public String convert(String aTime) {

        String time = "";

        if (hasNoMinutes(aTime)) {
            time += hours(aTime) + " Hundred Hours";
        } else if (tenMinutes(aTime).equalsIgnoreCase("zero")) {
            time += hours(aTime) + " Hundred " + tenMinutes(aTime) + minutes(aTime) + " Hours";
        } else {
            time += hours(aTime) + " Hundred and " + tenMinutes(aTime) + minutes(aTime) + " Hours";
        }


        return time;
    }


    // look out below!


    public String splitHours(String aString) {
        return aString.split(":")[0];
    }

    public String splitTens(String aTime) {
        String afterColon = aTime.split(":")[1];
        return afterColon.substring(0, 1);
    }

    public String splitMinutes(String aTime) {
        String afterColon = aTime.split(":")[1];
        return afterColon.substring(1, 2);
    }

    public String hours(String aString) {

        String hoursString = splitHours(aString);
        Integer hoursInt = Integer.parseInt(hoursString);
        if (isPm(aString)) {
            hoursInt += 12;
        }
        String hours = null;

        for (Hour h : Hour.values()) {
            if (h.getValue() == hoursInt) {
                hours = h.toString();
            }
        }

        if (hoursInt < 10) {
            return "Zero " + hours.substring(0, 1) + hours.substring(1, hours.length()).toLowerCase();
        } else {
            return hours.substring(0, 1) + hours.substring(1, hours.length()).toLowerCase();
        }
    }

    public String tenMinutes(String aTime) {

        String tenMinutesString = splitTens(aTime);
        Integer tensInt = Integer.parseInt(tenMinutesString);
        String tens = "";

        if (!hasNoMinutes(aTime) && !isTeen(aTime)) {

            for (TenBasedMinute tbm : TenBasedMinute.values()) {
                if (tbm.getValue() == tensInt) {
                    tens = tbm.toString();
                }
            }
        }

        if (tens.equalsIgnoreCase("")) {
            return tens;
        } else {
            return tens.substring(0, 1) + tens.substring(1, tens.length()).toLowerCase();

        }
    }

    public String minutes(String aTime) {
        String minutesString = splitMinutes(aTime);
        Integer minutesInt = Integer.parseInt(minutesString);
        String minutes = "";

        if (!hasNoMinutes(aTime) && !isTeen(aTime)) {

            for (SingleMinute sm : SingleMinute.values()) {
                if (sm.getValue() == minutesInt) {
                    minutes = sm.toString();
                }
            }
        }

        if (isTeen(aTime)) {
            for (TeenMinute tm : TeenMinute.values()) {
                if (tm.getValue() == minutesInt) {
                    minutes = tm.toString();
                }
            }
        }

        if (minutes.equalsIgnoreCase("")) {
            return minutes;
        } else if (isTeen(aTime)) {
            return minutes.substring(0, 1) + minutes.substring(1, minutes.length()).toLowerCase();
        } else {
            return " " + minutes.substring(0, 1) + minutes.substring(1, minutes.length()).toLowerCase();
        }
    }


    public boolean isPm(String aTime) {
        if (aTime.contains("p")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isTeen(String aTime) {
        if (aTime.charAt(aTime.length() - 4) == '1') {
            return true;
        } else {
            return false;
        }
    }

    public boolean hasNoMinutes(String aTime) {
        if (aTime.charAt(aTime.length() - 4) == '0' && aTime.charAt(aTime.length() - 3) == '0') {
            return true;
        } else {
            return false;
        }
    }


}
