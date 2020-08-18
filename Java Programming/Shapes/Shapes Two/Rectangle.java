/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestwo;

/**
 *
 * @author Dylan Dietrick
 */
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author Dylan Dietrick
 */
public class Rectangle extends Shapes {


    protected int x,y,w,h;
    public Rectangle(int xAxis, int yAxis, int width, int height) {
        super("Rectangle");
        this.x = xAxis;
        this.y = yAxis;
        this.w = width;
        this.h = height;
    }
    public static Rectangle getRandomRectangle(int xAxis,int yAxis, int width,int height) {
        Random random = new Random();
        xAxis = (int)(200*Math.random());
        yAxis = (int)(200*Math.random());
        width = (int)(200*Math.random());
        height = (int)(200*Math.random());
        
        return new Rectangle(xAxis,yAxis,width,height);  
    }
public void draw(Graphics g) {
g.drawRect(x, y, w, h);
}

}


