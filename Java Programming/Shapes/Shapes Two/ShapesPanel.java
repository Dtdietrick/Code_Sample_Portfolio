/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestwo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Dylan Dietrick
 */
public class ShapesPanel extends JPanel implements ActionListener {

    public final static int WIDTH = 320;
    public final static int HEIGHT = 200;
    JButton addCircle;
    JButton clear;
    JButton addRectangle;
    ArrayList<Shapes> strings = new ArrayList<Shapes>();
    
    public ShapesPanel(JButton addRec, JButton addCir, JButton clear) {
        super();
        
        this.addCircle = addCir;
        this.addRectangle = addRec;
        this.clear = clear;
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
        public void paintComponent(Graphics g) {
        g.clearRect(0, 0, WIDTH, HEIGHT);
        for (Shapes s : strings) {
            s.draw(g);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == addRectangle) {
            strings.add(Rectangle.getRandomRectangle(0,0,0,0));
            repaint();
        } else if (source == addCircle) {
            strings.add(Circle.getRandomCircle(0,0,0,0));
            repaint();
        }
            else if (source == clear) {
            strings.clear();
            repaint();
        }
    }
}
