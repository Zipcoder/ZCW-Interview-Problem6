package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {

    Problem6 test;

/**
 *  Problem: Convert standard time notation into military phraseology.
 *      Step1: Convert standard time notation to military notation.
 *      Step2: Convert military notation to phraseology.
 *          Step2a: Separation between hours and minutes
 *          Step2b: Edge cases: 00:xx
 */
    @Before
    public void performNewTestInitialization() {
        test = new Problem6();
    }

    @Test
    public void convertToMilitaryNotation(){
        String inputTime="1:30pm";
        String expectedOutput="13:30";
        String actual=test.convertToMilitaryNotation(inputTime);

        Assert.assertEquals(expectedOutput, actual);

        inputTime="1:30am";
        expectedOutput="1:30";
        actual=test.convertToMilitaryNotation(inputTime);

        Assert.assertEquals(expectedOutput, actual);
    }

    @Test
    public void convertMilitaryNotationToPhraseology(){
        String input="13:30";
        String expectedOutput="Thirteen Hundred and Thirty Hours";
        String actual = test.convertMilitaryNotationToPhraseology(input);

        Assert.assertEquals(expectedOutput, actual);

        input="4:23";
        expectedOutput="Zero Four Hundred and Twenty Three Hours";
        actual=test.convertMilitaryNotationToPhraseology(input);

        Assert.assertEquals(expectedOutput, actual);
    }

    @Test
    public void testConvertStandardToMilitaryPhrase(){
        String input="2:22pm";
        String expectedOutput="Fourteen Hundred and Twenty Two Hours";
        String actual = test.convertStandardToMilitaryPhrase(input);

        Assert.assertEquals(expectedOutput, actual);

        input= "2:11am";
        expectedOutput="Zero Two Hundred and Eleven Hours";
        actual = test.convertStandardToMilitaryPhrase(input);

        Assert.assertEquals(expectedOutput, actual);

        input="12:09am";
        expectedOutput="Zero Hundred and Zero Nine Hours";
        actual = test.convertStandardToMilitaryPhrase(input);

        Assert.assertEquals(expectedOutput, actual);
    }

}
