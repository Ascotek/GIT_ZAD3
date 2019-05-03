package pl.com.dziendobry.DodatkoweCwiczenia;

public class Rectangle implements Figure {
        double x =0;
        double y = 0;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getPerimeter() {
        return 2*x + 2*y;
    }

    @Override
    public double getArea() {
        return x*y;
    }
}
