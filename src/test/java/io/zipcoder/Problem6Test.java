package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class Problem6Test {

    private Problem6 problem;

    @Before
    public void setUp() {
        problem = new Problem6();
    }

    @Test
    public void convertToMilitaryTimeTestOne(){
        String expected = "13:30";
        String actual =  problem.convertToMilitaryTime("1:30 pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestTwo(){
        String expected = "01:30";
        String actual =  problem.convertToMilitaryTime("1:30 am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestThree(){
        String expected = "14:22";
        String actual =  problem.convertToMilitaryTime("2:22 pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestFour(){
        String expected = "02:22";
        String actual =  problem.convertToMilitaryTime("2:22 am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseMilitaryHour() {
        String expected = "Thirteen";
        String actual  = problem.parseMilitaryHour();
        Assert.assertEquals(expected, actual);
    }



//    @Test
//    public void convertToMilitaryTimeInWordsTest(){
//        String expected = "Thirteen Hundred and Thirty Hours";
//        String actual = problem.convertToMilitaryTimeInWords();
//        Assert.assertEquals(expected, actual);

    }

}


