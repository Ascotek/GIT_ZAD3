package pl.com.dziendobry.TestowanieTDD;

import java.util.LinkedList;
import java.util.List;

public class PrimeNumbers {
    List<Integer> primes = new LinkedList<>();


    public PrimeNumbers() {
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        primes.add(13);
        primes.add(15);

    }
    public boolean isPrimeNumber(Integer liczba){
        return primes.contains(liczba);
    }

    public int sumaToIndexedPrimeNumbers(int a, int b){
        return primes.get(a) + primes.get(b);
    }


}
