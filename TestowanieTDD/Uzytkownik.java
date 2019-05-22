package pl.com.dziendobry.TestowanieTDD;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Uzytkownik {
    List<Uzytkownik> baza = new LinkedList<>();

    public void dodaj_uzyt(Uzytkownik uzytkownik)throws NullPointerException{
        if(uzytkownik == null){
            throw new NullPointerException("Uzytkownik jest moze Nullem");
        }
        baza.add(Objects.requireNonNull(uzytkownik));
    }
    public void usun_uzyt(Uzytkownik uzytkownik){

        baza.remove(Objects.requireNonNull(uzytkownik));
    }

    public Uzytkownik wyszukaj_uzyt(int ind){
        return baza.get(ind);
    }
}
