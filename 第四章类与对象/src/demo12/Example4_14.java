package demo12;
import demo11.Triangle;
public class Example4_14 {
    public static void main(String[] args) {
        Triangle tri=new Triangle(10,20,30);
        tri.计算面积();
        tri.修改三边(3,4,5);
        tri.计算面积();
    }
}
