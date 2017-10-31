/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import static java.time.Instant.now;
import java.util.Date;


/**
 *
 * @author kinu
 */
public class file_sousa3 {
    public static void main(String[]args) throws IOException {
        
        SimpleDateFormat a = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        
        Date now = new Date();
        
        File fp = new File("./src/javaapplication1/test2.txt");
        
        FileWriter fw = new FileWriter(fp);
        
        fw.write(a.format(now));
        
        fw.close();

    }
    
}



