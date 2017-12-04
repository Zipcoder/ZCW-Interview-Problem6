package io.zipcoder;

public class MilitaryConversionHelper {

    private static String timeRepresentation="";

    private static void minuteMapping(int passedMinute){
        switch (passedMinute){
            case 0:{
                timeRepresentation+="";
                break;
            }
            case 1:{
                timeRepresentation+=" One";
                break;
            }
            case 2:{
                timeRepresentation+=" Two";
                break;
            }
            case 3:{
                timeRepresentation+=" Three";
                break;
            }
            case 4:{
                timeRepresentation+=" Four";
                break;
            }
            case 5:{
                timeRepresentation+=" Five";
                break;
            }
            case 6:{
                timeRepresentation+=" Six";
                break;
            }
            case 7:{
                timeRepresentation+=" Seven";
                break;
            }
            case 8:{
                timeRepresentation+=" Eight";
                break;
            }case 9:{
                timeRepresentation+=" Nine";
                break;
            }

        }

    }
    private static void tensMapping(int passedMinute){
        switch(passedMinute) {
            case 10:{timeRepresentation+="Ten";
                break;
            }
            case 11:{timeRepresentation+="Eleven";
                break;
            }
            case 12:{timeRepresentation+="Twelve";
                break;
            }
            case 13:{timeRepresentation+="Thirteen";
                break;
            }
            case 14:{timeRepresentation+="Fourteen";
                break;
            }
            case 15:{timeRepresentation+="Fifteen";
                break;
            }
            case 16:{timeRepresentation+="Sixteen";
                break;
            }
            case 17:{timeRepresentation+="Seventeen";
                break;
            }
            case 18:{timeRepresentation+="Eighteen";
                break;
            }
            case 19:{timeRepresentation+="Nineteen";
                break;
            }
        }
    }
    public static String convertToPhrase(int passedMinute){

        timeRepresentation="";

        switch (passedMinute/10){
            case 0: {
                timeRepresentation += "Zero";
                minuteMapping(passedMinute%10);
                break;
            }
            case 1:{
                tensMapping(passedMinute);
                break;
            }
            case 2:{
                timeRepresentation+="Twenty";
                minuteMapping(passedMinute%10);
                break;
            }
            case 3:{
                timeRepresentation+="Thirty";
                minuteMapping(passedMinute%10);
                break;
            }
            case 4:{
                timeRepresentation+="Forty";
                minuteMapping(passedMinute%10);
                break;
            }
            case 5:{
                timeRepresentation+="Fifty";
                minuteMapping(passedMinute%10);
                break;
            }

        }
        return timeRepresentation;
    }

}
