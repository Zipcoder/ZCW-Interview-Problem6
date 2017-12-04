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
    public void convertGivenTimeToMilitaryTime() throws Exception{
        String input = "1:30pm";
        String expected = "1330";
        String actual = problem6.convertGivenTimeToMilitaryTime(input);
        Assert.assertEquals(expected,actual);

    }

//    @Test
//    public void convertToMilitaryTimeTest1() throws Exception {
//        String expected = "Thirteen Hundred and Thirty Hours";
//        String actual = problem6.convertMilitaryTimeToPhrase("1330");
//        Assert.assertEquals(expected, actual);
//
//    }
//
//    @Test
//    public void convertToMilitaryTimeTest2() throws Exception {
//        String expected = "Zero One Hundred and Thirty Hours";
//        String actual = problem6.convertMilitaryTimeToPhrase("0130");
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void convertToMilitaryTimeTest3() throws Exception {
//        String expected = "Fourteen Hundred and Twenty Two Hours";
//        String actual = problem6.convertMilitaryTimeToPhrase("1422");
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void convertToMilitaryTimeTest4() throws Exception {
//        String expected = "Zero Two Hundred and Eleven Hour";
//        String actual = problem6.convertMilitaryTimeToPhrase("0211");
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void convertToMilitaryTimeTest5() throws Exception {
//        String expected = "Ten Hundred Zero Two Hours";
//        String actual = problem6.convertMilitaryTimeToPhrase("1002");
//        Assert.assertEquals(expected, actual);
//    }
}