package pl.com.dziendobry.TestowanieTDD;

public class Masa {
    double g;

    public Masa() {
        g = 9.81;
    }

    public double jakaWaga(double masa)throws IllegalArgumentException{
        if(masa<0.0){
            throw new IllegalArgumentException("Masa musi być >= 0");
        }
        return masa * g;
    }
}
