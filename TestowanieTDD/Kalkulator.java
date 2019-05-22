package pl.com.dziendobry.TestowanieTDD;

public class Kalkulator {


    public static int dodawanie(int a, int b){
        return a+b;
    }

    public static int odejmowanie (int a, int b){
        return a-b;
    }

    public static int mnożenie(int a, int b){
        return a*b;
    }
    public static double dzielenie(double a, double b)throws IllegalArgumentException {
        if(b == 0){
            throw new IllegalArgumentException(String.format("dzielnik wynosi:%5.3f a musi byc rozny od zera", b));
        }
        return a/b;
    }

    public static double odwracanie(double a){
        if(a == 0){
            throw new IllegalArgumentException(String.format("Liczba wynosi:%5.3f a musi byc rozny od zera", a));
        }
        return 1/a;
    }

}
