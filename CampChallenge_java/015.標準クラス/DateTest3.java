/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 *
 * @author kinu
 */
public class DateTest3 {

    public static void main(String[] args) {
 
        Calendar a = Calendar.getInstance();
        // 2016年11月4日10時00分00秒     
        a.set(2016, 10, 4, 10, 00, 00);
        
        SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:m:s");
        System.out.print(b.format(a.getTime()));
}
 
}
