/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author kinu
 */
public class User extends Human{
    
    
    @Override
    public int open(){
    int sum = 0;
    for(int i =0; i<myCards.size(); i++){
        sum+=myCards.get(i);
}
        return sum;
}

    @Override
    public boolean cheakSum() {
        int total = open();

        if (total <= 16) {

            return true;

        } else {

            return false;

        }
    }
    
    @Override
    public void setCard(ArrayList<Integer>index){
    for(int i=0; i<index.size(); i++){
        myCards.add(index.get(i));
    }
}
 
}
    