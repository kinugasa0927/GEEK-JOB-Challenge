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
public class UseJapanese {

    public static void main(String[] args) {
        Japanese pro = new Japanese();
        pro.setHuman("衣笠", 24);
        pro.printHuman();
        pro.profile();
        pro.printHuman();
    }
}

class Japanese extends Human {
    
    public void profile() {
        name = null;
        age = 0;
    }

}
