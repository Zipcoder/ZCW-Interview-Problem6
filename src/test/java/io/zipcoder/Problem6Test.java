package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

Problem6 problem6 = new Problem6();
    @Test
    public void militarConvertedTest(){

        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.militarConvertor("1:30 pm");
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void numToWordTest(){

        String expected = "Two Hundred and Twenty Two";
        String actual = problem6.numToWord(222);
        Assert.assertEquals(expected, actual);
    }
}
