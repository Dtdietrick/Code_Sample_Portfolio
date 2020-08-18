/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Dylan Dietrick
 */
public class ShapesDriver {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        String repeat = "Yes";
        System.out.println("Welcome to the Shapes console app!");
        while (true) {
            displayMenu();
            int choice = keyboard.nextInt();
            keyboard.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("What shape to create?\n(1) Rectangle\n(2) Circle\n(3) Exit");
                    choice = keyboard.nextInt();
                    while(choice == 1 || choice == 2){
                        if(choice == 1){
                        shapes.add(Rectangle.getRandomRectangle(0,0,0,0));
                        System.out.print("Your choice: " + choice);                        
                    }
                        else if(choice == 2){
                        shapes.add(Circle.getRandomCircle(0,0,0));
                        System.out.print("Your choice: " + choice);                        
                        }
                    System.out.println("\n(1) Rectangle\n(2) Circle\n(3) Exit");
                    choice = keyboard.nextInt();
                    }
                    break;
                case 2:
                    for (Shape s: shapes) {
                    System.out.println(s);
                    }
                    break;
                case 3: 
                    shapes.clear ();
                    System.out.println("The shapes have been cleared");                    
                    break;
                case 4:
                    System.out.println("Thank you and goodbye!");
                    return;
                default:
                    System.out.println("Unknown option");
            }
            
        }
    }

public static void displayMenu() {
        System.out.println("Choices: ");
        System.out.println("(1) Create random shape");
        System.out.println("(2) Print all shapes");
        System.out.println("(3) Clear shapes array");
        System.out.println("(4) Exit");
        System.out.print("Your choice: ");
    }
    
}

    

