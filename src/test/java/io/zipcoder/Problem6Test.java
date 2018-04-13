package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6;

    @Before
    public void setup(){
        problem6 = new Problem6();
    }

    @Test
    public void onethirtyTest(){
        String actual = problem6.militaryTime("1:30am");
        String expected = "Zero One Hundred and Thirty Hours";
        Assert.assertEquals(expected, actual);
    }
}
