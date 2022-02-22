package demo02;

public class Student {
    int number;
    String name;
    Student(){
    }

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }


    public String getName() {
        return name;
    }

}
