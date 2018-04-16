package io.zipcoder;

public class Formatting {

    public static String getNewTime(String s){
        String makeMilitary = convertTime(s);
        String hundreds = changeFormatHundred(makeMilitary);
        String hours = changeFormatHours(makeMilitary);
        String militaryTime = hundreds + hours;
        System.out.println(militaryTime);
        return militaryTime;
    }

    public static String convertTime(String s){
        if(s.contains("AM")){
            s = s.replace("AM", "");
            String[] timeArray = s.split(":");
            if(timeArray[0].equals("12")) {
                timeArray[0] = "00";
            }
            if(timeArray[0].equals("12") || timeArray[0].equals("11") || timeArray[0].equals("10")){
                s = timeArray[0] + ":" + timeArray[1];
            }
            else if(!timeArray[0].equals("12") || timeArray[0].equals("11") || timeArray[0].equals("10")) {
                s = "0" + timeArray[0] + ":" + timeArray[1];
            }
        }
        else if(s.contains("PM")){
            s = s.replace("PM", "");
            String[] timeArray = s.split(":");
            if(!timeArray[0].equals("12")){
                timeArray[0] = Integer.toString(Integer.parseInt(timeArray[0])+12);
            }
            s = timeArray[0] + ":" + timeArray[1];
        }
        System.out.println(s);
        return s;
    }

    public static String changeFormatHundred(String s){
        String[] newTime = s.split(":");
        String hundred = NumberRepresentation.getHundred(newTime[0]);
        System.out.println(hundred + " Hundred");
        return hundred + " Hundred";
        }

    public static String changeFormatHours(String s){
        String[] newTime = s.split(":");
        int result = Integer.valueOf(newTime[1]);
        String newNumber = "";
        if(result < 10){
            newNumber = " Zero" + NumberRepresentation.getHours(result);
        } else if(result > 10 && result < 19){
            newNumber = HigherMinuteConverter.tenToTwenty(result);

        }else if(result > 20 && result < 29){
            newNumber = " Twenty" + HigherMinuteConverter.higherMinutes(result);

        }else if(result > 30 && result < 39){
            newNumber = " Thirty" + HigherMinuteConverter.higherMinutes(result);

        }else if(result > 40 && result < 49){
            newNumber = " Forty" + HigherMinuteConverter.higherMinutes(result);

        }else if(result > 50 && result < 59){
            newNumber = " Fifty" + HigherMinuteConverter.higherMinutes(result);

        }
        System.out.println(newNumber + " Hours");
        return newNumber + " Hours";
    }

}

