package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6;
    Time testTime;

    @Before
    public void setUp(){
        problem6 = new Problem6();
        testTime = new Time(1,30,"am");
    }

    @Test
    public void transformTimeTest1(){
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.transformTime(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void transformTimeTest2(){
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.transformTime(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void transformTimeTest3(){
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.transformTime(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void transformTimeTest4(){
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.transformTime(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void transformTimeTest5(){
        String input = "10:02am";
        String expected = "Ten Hundred and Zero Two Hours";
        String actual = problem6.transformTime(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTimeTest(){
        Time testTime2 = new Time(12,45,"pm");
        int expected = 12;
        int actual = problem6.militaryTime(testTime2).hour;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void createTimeTest(){
        String str = "12:30pm";
        int expected = 30;
        int actual = problem6.createTime(str).minute;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeStringTest(){
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.makeString(testTime);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void convertTimeTest(){
        String expected = "Zero Five";
        String actual = problem6.convertTime(5);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void convertTimeOverTenTest(){
        String expected = "Forty Five";
        String actual = problem6.convertTime(45);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void firstDigitTest(){
        String expected = "Forty";
        String actual = problem6.firstDigit(4);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getTeenNumberTest(){
        String expected = "Sixteen";
        String actual = problem6.getTeenNumber(16);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void secondDigitTest(){
        String expected = "Nine";
        String actual = problem6.secondDigit(9);
        Assert.assertEquals(expected,actual);
    }

}
