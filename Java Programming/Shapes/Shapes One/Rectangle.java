/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.Random;

/**
 *
 * @author Dylan Dietrick
 */
public class Rectangle extends Shape {


    protected int x,y,w,h;
    public Rectangle(int xAxis, int yAxis, int width, int height) {
        super("Rectangle");
        this.x = xAxis;
        this.y = yAxis;
        this.w = width;
        this.h = height;
    }
    public String toString() {
        return "Rectangle" +" x:"+ x +" y:"+y+" w:" + w +" h:" + h;
    }
    public static Rectangle getRandomRectangle(int xAxis,int yAxis, int width,int height) {
        Random random = new Random();
        xAxis = random.nextInt((400-1)+1);
        yAxis = random.nextInt((400-1)+1);
        width = random.nextInt((400-1)+1);
        height = random.nextInt((400-1)+1);
        
        return new Rectangle(xAxis,yAxis,width,height);  
    }
}


