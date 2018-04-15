package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void convertToMilitaryTimeAMTest(){
        Problem6 problem6 = new Problem6();

        String expected = "Eleven Hundred and Thirty Three Hours";
        String actual = problem6.convertToMilitaryTime("11:33am");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimePMTest(){
        Problem6 problem6 = new Problem6();

        String expected = "Twenty Three Hundred and Thirty Three Hours";
        String actual = problem6.convertToMilitaryTime("11:33pm");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitTimeTest(){
        Problem6 problem6 = new Problem6();

        String[] expected = {"10", "35", "pm"};
        String[] actual = problem6.splitTime("10:35pm");

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isItMorningTest(){
        Problem6 problem6 = new Problem6();
        String[] timeArray = {"10", "35", "am"};

        boolean actual = problem6.inTheMorning(timeArray);

        Assert.assertTrue(actual);
    }

    @Test
    public void isItAfternoonTest(){
        Problem6 problem6 = new Problem6();
        String[] timeArray = {"10", "35", "pm"};

        boolean actual = problem6.inTheMorning(timeArray);

        Assert.assertFalse(actual);
    }

}
