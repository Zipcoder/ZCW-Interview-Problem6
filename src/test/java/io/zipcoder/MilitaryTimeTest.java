package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MilitaryTimeTest {

    MilitaryTime militaryTime;

    @Before
    public void setup() {
        militaryTime = new MilitaryTime();
    }

    @Test
    public void formatTest() {
        String input = "11:30pm";
        String expected = "11:30 PM";

        String actual = militaryTime.formatTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumericallyPMTest() throws Exception{
        String input = "1:30pm";
        String expected = "13:30";

        String actual = militaryTime.convertNumerically(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertNumericallyAMTest() throws Exception {
        String input = "1:30am";
        String expected = "01:30";

        String actual = militaryTime.convertNumerically(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHoursTest() {
        Integer input = 11;
        String expected = "Eleven Hundred and ";

        String actual = militaryTime.convertHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHoursTest2() {
        Integer input = 23;
        String expected = "Twenty Three Hundred and ";

        String actual = militaryTime.convertHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHoursTest3() {
        Integer input = 58;
        String expected = "Fifty Eight Hundred and ";

        String actual = militaryTime.convertHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHoursTest4() {
        Integer input = 3;
        String expected = "Zero Three Hundred and ";

        String actual = militaryTime.convertHours(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMinutesTest() {
        Integer input = 3;
        String expected = "Zero Three Hours";

        String actual = militaryTime.convertMinutes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMinutesTest2() {
        Integer input = 14;
        String expected = "Fourteen Hours";

        String actual = militaryTime.convertMinutes(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimePM() throws Exception {
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = militaryTime.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimePM2() throws Exception {
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";

        String actual = militaryTime.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeAM() throws Exception {
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";

        String actual = militaryTime.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeAM2() throws Exception {
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = militaryTime.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeAM3() throws Exception {
        String input = "10:02am";
        String expected = "Ten Hundred and Zero Two Hours";

        String actual = militaryTime.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

}
