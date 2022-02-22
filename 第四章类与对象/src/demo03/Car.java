package demo03;

public class Car {
    Person person;
    public void setPerson(Person p){
        person=p;
    }
    public void show(){
        if(person==null){
            System.out.println("目前没人驾驶汽车");
        }
        else{
            System.out.println("目前驾驶汽车的人是：");
            System.out.println(person.getMess());
        }
    }
}
