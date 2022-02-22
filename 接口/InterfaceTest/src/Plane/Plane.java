package Plane;

import Flyable.Flyable;

public class Plane implements Flyable {
    @Override
    public void fly() {
        System.out.println("芜湖起飞！");
    }

    @Override
    public void stop() {
        System.out.println("等等,我还没上车呢");
    }
}
