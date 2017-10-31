/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kinu
 */
public class DateTest4 {
    
    //2015年1月1日 0時0分0秒と2015年12月31日 23時59分59秒の差
    public static void main(String[] args) throws ParseException {
 
        SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        Date day = a.parse("2015/01/01 00:00:00");
        Date day2 = a.parse("2015/12/31 23:59:59");
        
        long x = day2.getTime() - day.getTime();//ミリ秒、差を計算。
        
        System.out.println(day.getTime());
        System.out.println(day2.getTime());
        System.out.println(x);//dayとday2の差
      
}
}
