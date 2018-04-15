package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 newProblem6;
    String testDate1 = "1:00pm";
    String testDate = "10:00am";
    String testDate2 = "3:30pm";
    String testDate3 = "3:30am";
    String militaryTime = "15:30";
    String[] militaryTimeArray = {"15", "30"};

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


    @Test
    public void splitTimeTest(){
        //Given
        Integer expected = militaryTimeArray.length;
        //When
        String[] splitTimeTest = newProblem6.splitTime(militaryTime);
        Integer actual = splitTimeTest.length;
        //Then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void splitTimeTest1(){
        //Given
        String expected = militaryTimeArray[0];
        //When
        String[] splitTimeTest = newProblem6.splitTime(militaryTime);
        String actual = splitTimeTest[0];
        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void covertIndexOneToWordTest(){
        //Given
        String expected = "Fifteen";
       //When
        String actual = newProblem6.convertIndexToWord(militaryTimeArray[0]);
       //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void covertIndexTwoToWordTest(){
        //Given
        String expected = "Thirty";
        //When
        String actual = newProblem6.convertIndexToWord(militaryTimeArray[1]);
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void formatWordsTest(){
        //Given
        String expected = "Fifteen Hundred and Thirty Hours";
        //When
        String actual = newProblem6.formatWords("Fifteen", "Thirty");
        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void seeIfWholeThingWorksTest(){
        String expected = "Fifteen Hundred and Thirty Hours";
        String actual = newProblem6.seeIfWholeThingWorks(testDate2);
        Assert.assertEquals(expected, actual);

    }

}
