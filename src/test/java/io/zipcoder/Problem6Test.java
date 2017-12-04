package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
    private Problem6 problem6;
    private String militaryString1;
    private String militaryString2;
    private String militaryString3;
    private String militaryString4;
    private String militaryString5;

    @Before
    public void setUp(){
        problem6 = new Problem6();
        militaryString1 = "1:30pm";
        militaryString2 = "1:30am";
        militaryString3 = "2:22pm";
        militaryString4 = "2:11am";
        militaryString5 = "10:02am";
    }

    @Test
    public void convertToMilitaryStringTest1(){
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.convertToMilitaryString(militaryString1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryStringTest2(){
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.convertToMilitaryString(militaryString2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryStringTest3(){
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.convertToMilitaryString(militaryString3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryStringTest4(){
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.convertToMilitaryString(militaryString4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryStringTest5(){
        String expected = "Ten Hundred Zero Two Hours";
        String actual = problem6.convertToMilitaryString(militaryString5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void stringSplitTest(){
    }
}
