package demo11;

public class Triangle {
    double sideA,sideB,sideC;
    boolean isTriangle;
    public Triangle(double a,double b,double c){
        sideA=a;
        sideB=b;
        sideC=c;
        if(a+b>c&&b+c>a&&a+c>b){
            isTriangle=true;
        }
        else isTriangle=false;
    }
    public void  计算面积() {
        if (isTriangle) {
            double p = (sideA + sideB + sideA) / 2.0;
            double area = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
            System.out.println("三角形的面积为:" + area);
        } else System.out.println("不是三角形");
    }
     public void 修改三边(double a,double b,double c){
         sideA=a;
         sideB=b;
         sideC=c;
         if(a+b>c&&a+c>b&&c+b>a){
             isTriangle=true;
         }
         else isTriangle=false;
        }
    }


