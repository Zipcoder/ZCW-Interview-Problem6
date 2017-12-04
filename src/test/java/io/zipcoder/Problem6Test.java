package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6 = new Problem6();
    String input = "12:47am";
    String inputb = "12:47pm";
    String input1 = "1:30am";
    String input2 = "1:30pm";
    String input3 = "2:22pm";
    String input4 = "2:11am";
    String input5 = "10:02am";

    @Before

    @Test
    public void militaryTimeConverterTestSandbox() {

        String expected = "Zero Hundred and Forty-Seven Hours";
        String actual = problem6.militaryTimeConverter(input);

        Assert.assertEquals(expected,actual);

        String expectedb = "Twelve Hundred and Forty-Seven Hours";
        String actualb = problem6.militaryTimeConverter(inputb);

        Assert.assertEquals(expectedb,actualb);

    }
    @Test
    public void militaryTimeConverterTestOfficial(){

        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.militaryTimeConverter(input1);

        Assert.assertEquals(expected,actual);

        String expected2 = "Thirteen Hundred and Thirty Hours";
        String actual2 = problem6.militaryTimeConverter(input2);

        Assert.assertEquals(expected2,actual2);

        String expected3 = "Fourteen Hundred and Twenty-Two Hours";
        String actual3 = problem6.militaryTimeConverter(input3);

        Assert.assertEquals(expected3,actual3);

        String expected4 = "Zero Two Hundred and Eleven Hours";
        String actual4 = problem6.militaryTimeConverter(input4);

        Assert.assertEquals(expected4,actual4);

        String expected5 = "Ten Hundred and Zero Two Hours";
        String actual5 = problem6.militaryTimeConverter(input5);

        Assert.assertEquals(expected5,actual5);

    }

    @Test
    public void isAMTest() throws Exception {

        boolean actual = problem6.isAM("1:30am");
        boolean actual2 = problem6.isAM("10:22am");

        Assert.assertTrue(actual);
        Assert.assertTrue(actual2);
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
