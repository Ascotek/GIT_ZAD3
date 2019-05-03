package pl.com.dziendobry.zajecia2;
/*
1. Napisz metodę, która zwróci Twój aktualny wiek. // trudne
2. Napisz metodę, która zwróci Twoje imię, // ok
3. Napisz metodę, która jako argument przyjmuje 2 liczby i wypisuje ich sumę, różnicę i iloczyn,//ok
4. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest parzysta,//ok
5. Napisz metodę, która jako argument przyjmuje liczbę i zwraca true jeśli liczba jest podzielna przez 3 i przez 5, //ok
6. Napisz metodę, która jako argument przyjmuje liczbę i zwraca go podniesionego do 3 potęgi, // ok
7. Napisz metodę, która jako argument przyjmuje liczbę i zwraca jej pierwiastek kwadratowy // ok
(poczytaj javadoc do klasy Math, znajdziesz tam metodę, która na pewno Ci pomoże),
8.Napisz metodę, która jako argument przyjmie trzy liczby. Metoda powinna zwrócić true jeśli
z odcinków o długości przekazanych w argumentach można zbudować trójkąt prostokątny.
*/

import java.time.*;
import java.util.Scanner;

public class MetodyCwiczenia {
    public static void main(String[] args) {
        System.out.println(imieUzytkownika());

        System.out.println("--------------------");

        liczba(100, 0);

        System.out.println("--------------------");

        System.out.println(parzystaLiczba(10));

        System.out.println("--------------------");

        System.out.println(podzielnaLiczba(5));

        System.out.println("--------------------");

        System.out.println(liczbaDoPotegi(3));
        System.out.println("--------------------");

        System.out.println(liczbaDoKwadratu(25));

        System.out.println("--------------------");

        System.out.println(trojkat(6, 8, 10));


    }

    public static String imieUzytkownika() {
        String imie = "Paulina";
        return imie;
    }

    public static void liczba(int x, int y) {
        int suma = x + y;
        System.out.println("Suma liczb wynosi " + suma);

        int roznica = x - y;
        if (roznica <= 0) {
            System.out.println("Bład gdyz x jest mniejszy od y");
        } else {
            System.out.println("Roznica liczb wynosi" + roznica);
        }

        int iloczyn = x * y;
        if (iloczyn == 0) {
            System.out.println("Jedna z liczb jest rowna 0");
        } else {
            System.out.println("Iloczyn liczb wynosi " + iloczyn);
        }

    }

    public static boolean parzystaLiczba(int x) {
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean podzielnaLiczba (int y) {
        if (y % 3 == 0 && y%5 == 0) {
            return true;
        }
        return false;
    }

    public static double liczbaDoPotegi (int y) {
        int potega = 3;
        double wynik = Math.pow(y,potega);
        return wynik;
    }

    public static double liczbaDoKwadratu (int x) {
        double wynik = Math.sqrt(x);
        return wynik;
    }

    public static boolean trojkat(double a, double b, double c) {
        int potega = 2;
        double pierwszyBok = Math.pow(a, potega);
        double drugiBok = Math.pow(b, potega);
        double trzeciBok = Math.pow(c, potega);

        if (pierwszyBok + drugiBok == trzeciBok) {
            return true;
        }
        return false;
    }
}




