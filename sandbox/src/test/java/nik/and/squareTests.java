package nik.and;

import org.testng.Assert;
import org.testng.annotations.Test;


public class squareTests {

    @Test
    public void testArea(){
        square s = new square(5);

        Assert.assertEquals(s.sq(), 25);
    }
}
