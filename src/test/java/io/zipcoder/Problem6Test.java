package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    private Problem6 testProblem;

    @Before
    public void setup() {
        testProblem = new Problem6();
    }

    @Test
    public void convertTest1() {
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = testProblem.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest2() {
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = testProblem.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest3() {
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = testProblem.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest4() {
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = testProblem.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest5() {
        String input = "10:02am";
        String expected = "Ten Hundred Zero Two Hours";
        String actual = testProblem.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void pmTest1() {
        String input = "1:30pm";
        Assert.assertTrue(testProblem.isPm(input));
    }

    @Test
    public void pmTest2() {
        String input = "1:30am";
        Assert.assertFalse(testProblem.isPm(input));
    }

    @Test
    public void splitHoursAndMinutesTest1() {
        String input = "1:30pm";
        int expected = 2;
        int actual = testProblem.splitHoursAndMinutes(input).length;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursAmTest1() {
        String input = "3:30am";
        String expected = "Zero Three Hundred";
        String actual = testProblem.getHoursAm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursAmTest2() {
        String input = "11:30am";
        String expected = "Eleven Hundred";
        String actual = testProblem.getHoursAm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursAmTest3() {
        String input = "12:30am";
        String expected = "Zero Hundred";
        String actual = testProblem.getHoursAm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursPmTest1() {
        String input = "7:30pm";
        String expected = "Nineteen Hundred";
        String actual = testProblem.getHoursPm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursPmTest2() {
        String input = "11:30pm";
        String expected = "Twenty Three Hundred";
        String actual = testProblem.getHoursPm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursPmTest3() {
        String input = "12:30pm";
        String expected = "Twelve Hundred";
        String actual = testProblem.getHoursPm(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest1() {
        String input = "8:14am";
        String expected = " and Fourteen Hours";
        String actual = testProblem.getMinutes(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest2() {
        String input = "2:52pm";
        String expected = " and Fifty Two Hours";
        String actual = testProblem.getMinutes(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest3() {
        String input = "5:04pm";
        String expected = " Zero Four Hours";
        String actual = testProblem.getMinutes(input);
        Assert.assertEquals(expected, actual);
    }


}
