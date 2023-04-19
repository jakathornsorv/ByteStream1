/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ByteStream1;

/**
 *
 * @author HP VICTUS
 */
public abstract class ShapeDecorator implements Shape{
    public Shape shape;
    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw(){
        shape.draw();
    }
    
}
