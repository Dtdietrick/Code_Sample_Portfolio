package inventoryproduct;

import java.io.*;
import java.io.RandomAccessFile;
/**
 *   Objective:  subclass of the inventory product class
 *               contains relevant code for creating record 
 *               objects for use in other classes
 *              
 *           
 * @author Dylan Dietrick
 * 
 * @date 6/23/19
 * 
 */
public class BitcoinInventoryProductRecord extends InventoryProduct{
    
    public static final int BITCOIN_INVENTORY_PRODUCT_RECORD_SIZE = 
            (Integer.BYTES * 5)
             + (6 * (Character.BYTES * 30) 
             + (Float.BYTES * 3));
    
    //Default Constructor for record inventory product        
    public BitcoinInventoryProductRecord()
    {
        this(0,1,"Bitcoin",10000.00,50,6,3);
    }
    
    public BitcoinInventoryProductRecord (
                                int inventoryRecordNumber,
                                int inventoryProductNumber,
                                String inventoryProductDescription,
                                double inventoryProductPrice,
                                int inventoryQuantityOnHand,
                                int inventoryQuantityOnOrder,
                                int inventoryQuantitySold)
    {
        super(                  inventoryRecordNumber,
                                inventoryProductNumber,
                                inventoryProductDescription,
                                inventoryProductPrice,
                                inventoryQuantityOnHand,
                                inventoryQuantityOnOrder,
                                inventoryQuantitySold);
    }
    
    public void readInventoryRecordFile (RandomAccessFile inventoryProductFile)
                throws IOException
    {
        setInventoryRecordNumber(inventoryProductFile.readInt());
        setInventoryProductNumber(inventoryProductFile.readInt());
        setInventoryProductDescription(readToString(inventoryProductFile));
        setInventoryProductPrice(inventoryProductFile.readDouble());
        setInventoryQuantityOnHand(inventoryProductFile.readInt());
        setInventoryQuantityOnOrder(inventoryProductFile.readInt());
        setInventoryQuantitySold(inventoryProductFile.readInt());
    }
    
    public void writeInventoryRecordFile ( RandomAccessFile inventoryProductFile)
                throws IOException
    {
        inventoryProductFile.writeInt(getInventoryRecordNumber());
        inventoryProductFile.writeInt(getInventoryProductNumber());
        writeToString(inventoryProductFile,getInventoryProductDescription());
        inventoryProductFile.writeDouble(getInventoryProductPrice());        
        inventoryProductFile.writeInt(getInventoryQuantityOnHand());
        inventoryProductFile.writeInt(getInventoryQuantityOnOrder());
        inventoryProductFile.writeInt(getInventoryQuantitySold());
        
    }
    
    private String readToString(RandomAccessFile inventoryProductFile)
                   throws IOException
    {
        char[] holdString = new char[30];
        for (int index = 0; index < holdString.length; index++)
        {
             holdString[index]  = inventoryProductFile.readChar();
        }
        return new String(holdString).replace('\0', ' ');
    }
    
    
    private void writeToString(RandomAccessFile 
                               inventoryProductFile, String userInputString)
                 throws IOException
    {
        StringBuffer bufferedArea = null;

        if (userInputString != null)
        {
           bufferedArea = new StringBuffer(userInputString);
        }
        else   
        {
           bufferedArea = new StringBuffer(30);
        }
        bufferedArea.setLength(30);
        inventoryProductFile.writeChars(bufferedArea.toString());
  
    }    
  }  //End of the class

