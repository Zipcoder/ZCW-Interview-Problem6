package io.zipcoder;

public class TimeObject {

    Integer firstNumber;
    String secondNumber;
    String amPM;

    TimeObject(Integer first, String second, String amPM){
        this.firstNumber = first;
        this.secondNumber = second;
        this.amPM = amPM;
    }

    public Integer getFirstNumber() {
        return firstNumber;
    }

    public String getSecondNumber() {
        return secondNumber;
    }

    public String getAmPM() {
        return amPM;
    }
}
