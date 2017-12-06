package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6 = new Problem6();
    @Test
    public void testConvertTo24Hours(){
        String expected= "14:30";
        String actual = problem6.convertTo24Hours("2:30 pm");
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }
    //output should Fourteen Hundred and Thirty Hours
    @Test
    public void testConvert() {
        String expected = "Fourteen Hundred and Thirty Hours";
        String actual = problem6.convert("2:30 pm");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testConvert2(){
        String expected="Fourteen Hundred and Zero Hours";
        String actual = problem6.convert("2:00 pm");
        Assert.assertEquals(expected,actual);
        System.out.println(actual);
    }
    @Test
    public void testConvertTo24Hours2(){
        String expected = "09:00";
        String actual = problem6.convertTo24Hours("9:00 am");
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testConvert3(){
        String expected ="Zero Two Hundred and Eleven Hours";
        String actual = problem6.convert("2:11 am");
        Assert.assertEquals(expected,actual);
    }
}
