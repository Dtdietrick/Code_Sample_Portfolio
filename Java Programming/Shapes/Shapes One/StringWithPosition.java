/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;

/**
 *
 * @author aorlichenko
 */
public class StringWithPosition {
        String s;
        int x, y;
        
        public StringWithPosition(String s, int x, int y) {
            this.s = s;
            this.x = x;
            this.y = y;
        }
        
        public static StringWithPosition generate() {
            int x = (int)(200*Math.random());
            int y = (int)(200*Math.random());
            return new StringWithPosition("Hello!", x, y);
        }
        
        public void draw(Graphics g) {
            g.drawString(s, x, y);
        }
    }
    
    
        
    
