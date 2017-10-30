/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
import java.util.Calendar;
        

/**
 *
 * @author kinu
 */
public class DateTest {
    public static void main(String[]args){
        Date test=new Date();
        System.out.println(test);
        System.out.println(test.getTime());
        
        Calendar c = Calendar.getInstance();
        
        // 2016年1月1日 0時0分0秒
        c.set(2016,0,1,01,01,01);// 0から始まる為、0は１月
        System.out.println(c.getTime());
    }
}
