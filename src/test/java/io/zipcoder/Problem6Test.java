package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void getMilitaryTimeTest() {
        //Given
        String input = "1:03AM";
        String expected = "Zero One Hundred Zero Three Hours";
        //When
        String actual = Formatting.getNewTime(input);
        //Then
        Assert.assertEquals(expected, actual);
    }

}
