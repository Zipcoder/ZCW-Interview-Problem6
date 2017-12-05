package io.zipcoder;

public class MilitarConvention {




    public String amTime(Integer value) {

        final String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty"};

        if (value == 100) {
            return "Zero One Hundred hours";
        }
        if (value < 100) {
            return (units[0] + " " + units[0] + " " + tens[value % 10] + "  " + units[value % 10]);
        } else if (value < 1000 && value > 100) {

                if((value % 100) < 20){
                    return units[0] + " " + units[value / 100] + " " + "hundred and " + units[(value % 100)];
            }

            return units[0] + " " + units[value / 100] + " " + "hundred and " + tens[(value % 100) / 10] + " " + units[value % 100 / 10];

        } else if (value > 1000 && value < 2359) {
            return units[value / 100] + " " + "hundred" + " " + tens[(value % 100) / 10] + " " + units[(value % 1000) % 20];
        }
        return null;
    }


    public String pmTime(Integer number){

        Integer value = pmConverted (number);

        String[] units = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
         String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty"};

        if (value == 1200) {
            return "Zero Zero Zero Zero";
        }
//1331
        if (value > 1300 && value < 1400) {

            if(value % 10 != 0){
                return ( units[value / 100] + " hundred " + tens[(value%1000) % 100 ] + " " + units[((value % 1000) % (100) % (10))]);
            }

        } else if (value < 1000 && value > 100) {

           if((value % 1000) > 19){
                return units[0] + " " + units[value / 100] + " " + "hundred " + tens[(value % 100) / 10] + " " + units[value % 100 / 10];
            }
        } else if (value > 1000 && value < 2359) {
            return units[value / 100] + " " + "hundred" + " " + tens[(value % 100) / 10] + " " + units[(value % 1000) % 20];
        }
        return null;
    }


    public int pmConverted(Integer number){

        Integer value = ((number/100) + 12) * 100 + (number % 100);

        return value;
    }


}

