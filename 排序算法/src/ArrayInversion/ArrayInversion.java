package ArrayInversion;

public class ArrayInversion {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 544, 54, 62, 35, 645, 34};
        //方法一（一个循环变量）
        for (int i = 0;i < arr.length / 2;i++){
            int temp;
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;

        }
        for(int i: arr){
            System.out.print(i + " ");
        }
        System.out.println("\n========================");
        //方法二（两个循环变量）
        for (int i = 0,j = arr.length-1; i < j; i++,j--) {
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i: arr){
            System.out.print(i + " ");
        }
    }
}
