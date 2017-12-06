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
    public void convertToMilitaryTimeTestOne() {
        String expected = "13:30";
        String actual = problem.convertToMilitaryTime("1:30 pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestTwo() {
        String expected = "01:30";
        String actual = problem.convertToMilitaryTime("1:30 am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestThree() {
        String expected = "14:22";
        String actual = problem.convertToMilitaryTime("2:22 pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTestFour() {
        String expected = "02:22";
        String actual = problem.convertToMilitaryTime("2:22 am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseMilitaryHourTest() {
        int expected = 13;
        int actual = problem.parseMilitaryHour("13:30");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseMilitaryMinutesTest() {
        int expected = 30;
        int actual = problem.parseMilitaryMinutes("13:30");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHourToWordTestONe() {
        String expected = "Thirteen";
        String actual = problem.convertHourToWord(13);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHourToWordTestTwo() {
        String expected = "Twentyfour";
        String actual = problem.convertHourToWord(24);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMinuteToWordTestOne() {
        String expected = "Seven";
        String actual = problem.convertMinuteToWord(7);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMinuteToWordTestTwo() {
        String expected = "Fortyone";
        String actual = problem.convertMinuteToWord(41);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void convertToMilitaryTimeInWordsTestOne() {
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem.convertToMilitaryTimeInWords("Thirteen", "Thirty");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeInWordsTestTwo() {
        String expected = "Fourteen Hundred and Twentytwo Hours";
        String actual = problem.convertToMilitaryTimeInWords("Fourteen", "Twentytwo");
        Assert.assertEquals(expected, actual);
    }

}