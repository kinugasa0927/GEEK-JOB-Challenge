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
public class file_sousa2 {
    
    public static void main(String[]args) throws IOException{
        
        File fp = new File("./src/javaapplication1/test.txt");
        
        FileReader fr = new FileReader(fp);
   
        BufferedReader br = new BufferedReader(fr);

        System.out.print(br.readLine());

        br.close();
  
    }  
}
