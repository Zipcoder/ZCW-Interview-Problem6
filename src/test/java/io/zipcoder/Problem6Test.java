package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {

    @Test
    public void testMilitaryTimeConverter1(){
        Problem6 test = new Problem6();
        String input = "1:30pm";
        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMilitaryTimeConverter2(){
        Problem6 test = new Problem6();
        String input = "7:30pm";
        String expected = "Ninteen Hundred and Thirty Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMilitaryTimeConverter3(){
        Problem6 test = new Problem6();
        String input = "2:11am";
        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testMilitaryTimeConverter4(){
        Problem6 test = new Problem6();
        String input = "11:55pm";
        String expected = "Twenty Three Hundred and Fifty Five Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMilitaryTimeConverter5(){
        Problem6 test = new Problem6();
        String input = "1:22am";
        String expected = "Zero One Hundred and Twenty Two Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMilitaryTimeConverter6(){
        Problem6 test = new Problem6();
        String input = "12:00am";
        String expected = "Zero Zero Hundred and Zero Zero Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testMilitaryTimeConverter7(){
        Problem6 test = new Problem6();
        String input = "12:00pm";
        String expected = "Twelve Hundred and Zero Zero Hours";

        String actual = test.militaryTimeConverter(input);
        Assert.assertEquals(expected,actual);
    }







}
