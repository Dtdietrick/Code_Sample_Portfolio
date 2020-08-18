
package inventoryproduct;

/**
 *  Objective:  Defines inventory class private data fields,
 *              constructors, accessor and mutator methods, 
 *              overloading methods, and methods that manipulate
 *              the inventory product classes
 * 
 * 
 * @author Dylan Dietrick
 *
 * @date 6/19/19
 *  
 */

public class InventoryProduct{
    // Data Fields for the Inventory Product Class Multilist
    private int    inventoryRecordNumber;    
    private int     inventoryProductNumber;
    private String  inventoryProductDescription;
    private double   inventoryProductPrice;
    private int     inventoryQuantityOnHand;
    private int     inventoryQuantityOnOrder;
    private int     inventoryQuantitySold;

    public InventoryProduct()
    {
      // Default Constructor
      inventoryRecordNumber       = 0;  
      inventoryProductNumber      = 0; 
      inventoryProductDescription = "no inventory";
      inventoryProductPrice       = 0.00;
      inventoryQuantityOnHand     = 0;
      inventoryQuantityOnOrder    = 0;
      inventoryQuantitySold       = 0;
    }

    //Constructor
    public InventoryProduct(
                int     inventoryRecordNumber,
                int     inventoryProductNumber,
                String  inventoryProductDescription,
                double  inventoryProductPrice,
                int     inventoryQuantityOnHand,
                int     inventoryQuantityOnOrder,
                int     inventoryQuantitySold)
    
    {
        this.inventoryRecordNumber =       inventoryRecordNumber;
        this.inventoryProductNumber =      inventoryProductNumber;
        this.inventoryProductDescription = inventoryProductDescription;
        this.inventoryProductPrice =       inventoryProductPrice;
        this.inventoryQuantityOnHand =     inventoryQuantityOnHand;
        this.inventoryQuantityOnOrder =    inventoryQuantityOnOrder;
        this.inventoryQuantitySold =       inventoryQuantitySold;
    }
    //Mutator method to set inventory record number
    public void setInventoryRecordNumber (int inventoryRecordNumber)
    {
        this.inventoryRecordNumber = inventoryRecordNumber;
    }
    
    //Accessor method to get the inventory record number
    public int getInventoryRecordNumber()
    {
        return inventoryRecordNumber;
    }
    

    //Mutator method to set inventory product number
    public void setInventoryProductNumber (int inventoryProductNumber)
    {
        this.inventoryProductNumber = inventoryProductNumber;
    }
    
    //Accessor method to get the inventory product number
    public int getInventoryProductNumber()
    {
        return inventoryProductNumber;
    }

    //Mutator method to set inventory product description
    public void setInventoryProductDescription 
        (String inventoryProductDescription)
    {
        this.inventoryProductDescription = inventoryProductDescription;
    }
    
    //Accessor method to get the inventory product description
    public String getInventoryProductDescription()
    {
        return inventoryProductDescription;
    }
    
    //Mutator method to set inventory product price
    public void setInventoryProductPrice (double inventoryProductPrice)
    {
        this.inventoryProductPrice = inventoryProductPrice;
    }
    
    //Accessor method to get the inventory product price
    public double getInventoryProductPrice()
    {
        return inventoryProductPrice;
    }
    
    //Mutator method to set inventory quantity on hand
    public void setInventoryQuantityOnHand (int inventoryQuantityOnHand)
    {
        this.inventoryQuantityOnHand = inventoryQuantityOnHand;
    }
    
    //Accessor method to get inventory quantity on hand
    public int getInventoryQuantityOnHand()
    {
        return inventoryQuantityOnHand;
    }
    
    //Mutator method to set inventory quantity on order
    public void setInventoryQuantityOnOrder 
            (int inventoryQuantityOnOrder)
    {
        this.inventoryQuantityOnOrder = inventoryQuantityOnOrder;
    }
    
    //Accessor method to get the inventory quantity on order
    public int getInventoryQuantityOnOrder()
    {
        return inventoryQuantityOnOrder;
    }

    //Mutator method to set inventory quantity sold
    public void setInventoryQuantitySold 
            (int inventoryQuantitySold)
    {
        this.inventoryQuantitySold = inventoryQuantitySold;
    }
    
    //Accessor method to get the inventory quantity sold
    public int getInventoryQuantitySold()
    {
        return inventoryQuantitySold;
    }

    //Abstract class for finding current product inventory
    public float getCurrentProductInventory()
    {
        float currentProductInventory = (inventoryQuantityOnHand +
                                        inventoryQuantityOnOrder)-
                                        inventoryQuantitySold;
        return currentProductInventory;            
    }
    
    //Abstract class for finding dollar value of inventory product
    public double getDollarValueOfInventoryProduct()
    {
        double dollarValueOfInventoryProduct = inventoryProductPrice *
                                             (inventoryQuantityOnHand +
                                              inventoryQuantityOnOrder -
                                              inventoryQuantitySold);
        return dollarValueOfInventoryProduct;
    }
    
    
    //Method to show the inventory product object
    @Override
    public String toString()
    {
        StringBuilder bufferArea= new StringBuilder();
        
        bufferArea.append(getInventoryProductNumber());
        bufferArea.append("\n");

        bufferArea.append(getInventoryProductDescription());
        bufferArea.append("\n");
        
        bufferArea.append(getInventoryProductPrice());
        bufferArea.append("\n");
        
        bufferArea.append(getInventoryQuantityOnHand());
        bufferArea.append("\n");
        
        bufferArea.append(getInventoryQuantityOnOrder());
        bufferArea.append("\n");
 
        bufferArea.append(getInventoryQuantitySold());
        bufferArea.append("\n");
 
        bufferArea.append(getCurrentProductInventory());
        bufferArea.append("\n");
        
        bufferArea.append(getDollarValueOfInventoryProduct());
        bufferArea.append("\n");
        
        return bufferArea.toString();
    }
}//End Of Class

