/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ByteStream1;

/**
 *
 * @author HP VICTUS
 */
public class LAB1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedShapeDecorator circleDecorator = new RedShapeDecorator(circle);
        circleDecorator.draw();
        
        Recgtangle rectangle = new Recgtangle();
        RedShapeDecorator retangleDecorator = new RedShapeDecorator(rectangle);
        retangleDecorator.draw();
    }
}
