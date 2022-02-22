package demo15;

public abstract  class Interfaceimpl implements InterfaceB,InterfaceA{
    @Override
    public void methodA() {
        System.out.println("覆盖重写A接口方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写B接口方法");
    }

    @Override
    public void method() {
        System.out.println("重写的默认方法");
    }

}
