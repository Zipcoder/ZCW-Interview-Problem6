package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimeParserTest {
    String input;

    @Before
    public void setUp() throws Exception {
        input = "12:43am";
    }

    @Test
    public void findPatternTest_AmPm() throws Exception {
        String expected = "am";
        String actual = new TimeParser(input).getAmOrPm();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Minutes() {
        String expected = "43";
        String actual = new TimeParser(input).getMinutes();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Hours() {
        String expected = "12";
        String actual = new TimeParser(input).getHours();
        Assert.assertEquals(expected,actual);
    }


}