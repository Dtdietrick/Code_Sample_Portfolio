/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestwo;

import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Dylan Dietrick
 */
public class Circle extends Shapes {
    protected int x,y,width,height;
    public Circle(int xAxis, int yAxis, int newWidth, int newHeight) {
        super("Circle");
        this.x = xAxis;
        this.y = yAxis;
        this.width = newWidth;
        this.height = newHeight;
    }

    public static Circle getRandomCircle(int xAxis, int yAxis, int newWidth, int newHeight) {
        Random random = new Random();
        xAxis = (int)(200*Math.random());
        yAxis = (int)(200*Math.random());
        newWidth = (int)(200*Math.random());
        newHeight = (int)(200*Math.random());      
        return new Circle(xAxis,yAxis,newWidth,newHeight);
    }
public void draw(Graphics g) {
g.drawOval(x, y, width,height );
}
}
