package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class Problem6Test {

    @Test
    public void testMiltaryTime1()  {
        //Given
        String input = "1:30pm";
        Problem6 problem6 = new Problem6();

        //When
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.militaryTime(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMiltaryTime2()  {
        //Given
        String input = "1:30am";
        Problem6 problem6 = new Problem6();

        //When
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.militaryTime(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMiltaryTime3()  {
        //Given
        String input = "2:11am";
        Problem6 problem6 = new Problem6();

        //When
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.militaryTime(input);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMiltaryTime4()  {
        //Given
        String input = "10:02am";
        Problem6 problem6 = new Problem6();

        //When
        String expected = "Ten Hundred Zero Two Hours";
        String actual = problem6.militaryTime(input);

        //Then
        Assert.assertEquals(expected, actual);
    }


}
