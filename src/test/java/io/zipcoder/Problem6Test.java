package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

public class Problem6Test {

    Problem6 newProblem6;
    String testDate1 = "1:00pm";
    String testDate = "10:00am";
    String testDate2 = "3:30pm";
    String testDate3 = "3:30am";

    @Before
    public void setUp(){
        this.newProblem6 = new Problem6();
    }

    @Test
    public void timeConverterTest(){
        //Given
        String expected = "13:00";
        //When
        String actual = newProblem6.timeConverter(testDate1);
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void timeConverterTest1(){
        //Given
        String expected = "10:00";
        //When
        String actual = newProblem6.timeConverter(testDate);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeConverterTest2(){
        //Given
        String expected = "15:30";
        //When
        String actual = newProblem6.timeConverter(testDate2);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeConverterTest3(){
        //Given
        String expected = "03:30";
        //When
        String actual = newProblem6.timeConverter(testDate3);
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test (expected = ParseException.class)
    public void timeConverterTest4(){
        newProblem6.timeConverter("12pm");
    }

}
