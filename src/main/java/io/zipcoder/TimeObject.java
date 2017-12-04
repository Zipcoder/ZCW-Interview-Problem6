package io.zipcoder;

public class TimeObject {

    Integer firstNumber;
    Integer secondNumber;
    String amPM;

    TimeObject(Integer first, Integer second, String amPM){
        this.firstNumber = first;
        this.secondNumber = second;
        this.amPM = amPM;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public Integer getSecondNumber() {
        return secondNumber;
    }

    public String getAmPM() {
        return amPM;
    }
}
