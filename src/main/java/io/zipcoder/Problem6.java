package io.zipcoder;


public class Problem6 {

    public String convertToMilitaryNotation(String input){
        boolean isAM;
        isAM="AM".equalsIgnoreCase(input.substring(input.length()-2, input.length()));

        if (isAM){
            return (input.substring(0, input.length()-2));
        } else{
            input=input.substring(0, input.length()-2);
        }

        String[] time = input.split(":");
        Integer hours = Integer.valueOf(time[0]);
        if (hours<12){
            hours+=12;
            time[0]=""+hours;
            return (time[0]+":"+time[1]);
        } else{
            return("00:"+time[1]);
        }
    }

    public String convertMilitaryNotationToPhraseology(String input){
        String[] time = input.split(":");
        String timePhrase = "";
        for (MilitaryHourMapping m : MilitaryHourMapping.values())
        {
            if (m.hour==Integer.valueOf(time[0])){
                timePhrase+=m.timeRepresentation;
            }
        }
        timePhrase+=" Hundred and ";

        for (MilitaryMinuteMapping m : MilitaryMinuteMapping.values())
        {
            if (m.minute==Integer.valueOf(time[1])){
                timePhrase+=m.timeRepresentation;
            }
        }
        timePhrase+=" Hours";
        return timePhrase;
    }
}
