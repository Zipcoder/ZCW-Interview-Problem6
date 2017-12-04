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
    public void testConvert(){
        String expected="Fourteen Hundred and Thirty Hours";
        String actual = problem6.convert("2:30 pm");
        Assert.assertEquals(expected,actual);
    }
}
