package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem6 {


    public String militaryTime(String timeString) {
        Map<String, String> amTimeMap = new HashMap<>();
        Map<String, String> pmTimeMap = new HashMap<>();

        TimeObject time = splitTime(timeString);

        convertUsingMap(time);

        return null;


    }

    public String convertUsingMap(TimeObject time) {
        StringBuilder timeString = new StringBuilder();
        Map<Integer, String> timeMap;

        if ("am".equals(time)) {
            timeMap = createPMmap();
        } else {
            timeMap = createAMmap();
        }

        for(Map.Entry<Integer, String> timeObject : timeMap.entrySet()){
            if(time.firstNumber.equals(timeObject.getKey())){
                timeString.append(timeObject.getValue());
            }
        }

        timeString.append(" ");

       return timeString.toString();
    }


    public TimeObject splitTime(String time) {
        String amPM = time.substring((time.length() - 2), time.length());
        String timeSplit[] = time.split(":");
        Integer firstNumber = Integer.valueOf(timeSplit[0]);
        String secondNumber = timeSplit[1];

        return new TimeObject(firstNumber, secondNumber, amPM);
    }

    private Map<Integer, String> createPMmap() {
        Map<Integer, String> pmTimeMap = new HashMap<>();
        pmTimeMap.put(1, "Thirteen Hundred");
        pmTimeMap.put(2, "Fourteen Hundred");
        pmTimeMap.put(3, "Fifteen Hundred");
        pmTimeMap.put(4, "Sixteen Hundred");
        pmTimeMap.put(5, "Seventeen Hundred");
        pmTimeMap.put(6, "Eighteen Hundred");
        pmTimeMap.put(7, "Nineteen Hundred");
        pmTimeMap.put(8, "Twenty Hundred");
        pmTimeMap.put(9, "Twenty One Hundred");
        pmTimeMap.put(10, "Twenty Two Hundred");
        pmTimeMap.put(11, "Twenty Three Hundred");
        pmTimeMap.put(12, "Zero Zero");

        return pmTimeMap;
    }

    private Map<Integer, String> createAMmap() {
        Map<Integer, String> amTimeMap = new HashMap<>();
        amTimeMap.put(1, "Zero One Hundred");
        amTimeMap.put(2, "Zero Two Hundred");
        amTimeMap.put(3, "Zero Three Hundred");
        amTimeMap.put(4, "Zero Four Hundred");
        amTimeMap.put(5, "Zero Five Hundred");
        amTimeMap.put(6, "Zero Six Hundred");
        amTimeMap.put(7, "Zero Seven Hundred");
        amTimeMap.put(8, "Zero Eight Hundred");
        amTimeMap.put(9, "Zero Nine Hundred");
        amTimeMap.put(10, "Ten Hundred");
        amTimeMap.put(11, "Eleven Hundred");
        amTimeMap.put(12, "Twelve Hundred");

        return amTimeMap;
    }

    


}
