package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MilitarizerTest {

    Militarizer test;

    @Before
    public void setup(){
        test = new Militarizer();
    }


    @Test
    public void SpeakerTest(){
        //Given
        String input = "11";

        //When
        String expected = "Eleven";
        String actual = test.speaker(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void SpeakerTestTwo(){
        //Given
        String input = "05";

        //When
        String expected = "Zero Five";
        String actual = test.speaker(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void SpeakerTestThree(){
        //Given
        String input = "30";

        //When
        String expected = "Thirty";
        String actual = test.speaker(input);

        //Then
        Assert.assertEquals(expected,actual);
    }

}
