package demo16;

public class B {
    int x=100,y=200;//成员变量
    public void setX(int x){
        x=x;//成员变量未改变
    }
    public void setY(int y){
        this.y=y;//成员变量改变
    }
    public int getXYSum(){
        return x+y;
    }
}
