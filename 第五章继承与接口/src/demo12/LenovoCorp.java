package demo12;

public class LenovoCorp implements Advertisement{
    @Override
    public void showAdvertisement() {
        System.out.println("@@@@@@@@@@@@@@@@@@@");
        System.out.println("让世界变得很小");
        System.out.println("@@@@@@@@@@@@@@@@@@@");
    }
    public String getCorpName(){
        return "联想";
    }
}
