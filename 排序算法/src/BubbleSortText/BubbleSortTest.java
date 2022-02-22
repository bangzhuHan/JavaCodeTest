package BubbleSortText;

import java.util.Arrays;
public class BubbleSortTest {


    public static void main(String[] args) {
        int arr[] = new int[]{2345, 234, 35, 1, 45};
        int arr2[] = new int[]{2345, 234, 235, 1, 45};
        //比较
        boolean isTrue = Arrays.equals(arr, arr2);
        System.out.println(isTrue);
        //指定值填充数组
        Arrays.fill(arr, 23);
        System.out.println(Arrays.toString(arr));
        //排序（快排）
        Arrays.sort(arr2);
        //冒泡
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr2.length - 1; i++) {
            for (int j = 0; j < arr2.length - i - 1; j++) {
                int temp;
                int flag = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr2[j] = arr2[j + 1];
                    arr2[j + 1] = temp;
                    flag = 1;
                }
                if (flag == 0) break;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ", ");
            if (i == arr2.length - 1) System.out.println(arr2[i]);
        }
        //二分查找
        int index = Arrays.binarySearch(arr2, 2345);
        System.out.println(index);

        //二维数组求和
        int arr3[][] = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};
        int sum = 0;
        /*for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                sum += arr3[i][j];
            }
        }*/
        for(int[] x: arr3){
            for(int y: x)
                sum+=y;
        }
        System.out.println(sum);


        //二维数组的遍历
        for (int[] x : arr3)
            for (int y :  x)
            System.out.print(y + " ");
    }
}
