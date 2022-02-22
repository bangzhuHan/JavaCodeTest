package demo17;

public class Achieve {
    public static void main(String[] args) {
        Animal animal=new Cat();
        animal.eat();
        //animal.CatchMouse();
        Cat cat=(Cat)animal;
        cat.CatchMouse();
    }
}
