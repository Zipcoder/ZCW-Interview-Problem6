package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    private Problem6 problem6;
    private String timeStringPm0 = "1:30pm";

    @Before
    public void setup() {
        problem6 = new Problem6();
    }

    @Test
    public void isTimeAmOrPmTest() {
        // Given
        char expectedSecondToLastChar = 'p';
        // When
        char actualSecondToLastChar = problem6.isTimeAmOrPm(timeStringPm0);
        // Then
        Assert.assertEquals(expectedSecondToLastChar, actualSecondToLastChar);
    }

    @Test
    public void timeStringToStringArrayTest() {
        // Given
        String[] expectedStringArr = { "1", "30"};
        // When
        String[] actualStringArr = problem6.timeStringToStringArray(timeStringPm0);
        // Then
        Assert.assertArrayEquals(expectedStringArr, actualStringArr);
    }

    @Test
    public void removeLastTwoCharsTest() {
        // Given
        String expectedString = "1:30";
        // When
        String actualString = problem6.removeLastTwoChars(timeStringPm0);
        // Then
        Assert.assertEquals(expectedString, actualString);
    }

    @Test
    public void writeTimeAsMilitaryTest() {
        // Given
        String expectedHourMilitary = "Zero One Hundred and Thirty Hours";
        // When
        String actualHourMilitary = problem6.writeTimeAsMilitary(timeStringPm0);
        // Then
        Assert.assertEquals(expectedHourMilitary, actualHourMilitary);
    }

    @Test
    public void writeHourAsMilitaryTest() {
        // Given
        String hourString = "01";
        String expectedHourMilitary = "Zero One";
        // When
        String actualHourMilitary = problem6.writeHourAsMilitary(hourString);
        // Then
        Assert.assertEquals(expectedHourMilitary, actualHourMilitary);
    }

    @Test
    public void writeMinutesAsMilitaryTest() {
        // Given
        String minutesString = "59";
        String expectedMinutesMilitary = "Fifty Nine";
        // When
        String actualMinutesMilitary = problem6.writeMinutesAsMilitary(minutesString);
        // Then
        Assert.assertEquals(expectedMinutesMilitary, actualMinutesMilitary);
    }

    @Test
    public void digitsToStringTest() {
        // Given
        int digits = 0;
        String expectedHourMilitary = "Zero Zero";
        // When
        String actualHourMilitary = problem6.digitsToString(digits);
        // Then
        Assert.assertEquals(expectedHourMilitary, actualHourMilitary);
    }



}
