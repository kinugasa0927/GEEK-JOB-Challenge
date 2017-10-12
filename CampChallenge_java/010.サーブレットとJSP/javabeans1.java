package org.mypackage.sample;
import java.io.Serializable;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kinu
 */

public class javabeans1 implements Serializable {
    private Date d;
    private String luck;
    
    public javabeans1() {};
    
    public Date getD(){
        return d; 
    }   
    public void setD(Date d){
        this.d=d;
    }
    public String getluck() {
        return luck;
    }
    public void setluck(String luck) {
        this.luck=luck;
    }
    
    
}
    

