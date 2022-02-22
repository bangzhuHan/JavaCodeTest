package demo02;

public class Triangle extends Geometry{
    double a,h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    public double getArea(){
        return(0.5*a*h);
    }
}
