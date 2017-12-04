package io.zipcoder;

public enum MilitaryMinuteMapping {
    ZERO (0), ONE (1), TWO (2), THREE (3), FOUR (4),
    FIVE (5), SIX (6), SEVEN (7), EIGHT (8),NINE (9),
    TEN (10), ELEVEN (11), TWELVE (12), THIRTEEN (13), FOURTEEN (14),
    FIFTEEN (15), SIXTEEN (16), SEVENTEEN (17), EIGHTEEN (18), NINETEEN (19),
    TWENTY (20), TWENTYONE (21), TWENTYTWO (22), TWENTYTHREE (23), TWENTYFOUR(24),
    TWENTYFIVE (25), TWENTYSIX (26), TWENTYSEVEN (27), TWENTYEIGHT (28), TWENTYNINE (29),
    THIRTY (30), THIRTYONE (31), THIRTYTWO (32), THIRTYTHREE (33), THIRTYFOUR (34),
    THIRTYFIVE (35), THIRTYSIX (36), THIRTYSEVEN (37), THIRTYEIGHT (38), THIRTYNINE (39),
    FORTY (40), FORTYONE (41), FORTYTWO (42), FORTYTHREE (43), FORTYFOUR (44),
    FORTYFIVE (45), FORTYSIX (46), FORTYSEVEN (47), FORTYEIGHT (48),FORTYNINE (49),
    FIFTY (50), FIFTYONE (51), FIFTYTWO (52), FIFTYTHREE (53), FIFTYFOUR (54),
    FIFTYFIVE (55), FIFTYSIX (56), FIFTYSEVEN (57), FIFTYEIGHT (58),FIFTYNINE (59);

    String timeRepresentation="";
    int minute;
    MilitaryMinuteMapping(int passedTime){
        minute=passedTime;
        timeRepresentation=MilitaryConversionHelper.convertToPhrase(passedTime);
    }
//    private void minuteMapping(int passedMinute){
//        switch (passedMinute){
//            case 0:{
//                timeRepresentation+="";
//                break;
//            }
//            case 1:{
//                timeRepresentation+="-One";
//                break;
//            }
//            case 2:{
//                timeRepresentation+="-Two";
//                break;
//            }
//            case 3:{
//                timeRepresentation+="-Three";
//                break;
//            }
//            case 4:{
//                timeRepresentation+="-Four";
//                break;
//            }
//            case 5:{
//                timeRepresentation+="-Five";
//                break;
//            }
//            case 6:{
//                timeRepresentation+="-Six";
//                break;
//            }
//            case 7:{
//                timeRepresentation+="-Seven";
//                break;
//            }
//            case 8:{
//                timeRepresentation+="-Eight";
//                break;
//            }case 9:{
//                timeRepresentation+="-Nine";
//                break;
//            }
//
//        }
//
//    }
//    private void tensMapping(int passedMinute){
//        switch(passedMinute) {
//            case 10:{timeRepresentation+="Ten";
//                break;
//            }
//            case 11:{timeRepresentation+="Eleven";
//                break;
//            }
//            case 12:{timeRepresentation+="Twelve";
//                break;
//            }
//            case 13:{timeRepresentation+="Thirteen";
//                break;
//            }
//            case 14:{timeRepresentation+="Fourteen";
//                break;
//            }
//            case 15:{timeRepresentation+="Fifteen";
//                break;
//            }
//            case 16:{timeRepresentation+="Sixteen";
//                break;
//            }
//            case 17:{timeRepresentation+="Seventeen";
//                break;
//            }
//            case 18:{timeRepresentation+="Eighteen";
//                break;
//            }
//            case 19:{timeRepresentation+="Nineteen";
//                break;
//            }
//        }
//    }
//    MilitaryMinuteMapping(int passedMinute){
//        minute=passedMinute;
//
//        switch (passedMinute/10){
//            case 0: {
//                timeRepresentation += "Zero";
//                minuteMapping(passedMinute%10);
//                break;
//            }
//            case 1:{
//                tensMapping(passedMinute);
//                break;
//            }
//            case 2:{
//                timeRepresentation+="Twenty";
//                minuteMapping(passedMinute%10);
//                break;
//            }
//            case 3:{
//                timeRepresentation+="Thirty";
//                minuteMapping(passedMinute%10);
//                break;
//            }
//            case 4:{
//                timeRepresentation+="Forty";
//                minuteMapping(passedMinute%10);
//                break;
//            }
//            case 5:{
//                timeRepresentation+="Fifty";
//                minuteMapping(passedMinute%10);
//                break;
//            }
//
//        }
//    }

}
