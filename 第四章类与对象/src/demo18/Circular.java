package demo18;

public class Circular {
    Circle bottom;
    double height;
    public void setBottom(Circle r){
        bottom=r;
    }
    public void setHeight(double h){
        height=h;
    }
    double getVolume(){
        return bottom.getArea()*height/3.0;
    }


}
