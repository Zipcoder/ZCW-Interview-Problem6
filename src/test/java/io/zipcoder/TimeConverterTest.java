package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class TimeConverterTest {

    @Test
    public void timeSplitTestOne(){
        //Given
        String input = "1:30pm";

        //When
        String [] expected = {"01","30","pm"};
        String [] actual = TimeConverter.splitTime(input);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void timeSplitTestTwo(){
        //Given
        String input = "12:30pm";

        //When
        String [] expected = {"12","30","pm"};
        String [] actual = TimeConverter.splitTime(input);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void timeConvertTestOne() {
        //Given
        String [] input = {"01","30","pm"};

        //When
        String [] expected = {"13","30"};
        String [] actual = TimeConverter.convertTime(input);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

    @Test
    public void timeConvertTestTwo() {
        //Given
        String [] input = {"01","30","am"};

        //When
        String [] expected = {"01","30"};
        String [] actual = TimeConverter.convertTime(input);

        //Then
        Assert.assertArrayEquals(expected,actual);
    }

}
