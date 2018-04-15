package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void splitStringTest() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "1:30pm";

        // When
        String expected = "13:30";
        String actual = problem6.convertToMilitary(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitStringTest2() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "1:30am";

        // When
        String expected = "01:30";
        String actual = problem6.convertToMilitary(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitStringTest3() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "2:22pm";

        // When
        String expected = "14:22";
        String actual = problem6.convertToMilitary(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitStringTest4() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "2:11am";

        // When
        String expected = "02:11";
        String actual = problem6.convertToMilitary(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void splitStringTest5() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "10:02am";

        // When
        String expected = "10:02";
        String actual = problem6.convertToMilitary(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseToStringTest() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "1:30pm";

        // When
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.parseToString(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseToStringTest2() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "1:30am";

        // When
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.parseToString(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseToStringTest3() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "2:22pm";

        // When
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.parseToString(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseToStringTest4() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "2:11am";

        // When
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.parseToString(time);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void parseToStringTest5() {
        // Given
        Problem6 problem6 = new Problem6();
        String time = "10:02am";

        // When
        String expected = "Ten Hundred and Two Hours";
        String actual = problem6.parseToString(time);

        // Then
        Assert.assertEquals(expected, actual);
    }
}