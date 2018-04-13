package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void testParse1() {
        Problem6 problem6 = new Problem6();
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.parse("1:30pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParse2() {
        Problem6 problem6 = new Problem6();
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.parse("1:30am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParse3() {
        Problem6 problem6 = new Problem6();
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.parse("2:22pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParse4() {
        Problem6 problem6 = new Problem6();
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.parse("2:11am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testParse5() {
        Problem6 problem6 = new Problem6();
        String expected = "Ten Hundred Zero Two Hours";
        String actual = problem6.parse("10:02am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTest() {
        Problem6 problem6 = new Problem6();
        Integer expected = 2;
        Integer actual = problem6.testMethod("02pm");
        Assert.assertEquals(expected, actual);
    }

}
