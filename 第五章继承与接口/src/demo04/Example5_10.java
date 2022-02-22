package demo04;

class  dongwu{
    void cry(){
    }
}
class gou extends dongwu{
    void cry(){
        System.out.println("这是狗的叫声：汪汪汪");
    }
}
class mao extends dongwu{
    void cry(){
        System.out.println("这是猫的叫声：喵喵喵");
    }
}
public class Example5_10 {
    public static void main(String[] args) {
        dongwu dog=new gou();
        dog.cry();
        //动物 cat=new mao();
        //cat.cry();
        dog=new mao();
        dog.cry();
    }
}
