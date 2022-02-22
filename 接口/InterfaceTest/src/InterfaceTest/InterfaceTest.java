package InterfaceTest;

import Bullet.Bullet;
import Flyable.Flyable;
import Plane.Plane;

public class InterfaceTest{
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        Plane p1 = new Plane();
        p1.fly();
        p1.stop();

        Bullet bullet = new Bullet() {
            @Override
            public void attack() {
                System.out.println("1");
            }

            @Override
            public void fly() {
                System.out.println("2");
            }

            @Override
            public void stop() {
                System.out.println(3);
            }
        };
    }
}