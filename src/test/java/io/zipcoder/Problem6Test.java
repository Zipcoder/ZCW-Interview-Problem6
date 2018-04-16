package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void testTime() {
        Problem6 problem6 = new Problem6();
        String input = "1:30pm";
        String[] expected = {"1","30pm"};
        String[] actual = problem6.splitString(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetHour() {
        Problem6 problem6 = new Problem6();
        String input = "1:30pm";
        Integer expected = 13;
        Integer actual = problem6.parseIntoHour(input);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetMilitaryTime1() {
        Problem6 problem6 = new Problem6();
        Integer input = 5;
        String expected = "Zero Five";
        String actual = problem6.getMilitaryHour(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMilitaryTime() {
        Problem6 problem6 = new Problem6();
        Integer input = 13;
        String expected = "Thirteen";
        String actual = problem6.getMilitaryHour(input);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMinuteTime() {
        Problem6 problem6 = new Problem6();
        String input = "1:30pm";
        Integer expected = 30;
        Integer actual = problem6.parseMinutes(input);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testMilitaryMinutes() {
        Problem6 problem6 = new Problem6();
        Integer input = 30;
        String expected = "Thirty ";
        String actual = problem6.getMilitaryMinutes(input);
        System.out.println(actual);
        Assert.assertEquals(expected, actual);
    }


}
