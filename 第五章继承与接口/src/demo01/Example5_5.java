package demo19;
class CreatePeople{
    public People createPeople() {
        People p = new People();//方法的类型是People类
        return p;
    }
}
class CreateChinese extends CreatePeople{
    public Chinese createPeople(){//重写方法的类型是People类的子类Chinese类，即子类型
        Chinese chinese=new Chinese();
        return chinese;
    }
}
public class Example5_5 {
    public static void main(String args[]){
        CreateChinese create=new CreateChinese();
        Chinese zhang=create.createPeople();//create调用重写方法
        zhang.speak();
        //create.speak();

    }
}
