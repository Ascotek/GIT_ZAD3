package pl.com.dziendobry.DodatkoweCwiczenia;

public class TriangleEx implements Figure {
    double a = 0;
    double b = 0;
    double c = 0;
    double h = 0;

    public TriangleEx(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
}

    @Override
    public double getArea() {
        return (a*h)/2;
    }
}
