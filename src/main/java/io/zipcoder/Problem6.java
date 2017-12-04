package io.zipcoder;

import java.util.HashMap;
import java.util.Map;

public class Problem6 {


    public String militaryTime(String timeString) {
        Map<String, String> amTimeMap = new HashMap<>();
        Map<String, String> pmTimeMap = new HashMap<>();

        TimeObject time = splitTime(timeString);

        if ("am".equals(time)) {
            convertUsingAMMap(time);
        } else {
            convertUsingPMMap(time);
        }

        return null;


    }

    private String convertUsingPMMap(TimeObject time) {
        Map<Integer, String> pmTimeMap = createPMmap();
        StringBuilder timeString = new StringBuilder();

        for(Map.Entry<Integer, String> timeMap : pmTimeMap.entrySet()){
            if(time.firstNumber.equals(timeMap.getKey())){
                timeString.append(timeMap.getValue());
            }
        }

        timeString.append(" ");

       return timeString.toString();


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

    private void convertUsingAMMap(TimeObject time) {

    }

    public TimeObject splitTime(String time) {
        String amPM = time.substring((time.length() - 2), time.length());
        String timeSplit[] = time.split(":");
        Integer firstNumber = Integer.valueOf(timeSplit[0]);
        Integer secondNumber = Integer.valueOf(timeSplit[1]);

        return new TimeObject(firstNumber, secondNumber, amPM);
    }


}
