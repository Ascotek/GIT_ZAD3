package pl.com.dziendobry.DodatkoweCwiczenia;
/*
1.Metoda ktora ma zwrocic tablice gdzie jedent lement to suma liczb ujemnych a drugi do szuma ich wszystkich elementow.
2.Napisz metodę pobierającą dwuelementową tablicę liczb i zwracający ich sumę.
3.Napisz metodę pobierającą trójelementową tablicę liczb, która zwróci tablicę zawierającą te same elementy w odwróconej kolejności


*/

public class Tablice {
    public static void main(String[] args) {

        int [] input  = {1, 2, 3, 4, 5,-3, -2, -1}; //1
        countAndSumElements(input);

        System.out.println("-------------------------------");

        int [][]tab = {{2, 58, 41, 1}, {3,2,1,-8}}; //2

        System.out.println(sumaLiczb(tab));

        System.out.println("-------------------------------");

        int [] myTab = {3,1,6};                       //3

        System.out.println(odwrotnaKolejnosc(myTab));


    }

    public static int[] countAndSumElements(int[] tablica) {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            if(tablica[i] < 0) {
                suma ++;
                System.out.println(tablica[i]);
            }
        }
        System.out.println("Suma liczb ujemnych wynosi: " + suma);
        return tablica;
    }

    public static int sumaLiczb (int [][]tab){
        int suma=0;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                suma += tab[i][j];
                System.out.println("Suma " + tab[i][j]);
            }
        }
        return suma;
    }

    public static int []odwrotnaKolejnosc (int ... tab){

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println("odwrotne " + tab[i]);
        }
        return null;
    }


}
