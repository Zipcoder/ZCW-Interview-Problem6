package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6;

    @Before
    public void setUp() {
        problem6 = new Problem6();
    }

    @Test
    public void convertToMilitaryTimeTest_Input130pm() {
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTest_Input130am() {
        String input = "1:30am";
        String expected = "Zero One Hundred and Thirty Hours";

        String actual = problem6.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTest_Input222pm() {
        String input = "2:22pm";
        String expected = "Fourteen Hundred and Twenty Two Hours";

        String actual = problem6.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTest_Input211am() {
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = problem6.convertToMilitaryTime(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertToMilitaryTimeTest_Input1002am() {
        String input = "10:02am";
        String expected = "Ten Hundred Zero Two Hours";

        String actual = problem6.convertToMilitaryTime(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkIfPmTest_expectedTrue() {
        String input = "1:30pm";
        Assert.assertTrue(problem6.checkIfPm(input));
    }

    @Test
    public void checkIfPmTest_expectedFalse() {
        String input = "5:30am";
        Assert.assertFalse(problem6.checkIfPm(input));
    }

    @Test
    public void getHoursTest_expected1() {
        String input = "1:30pm";
        Integer expected = 1;
        Integer actual = problem6.getHours(input);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NumberFormatException.class)
    public void verifyValidInputTestFromGetHours_ExpectedNumberFormatException() {
        String input = "Tariq:30pm";
        Integer actual = problem6.getHours(input);
    }

    @Test
    public void getMinutesTest_expected30() {
        String input = "1:30pm";
        Integer expected = 30;
        Integer actual = problem6.getMinutes(input);
        Assert.assertEquals(expected, actual);
    }

    @Test (expected = NumberFormatException.class)
    public void verifyValidInputTestFromGetMinutes_expectedNumberFormatException() {
        String input = "1:lolpm";
        Integer actual = problem6.getMinutes(input);
    }

    @Test
    public void testPopulateHours_ExpectedSize25() {
        int expected = 25;
        int actual = problem6.getHoursArrayList().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPopulateMinutes_ExpectedSize60() {
        int expected = 60;
        int actual = problem6.getMinutesArrayList().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertHoursToString_expectedFourteen() {
        String input = "2:30pm";
        String expected = "Fourteen";

        Integer hours = problem6.getHours(input);

        boolean isPm = problem6.checkIfPm(input);

        String actual = problem6.convertHoursToString(hours, isPm);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertMinutesToString_expectedThirty() {
        String input = "2:30pm";
        String expected = "and Thirty";

        Integer minutes = problem6.getMinutes(input);

        String actual = problem6.convertMinutesToString(minutes);

        Assert.assertEquals(expected, actual);
    }

}
