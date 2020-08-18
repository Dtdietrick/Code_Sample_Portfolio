package inventoryproduct;

import java.io.*;
import javax.swing.JOptionPane; 
import java.util.Scanner; 
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * Objective: This program has methods that work with
 *            the Inventory Product file 
 *
 * @author Dylan Dietrick
 * @author 6/20/19
 *
 */
public class ClassSequentialInventoryProduct {

    static DataInputStream  inputInventoryProduct;
    
    static DataOutputStream outputInventoryProduct;

public static DataInputStream openInputStream
                              (DataInputStream inputInventoryProduct)     
{
    // This code defines the DataInputStream  where it is stored and errors 
    try
    {
        inputInventoryProduct = new DataInputStream
             (new FileInputStream("c://cit244/Product Inventory/product.dat"));
    }
    catch (SecurityException securityError )
    {
        System.out.println("Found a Security Exception Error " 
                            + securityError);
        System.exit(1);
    }
    catch (IOException ioExceptionError )
    {
        System.out.println("Found an I O Exception Error " 
                            + ioExceptionError);
        System.exit(1);
    } 
  return inputInventoryProduct;
}
    
public static DataOutputStream openOutputStream
                               (DataOutputStream outputInventoryProduct)   
{
    // This code defines the DataOutputStream where it is stored and errors 
    try
    {
        outputInventoryProduct = new DataOutputStream
            (new FileOutputStream("c://cit244/Product Inventory/product.dat"));
    }
    catch (SecurityException securityError )
    {
        System.out.println("Found a Security Exception Error " 
                            + securityError);
        System.exit(1);
    }
    catch (IOException ioExceptionError )
    {
        System.out.println("Found an I O Exception Error " 
                            + ioExceptionError);
        System.exit(1);
    } 
  return outputInventoryProduct;  
}    
//Defines what to do with user input data in Inventory Product
public static DataInputStream readInputStream
                                (DataInputStream inputInventoryProduct)
{
    boolean reachEnd;
    
    reachEnd = false;
        
    while(!reachEnd) 
    {
        try
        {
            InventoryProduct inventoryPropertyRecord = 
                               new InventoryProduct();
           
            inventoryPropertyRecord.setInventoryProductNumber
                                     (inputInventoryProduct.readInt());
            System.out.println("The Inventory Product Number is: " + 
                                inventoryPropertyRecord.
                                getInventoryProductNumber());

            inventoryPropertyRecord.setInventoryProductDescription
                                     (inputInventoryProduct.readUTF());
            System.out.println("The Inventory Product Description is: " +
                                inventoryPropertyRecord.
                                getInventoryProductDescription());
            
            inventoryPropertyRecord.setInventoryProductPrice
                                     (inputInventoryProduct.readDouble());
            System.out.println("The Inventory Product Price in Dollars"
                                + " and Cents is: " +
                                inventoryPropertyRecord.
                                getInventoryProductPrice());
                                
            inventoryPropertyRecord.setInventoryQuantityOnHand
                                     (inputInventoryProduct.readInt());
            System.out.println("The Inventory Quantity On Hand is: " +
                                inventoryPropertyRecord.
                                getInventoryQuantityOnHand());
                                
            inventoryPropertyRecord.setInventoryQuantityOnOrder
                                     (inputInventoryProduct.readInt());
            System.out.println("The Inventory Quantity On Order is: " +
                                inventoryPropertyRecord.
                                getInventoryQuantityOnOrder());                

            inventoryPropertyRecord.setInventoryQuantitySold
                                     (inputInventoryProduct.readInt());
            System.out.println("The Inventory Quantity Sold is: " +
                                inventoryPropertyRecord.
                                getInventoryQuantitySold());  

        }
        catch (EOFException endOfFileException) 
        {
            System.out.println("End of File Reached While Reading "
                       + endOfFileException);
            System.exit(0);
        }
        catch (IOException ioExceptionError)
        {
            System.out.println("I O Exception Error has Been Encountered " 
                       + ioExceptionError);
            System.exit(1);
        }                         
    
    }
    return inputInventoryProduct;
}

public static DataOutputStream writeOutputStream
                               (DataOutputStream outputInventoryProduct)
{
    boolean processInventoryProduct;
    
    String userData;
    
    //Allows user to begin the program
    userData       = JOptionPane.showInputDialog(null,
                     "To Add an Inventory Product Record \n"
                      + " Type True for Yes or False to Exit ");
    
    processInventoryProduct  = Boolean.parseBoolean(userData);
    
            InventoryProduct inventoryPropertyRecord = 
                               new InventoryProduct();
            
    // while loop to process multiple inventory product records
    while (processInventoryProduct)
    {
        //Scanner objects for user input
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Enter the Inventory Product Number: ");
               inventoryPropertyRecord.setInventoryRecordNumber
                                        (userInput.nextInt());        
        
        
        System.out.print("Enter the Inventory Product Number: ");
               inventoryPropertyRecord.setInventoryProductNumber
                                        (userInput.nextInt()); 

        System.out.print("Enter the Inventory Product Description: ");
               inventoryPropertyRecord.setInventoryProductDescription
                                        (userInput.nextLine()); 
             
        System.out.print("Enter the Inventory Product Price: ");
               inventoryPropertyRecord.setInventoryProductPrice
                                        (userInput.nextDouble()); 
               
        System.out.print("Enter the Inventory Product Quantity on Hand: ");
               inventoryPropertyRecord.setInventoryQuantityOnHand
                                        (userInput.nextInt()); 
               
        System.out.print("Enter the Inventory Product Quantity on Order: ");
               inventoryPropertyRecord.setInventoryQuantityOnOrder
                                        (userInput.nextInt()); 
               
        System.out.print("Enter the Inventory Product Number: ");
               inventoryPropertyRecord.setInventoryQuantitySold
                                        (userInput.nextInt());
        try
        {
            outputInventoryProduct.writeInt(inventoryPropertyRecord.
                                            getInventoryRecordNumber());            
            
            
            outputInventoryProduct.writeInt(inventoryPropertyRecord.
                                            getInventoryProductNumber());

            outputInventoryProduct.writeUTF(inventoryPropertyRecord.
                                            getInventoryProductDescription());

            outputInventoryProduct.writeDouble(inventoryPropertyRecord.
                                            getInventoryProductPrice());
            
            outputInventoryProduct.writeInt(inventoryPropertyRecord.
                                            getInventoryQuantityOnHand());
            
            outputInventoryProduct.writeInt(inventoryPropertyRecord.
                                            getInventoryQuantityOnOrder());
         
            outputInventoryProduct.writeInt(inventoryPropertyRecord.
                                            getInventoryQuantitySold());
                        
        }
        catch (IOException ioExceptionError)
        {
            System.out.println("I O Exception Error Was Detected" 
                            + ioExceptionError);
            System.exit(1);
        }
    
    //Prompt to add another Inventory Product Record
        userData       = JOptionPane.showInputDialog(null,
                     "To Add an Inventory Product Record \n"
                      + " Type True for Yes or False to Exit ");
        
        processInventoryProduct = Boolean.parseBoolean(userData);        
        }
    return outputInventoryProduct;
}

public static void closeInputStream
                        (DataInputStream inputInventoryProduct)
{
    try 
    {
        inputInventoryProduct.close();
    } 
    catch (IOException exceptionError) 
    {
        Logger.getLogger(ClassSequentialInventoryProduct
              .class.getName()).log(Level.SEVERE, null, exceptionError);
    }
}    

public static void closeOutputStream
                        (DataOutputStream outputInventoryProduct)
{
    try 
    {
        outputInventoryProduct.close();
    } 
    catch (IOException exceptionError) 
    {
        Logger.getLogger(ClassSequentialInventoryProduct
              .class.getName()).log(Level.SEVERE, null, exceptionError);
    }

}                        
}

    
    

