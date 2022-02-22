package demo11;
abstract class MotorVehicles{
    abstract void brake();
}
interface MoneyFace{
     public abstract void charge();
}
interface  ControlTemperature{
    void controlAirTemperature();
}
class Bus extends MotorVehicles implements MoneyFace{
    void brake(){//非abstract子类继承abstract类，必须重写abstract类的brake方法
        System.out.println("公共汽车使用欧式刹车技术");
    }
    public void charge(){//必须重写接口的charge方法
        System.out.println("公共汽车：一元/张，不计算公里数");
    }
}

class Taxi extends MotorVehicles implements MoneyFace,ControlTemperature{
    void brake(){
        System.out.println("出租车使用盘式刹车技术");
    }
    public void charge(){
        System.out.println("出租车：2元/公里，起价4公里");
    }
    public void controlAirTemperature(){
        System.out.println("出租车安装了美的空调");
    }
}



class Cinema implements MoneyFace,ControlTemperature{
    public void charge(){
        System.out.println("电影院：门票,35/张");
    }
    public void controlAirTemperature(){
        System.out.println("电影院安装了中央空调");
    }
}
public class Example5_16{
    public static void main(String[] args) {
        Bus bus101=new Bus();
        Taxi blueTaxi=new Taxi();
        Cinema redStarCinema=new Cinema();
        MoneyFace fare;
        ControlTemperature temperature;
        fare=bus101;
        bus101.brake();
        blueTaxi.charge();
        fare=blueTaxi;
        temperature=blueTaxi;
        blueTaxi.brake();
        fare.charge();
        temperature.controlAirTemperature();
        fare=redStarCinema;
        temperature=redStarCinema;
        redStarCinema.charge();
        temperature.controlAirTemperature();
    }
}
