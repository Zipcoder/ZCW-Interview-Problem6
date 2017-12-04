package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 problem6;

    @Before
    public void initialize() {
        problem6 = new Problem6();
    }

    @Test
    public void convertTimeToMilitaryTimePhraseOneThirtyPMTest() {
        String input = "1:30pm";

        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseOneThirtyAMTest() {
        String input = "1:30am";

        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTwoTwentyTwoPMTest() {
        String input = "2:22pm";

        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTwoElevenAMTest() {
        String input = "2:11am";

        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTenOTwoAMTest() {
        String input = "10:02am";

        String expected = "Ten Hundred and Zero Two Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTwelveFiftyFivePMTest() {
        String input = "12:55pm";

        String expected = "Twelve Hundred and Fifty Five Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTwelveSeventeenAMTest() {
        String input = "12:17am";

        String expected = "Zero Zero Hundred and Seventeen Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void convertTimeToMilitaryTimePhraseTwelveAMTest() {
        String input = "12:00am";

        String expected = "Zero Zero Hundred Hours";
        String actual = problem6.convertTimeToMilitaryTimePhrase(input);

        Assert.assertEquals(expected, actual);
    }
}
