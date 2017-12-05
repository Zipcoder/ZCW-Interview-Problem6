package io.zipcoder;


import java.util.Scanner;

public class Problem6 {

// AM FEATURES WORKING
    // PM FEATURES SOON

    static MilitarConvention convention = new MilitarConvention ();

    // WORKING STILL ON PM FEATURES

    public static void main(String[] args) {

        int var = 1330 / 100;
        System.out.println (var);

        Problem6 problem6 = new Problem6 ();

        System.out.println ("Enter standard time...");

        String timeEntered = problem6.scanner ();

        if(problem6.getPmOrAm (timeEntered).equalsIgnoreCase ("am")){
            String amTimeResult = convention.amTime (problem6.cleanNumber (timeEntered));
            System.out.println (amTimeResult + " Hours");

        }else if(problem6.getPmOrAm (timeEntered).equalsIgnoreCase ("pm")){
            String pmTimeResult = convention.pmTime (problem6.cleanNumber (timeEntered));
            System.out.println (pmTimeResult + " Hours");
        }

    }

    public String getPmOrAm(String userInput) {

        return userInput.substring (userInput.length () - 2, userInput.length ());
    }

    public String getNumberWithOutamOrPm(String userInput) {

        return userInput.substring (0, userInput.length () - 2);
    }


    public String removeSemicolon(String userInput) {

        String trim = userInput.trim ();

        return trim.replace (":", "");
    }

    public int numberToInt(String str) {

        return Integer.parseInt (str);
    }

    public int cleanNumber(String str) {

        return numberToInt (removeSemicolon (getNumberWithOutamOrPm (str)));

    }

    public String scanner() {

        Scanner scanner = new Scanner (System.in);

        return scanner.next ();
    }
}


