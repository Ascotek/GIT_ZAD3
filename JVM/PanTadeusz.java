package pl.com.dziendobry.JVM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PanTadeusz {
    public static void main(String[] args) {
    }
    public static int zlicz(String szukanyTekst){
    int licznik = 0;
    String fileName = "https://wolnelektury.pl/media/book/txt/pan-tadeusz.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

        String line;
        int lineCounter = 1;
        while ((line = br.readLine()) != null) {
            String [] split = line.split("[,.:;  ]");

            if(split[3].equalsIgnoreCase(szukanyTekst))  // podzielenie pliku na kolumny
                if(line.contains(szukanyTekst)){
                    System.out.println("Linia: " + lineCounter);
                    licznik++;
                }
            lineCounter++;                              //w jakich linijkach znajduje sie wyraz Francja
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
        return licznik;
}

}
