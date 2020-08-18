/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapestwo;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dylan Dietrick
 */
public class ShapesDriver {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        JFrame frame = new JFrame("ShapesPrimer");
        
        Container pane = frame.getContentPane();
        pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
        
        JButton addCircle = new JButton("Add Circle");
        JButton addRectangle = new JButton("Add Rectangle"); 
        JButton clear = new JButton("Clear");
        
        ShapesPanel display = new ShapesPanel(addRectangle,addCircle, clear);
        
        JPanel buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        buttons.add(addRectangle);
        buttons.add(addCircle);
        buttons.add(clear);
        
        addCircle.addActionListener(display);
        addRectangle.addActionListener(display);
        clear.addActionListener(display);
        
        frame.add(buttons);
        frame.add(display);
        
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
    
}
