package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KalkulatorTestThrow {
    Kalkulator kal;

    @Before
    public void setUp(){
        kal = new Kalkulator();
    }

    @Test
    public void shouldThrowIllegalArguments(){
        try{
            kal.dzielenie(10,0);
            fail("Wyjatek nie zostal rzucony");

        } catch (Exception exc){
            assertEquals("Dzielnik nie moze byc zerem", exc.getMessage());
    }

    }

}