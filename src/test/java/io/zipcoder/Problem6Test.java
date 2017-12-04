package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6;
    String expected;
    String time;

    @Before
    public void setUp() throws Exception {
        problem6 = new Problem6();

        time = "1:30pm";
        expected = "Thirteen Hundred and Thirty Hours";

    }

    @Test
    public void militaryTime(){

        String actual = problem6.militaryTime(time);

        Assert.assertEquals(expected,actual);

    }
}
