package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KalkulatorTest {

    Kalkulator kal;

    @Before
    public void setUp(){
        kal = new Kalkulator();
    }

    @Test
    public void isCorrectDod(){
        assertEquals(11,(kal.dodawanie(5,6)));
    }
    @Test
    public void isCorrectOdej(){
        assertEquals(5,(kal.odejmowanie(10,5)));
    }

    @Test
    public void isCorrectMnoż(){
        assertEquals(25,(kal.mnożenie(5,5)));
    }
    @Test
    public void isCorrectDziel(){
        assertEquals(5,(kal.dzielenie(10,2)),0.1);
    }
    @Test
    public void isCorrectOdw(){
        assertEquals(0.5,(kal.odwracanie(2.0)),0.001);
    }

}