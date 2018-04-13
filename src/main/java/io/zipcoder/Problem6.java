package io.zipcoder;

public class Problem6 {

    public String timeConverter(String time){
        Militarizer converter = new Militarizer();

        String [] stepOne = TimeConverter.splitTime(time);
        String [] stepTwo = TimeConverter.convertTime(stepOne);

        return converter.speaker(stepTwo[0]) + " Hundred and " + converter.speaker(stepTwo[1]) + " Hours";
    }

}
