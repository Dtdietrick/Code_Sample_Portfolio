/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 *
 * @author aorlichenko
 */
public class ShapesPrimer extends JPanel implements ActionListener {

    public final static int WIDTH = 320;
    public final static int HEIGHT = 200;
    JButton add;
    JButton clear;
    ArrayList<StringWithPosition> strings = new ArrayList<StringWithPosition>();
    
    public ShapesPrimer(JButton add, JButton clear) {
        super();
        
        this.add = add;
        this.clear = clear;
        
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
    public void paintComponent(Graphics g) {
        g.clearRect(0, 0, WIDTH, HEIGHT);
        g.drawRect(100, 100, 40, 40);
        g.drawOval(150, 50, 30, 30);
        for (StringWithPosition s : strings) {
            s.draw(g);
        }
    }
    
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == add) {
            strings.add(StringWithPosition.generate());
            repaint();
        } else if (source == clear) {
            strings.clear();
            repaint();
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("ShapesPrimer");
        
        Container pane = frame.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        JButton add = new JButton("Add String");
        JButton clear = new JButton("Clear");
        
        ShapesPrimer display = new ShapesPrimer(add, clear);
        
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        buttons.add(add);
        buttons.add(clear);
        
        add.addActionListener(display);
        clear.addActionListener(display);
        
        frame.add(buttons);
        frame.add(display);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
