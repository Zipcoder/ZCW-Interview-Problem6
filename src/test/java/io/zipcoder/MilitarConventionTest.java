package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;



public class MilitarConventionTest {

    MilitarConvention mc = new MilitarConvention ();

    @Test
    public void pmConvertedTest(){

        int expected = 1330;
        int actual = mc.pmConverted (130);
        Assert.assertEquals (expected, actual);
    }
}
