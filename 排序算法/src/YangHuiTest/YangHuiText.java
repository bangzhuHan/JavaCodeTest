package YangHuiTest;

public class YangHuiText {
    public static void main(String[] args) {
        //1.声明
        int yangHui[][] = new int[20][];
        //2.赋值
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            yangHui[i][0] = yangHui[i][i] = 1;
            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
            }

        }
        //3.遍历
        for (int[] x : yangHui) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println("\n");
        }
    }
}