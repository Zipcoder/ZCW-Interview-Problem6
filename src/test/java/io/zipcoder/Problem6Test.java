package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6 = new Problem6();


    @Test
    public void toMilitaryTimeConvertor() {

        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = problem6.toMilitaryTimeConvertor("1:30pm");


    }

    @Test
    public void getHourStringTest() {

        String expected = "1";

        String actual = problem6.getHourString("1:30pm");

        Assert.assertEquals(expected , actual);

    }

    @Test
    public void getMilitaryPeriodCoversionTest() {

        Boolean expected = false;
        Boolean expected2 = true;

        Boolean actual = problem6.toMilitaryPeriodConversion("1:30pm");
        Boolean actual2 = problem6.toMilitaryPeriodConversion("1:30am");

        Assert.assertEquals(expected , actual);
        Assert.assertEquals(expected2 , actual2);

    }

    @Test
    public void hourToMilitaryCoversionTest() {

        String expected = "Thirteen Hundred";
        String expected2 = "Zero One Hundred";

        String actual = problem6.hourToMilitaryHourConversion("1:30pm");
        String actual2 = problem6.hourToMilitaryHourConversion("1:30am");

        Assert.assertEquals(expected , actual);
        Assert.assertEquals(expected2 , actual2);

    }

    @Test
    public void getMinuteTest() {

        String expected = "30";
        String expected2 = "4";

        String actual = problem6.getMinute("1:30pm");
        String actual2 = problem6.getMinute("1:04am");

        Assert.assertEquals(expected , actual);
        Assert.assertEquals(expected2 , actual2);

    }

    @Test
    public void minuteToMilitaryConversionTest() {

        String expected = "Zero Two Hours";
        String expected2 = "40";

        String actual = problem6.minuteToMilitaryMinuteConversion("10:02pm");
        String actual2 =  problem6.getMinute("1:40am");

        Assert.assertEquals(expected , actual);
        Assert.assertEquals(expected2,actual2);

    }

//    @Test
//    public void getFormattedMinuteTest() {
//
//        String expected = " Zero Two Hours";
//
//
//        String actual = problem6.getFormatedMinute("10:02am");
//
//
//        Assert.assertEquals(expected , actual);
//
//
//    }

    @Test
    public void toMilitaryTimeConvertorTest() {

        String expected = "Ten Hundred Zero Two Hours";
        String expected2 = "Zero Two Hundred  and Eleven Hours";
        //String expected3 = "Fourteen Hundred and Twenty Two Hours";

        String actual = problem6.toMilitaryTimeConvertor("10:02am");
        String actual2 = problem6.toMilitaryTimeConvertor("2:11am");
       // String actual3 = problem6.toMilitaryTimeConvertor("2:22pm");

        Assert.assertEquals(expected , actual);
        Assert.assertEquals(expected2,actual2);
        //Assert.assertEquals(expected3,actual3);

    }


}
