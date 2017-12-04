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

    MilitaryMinuteMapping(int passedMinute){
        minute=passedMinute;

        switch(passedMinute){
            case 0:{timeRepresentation+="Zero";
                break;
            }
            case 1:{timeRepresentation+="Zero One";
                break;
            }
            case 2:{timeRepresentation+="Zero Two";
                break;
            }
            case 3:{timeRepresentation+="Zero Three";
                break;
            }
            case 4:{timeRepresentation+="Zero Four";
                break;
            }
            case 5:{timeRepresentation+="Zero Five";
                break;
            }
            case 6:{timeRepresentation+="Zero Six";
                break;
            }
            case 7:{timeRepresentation+="Zero Seven";
                break;
            }
            case 8:{timeRepresentation+="Zero Eight";
                break;
            }
            case 9:{timeRepresentation+="Zero Nine";
                break;
            }
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
            case 20:{timeRepresentation+="Twenty";
                break;
            }
            case 21:{timeRepresentation+="Twenty-One";
                break;
            }
            case 22:{timeRepresentation+="Twenty-Two";
                break;
            }
            case 23:{timeRepresentation+="Twenty-Three";
                break;
            }
            case 24:{timeRepresentation+="Twenty-Four";
                break;
            }
            case 25:{timeRepresentation+="Twenty-Five";
                break;
            }
            case 26:{timeRepresentation+="Twenty-Six";
                break;
            }
            case 27:{timeRepresentation+="Twenty-Seven";
                break;
            }
            case 28:{timeRepresentation+="Twenty-Eight";
                break;
            }
            case 29:{timeRepresentation+="Twenty-Nine";
                break;
            }
            case 30:{timeRepresentation+="Thirty";
                break;
            }
            case 31:{timeRepresentation+="Thirty-One";
                break;
            }
            case 32:{timeRepresentation+="Thirty-Two";
                break;
            }
            case 33:{timeRepresentation+="Thirty-Three";
                break;
            }
            case 34:{timeRepresentation+="Thirty-Four";
                break;
            }
            case 35:{timeRepresentation+="Thirty-Five";
                break;
            }
            case 36:{timeRepresentation+="Thirty-Six";
                break;
            }
            case 37:{timeRepresentation+="Thirty-Seven";
                break;
            }
            case 38:{timeRepresentation+="Thirty-Eight";
                break;
            }
            case 39:{timeRepresentation+="Thirty-Nine";
                break;
            }
            case 40:{timeRepresentation+="Forty";
                break;
            }
            case 41:{timeRepresentation+="Forty-One";
                break;
            }
            case 42:{timeRepresentation+="Forty-Two";
                break;
            }
            case 43:{timeRepresentation+="Forty-Three";
                break;
            }
            case 44:{timeRepresentation+="Forty-Four";
                break;
            }
            case 45:{timeRepresentation+="Forty-Five";
                break;
            }
            case 46:{timeRepresentation+="Forty-Six";
                break;
            }
            case 47:{timeRepresentation+="Forty-Seven";
                break;
            }
            case 48:{timeRepresentation+="Forty-Eight";
                break;
            }
            case 49:{timeRepresentation+="Forty-Nine";
                break;
            }
            case 50:{timeRepresentation+="Fifty";
                break;
            }
            case 51:{timeRepresentation+="Fifty-One";
                break;
            }
            case 52:{timeRepresentation+="Fifty-Two";
                break;
            }
            case 53:{timeRepresentation+="Fifty-Three";
                break;
            }
            case 54:{timeRepresentation+="Fifty-Four";
                break;
            }
            case 55:{timeRepresentation+="Fifty-Five";
                break;
            }
            case 56:{timeRepresentation+="Fifty-Six";
                break;
            }
            case 57:{timeRepresentation+="Fifty-Seven";
                break;
            }
            case 58:{timeRepresentation+="Fifty-Eight";
                break;
            }
            case 59:{timeRepresentation+="Fifty-Nine";
                break;
            }
            default: {
                timeRepresentation += "You shouldn't ever see this";
                break;
            }
        }

    }

    public String getTimeRepresentation(){
        return timeRepresentation;
    }
}
