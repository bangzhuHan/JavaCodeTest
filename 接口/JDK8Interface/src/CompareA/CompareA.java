package CompareA;
/**
 * JDK8:除了定义全局常量和抽象方法外，还能定义静态方法和默认方法
 *接口中的静态方法只能通过接口来调用
 */
public interface CompareA {
        //静态方法
        public static void method1() {
            System.out.println("休宁");
        }
        public default void method2() {
            System.out.println("黄山");
        }
        public static void method3() {
            System.out.println("屯溪");
        }
}
