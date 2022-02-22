package demo09;
//枚举类型，教材p55
//2021.10.31
enum Color{
    红,蓝,黄,绿;
}
public class Enum {
    public static void main(String[] args) {
        for(Color b:Color.values())//循环变量依次取Color的每一个值
            for(Color c:Color.values())
                for(Color d:Color.values())
                    if(b!=c&&c!=d&&b!=d)
                        System.out.println(b+","+c+","+d);

    }
}
