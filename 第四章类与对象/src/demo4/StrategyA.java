package demo4;

public class StrategyA implements Strategy{
    public double computerAverage(double[] a){
        double score=0,sum=0;
        for (int i = 0; i <a.length ; i++) {
            sum+=a[i];
        }
        return  score=sum/a.length;
    }
}
