/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.sample;

/**
 *
 * @author kinu
 */
class Human {
        
    public static String name;
    public static int age;
        
    public static void setHuman(String a,int b){
        name=a;
        age=b;
    }                
    public static void printHuman(){
        System.out.println("名前："+name);
        System.out.println("年齢："+age);
    }
}
public class UseHuman{
    public static void main(String[]args){
        Human.setHuman("衣笠",24);
        Human.printHuman();
    } 
}

