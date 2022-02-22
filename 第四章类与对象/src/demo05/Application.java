package demo05;

public class Application {
    public static void main(String[] args) {
        Visitor 记表员=new HomeAmmeterVisitor();  //按家庭用电标准
        Ammeter 电表=new Ammeter();
        电表.setElectricAmount(5678);
        电表.accept(记表员);
        记表员=new IndustryAmmeterVisitor();  //按工业标准
        电表.setElectricAmount(5678);
        电表.accept(记表员);
    }
}
