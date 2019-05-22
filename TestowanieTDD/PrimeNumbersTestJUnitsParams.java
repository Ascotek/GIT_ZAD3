package pl.com.dziendobry.TestowanieTDD;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class PrimeNumbersTestJUnitsParams {
    PrimeNumbers pnum;

    @Before
    public void setUp(){
        pnum = new PrimeNumbers();
    }

    @Test
    @Parameters({"2", "3", "5"})
    public void shouldSayAllNumbersArePrimes(int value){
        assertTrue(pnum.isPrimeNumber(value));
    }

    @Test
    @Parameters({"0,0,4", "0,1,5", "0,2,7"})
    public void shouldProperlySum (int a, int b, int expected){
        assertEquals(expected,pnum.sumaToIndexedPrimeNumbers(a,b));
    }



}