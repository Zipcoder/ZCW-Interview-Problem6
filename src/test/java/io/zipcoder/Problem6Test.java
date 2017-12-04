package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6;
    String givenTime;

    @Before
    public void setup(){
        problem6 = new Problem6();
        givenTime = "";

    }
    @Test
    public void convertGivenTimeToMilitaryTimeTest() throws Exception{
        String input = "1:30pm";
        String expected = "1330";
        String actual = problem6.convertGivenTimeToMilitaryTime(input);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void convertNumberToWordTest1() throws Exception {
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("1:30pm");
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void convertNumberToWordTest2() throws Exception {
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("1:30am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToWordTest3() throws Exception {
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("2:22pm");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToWordTest4() throws Exception {
        String expected = "Zero Two Hundred and Eleven Hour";
        String actual = problem6.convertGivenTimeToMilitaryTime("2:11am");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumberToWordTest5() throws Exception {
        String expected = "Ten Hundred Zero and Two Hours";
        String actual = problem6.convertGivenTimeToMilitaryTime("10:02am");
        Assert.assertEquals(expected, actual);
    }
}