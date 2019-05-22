package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumbersTestParaWielo {
    PrimeNumbers pnum;

    int liczba1;
    int liczba2;
    int spodzewany;

    @Parameters(name = "{index}: pnum {0} + pnum{1} = {2}" )
    public static  Iterable<? extends Object> parametry(){
        return Arrays.asList(new Object [][]{
                {0,0,4}, {0,1,5}, {1,2,8}});
        }


    public PrimeNumbersTestParaWielo(int liczba1, int liczba2, int spodzewany) {
        this.liczba1 = liczba1;
        this.liczba2 = liczba2;
        this.spodzewany = spodzewany;
    }
    @Before
    public void setUp(){
        pnum = new PrimeNumbers();
    }

    @Test
    public void shouldProperlySum(){
        assertEquals(spodzewany, pnum.sumaToIndexedPrimeNumbers(liczba1,liczba2));
    }
}




