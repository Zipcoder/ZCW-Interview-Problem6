package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem6Test {

    @Test
    public void problemTest1(){

        Problem6 problem6 = new Problem6("1:30pm");

        String expected = "Thirteen Hundred and Thirty Hours ";
        String actual = problem6.convertToMilitaryTimePhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void problemTest2(){

        Problem6 problem6 = new Problem6("1:30am");

        String expected = "Zero One Hundred and Thirty Hours ";
        String actual = problem6.convertToMilitaryTimePhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void problemTest3(){

        Problem6 problem6 = new Problem6("2:22pm");

        String expected = "Fourteen Hundred and Twenty Two Hours ";
        String actual = problem6.convertToMilitaryTimePhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void problemTest4(){

        Problem6 problem6 = new Problem6("2:11am");

        String expected = "Zero Two Hundred and Eleven Hours ";
        String actual = problem6.convertToMilitaryTimePhrase();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void problemTest5(){

        Problem6 problem6 = new Problem6("10:02am");

        String expected = "Ten Hundred Zero Two Hours ";
        String actual = problem6.convertToMilitaryTimePhrase();

        Assert.assertEquals(expected, actual);
    }
}

