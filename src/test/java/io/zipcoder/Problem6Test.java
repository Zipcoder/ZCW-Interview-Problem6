package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void normalToMilitaryTimeTest1(){
        String input = "1:30pm";
        Problem6 problem6 = new Problem6();

        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.normalToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void normalToMilitaryTimeTest2(){
        String input = "1:30am";
        Problem6 problem6 = new Problem6();

        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.normalToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void normalToMilitaryTimeTest3(){
        String input = "2:22pm";
        Problem6 problem6 = new Problem6();

        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.normalToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void normalToMilitaryTimeTest4(){
        String input = "2:11am";
        Problem6 problem6 = new Problem6();

        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.normalToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void normalToMilitaryTimeTest5(){
        String input = "10:02am";
        Problem6 problem6 = new Problem6();

        String expected = "Ten Hundred and Zero Two Hours";
        String actual = problem6.normalToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militarizeTimeTest(){
        String input = "10:02pm";
        Problem6 problem6 = new Problem6();

        String expected = "22:02";
        String actual = problem6.militarizeTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoDigitToStringTwentyTwoTest(){
        String input = "22";
        Problem6 problem6 = new Problem6();

        String expected = "Twenty Two";
        String actual = problem6.twoDigitToString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoDigitToStringThirteenTest(){
        String input = "13";
        Problem6 problem6 = new Problem6();

        String expected = "Thirteen";
        String actual = problem6.twoDigitToString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void twoDigitToStringZeroFiveTest(){
        String input = "05";
        Problem6 problem6 = new Problem6();

        String expected = "Zero Five";
        String actual = problem6.twoDigitToString(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToStringTest(){
        String input = "22:02";
        Problem6 problem6 = new Problem6();

        String expected = "Twenty Two Hundred and Zero Two Hours";
        String actual = problem6.convertToString(input);

        Assert.assertEquals(expected, actual);
    }
}
