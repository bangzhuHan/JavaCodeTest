package demo02;

public class Search_Bin {
    int[] a;
    int low;
    int high;
    int key;

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        this.low = low;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public int Search(int low,int high,int key,int []a){
        int mid=(low+high)/2;
        if(a[mid]==key){
            System.out.println("查找成功,位置在："+mid);
            return mid;
        }else if(a[mid]<key) return Search(mid+1,high,key,a);
            else return Search(low,mid-1,key,a);
    }

}