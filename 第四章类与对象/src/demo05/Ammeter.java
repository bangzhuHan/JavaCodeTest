package demo05;

public class Ammeter extends AmmeterElement{
    double electricAmount;

    @Override
    public void setElectricAmount(double n) {
        electricAmount = n;
    }
    public void accept(Visitor visitor){
        double feer=visitor.visit(this);
        System.out.println("当前电表的用户需缴纳电费："+feer+"元");
    }
    public double showElectricAmount(){
        return electricAmount;
    }

}

