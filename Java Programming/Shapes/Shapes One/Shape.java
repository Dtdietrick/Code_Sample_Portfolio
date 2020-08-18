/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;


/**
 *
 * @author Dylan Dietrick
 */
public abstract class Shape {
    protected String name;
    public Shape(String name) {
        this.name = name;
    }
    public abstract String toString();

}


