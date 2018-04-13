package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    Problem6 timeConerter = new Problem6();

    @Test
    public void amCheckerTest1(){
        boolean actual = timeConerter.amChecker("11:00am");
        Assert.assertTrue(actual);
    }

    @Test
    public void amCheckerTest2(){
        boolean actual = timeConerter.amChecker("11:00pm");
        Assert.assertFalse(actual);
    }

    @Test
    public void timeSplitterTest(){
        String[] expected = new String[2];
        expected[0] = "11";
        expected[1] = "30";
        String[] actual = timeConerter.timeSplitter("11:30pm");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void intParserTest(){
        int[] expected = new int[2];
        expected[0] = 11;
        expected[1] = 30;
        String[] testArray = new String[2];
        testArray[0] = "11";
        testArray[1] = "30";
        int[] actual = timeConerter.intParser(testArray);
        Assert.assertEquals(actual[0],expected[0]);
        Assert.assertEquals(actual[1], expected[1]);
    }

    @Test
    public void add12IfPMTest(){
        int[] testArray = new int[2];
        testArray[0] = 11;
        testArray[1] = 30;
        int[] actual = timeConerter.add12IfPM(testArray, false);
        Assert.assertEquals(actual[0], 23);
    }

    @Test
    public void hourCheckerTest(){
        int[] testArray = new int[2];
        testArray[0] = 23;
        testArray[1] = 30;
        String actual = timeConerter.hourChecker(testArray);
        String expected = "Twenty-Three Hundred";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void onesCheckerTest(){
        String actual = timeConerter.onesChecker("1");
        Assert.assertEquals(actual, "One");
    }

    @Test
    public void tensCheckerTest(){
        String actual = timeConerter.tensChecker("3");
        Assert.assertEquals(actual, "Thirty");
    }

    @Test
    public void minuteCheckerTest1(){
        String[] testArray = new String[2];
        testArray[0] = "11";
        testArray[1] = "02";
        String actual = timeConerter.minuteChecker(testArray);
        Assert.assertEquals(actual, " And Two Hours");
    }

    @Test
    public void minuteCheckerTest2(){
        String[] testArray = new String[2];
        testArray[0] = "11";
        testArray[1] = "00";
        String actual = timeConerter.minuteChecker(testArray);
        Assert.assertEquals(actual, " Hours");
    }

    @Test
    public void minuteCheckerTest3(){
        String[] testArray = new String[2];
        testArray[0] = "11";
        testArray[1] = "13";
        String actual = timeConerter.minuteChecker(testArray);
        Assert.assertEquals(actual, " And Thirteen Hours");
    }

    @Test
    public void minuteCheckerTest5(){
        String[] testArray = new String[2];
        testArray[0] = "11";
        testArray[1] = "26";
        String actual = timeConerter.minuteChecker(testArray);
        Assert.assertEquals(actual, " And Twenty Six Hours");
    }

    @Test
    public void timeConverterTest1(){
        String actual = timeConerter.timeConverter("11:59am");
        String expected = "Eleven Hundred And Fifty Nine Hours";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeConverterTest2(){
        String actual = timeConerter.timeConverter("12:00pm");
        String expected = "Twelve Hundred Hours";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeConverterTest3(){
        String actual = timeConerter.timeConverter("12:19am");
        String expected = "Zero Hundred And Nineteen Hours";
        Assert.assertEquals(expected,actual);
    }
}
