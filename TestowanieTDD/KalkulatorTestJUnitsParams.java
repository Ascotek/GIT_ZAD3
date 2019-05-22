package pl.com.dziendobry.TestowanieTDD;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class KalkulatorTestJUnitsParams {
    Kalkulator kal;

    @Before
    public void setUp(){
        kal = new Kalkulator();
    }

    @Test
    @Parameters({"1,1,2", "2,3,5", "3,4,7"})
    public void testDodawania(int a, int b, int wyn){
        assertEquals(wyn, kal.dodawanie(a, b));
    }

    @Test
    @Parameters({"1,1,0", "4,3,1", "7,3,4"})
    public void testOdej(int a, int b, int wyn){
        assertEquals(wyn, kal.odejmowanie(a, b));
    }
    @Test
    @Parameters({"1,1,1", "2,3,6", "3,4,12"})
    public void testMnoz(int a, int b, int wyn){
        assertEquals(wyn, kal.mnożenie(a, b));
    }

    @Test
    @Parameters({"1,1,1", "15,5,3", "1,1,1"})
    public void testDziel(int a, int b, int wyn){
        assertEquals(wyn, kal.dzielenie(a, b),0.001);
    }







}