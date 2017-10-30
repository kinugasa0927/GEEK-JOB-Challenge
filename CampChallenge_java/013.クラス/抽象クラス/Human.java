/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author kinu
 */
abstract public class Human {
    
    abstract int open();
    
    ArrayList<Integer> myCards = new ArrayList<>();

    abstract public void setCard(ArrayList<Integer>index);
    
    abstract public boolean cheakSum();
    
}

