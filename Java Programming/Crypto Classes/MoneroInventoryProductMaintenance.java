package inventoryproduct;

import java.io.*;
/*
 * Objective: This program has methods that work with
 *            the Monero Inventory Product file and handle exceptions
 *            from inserting, deleting, etc.
 *
 * @author Dylan Dietrick
 * @author 6/23/19
 *
 */
public class MoneroInventoryProductMaintenance extends 
        MoneroInventoryProductRecord
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
                    (MoneroInventoryProductRecord inventoryProductRecord)
           
            throws IllegalArgumentException, IOException
    {
        if (getInventoryProductRecord(inventoryProductRecord.
            getInventoryRecordNumber()).getInventoryRecordNumber()
            != 0)
        {
            System.out.println("The record already exists");
        }
        else
        {
            inventoryProductFile.seek(
            (inventoryProductRecord.getInventoryRecordNumber() - 1 )
                * MoneroInventoryProductRecord.
                MONERO_INVENTORY_PRODUCT_RECORD_SIZE);
            inventoryProductRecord.writeInventoryRecordFile
                (inventoryProductFile);
        }
    }
   
    public void updateInventoryRecord
                (MoneroInventoryProductRecord inventoryProductRecord)
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
                * MoneroInventoryProductRecord.
                MONERO_INVENTORY_PRODUCT_RECORD_SIZE);
            inventoryProductRecord.writeInventoryRecordFile
                (inventoryProductFile);
        }
     }
    
     public void deleteInventoryRecord
                (MoneroInventoryProductRecord inventoryProductRecord)
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
                * MoneroInventoryProductRecord.
                MONERO_INVENTORY_PRODUCT_RECORD_SIZE);
            inventoryProductRecord.writeInventoryRecordFile
            (inventoryProductFile);
         }
     }
         
    
    public MoneroInventoryProductRecord 
                getInventoryProductRecord(int recordNumber)
           throws IOException
    {
        MoneroInventoryProductRecord inventoryProductRecord = new
        MoneroInventoryProductRecord();
            
        if (recordNumber < 1)
        {
            throw new IllegalArgumentException("Record Number already Used");
        }
        System.out.println(" Record number is " + recordNumber);
        
        inventoryProductFile.seek((recordNumber - 1) * 
            MoneroInventoryProductRecord.
            MONERO_INVENTORY_PRODUCT_RECORD_SIZE);
        inventoryProductRecord.readInventoryRecordFile(inventoryProductFile);
        
        return inventoryProductRecord;        
    }

    public void showAllInventoryRecords()
    {    
        MoneroInventoryProductRecord inventoryProductRecord = new
        MoneroInventoryProductRecord();
              
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
    
     
    

