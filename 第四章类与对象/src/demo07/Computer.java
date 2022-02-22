package demo07;
//可变参数
public class Computer {
        public double getResult(double a,int ...x){
            double result=0;
            int sum=0;
           /*for (int i = 0; i <x.length ; i++) {
                sum+=x[i];
            }*/
            for(int i:x){
                sum+=i;
            }
            return result=a*sum;
        }
}
