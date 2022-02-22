package demo03;

import java.lang.reflect.InvocationTargetException;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        int i = 1;
        while (true) {
            try {
                car.show();
                Thread.sleep(2000);
                Class<?> cs = Class.forName("Driver" + i);
                Person p = (Person) cs.getDeclaredConstructor().newInstance();
                car.setPerson(p);
                i++;
            }
            catch (Exception exp){
                i++;
            }
            if(i>10) i=1;

        }
    }
}
