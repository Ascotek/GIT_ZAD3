package pl.com.dziendobry.JVM;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.security.KeyStore;
import java.util.*;

public class KsiazkaAnaliza {
    String tekst = "";
    String [] rozSlowa;
    String rozLinie;
    String []rozTekst;
    String filePath = "C:\\Users\\UltraGroup\\Desktop\\tekst\\PanTadeusz.txt";
    BufferedReader inputFile = null;
    int numberOfLines = 0;
    String linia;

    Map<String, Integer> mapaSlow = new HashMap<>();




    Map<String, Integer> slowaPosortowane = new HashMap<>();


    public KsiazkaAnaliza() {

    }

    public void analiza()throws IOException {
        try{
            inputFile = new BufferedReader(new FileReader(filePath));
            while (true){
                linia = inputFile.readLine();

                if(linia == null){
                    break;
                }
                //System.out.println(linia);


                tekst+=" ";
                tekst+=linia;
                rozLinie+="\n";
                rozLinie+=linia;
                numberOfLines++;
            }
            System.out.println(tekst);
            System.out.println(numberOfLines);
        }

        finally {
            if(inputFile != null){
                inputFile.close();
            }

            tekst = tekst.toLowerCase();                    //ignorowanie wielkich liter
            rozSlowa = tekst.split("[? *!,.:; ]");

            for(String slowo: rozSlowa){
                System.out.println(slowo);
            }
            for(String slowo: rozSlowa){
                if(mapaSlow.containsKey(slowo)){
                    mapaSlow.put(slowo, mapaSlow.get(slowo)+1);
                }else{
                    mapaSlow.put(slowo, 1);
                }
            }

            for(Map.Entry<String, Integer> wpis: mapaSlow.entrySet()){

                String klucz = wpis.getKey();
                Integer wartosc = wpis.getValue();

                System.out.println(klucz + ":" + wartosc);

            }

        }
        System.out.println(mapaSlow.size());
        slowaPosortowane = sortByValue(mapaSlow);
        System.out.println(slowaPosortowane.size());

        for(Map.Entry<String, Integer> wpis: slowaPosortowane.entrySet()){

            String klucz = wpis.getKey();
            Integer wartosc = wpis.getValue();

            System.out.println(klucz + ":" + wartosc);

        }
        //System.out.println(rozLinie);
        rozLinie = rozLinie.replaceAll("[? !,.:; ]", "");
        rozTekst=rozLinie.split("\n");

        for(String slowo: rozTekst){
            System.out.println(slowo);
        }

    }
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        List<Map.Entry<K, V>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<K, V> result = new LinkedHashMap<>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }
}
