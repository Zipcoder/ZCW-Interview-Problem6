package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem6Test {

    @Test
    public void test1() {
        Problem6 test = new Problem6();

        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = test.breakInput("01:30pm").toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        Problem6 test = new Problem6();
        String expected = "Zero One Hundred and Thirty Hours";

        String actual = test.breakInput("01:30am").toString();

        Assert.assertEquals(expected, actual);
    }

        @Test
    public void test3(){
        Problem6 test = new Problem6();
        String expected = "Fourteen Hundred and Twenty Two Hours";

        String actual = test.breakInput("02:22pm").toString();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test4(){
        Problem6 test = new Problem6();
        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = test.breakInput("02:11am").toString();

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void test5(){
        Problem6 test = new Problem6();
        String expected = "Ten Hundred and Zero Two Hours";

        String actual = test.breakInput("10:02am").toString();

        Assert.assertEquals(expected,actual);
    }



}
