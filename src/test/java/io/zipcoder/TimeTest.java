package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTest {
    String input;

    @Before
    public void setUp() throws Exception {
        input = "12:43am";
    }

    @Test
    public void findPatternTest_AmPm() throws Exception {
        String expected = "am";
        String actual = new Time(input).getAmOrPm();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Minutes() {
        String expected = "43";
        String actual = new Time(input).getMinutes();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Hours() {
        String expected = "12";
        String actual = new Time(input).getHours();
        Assert.assertEquals(expected,actual);
    }


}