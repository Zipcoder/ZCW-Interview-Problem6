package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;


public class Problem6Test {

    @Test
    public void getMilitaryTimeTest1() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = militaryTimeConverter.convertTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMilitaryTimeTest3() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = militaryTimeConverter.convertTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMilitaryTimeTest4() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = militaryTimeConverter.convertTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMilitaryTimeTest5() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "10:02am";
        String expected = "Ten Hundred and Zero Two Hours";
        String actual = militaryTimeConverter.convertTime(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void isPmTest() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "10:02am";
        boolean actual = militaryTimeConverter.isPm(input);

        Assert.assertFalse(actual);
    }

    @Test
    public void isPmTest2() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();

        String input = "10:02pm";
        boolean actual = militaryTimeConverter.isPm(input);

        Assert.assertTrue(actual);
    }

    @Test
    public void getHoursTest() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "11:12pm";

        int expected = 23;
        int actual = militaryTimeConverter.getHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getHoursTest2() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "9:12pm";

        int expected = 21;
        int actual = militaryTimeConverter.getHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "9:12pm";

        int expected = 12;
        int actual = militaryTimeConverter.getMinutes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getMinutesTest2() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "9:03pm";

        int expected = 3;
        int actual = militaryTimeConverter.getMinutes(input);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void convertToMilitaryTimeTest() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "12:36pm";

        int expected = 12;
        int actual = militaryTimeConverter.getHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTest2() {
        MilitaryTimeConverter militaryTimeConverter = new MilitaryTimeConverter();
        String input = "2:17pm";

        int expected = 14;
        int actual = militaryTimeConverter.getHours(input);

        Assert.assertEquals(expected, actual);
    }

}
