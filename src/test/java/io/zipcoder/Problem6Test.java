package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 prob6;
    @Before
    public void setUp() {
        prob6 = new Problem6();
    }

    @Test
    public void convertToMilitaryTimeZeroHundredsTest() throws Exception {
        String output = "Zero One Hundred and Thirty Hours";
        String actual = prob6.convertToMilitaryTime("1:30am");
        Assert.assertEquals(output, actual);
    }

    @Test
    public void convertToMilitaryTimeTenHundredsTest() throws Exception {
        String output = "Thirteen Hundred and Thirty Hours";
        String actual = prob6.convertToMilitaryTime("1:30pm");
        Assert.assertEquals(output, actual);
    }
}
