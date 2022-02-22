package demo12;

public class AdvertisementBoard {
    Advertisement adver;//定义Advertisement类型的接口变量adver
    public void setAdvertisement(Advertisement adver){//adver存放实现advertisement类的对象的引用
        this.adver=adver;
    }
    public void show(){
        if(adver!=null){
            System.out.println("广告牌显示"+adver.getCorpName()+"公司的广告词");//接口回调，展现公司名称
            adver.showAdvertisement();//接口回调,显示公司广告词
        }
        else{
            System.out.println("广告牌无广告");
        }
    }
}
