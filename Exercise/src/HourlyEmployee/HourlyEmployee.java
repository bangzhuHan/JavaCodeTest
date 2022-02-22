package HourlyEmployee;
/*
    定义HourlyEmployee类继承Employee类，包含有:
    private成员变量wage和hour：
    实现父类的抽象方法earnings（），该方法返回wage*hour值
    toSting（）方法输出员工类型信息及员工的name，number，birthday。

 */
import Employee.Employee;
import MyDate.MyDate;

public class HourlyEmployee extends Employee {
    private  int wage;
    private int hour;//月工作小时数

    public HourlyEmployee(String name, int number, MyDate birthday,int wage,int hour) {
        super(name, number, birthday);
        this.hour = hour;
        this.wage = wage;   //时薪
    }

    @Override
    public double earnings() {
        return wage*hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
