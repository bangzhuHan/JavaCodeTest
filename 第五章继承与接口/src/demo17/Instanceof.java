package demo17;

public class Instanceof {
    public static void main(String args[]){
        Animal cat=new Cat();//Cat类的向上转型
        cat.eat();
        //使用instanceof关键字来判断cat对象属于哪一类，从而向下转型为本类使用自身的方法
        if(cat instanceof Cat){
            Cat cat1=(Cat)cat;//cat的向下转型
            cat1.CatchMouse();
        }
        if(cat instanceof Dog){
            Dog dog=(Dog) cat;
            dog.Catch();
        }
        giveAPat(cat);
    }
    public static void giveAPat(Animal animal){//对于传入的未知类型的animal对象，使用instanceof关键字能更好的使用其本来的类的方法,物尽其用
        if(animal instanceof Cat){
            Cat cat1=(Cat)animal;
            cat1.CatchMouse();
        }
       if(animal instanceof Dog){
            Dog dog=(Dog) animal;
            dog.Catch();
        }

    }
}
