package Example9_5;

public class Example9_5 {
    public static void main(String[] args) {
        public static void main(String args[]){
            double aver=0,sum=0,item=0;
            boolean computable=false;
            for(String s:args){
                try{
                    item=Double.parseDouble(s);
                    sum+=item;
                }
                catch (NumberFormatException e){
                    System.out.println("您输入的数据有误："+e);
                    computable=false;
                }
                if(computable){
                    aver=sum/ args.length;
                }
                for(String s1:args){
                    System.out.println(s1+"");
                }
                System.out.println("的平均数："+aver);
                int num=8642;
                String binaryString=Long.toBinaryString(num);
                System.out.println(num+"的二进制表示:"+binaryString);
                System.out.println();;
        }
    }
}
