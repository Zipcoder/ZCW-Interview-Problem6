package io.zipcoder;

import java.util.regex.Pattern;

public class Problem6 {

    public String transformTime(String str){
        if(checkString(str)) {
            Time newTime = createTime(str);
            if ("pm".equalsIgnoreCase(newTime.amORpm)) {
                newTime.hour += 12;
                if (newTime.hour == 24) {
                    newTime.hour = 0;
                }
            }
            return makeString(newTime);
        }else {
            return "Invalid format";
        }
    }

    public boolean checkString(String str){
        return Pattern.matches("\\d{1,2}:[0-6]\\d[aA|pP][mM]",str);
    }

    public Time createTime(String str){
        String amORpm = (str.substring(str.length()-2).toLowerCase());
        String time = str.substring(0,str.length()-2);
        String[] timeSplit = time.split(":");

        return new Time(Integer.parseInt(timeSplit[0]),Integer.parseInt(timeSplit[1]),amORpm);
    }

    public String makeString(Time time){
        return convertTime(time.hour)+" Hundred and "+convertTime(time.minute)+" Hours";
    }

    public String convertTime(int time){
        if(time < 10 ){
            return "Zero "+secondDigit(time);
        }
        return convertTimeOverTen(time);
    }

    public String convertTimeOverTen(int time){
        int convertTime = time/10;
        if(convertTime < 2 ){
            return getTeenNumber(time);
        }
        int secondDigit = time-(convertTime*10);
        return firstDigit(convertTime) +spacing(secondDigit)+ secondDigit(secondDigit);
    }

    private String spacing(int num){
        if(num == 0){
            return "";
        }
        return " ";
    }

    public String firstDigit(int firstNum){
        String[] firstDigits = {"Twenty","Thirty","Forty","Fifty"};
        return firstDigits[firstNum-2];
    }

    public String getTeenNumber(int time){
        String[] teens = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
        return teens[time-10];
    }


    public String secondDigit(int secondNum){
        String[] digits = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        return digits[secondNum];
    }

}
