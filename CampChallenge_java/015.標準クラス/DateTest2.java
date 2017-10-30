/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author kinu
 */
public class DateTest2 {
    
    public static void main(String[] args){

         Date a = new Date();
         
         SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

         System.out.print(b.format(a));
 }
    
}
