package demo06;

public class InterException extends Exception{
    String message;
    public InterException(int m){
        message="年龄"+m+"不合理";
    }
    public String toString(){
        return message;
    }
}

