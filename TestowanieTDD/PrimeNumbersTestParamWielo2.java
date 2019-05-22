package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PrimeNumbersTestParamWielo2 {
    PrimeNumbers pnum;

    @Parameter(0)
    public int liczba1;
    @Parameter(1)
    public int liczba2;
    @Parameter(2)
    public int spodzewany;

    @Parameterized.Parameters(name = "{index}: pnum {0} + pnum{1} = {2}" )
    public static  Iterable<? extends Object> parametry(){
        return Arrays.asList(new Object [][]{
                {0,0,4}, {0,1,5}, {1,2,8}});
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

