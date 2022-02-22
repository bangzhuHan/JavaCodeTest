package demo06;

public class People {
    private int age = 1;

    public void setAge(int age) throws InterException {
        if (age >= 100 || age <= 0) {
            throw new InterException(age);
        } else this.age = age;
    }

    public int getAge() {
        System.out.println("年龄" + age + "合理");
        return age;
    }
}
