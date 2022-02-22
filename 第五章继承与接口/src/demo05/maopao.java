package demo05;

public class maopao {
    public static void main(String[] args) {
        int [] a = new int[]{11, 2, 43, 24, 5, 6};
        //int i = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i; j++) {
                if(a[j]>a[j+1]){
                    int t=0;
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
            for (int k = 0; k< a.length; k++) {
                System.out.print(a[k]+" ");
            }

        }
    }

}
