package Main;

public class Main {
    public static void main(String[] args) {//入口
        //Main2 m = Main2.main(String[100]);
        Main2.main(new String[100]);
    }
}

class Main2{
    public static void main(String[] args) {//普通的静态方法
        for (int i = 0; i < args.length; i++) {
            System.out.println("args_" + i);
        }
    }
}
