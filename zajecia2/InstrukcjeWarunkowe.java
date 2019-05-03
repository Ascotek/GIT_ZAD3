package pl.com.dziendobry.zajecia2;

/*
1. Poza poznanym dzisiaj operatorem ++ istnieje też jego odpowiednik zmniejszający wartość zmiennej o 1. Jest nim --.
Napisz program, który wypisze na ekranie malejąco wszystkie liczby od 20 do 10.

2. Napisz pętlę while, która wypisze na ekranie wszystkie liczby od 10 do 20 włącznie.
3. Napisz pętlę for, która wypisze na ekranie wszystkie liczby nieparzyste od -10 do 40.
4. Napisz metodę, która jako jedyny argument przyjmie zmienną typu int[] i zwróci sumę wszystkich elementów tablicy.
5. Przerób funkcję z zadania piątego tak, żeby metoda przyjmowała tablicę dwuwymiarową typu int[][].


*/

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {
        int liczba = -10;

       /* for (int i = liczba; i >= 10; i--) {
            System.out.println(i);
        }*/
        System.out.println("-------------------------");
       /* while(liczba <= 20){
            System.out.println(liczba);
            liczba ++;
        }*/
        System.out.println("-------------------------");

       /* for (int i = liczba; i <= 40; i++) {
            if (i%2 ==0){
                System.out.println("Liczba parzysta " + i);
            }
        }*/
        System.out.println("-------------------------");

       /* while(liczba <= 40){
            if(liczba%2 ==0){
                System.out.println("Parzysta " + liczba);
            }
            liczba ++;
        }*/
        System.out.println("-------------------------");

     /*int [] tablica = {3,5,7,23,78};

       sumaLiczb(tablica);
    }

    public static void sumaLiczb (int [] tab){
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            suma += tab[i];

        }
        System.out.println("Suma " + suma);*/


        int [][] tablica = {{3,1,2},{4,2,4,5}};

        sumaLiczb(tablica);

    }

    public static void sumaLiczb (int [] []tab){
        int suma = 0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma += tab[i][j];
            }
        }
        System.out.println("Suma " + suma);

    }
}
