package io.zipcoder;

import java.util.ArrayList;

public class Problem6 {


    public static void main(String[] args) {

        Problem6 problem = new Problem6();

        System.out.println(problem.timeGiven("1:30pm, 1:30am, 2:22pm, 2:11am, 10:02am"));
    }

    ArrayList<String> timeGiven(String timeString) {


        //NOTE: I know this method is a massive violation of SRP... it bothered me but I was really focused on just trying to get
        //to a point where things were working and go from there (clean up later)


        //split time at the ":" so we have hour values and minutes values as separate elements in array to work with
        String[] timeArray = timeString.split(":");


        //get the elements at even indices and put in an arraylist b/c these are the hours values we want to start working with
        int counter = 0;
        String hourIndex;
        ArrayList<String> hoursList = new ArrayList<String>();
        for (int i = 0; i < timeArray.length; i++) {

            if (counter % 2 == 0) {
                hourIndex = timeArray[i];
                hoursList.add(hourIndex);
            }
            counter++;
        }

        //loop through hours list (which should contain all hour values), with the intent to then change those values from standard
        //time to military time strings

        //NOTE: BELOW SETUP WILL NOT CURRENTLY TAKE INTO ACCOUNT THE DIFFERENCE BETWEEN AM AND PM HOURS IN MILITARY TIME (CURRENTLY
        //JUST TRYING TO WORK WITH AM HOURS AS FOUNDATION
        //Also I know there are more elegant ways to add strings of military time to the militaryHours arraylist, I'm going for
        //function (testing my ideas) over form since time is a factor

        ArrayList<String> militaryHours = new ArrayList<String>();
        String militaryOneAM = "Zero One Hundred";
        militaryHours.add(militaryOneAM);
        String militaryTwoAM = "Zero Two Hundred";
        militaryHours.add(militaryTwoAM);
        String militaryThreeAM = "Zero Three Hundred";
        militaryHours.add(militaryThreeAM);
        String militaryFourAM = "Zero Four Hundred";
        militaryHours.add(militaryFourAM);
        String militaryFiveAM = "Zero Five Hundred";
        militaryHours.add(militaryFiveAM);
        String militarySixAM = "Zero Six Hundred";
        militaryHours.add(militarySixAM);
        String militarySevenAM = "Zero Seven Hundred";
        militaryHours.add(militarySevenAM);
        String militaryEightAM = "Zero Eight Hundred";
        militaryHours.add(militaryEightAM);
        String militaryNineAM = "Zero Nine Hundred";
        militaryHours.add(militaryNineAM);
        String militaryTenAM = "Ten Hundred";
        militaryHours.add(militaryTenAM);
        String militaryElevenAM = "Eleven Hundred";
        militaryHours.add(militaryElevenAM);
        String militaryTwelveAM = "Twelve Hundred";
        militaryHours.add(militaryTwelveAM);

        //hoursList.indexOf(0) = militaryHours.indexOf(0);


//        for(int i = 0; i < hoursList.size(); i++){
//
//        }


        //Once I had gotten the AM hours set from standard to military I would have had the foundation to then do the same for
        //PM hours as well as minutes from the other indices of the respective array
        //I think I have cake over my face though because I probably overcomplicated this whole problem and jumped into anyway


        //return currently just for testing use in the main method...
        return hoursList;
    }
}


