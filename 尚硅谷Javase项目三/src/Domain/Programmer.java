package Domain;

import Service.Status;

public class Programmer extends Employee{

    private int memberId;//开发团队中的ID;
    private Status status; //状态
    private String equipment;  //设备

    public Programmer(int id, String name, int age, double salary, int memberId,String equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

}
