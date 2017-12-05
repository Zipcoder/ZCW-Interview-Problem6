package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {
    InputReader problem = new InputReader();
    Problem6 main = new Problem6();
    String input = "12:30am";

    @Test
    public void hourRegexTest(){
        String expected = "12";
        String actual = problem.hourRegex(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void minutesRegexTest(){
        String expected = "30";
        String actual = problem.minuteRegex(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void amPmRegexTest(){
        String expected = "am";
        String actual = problem.amPmRegex(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeInWords(){
        String expected = "Eleven Hundred and Thirty Hours";
        String actual = main.timeIntoWords("11:30pm");
        Assert.assertEquals(expected, actual);
    }
}
