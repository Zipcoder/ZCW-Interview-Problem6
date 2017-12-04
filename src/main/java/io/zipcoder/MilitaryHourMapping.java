package io.zipcoder;

import javax.swing.event.MouseInputListener;

public enum MilitaryHourMapping {

    ZERO (0), ONE (1), TWO (2), THREE (3), FOUR (4),
    FIVE (5), SIX (6), SEVEN (7), EIGHT (8),NINE (9),
    TEN (10), ELEVEN (11), TWELVE (12), THIRTEEN (13), FOURTEEN (14),
    FIFTEEN (15), SIXTEEN (16), SEVENTEEN (17), EIGHTEEN (18), NINETEEN (19),
    TWENTY (20), TWENTYONE (21), TWENTYTWO (22), TWENTYTHREE (23);

    String timeRepresentation="";
    int hour;

    MilitaryHourMapping(int passedTime) {
        hour = passedTime;
        timeRepresentation = MilitaryConversionHelper.convertToPhrase(passedTime);
    }
//        switch (passedTime){
//            case 0: {
//                        timeRepresentation+="Zero";
//                        break;
//                    }
//            case 1: {
//                timeRepresentation+="Zero One";
//                break;
//            }
//            case 2: {
//                timeRepresentation+="Zero Two";
//                break;
//            }
//            case 3: {
//                timeRepresentation+="Zero Three";
//                break;
//            }
//            case 4: {
//                timeRepresentation+="Zero Four";
//                break;
//            }
//            case 5: {
//                timeRepresentation+="Zero Five";
//                break;
//            }
//            case 6: {
//                timeRepresentation+="Zero Six";
//                break;
//            }
//            case 7: {
//                timeRepresentation+="Zero Seven";
//                break;
//            }
//            case 8: {
//                timeRepresentation+="Zero Eight";
//                break;
//            }
//            case 9: {
//                timeRepresentation+="Zero Nine";
//                break;
//            }
//            case 10: {
//                timeRepresentation += "Ten";
//                break;
//            }
//            case 11: {
//                timeRepresentation += "Eleven";
//                break;
//            }
//            case 12: {
//                timeRepresentation += "Twelve";
//                break;
//            }
//            case 13: {
//                timeRepresentation += "Thirteen";
//                break;
//            }
//            case 14: {
//                timeRepresentation += "Fourteen";
//                break;
//            }
//            case 15: {
//                timeRepresentation += "Fifteen";
//                break;
//            }
//            case 16: {
//                timeRepresentation += "Sixteen";
//                break;
//            }
//            case 17: {
//                timeRepresentation += "Seventeen";
//                break;
//            }
//            case 18: {
//                timeRepresentation += "Eighteen";
//                break;
//            }
//            case 19: {
//                timeRepresentation += "Nineteen";
//                break;
//            }
//            case 20: {
//                timeRepresentation += "Twenty";
//                break;
//            }
//            case 21: {
//                timeRepresentation += "Twenty-One";
//                break;
//            }
//            case 22: {
//                timeRepresentation += "Twenty-Two";
//                break;
//            }
//            case 23: {
//                timeRepresentation += "Twenty-Three";
//                break;
//            }
//            default:{
//                timeRepresentation+="You shouldn't se this";
//                break;
//            }
//
//        }

}


