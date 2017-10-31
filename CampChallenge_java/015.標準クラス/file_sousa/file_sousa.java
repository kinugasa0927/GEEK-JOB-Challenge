/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
/**
 *
 * @author kinu
 */
public class file_sousa {
    
    public static void main(String[]args) throws IOException {
        
        String name = "衣笠";
        
        File fp = new File("./src/javaapplication1/test.txt");//JavaApplication1から
        
        FileWriter fw = new FileWriter(fp);
        
        fw.write("私の名前は"+name+"です。");
        
        fw.close();
    }
    
}
