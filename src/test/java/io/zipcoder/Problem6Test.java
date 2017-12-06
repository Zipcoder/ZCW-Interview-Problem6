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
    public void convertNumberToWord() throws Exception {
        String expected = "Zero Five";
        String actual = Problem6.convertNumberToWord(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertGivenTimeToMilitaryTimeTest1() throws Exception {
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("1:30pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertGivenTimeToMilitaryTimeTest2() throws Exception {
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("1:30am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertGivenTimeToMilitaryTimeTest3() throws Exception {
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("2:22pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertGivenTimeToMilitaryTimeTest4() throws Exception {
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("2:11am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertGivenTimeToMilitaryTimeTest5() throws Exception {
        String expected = "Ten Hundred Zero Two Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("10:02am");
        Assert.assertEquals(expected, actual);
    }
}