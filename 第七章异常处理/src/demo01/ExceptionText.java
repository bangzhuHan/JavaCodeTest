package demo01;

import org.junit.Test;

import java.sql.Date;
import java.sql.SQLOutput;

public class ExceptionText {
    @Test
    //ArrayIndexOutOfBandsException
    public void text1() {

        int[] array = new int[19];
        System.out.println(array[19]);
    }

    @Test
    //NullPointerException
    public void text2() {
        int[] array = null;
        System.out.println(array[8]);
    }

    /* @Test
      public void text3(){
          int[] array=new int[3];
          System.out.println(array[1,2,3]);
      }*/
    @Test
    //StringIndexOutOfBandsException
    public void text3() {
        //String[] array=new String[3];
        String array = "abc";
        System.out.println(array.charAt(3));
    }
    @Test
    //ClassCastException
    public void text4(){
        Object obj=new String();
        Date date=(Date)obj;

    }
}

