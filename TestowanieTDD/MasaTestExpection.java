package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MasaTestExpection {

    Masa mas;

    @Before
    public void setUp(){
        mas = new Masa();
    }

    @Test(expected = IllegalArgumentException.class)
        public void shouldThrowIllegalArgumentException(){
            mas.jakaWaga(-1);
        }
    }


