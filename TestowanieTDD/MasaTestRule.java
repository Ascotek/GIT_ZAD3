package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class MasaTestRule {

    Masa mas;

    @Rule
    public ExpectedException expex = ExpectedException.none();

    @Before
    public void setUp(){
        mas = new Masa();
    }

    @Test
    public void shouldThrowIllegalArgumentException(){
        expex.expect(IllegalArgumentException.class);
        expex.expectMessage("Masa musi być >= 0");

        double wynik = mas.jakaWaga(-2);
        assertNull(wynik);

    }

}