package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMethodsTest {
    String input;
    RegexMethods regexMethods;

    @Before
    public void setUp() throws Exception {
        input = "5:50pm";
        regexMethods = new RegexMethods();
    }

    @Test
    public void findPatternTest_AmPm() throws Exception {
        String regex = "[aA|pP][mM]";
        String expected = "pm";
        String actual = regexMethods.findPattern(regex, input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Minutes() {
        String regex = "[0-5]\\d(?!:)";
        String expected = "50";
        String actual = regexMethods.findPattern(regex, input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void findPatternTest_Hours() {
        String regex = "\\d{2}|\\d(?=:)";
        String expected = "5";
        String actual = regexMethods.findPattern(regex, input);
        Assert.assertEquals(expected,actual);
    }

}