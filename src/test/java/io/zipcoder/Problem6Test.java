package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {


    // Example 1
    @Test
    public void bootCampTime_1330() throws Exception {

        String input = "1:30pm";

        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = Problem6.bootCampTime(input);

        Assert.assertEquals(expected, actual);
    }

    // Example 2
    @Test
    public void bootCampTime_0130() throws Exception {

        String input = "1:30am";

        String expected = "Zero One Hundred and Thirty Hours";
        String actual = Problem6.bootCampTime(input);

        Assert.assertEquals(expected, actual);
    }

    // Example 3
    @Test
    public void bootCampTime_1422() {

        String input = "2:22pm";

        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = Problem6.bootCampTime(input);

        Assert.assertEquals(expected, actual);
    }

    //Example 4
    @Test
    public void bootCampTime_0211() {


        String input = "2:11am";

        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = Problem6.bootCampTime(input);

        Assert.assertEquals(expected, actual);
    }

    // Example 5
    @Test
    public void bootCampTime_1002() {

        String input = "10:02am";

        String expected = "Ten Hundred and Zero Two Hours";
        String actual = Problem6.bootCampTime(input);

        Assert.assertEquals(expected, actual);
    }
}
