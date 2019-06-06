package pl.com.dziendobry.JVM;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        KsiazkaAnaliza panTadeusz = new KsiazkaAnaliza();


        try{
            panTadeusz.analiza();
        }catch (IOException e){
            System.out.println("UPS");
        }
    }
}
