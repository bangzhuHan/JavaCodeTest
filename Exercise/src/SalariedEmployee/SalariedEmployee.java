package SalariedEmployee;

import Employee.Employee;
import MyDate.MyDate;

/*
    定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：private成员变量monthlySalary;
    实现父类的抽象方法earnings（）:该方法的返回值monthlySalary值;toString（）方法输出员工类型信息及员工的name,number，birthday。
 */
public class SalariedEmployee extends Employee {
    private int monthlySalary;  //月工资
    public SalariedEmployee(String name, int number, MyDate birthday,int monthlySalary) {
        super(name, number, birthday);  //调用父类的步骤
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}
