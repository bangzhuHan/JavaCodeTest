package Example9_4;

import java.util.Locale;

public class Example9_4 {
    public static void main(String[] args) {
        String path="c:\\book\\javabook\\xml.dmc";
        int index=path.indexOf("\\");
        index=path.indexOf("\\",index);
        System.out.println(index);
        String sub=path.substring(index);
        System.out.println(sub);
        index=path.lastIndexOf("\\");
        sub=path.substring(index);
        System.out.println(sub);
    }
}
