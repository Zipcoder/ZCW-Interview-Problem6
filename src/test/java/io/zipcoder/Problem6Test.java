package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

public class Problem6Test {
    @Test
    public void splitTime() {
        int expected = 3;
        String actual =Problem6.splitTime(dayNight);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeConverter() throws Exception {
        String expected = "13:30";
        Date actual = Problem6.timeConverter("1:30pm");
        Assert.assertEquals(expected,actual);
    }

}
