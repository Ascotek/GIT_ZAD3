package pl.com.dziendobry.TestowanieTDD;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class KalkulatorTestParametryzowany {
    Kalkulator kal;
    int a;
    int b;
    int wynikSum;
    int wynikOdej;
    int wynikMnoz;
    int wynikDziel;
    int wynikOdw;


    @Parameters(name = "{index}: wynik {0} i {1} = {2}")
    public static Iterable<? extends Object> parametry(){
        return Arrays.asList(new Object[][]{
                {1,1,2,0,1,1,1}
        });
    }

    public KalkulatorTestParametryzowany(int a, int b, int wynikSum, int wynikOdej, int wynikMnoz, int wynikDziel, int wynikOdw) {
        this.a = a;
        this.b = b;
        this.wynikSum = wynikSum;
        this.wynikOdej = wynikOdej;
        this.wynikMnoz = wynikMnoz;
        this.wynikDziel = wynikDziel;
        this.wynikOdw = wynikOdw;
    }

    @Before
    public void setUp(){
        kal = new Kalkulator();
    }

    @Test
    public void showResultDod(){
        assertEquals(wynikSum, kal.dodawanie(a,b));
    }

    @Test
    public void showResultOdj(){
        assertEquals(wynikOdej, kal.odejmowanie(a,b));
    }




}