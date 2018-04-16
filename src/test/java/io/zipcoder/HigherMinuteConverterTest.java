package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class HigherMinuteConverterTest {

    @Test
    public void tenToTwentyTest(){
        //Given
        int input = 11;
        String expected = "Eleven";
        //When
        String actual = HigherMinuteConverter.tenToTwenty(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void higherMinutesTest(){
        //Given
        int input = 31;
        String expected = "one";
        //When
        String actual = HigherMinuteConverter.higherMinutes(input);
        //Then
        Assert.assertEquals(expected, actual);
    }
}
