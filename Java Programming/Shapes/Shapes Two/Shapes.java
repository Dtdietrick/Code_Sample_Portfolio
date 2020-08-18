/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestwo;

import java.awt.Graphics;

/**
 *
 * @author Dylan Dietrick
 */
public abstract class Shapes {
    protected String name;
    public abstract void draw(Graphics g);
    public Shapes(String name) {
        this.name = name;
    }


}