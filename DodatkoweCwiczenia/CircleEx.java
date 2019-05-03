package pl.com.dziendobry.DodatkoweCwiczenia;

public class CircleEx implements Figure {

    double promien ;

    public CircleEx(double promien) {
        this.promien = promien;
    }

    @Override
    public double getPerimeter() {
        return 2* 3.14 *promien ;
    }

    @Override
    public double getArea() {
        return 3.14*Math.pow(promien,2);
    }


}
