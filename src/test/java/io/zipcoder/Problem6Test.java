package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem6Test {


    @Test
    public void timeTestOne(){
        //Given
        Problem6 tester = new Problem6();
        String input = "1:30pm";

        //When
        String expected = "Thirteen Hundred and Thirty Hours";
        String actual = tester.timeConverter(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeTestTwo(){
        //Given
        Problem6 tester = new Problem6();
        String input = "1:30am";

        //When
        String expected = "Zero One Hundred and Thirty Hours";
        String actual = tester.timeConverter(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeTestThree(){
        //Given
        Problem6 tester = new Problem6();
        String input = "2:22pm";

        //When
        String expected = "Fourteen Hundred and Twenty Two Hours";
        String actual = tester.timeConverter(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeTestFour(){
        //Given
        Problem6 tester = new Problem6();
        String input = "2:11am";

        //When
        String expected = "Zero Two Hundred and Eleven Hours";
        String actual = tester.timeConverter(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void timeTestFive(){
        //Given
        Problem6 tester = new Problem6();
        String input = "10:02am";

        //When
        String expected = "Ten Hundred Zero Two Hours";
        String actual = tester.timeConverter(input);

        //Then
        Assert.assertEquals(expected,actual);
    }


}
