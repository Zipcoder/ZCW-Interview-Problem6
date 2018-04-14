package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AnotherWayTest {


    private AnotherWay testProblem;

    @Before
    public void setup() {
        testProblem = new AnotherWay();
    }

    @Test
    public void convertTest1() {
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = testProblem.convert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest2() {
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = testProblem.convert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest3() {
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = testProblem.convert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest4() {
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = testProblem.convert(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTest5() {
        String input = "10:02am";
        String expected = "Ten Hundred Zero Two Hours";
        String actual = testProblem.convert(input);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void hoursTest1() {
        String input = "2:22pm";
        System.out.println(testProblem.hours(input));
    }

    @Test
    public void hoursTest2() {
        String input = "2:22am";
        System.out.println(testProblem.hours(input));
    }

    @Test
    public void tensTest1() {
        String input = "2:50am";
        System.out.println(testProblem.tenMinutes(input));
    }

    @Test
    public void tensTest2() {
        String input = "2:08am";
        System.out.println(testProblem.tenMinutes(input));
    }

    @Test
    public void tensTest3() {
        String input = "2:00am";
        System.out.println(testProblem.tenMinutes(input));
    }

    @Test
    public void minsTest1() {
        String input = "2:29am";
        System.out.println(testProblem.minutes(input));
    }

    @Test
    public void minsTest2() {
        String input = "2:50am";
        System.out.println(testProblem.minutes(input));
    }

    @Test
    public void minsTest3() {
        String input = "2:14am";
        System.out.println(testProblem.minutes(input));
    }

}
