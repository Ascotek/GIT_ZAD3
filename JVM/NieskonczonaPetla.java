package pl.com.dziendobry.JVM;

import java.util.Random;

import static java.lang.Thread.sleep;

public class NieskonczonaPetla {
        public static void main(String[] args) {
            Random generator = new Random();
            int j=0;

            while(true){
                char[]old = new char [1500 * 1500];
                try{
                    sleep((long)(1000));
                    j++;
                }catch(Exception e){

                }
                for (int i=0; i<1000; i++){
                    char [] tmp = new char[1500 * 1500];
                    old = new char[1500*1500];
                    old [1]= 'a';
                    tmp[1] = 'a';
                }

                if(j==10){
                    System.gc();
                    j=0;
                }


            }
        }
    }
