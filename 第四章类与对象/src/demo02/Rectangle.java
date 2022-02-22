package demo02;

public class Rectangle extends Geometry{
    double a,b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public double getArea(){//重写父类的getArea方法
        return a*b;
    }
}
