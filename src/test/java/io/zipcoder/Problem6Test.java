package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    private String firstTime;
    private String secondTime;
    private String thirdTime;
    private String fourthTime;
    private String fifthTime;
    private String myTime;
    private Problem6 problem6;

    @Before
    public void setUp(){
        firstTime = "1:30pm";
        secondTime = "1:30am";
        thirdTime = "2:22pm";
        fourthTime = "2:11am";
        fifthTime = "10:02am";
        myTime = "12:59pm";
        problem6 = new Problem6();
    }

    @Test
    public void convertTimeNumericallyTestFirst(){
        String expected = "1330";

        String actual = problem6.convertTimeNumerically(firstTime);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeNumericallyTestSecond(){
        String expected = "0130";

        String actual = problem6.convertTimeNumerically(secondTime);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeNumericallyTestThird(){
        String expected = "1422";

        String actual = problem6.convertTimeNumerically(thirdTime);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeNumericallyTestFourth(){
        String expected = "0211";

        String actual = problem6.convertTimeNumerically(fourthTime);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeNumericallyTestFifth(){
        String expected = "1002";

        String actual = problem6.convertTimeNumerically(fifthTime);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToWordTestFirst(){
        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(firstTime));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToWordTestSecond(){
        String expected = "Zero One Hundred and Thirty Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(secondTime));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToWordsTestThird(){
        String expected = "Fourteen Hundred and Twenty Two Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(thirdTime));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToWordsTestFourth(){
        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(fourthTime));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToWordsTestFifth(){
        String expected = "Ten Hundred Zero Two Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(fifthTime));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void myTest(){
        String expected = "Twenty Two and Forty Two Hours";

        String actual = problem6.convertTimeToWord(problem6.convertTimeNumerically(myTime));

        Assert.assertEquals(expected,actual);
    }
}
