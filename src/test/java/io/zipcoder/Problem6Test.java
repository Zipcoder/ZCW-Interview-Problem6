package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6;

    @Before
    public void setup(){
        problem6 = new Problem6();
    }

    @Test
    public void onethirtyTest(){
        String actual = problem6.militaryTime("1:30am");
        String expected = "Zero One Hundred and Thirty Hours";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void oneThirtyPmTest(){
        String actual = problem6.militaryTime("1:30pm");
        String expected = "Thirteen Hundred and Thirty Hours";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void fiveFourtyFivePmTest(){
        String actual = problem6.militaryTime("5:45pm");
        String expected = "Seventeen Hundred and Forty Five Hours";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tenOhTwoAmTest(){
        String actual = problem6.militaryTime("10:02am");
        String expected = "Ten Hundred Zero Two Hours";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoElevenAmTest(){
        String actual = problem6.militaryTime("2:11am");
        String expected = "Zero Two Hundred and Eleven Hours";
        Assert.assertEquals(expected, actual);
    }
}
