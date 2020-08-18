package inventoryproduct;

import java.io.*;
import java.util.Scanner;

/**
 *  Objective:  Defines Inquiries for the Inventory Product Class,
 *              Menu items,input, and output.
 * 
 * @author Dylan Dietrick
 *
 * @date 6/22/19
 *  
 */
public class InventoryProductInquiry 
{

        DataInputStream inputInventoryRecord;

        public void processInventoryProductQuery()
        {
            int displayInventoryResults;
            
            displayInventoryResults = displayInventoryProductMenu();
            
            while(displayInventoryResults != 5)
            {
                switch (displayInventoryResults)
                {
                    case 1:
                        System.out.println("Show all records contained in the "
                                + "inventory product data file");
                        break;
                        
                    case 2:
                        System.out.println("Show all records contained in the "
                                + "inventory product data file in which the "
                                + "current product inventory is less than or "
                                + "equal to 50");
                        break;
                        
                    case 3:
                        System.out.println("Show all records contained in the "
                                + "inventory product data file in which the "
                                + "current product inventory is greater than or"
                                + " equal to 50");
                        break;
                        
                    case 4:
                        System.out.println("Show all records contained in the "
                                + "inventory product data file in which the "
                                + "dollar value of all inventory products is"
                                + "greater than 500.00 dollars");
                        break;
                        
                    case 5:
                        System.out.println("Exit the program");
                        break;
            }// End of switch statment for menu 
            
            readInventoryProductRecords(displayInventoryResults);
            displayInventoryResults = displayInventoryProductMenu();

        }//End of while loop
    
   } //End of Query Method
   
    public int displayInventoryProductMenu()
    {
         int productOptionSelected;
         
         // Scanner object for keyboard input
         Scanner keyboard = new Scanner(System.in);
         
         // Prompt the user to select an option
         System.out.println("\nSelect an option" + 
              " Option 1: Show all records contained in the "
                                + "inventory product data file\n" + 
              " Option 2: Show all of the inventory product records " +
                          "with inventory less than or equal to 50\n" +
              " Option 3: Show all of the inventory product records " +
                          "with inventory greater than or equal to 50\n" +
              " Option 4: Show all of the inventory product records " +
                           "with dollar value greater than $500\n" +
              " Option 5: End the Program.");
         
         productOptionSelected = keyboard.nextInt();
         return productOptionSelected;
              
    }
    
    public void readInventoryProductRecords(int displayInventoryResults)
    {
    
        boolean readFileEnd;
        readFileEnd = false;
    
        try{
            DataInputStream inputInventoryRecord = new DataInputStream
                    (new FileInputStream
                    ("c://cit244/Product Inventory/product.dat"));
            
            while(!readFileEnd)
            {
                    InventoryProduct inventoryProductRecord = 
                            new InventoryProduct();
                    
        inventoryProductRecord.setInventoryProductNumber
                                (inputInventoryRecord.readInt());
        inventoryProductRecord.setInventoryProductDescription
                                (inputInventoryRecord.readUTF());
        inventoryProductRecord.setInventoryProductPrice
                                (inputInventoryRecord.readDouble());
        inventoryProductRecord.setInventoryQuantityOnHand
                                (inputInventoryRecord.readInt());
        inventoryProductRecord.setInventoryQuantityOnOrder
                                (inputInventoryRecord.readInt());
        inventoryProductRecord.setInventoryQuantitySold
                                (inputInventoryRecord.readInt()); 
        
        if (displayProductOrNot(displayInventoryResults, 
                        inventoryProductRecord.getCurrentProductInventory(),
                        inventoryProductRecord.getDollarValueOfInventoryProduct()))
        {
            System.out.println("The Inventory Product Number is " + 
                      inventoryProductRecord.getInventoryProductNumber());        

            System.out.println("The Inventory Product Description is " + 
                      inventoryProductRecord.getInventoryProductDescription()); 

            System.out.println("The Inventory Product Price is " + 
                      inventoryProductRecord.getInventoryProductPrice()); 

            System.out.println("The Inventory Product Quantity On Hand is " + 
                      inventoryProductRecord.
                      getInventoryQuantityOnHand()); 

            System.out.println("The Inventory Product Number "
                      + "Quantity on Order is " + 
                      inventoryProductRecord.
                      getInventoryQuantityOnOrder()); 

            System.out.println("The Inventory Product Quantity Sold is " + 
                      inventoryProductRecord.getInventoryQuantitySold());
            
            System.out.println();
    
            }//end of display if statment
        }// end of while loop
    }
        catch (EOFException e) 
        {
               System.out.println("Reached end of file");
        }
        
        catch (IOException e) 
        {
               System.out.println("IO Exception found while running");
               System.exit(1);
        }        
        
        
    }
     
    private boolean displayProductOrNot(int displayInventoryResults, 
                                        float currentProductInventory,
                                        double dollarValueOfInventoryProduct) 
    {
        boolean returnMenuSwitch = false;
        
        if (displayInventoryResults == 1)
        {
            returnMenuSwitch = true;
        }
        else
        if ((displayInventoryResults == 2) && (currentProductInventory <= 50))
        {
            returnMenuSwitch = true;
        }
        else
        if ((displayInventoryResults == 3) && (currentProductInventory > 50000.00))
        {
            returnMenuSwitch = true;
        }
        else
        if((displayInventoryResults == 4) && 
                (dollarValueOfInventoryProduct > 500.00))
        {
            returnMenuSwitch = true;
        
        }
        else
        {
            returnMenuSwitch = false;
        }
            
        return returnMenuSwitch;
     }
    
    }//End of the Inquiry Class    
        
        
        
        
        
       

