package demo4;

import demo03.Person;

import java.beans.PersistenceDelegate;

public class Application {
    public static void main(String[] args) {
        AverageScore game = new AverageScore();  //上下文对象game
        game.setStrategy(new StrategyA());   //上下文对象使用具体策略
        Person zhang = new Person();
        zhang.setName("张三");
        double [] a={ 9.12,9.25,8.87,9.99,6.99,10.88};
        double aver= game.getAverage(a); //上下文对象得到平均值
        zhang.setScore(aver);
        System.out.println("算法A");
        System.out.println(zhang.getName()+"最后得分："+zhang.getScore());
        game.setStrategy(new StrategyB());
        double aver1= game.getAverage(a);
        zhang.setScore(aver1);
        System.out.println("算法B");
        System.out.println(zhang.getName()+"最后得分："+zhang.getScore());
    }

    static class Person {
        String name;
        double score;

        public void setName(String s) {
            name = s;
        }

        public void setScore(double t) {
            score=t;
        }

        public String getName() {
            return name;
        }

        public double getScore() {
            return score;
        }
    }
}