package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem6Test {
    Problem6 problem6;
    String input1;
    String input2;
    String input3;
    String input4;
    String input5;

    @Before
    public void setup() {
        problem6 = new Problem6();
        input1 = "1:30pm";
        input2 = "1:30am";
        input3 = "2:22pm";
        input4 = "2:11am";
        input5 = "10:02am";
    }

    @Test
    public void numericalMilitaryTimeTest() {
        String expected = "13:30";
        String actual = problem6.numericalMilitaryTime(input1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wordFromOfMilitaryTimeTest_130pm() {
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = problem6.wordFromOfMilitaryTime(input1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wordFromOfMilitaryTimeTest_130am() {
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = problem6.wordFromOfMilitaryTime(input2);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wordFromOfMilitaryTimeTest_222pm() {
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = problem6.wordFromOfMilitaryTime(input3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wordFromOfMilitaryTimeTest_211pm() {
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = problem6.wordFromOfMilitaryTime(input4);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void wordFromOfMilitaryTimeTest_1002am() {
        String expected = "Ten Hundred and Zero Two Hours";
        String actual = problem6.wordFromOfMilitaryTime(input5);
        Assert.assertEquals(expected,actual);
    }
}
