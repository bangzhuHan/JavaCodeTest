package Test;

import Circle.Circle;
import ComparableCircle.ComparableCircle;

public class Test {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(34);
        ComparableCircle c2 = new ComparableCircle(35);

        int num = c1.compareTo(c2);
        if (num > 0) System.out.println("c1 WIN!");
            else if(num < 0) System.out.println("c2 WIN!");
                else System.out.println("c1 equals to c2!");
    }
}