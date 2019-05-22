package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumbersTestParametryzowany {

    PrimeNumbers pnum;

    int liczba;

    @Parameters(name = "{index}: isPrime {0}")
    public static Iterable<? extends Object> parametry(){
        return Arrays.asList(2,3,5,7,9,11,13,17);
    }

    public PrimeNumbersTestParametryzowany(int liczba) {
        this.liczba = liczba;
    }

    @Before
    public void setUp(){
        pnum = new PrimeNumbers();
    }

    @Test
    public void shouldAllNumbersBePrimes(){
        assertTrue(pnum.isPrimeNumber(liczba));
    }
}