package Example9_3;
/*String对象调用compareTo（String s）方法,按字典序与当前参数比较大小
    若当前String对象的字符序列与s的相同,该方法返回值0;
    若String类对象大于s,该方法返回正值；
    若String类对象小于s,该方法返回负值；
 */
import java.util.Arrays;

public class Example9_3 {
    public static void main(String[] args) {
        String [] a={"boy","apple","Applet","girl","Hat"};
        String [] b= Arrays.copyOf(a,a.length);
        System.out.println("使用用户编写的SorSting类，按字典序排列数组a:");
        SortString.sort(a);
        for(String s:a){
            System.out.println(""+s);
        }
        System.out.println("");
        /*普通写法
        for (int i = 0; i < a.length; i++) {
            System.out.println(""+a[i]);
        }*/
        System.out.println("使用类库中的Arrays类,按字典序排列数组b:");
        Arrays.sort(b);
        for(String s:b)
            System.out.println(""+s);
         String  c="abcda";
         String  d="aefgf";
        System.out.println(c.compareTo(d));
    }
}

