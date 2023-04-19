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
public class LAB2 {
    public static void main(String[] args) {
        String s = "Hello World";
        byte[] b = s.getBytes();
        try {
        FileOutputStream output = new FileOutputStream("data.dat");
        output.write(b);
        
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while ((ch =input.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }
}
