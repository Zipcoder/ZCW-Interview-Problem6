package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void getPeriodOfDayTest(){
        String input = "1:30am";

        String expected = "am";
        String actual = Problem6.getPeriodOfDay(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTimeTest(){
        String input = "1:30pm";

        String expected = "1:30";
        String actual = Problem6.getTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void determineTimeTest(){
        String input = "11:30am";

        String expected = "";
        String actual = Problem6.determineTime(input);

        Assert.assertEquals(expected, actual);
    }

}
