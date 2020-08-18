package inventoryproduct;

import java.io.*;
/*
 * Objective: This program has methods that work with
 *            the Bitcoin Inventory Product file and handle exceptions
 *            from inserting, deleting, etc.
 *
 * @author Dylan Dietrick
 * @author 6/23/19
 *
 */
public class BitcoinInventoryProductMaintenance extends 
        BitcoinInventoryProductRecord
{
    
    RandomAccessFile inventoryProductFile;
    
    public void openInventoryFile (String productFileString)
            throws IOException
            
    {
        inventoryProductFile = new RandomAccessFile(productFileString, "rw");
        inventoryProductFile.seek(0);
        System.out.println("Length of file is " + 
                            inventoryProductFile.length());
    }

    public void closeInventoryFile() throws IOException
    {
        if (inventoryProductFile != null)
            inventoryProductFile.close();

    }    
    
     public void insertInventoryRecord
                    (BitcoinInventoryProductRecord bitcoinInventoryProductRecord)
           
            throws IllegalArgumentException, IOException
    {
        if (getInventoryProductRecord(bitcoinInventoryProductRecord.
            getInventoryRecordNumber()).getInventoryRecordNumber()
            != 0)
        {
            System.out.println("The record already exists");
        }
        else
        {
            inventoryProductFile.seek((bitcoinInventoryProductRecord.
                getInventoryRecordNumber() - 1 )
                * BitcoinInventoryProductRecord.
                BITCOIN_INVENTORY_PRODUCT_RECORD_SIZE);
            bitcoinInventoryProductRecord.writeInventoryRecordFile
                (inventoryProductFile);
        }
    }
   
    public void updateInventoryRecord
                (BitcoinInventoryProductRecord inventoryProductRecord)
           throws IllegalArgumentException, IOException
    {
        if (getInventoryProductRecord(inventoryProductRecord.
            getInventoryRecordNumber()).getInventoryRecordNumber() == 0)
        {
            System.out.println("The record cannot update it is not on file");
        }
        else
        {
            inventoryProductFile.seek(
            (inventoryProductRecord.getInventoryRecordNumber() - 1 )
                * BitcoinInventoryProductRecord.
                BITCOIN_INVENTORY_PRODUCT_RECORD_SIZE);
            inventoryProductRecord.writeInventoryRecordFile
                (inventoryProductFile);
        }
     }
    
     public void deleteInventoryRecord
                (BitcoinInventoryProductRecord inventoryProductRecord)
           throws IllegalArgumentException, IOException
     {
        if (getInventoryProductRecord(inventoryProductRecord.
            getInventoryRecordNumber()).getInventoryRecordNumber() == 0)
         {
           System.out.println("The record cannot be deleted it is not on file");
         }
         else
         {
            inventoryProductFile.seek(
            (inventoryProductRecord.getInventoryRecordNumber() - 1 )
                * BitcoinInventoryProductRecord.
                BITCOIN_INVENTORY_PRODUCT_RECORD_SIZE);
            inventoryProductRecord.writeInventoryRecordFile
            (inventoryProductFile);
         }
     }
         
    
    public BitcoinInventoryProductRecord 
                getInventoryProductRecord(int recordNumber)
           throws IOException
    {
        BitcoinInventoryProductRecord inventoryProductRecord = new
        BitcoinInventoryProductRecord();
            
        if (recordNumber < 1)
        {
            throw new IllegalArgumentException("Invalid");
        }
        System.out.println(" Record number is " + recordNumber);
        
        inventoryProductFile.seek((recordNumber - 1) * 
            BitcoinInventoryProductRecord.
            BITCOIN_INVENTORY_PRODUCT_RECORD_SIZE);
        inventoryProductRecord.readInventoryRecordFile(inventoryProductFile);
        
        return inventoryProductRecord;        
    }

    public void showAllInventoryRecords()
    {    
        BitcoinInventoryProductRecord inventoryProductRecord = new
        BitcoinInventoryProductRecord();
              
         try
         {
              inventoryProductFile.seek(0);
              while (true)
              {
                     do
                     {
                          inventoryProductRecord.readInventoryRecordFile
                          (inventoryProductFile);
                     } 
                     while (inventoryProductRecord.
                           getInventoryRecordNumber() == 0);
    
                     System.out.println(inventoryProductRecord.toString());
               }              
          }
          catch (EOFException exceptionOne)
          {
                 System.out.println("End of File reached");
          }
          catch (IOException exceptionTwo)
          {
                 System.err.println("There was an error reading the file");
          }
    }
    
}//End of class 
    
     
    

