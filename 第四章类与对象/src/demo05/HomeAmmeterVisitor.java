package demo05;

public class HomeAmmeterVisitor implements Visitor{
    public double visit(AmmeterElement ammeter){
        double charge=0;
        double unitOne=0.6,unitTwo=1.0;
        int basic=6000;
        double n=ammeter.showElectricAmount();
        if(n<basic){
            charge=n*unitOne;
        }
        else{
            charge=basic*unitOne+(n-basic)*unitTwo;
        }
        return charge;
    }
}
