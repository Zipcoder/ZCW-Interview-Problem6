package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class Problem6Test {
    Problem6 problem6;
    @Before
    public void Setup(){
        problem6=new Problem6();
    }

    @Test
    public void timeBreakupTest(){
        String input="1:30pm";
        String expected="[1, 30, pm]";

        String [] out= problem6.timeBreakup(input);
        String actual= Arrays.toString(out);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void militaryConvertTest(){
        String input="12:55pm";
        String expected="[12, 55]";


        int[] a=problem6.militaryConvert(problem6.timeBreakup(input));
        String actual=Arrays.toString(a);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest(){
        String input="1:30pm";
        String expected="Thirteen Hundred and Thirty Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest2(){
        String input="1:30am";
        String expected="Zero One Hundred and Thirty Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest3(){
        String input="2:22pm";
        String expected="Fourteen Hundred and Twenty Two Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest4(){
        String input="2:22pm";
        String expected="Fourteen Hundred and Twenty Two Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest5(){
        String input="2:11am";
        String expected="Zero Two Hundred and Eleven Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void militaryTest6(){
        String input="10:02am";
        String expected="Ten Hundred and Zero Two Hours";
        String actual=problem6.getMilitary(input);

        Assert.assertEquals(expected,actual);
    }
}
