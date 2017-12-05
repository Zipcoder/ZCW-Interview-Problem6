package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

Problem6 problem6 = new Problem6();
    @Test
    public void getPmOrAmTest(){

        String expected = "am";
        String actual = problem6.getPmOrAm ("1:30am");
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void getNumberWithOutamOrPm(){

        String expected = "1:30";
        String actual = problem6.getNumberWithOutamOrPm ("1:30am");
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void removeSemicolonTest(){

        String expected = "130";
        String actual = problem6.removeSemicolon (problem6.getNumberWithOutamOrPm ("1:30am"));
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void numberToIntTest(){

        int expected = 130;
        int actual = problem6.numberToInt ("130");
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void cleanNumberTest(){

        int expected = 130;
        int actual = problem6.cleanNumber ("1:30pm");
        Assert.assertEquals (expected, actual);
    }




}
