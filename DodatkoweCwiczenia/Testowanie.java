package pl.com.dziendobry.DodatkoweCwiczenia;

import pl.com.dziendobry.zajecia3.Circle;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Testowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promien kola");
        double r = scanner.nextInt();

        CircleEx kolo = new CircleEx(r);

            System.out.println("Pole koła wynosi: " + kolo.getArea());
            System.out.println("Obwod kola wynosi: " + kolo.getPerimeter());

        System.out.println("\n");


        System.out.println("Podaj wymiary scian trojkata");
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double c = scanner.nextInt();

        System.out.println("Podaj wysokosc trojkata");
        double h = scanner.nextInt();

        TriangleEx trojkat = new TriangleEx(a,b,c,h);

        if(Math.pow(a,2)+ Math.pow(b,2) != Math.pow(c,2)){
            System.out.println("Bład, to nie jest trojkat prostokatny");
        }else{
            System.out.println("Pole trojkata: " + trojkat.getArea());
            System.out.println("Obwod trojkata " + trojkat.getPerimeter());
        }
        System.out.println("\n");

        System.out.println("Podaj wymiary prostokata");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        Rectangle prostokat = new Rectangle(x ,y);

        System.out.println("Powierzchnia prostokata " + prostokat.getArea());
        System.out.println("Obwod prostokata " + prostokat.getPerimeter());

        System.out.println("\n");


    }
}
