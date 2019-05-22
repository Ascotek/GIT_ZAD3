package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeNumbersTest {
    PrimeNumbers pnum;

    @Before
    public void setUp(){
        pnum = new PrimeNumbers();
    }

    @Test
    public void shouldSayThat2IsPrimeNumber (){
        assertTrue(pnum.isPrimeNumber(2));
    }

    @Test
    public void shouldSayThat3IsPrimeNumber (){
        assertTrue(pnum.isPrimeNumber(3));
    }

    @Test
    public void shouldSayThat5IsPrimeNumber (){
        assertTrue(pnum.isPrimeNumber(5));
    }



}