package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DigitsTest {

    @Test
    public void toIntTest() {
        // Given
        int expectedHour = 0;
        // When
        int actualHour = Digits.ZERO_ZERO.toInt();
        // Then
        Assert.assertEquals(expectedHour, actualHour);
    }

    @Test
    public void toStringTest() {
        // Given
        String expectedHour = "Zero Zero";
        // When
        String actualHour = Digits.ZERO_ZERO.toString();
        // Then
        Assert.assertEquals(expectedHour, actualHour);
    }

}
