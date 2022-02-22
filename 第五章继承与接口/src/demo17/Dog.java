package demo17;

public class Dog extends Animal{
    @Override
    public void eat() {
        //super.eat();
        System.out.println("狗吃屎");
    }
    public void Catch(){
        System.out.println("狗看家");
    }
}
