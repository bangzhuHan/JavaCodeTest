package Domain;

public class Designer extends Programmer{
    private double bonus;


    public Designer(int id, String name, int age, double salary, int memberId, String equipment, double bonus) {
        super(id, name, age, salary, memberId, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
