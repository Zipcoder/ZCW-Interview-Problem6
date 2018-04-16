package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class FormattingTest {

    @Test
    public void convertTimeTest(){
        //Given
        String input = "1:30AM";
        String expected = "01:30";
        //When
        String actual = Formatting.convertTime(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeTest2(){
        //Given
        String input = "1:30PM";
        String expected = "13:30";
        //When
        String actual = Formatting.convertTime(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeFormatHundredTest(){
        //Given
        String input = "01:30";
        String expected = "Zero One Hundred";
        //When
        String actual = Formatting.changeFormatHundred(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeFormatHundredTest2(){
        //Given
        String input = "13:30";
        String expected = "Thirteen Hundred";
        //When
        String actual = Formatting.changeFormatHundred(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void changeFormatHoursTest(){
        //Given
        String input = "13:03";
        String expected = " Zero Three Hours";
        //When
        String actual = Formatting.changeFormatHours(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNewTimeTest() {
        //Given
        String input = "11:03AM";
        String expected = "Eleven Hundred Zero Three Hours";
        //When
        String actual = Formatting.getNewTime(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

}
