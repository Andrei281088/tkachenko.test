package nik.and;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTest {

    @Test

    public void testPrimeTrue(){
        Assert.assertTrue(Prime.isPrime(Integer.MAX_VALUE));
    }

    @Test

    public void testPrimeFalse(){
        Assert.assertTrue(Prime.isPrimeWhile(Integer.MAX_VALUE));
    }
}
