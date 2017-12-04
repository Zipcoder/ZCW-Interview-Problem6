package io.zipcoder;

import org.junit.*;

public class Problem6Test {


    private String time1= "1:30pm";
    private String time2= "1:30am";
    private String time3= "2:22pm";
    private String time4= "2:11am";
    private String time5= "10:02am";
    private String timeNull= "";
    private Problem6 problem6Parser;

    @Before
    public void setUp(){
        problem6Parser = new Problem6();
    }
    

    @Test
    public void patternMatcherTimeTrueTest1() throws Exception {

        boolean expected = true;
        boolean actual = problem6Parser.patternMatcherName(time1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void patternMatcherTimeFalseTest1() throws Exception {

        boolean expected = false;
        boolean actual = problem6Parser.patternMatcherName(timeNull);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void patternMatcherTimeTrueTest2() throws Exception {

        boolean expected = true;
        boolean actual = problem6Parser.patternMatcherName(time2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void patternMatcherTimeFalseTest2() throws Exception {

        boolean expected = false;
        boolean actual = problem6Parser.patternMatcherName(timeNull);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void patternMatcherTimeTrueTest3() throws Exception {

        boolean expected = true;
        boolean actual = problem6Parser.patternMatcherName(time3);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void patternMatcherTimeFalseTest3() throws Exception {

        boolean expected = false;
        boolean actual = problem6Parser.patternMatcherName(timeNull);

        Assert.assertEquals(expected, actual);
    } @Test
    public void patternMatcherTimeTrueTest4() throws Exception {

        boolean expected = true;
        boolean actual = problem6Parser.patternMatcherName(time4);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void patternMatcherTimeFalseTest4() throws Exception {

        boolean expected = false;
        boolean actual = problem6Parser.patternMatcherName(timeNull);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void patternMatcherTimeTrueTest5() throws Exception {

        boolean expected = true;
        boolean actual = problem6Parser.patternMatcherName(time5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void patternMatcherTimeFalseTest5() throws Exception {

        boolean expected = false;
        boolean actual = problem6Parser.patternMatcherName(timeNull);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void militaryTimeTest1(){

        String expected = "Thirteen Hundred and Thirty Hours";

        String actual = problem6Parser.militaryTime(time1);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void militaryTimeTest2(){

        String expected = "Zero One Hundred and Thirty Hours";

        String actual = problem6Parser.militaryTime(time2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void militaryTimeTest3(){

        String expected = "Fourteen Hundred and Twenty Two Hours";

        String actual = problem6Parser.militaryTime(time3);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void militaryTimeTest4(){

        String expected = "Zero Two Hundred and Eleven Hours";

        String actual = problem6Parser.militaryTime(time4);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void militaryTimeTest5(){

        String expected = "Ten Hundred Zero Two Hours";

        String actual = problem6Parser.militaryTime(time5);

        Assert.assertEquals(expected, actual);

    }


}
