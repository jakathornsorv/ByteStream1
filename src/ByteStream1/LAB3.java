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
public class LAB3 {

    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream file = new FileOutputStream("data.dat");
            DataOutputStream output = new DataOutputStream(file);
            output.writeUTF("Jim Henry");
            output.write(30);
            output.writeDouble(65.5);
            output.writeChar('A');

        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream file = new FileInputStream("data.dat");
            DataInputStream input = new DataInputStream(file);
            System.out.println(input.readUTF());
            System.out.println(input.readInt());
            System.out.println(input.readDouble());
            System.out.println(input.readChar());
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(LAB3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
    }
}