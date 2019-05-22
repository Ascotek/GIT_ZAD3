package pl.com.dziendobry.TestowanieTDD;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KalkulatorTestRule {
    Kalkulator kal;

    @Parameter(0)
    public double dzielna;
    @Parameter(1)
    public double dzielnik;
    @Parameter(2)
    public double wynik;


    @Rule
    public ExpectedException expex = ExpectedException.none();

    @Parameters(name= "{index}: {0}/{1} = {2}")
    public static Iterable<? extends Object> parametry(){
        return Arrays.asList(new Object[][]{
            {1,1,1}, {1,0,2}, {12,0,5}}
        );
    }

    @Before
    public void setUp(){
        kal = new Kalkulator();
    }

    @Test
    public void testDzielenia(){
        double dzielnik = 0;
        expex.expect(IllegalArgumentException.class);
        expex.expectMessage(String.format("Dzielnik wynosi:%5.3f musi byc rozny od zera", dzielnik));

        double wynik = kal.dzielenie(10, dzielnik);


    }
    @Test
    public void testOdwracania(){
        double liczba = 0;
        expex.expect(IllegalArgumentException.class);
        expex.expectMessage(String.format("Liczba wynosi:%5.3f a musi byc rozny od zera",dzielnik));

        double wynik = kal.odwracanie(dzielnik);


    }

    @Test
    public void testDzielenia2(){

        expex.expect(IllegalArgumentException.class);
        expex.expectMessage(String.format("Dzielnik wynosi:%5.3f musi byc rozny od zera", dzielnik));

        double wynik = kal.dzielenie(dzielna, dzielnik);


    }

}