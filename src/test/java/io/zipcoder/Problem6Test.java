package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {


    @Test
    public void militaryTimeTest(){
        String time = "1:30pm";
        String militaryTime = "Thirteen Hundred and Thirty Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest1(){
        String time = "1:30am";
        String militaryTime = "Zero One Hundred and Thirty Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest2(){
        String time = "2:22pm";
        String militaryTime = "Fourteen Hundred and Twenty Two Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest3(){
        String time = "2:11am";
        String militaryTime = "Zero Two Hundred and Eleven Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest4(){
        String time = "10:02am";
        String militaryTime = "Ten Hundred and Zero Two Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest5(){
        String time = "10:22am";
        String militaryTime = "Ten Hundred and Twenty Two Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
    @Test
    public void militaryTimeTest6(){
        String time = "12:22am";
        String militaryTime = "Zero Hundred and Twenty Two Hours";
        Problem6 testProblem6 = new Problem6();
        String actual = testProblem6.militaryConverter(time);
        Assert.assertEquals(militaryTime, actual);
    }
}
