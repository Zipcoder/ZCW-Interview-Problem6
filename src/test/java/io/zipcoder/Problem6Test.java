package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void testSplitTime()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "1:30pm";
        String hour = "1";
        String minute = "30";
        String [] expected = {"1", "30pm"};

        //When
        String [] actual = problem6.splitTime(timeInput);

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testParseForHour1()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "1:30pm";
        Integer expected = 13;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testParseForHour2()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "2:30pm";
        Integer expected = 14;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForHour3()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "3:30pm";
        Integer expected = 15;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForHour4()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "7:00pm";
        Integer expected = 19;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForHour5()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "1:30am";
        Integer expected = 1;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testParseForHour6()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "2:30am";
        Integer expected = 2;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForHour7()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "3:30am";
        Integer expected = 3;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForHour8()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "7:00am";
        Integer expected = 7;

        //When
        Integer actual = problem6.parseForHour(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForMinute1()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "4:45am";
        Integer expected = 45;

        //When
        Integer actual = problem6.parseForMinute(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParseForMinute2()
    {
        //Given
        Problem6 problem6 = new Problem6();
        String timeInput = "4:03am";
        Integer expected = 03;

        //When
        Integer actual = problem6.parseForMinute(timeInput);

        //Then
        Assert.assertEquals(expected, actual);
    }





}
