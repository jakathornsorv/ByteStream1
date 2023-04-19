/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ByteStream1;

import java.io.*;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author HP VICTUS
 */
public class LAB4 {

    public static void main(String[] args){
        String s = "Hello World";
        byte[] b = s.getBytes();
        
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            BufferedOutputStream output = new BufferedOutputStream(file); //stream chaining
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            BufferedInputStream input = new BufferedInputStream(file);
            int ch;
            while ((ch=input.read()) !=-1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
            
    }
}

