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
public class Circle extends Shape {
    protected int x,y,radius;
    public Circle(int xAxis, int yAxis, int newRadius) {
        super("Circle");
        this.x = xAxis;
        this.y = yAxis;
        this.radius = newRadius;
    }
    public String toString() {
        return "Circle" +" x:"+ x +" y:" + y + " radius: " + radius; 
    }
    public static Circle getRandomCircle(int xAxis, int yAxis, int newRadius) {
        Random random = new Random();
        xAxis = random.nextInt((500-1)+1);
        yAxis = random.nextInt((500-1)+1);
        newRadius = random.nextInt((500-1)+1);
        return new Circle(xAxis,yAxis,newRadius);
    }
}
