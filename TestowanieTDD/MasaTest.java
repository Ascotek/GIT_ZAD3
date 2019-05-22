package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MasaTest {
    Masa mas;

    @Before
    public void setUp(){
        mas = new Masa();
    }

    @Test
    public void shouldTrowIllegalArguments(){
        try{
            mas.jakaWaga(10);
            fail("Wyjatek nie zostal rzucony");
        }
        catch (Exception exc){
            assertEquals("Masa musi byc >=0", exc.getMessage());
        }
    }

}