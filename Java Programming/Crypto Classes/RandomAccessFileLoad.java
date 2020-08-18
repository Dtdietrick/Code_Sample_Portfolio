/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryproduct;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Dylan Dietrick
 */
public class RandomAccessFileLoad {

 public static void main(String[] args)
{
        try 
        {
             RandomAccessFile inventoryProductFile = new RandomAccessFile
            ("c://cit244/Product Inventory/product.dat", "rw");



        
        // Insert space for five records in the file 
        for (int recordNumberInsert = 1; recordNumberInsert < 20; ++recordNumberInsert)
        {
            //  Write out the record number        
            inventoryProductFile.writeInt(0);
            
            //  Write two integers to the file
            for (int i = 0; i < 2; ++i)
            {
                 inventoryProductFile.writeInt(i);
            }
        
            //  Write six strings to the file
            inventoryProductFile.writeChars("Bitcoin");
            
    
            //  Write one double to the file
            for (int i = 0; i < 1; ++i)
            {
                 inventoryProductFile.writeDouble(0.00);
            }
            
            //  Write three integers to the file            
            for (int i = 0; i < 3; ++i)
            {
                 inventoryProductFile.writeInt(i);
            }
        }

        inventoryProductFile.close();

        
      } catch (IOException ex) {
               ex.printStackTrace();
      } 
  
  }
}
