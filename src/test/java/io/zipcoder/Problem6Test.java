package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6 = new Problem6();
    String input = "9:47pm";

    @Before


    @Test
    public void militaryTimeConverterTest(){

        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.militaryTimeConverter(input);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isAMTest() throws Exception {

        boolean actual = problem6.isAM("1:30pm");
        boolean actual2 = problem6.isAM("10:22am");

        Assert.assertFalse(actual);

    }

    @Test
    public void mapDigitToStringTest() throws Exception {

        String expected = "Two";
        String expected2 = "Twelve";

        String actual = problem6.mapDigitToString("2");
        String actual2 =problem6.mapDigitToString("12");

        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expected2, actual2);


    }
}
