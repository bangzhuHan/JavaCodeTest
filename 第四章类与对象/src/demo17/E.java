package demo17;

public class E {
    public static void main(String[] args) {
        Circle circle=new Circle();
        circle.setRadius(10);
        Geometry geometry=new Geometry();
        geometry.setCircle(circle);
        Circle circleTwo=new Circle();
        geometry.setCircle(circleTwo);
        System.out.println("%d"+circle.radius+"%d"+geometry.c.radius);
    }
}
