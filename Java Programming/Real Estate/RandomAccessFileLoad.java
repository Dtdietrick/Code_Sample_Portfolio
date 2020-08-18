package realestatemultilist;

import java.io.*;


public class RandomAccessFileLoad
{
    public static void main(String[] args)
{
        try 
        {
             RandomAccessFile realEstatePropertyFile = new RandomAccessFile
            ("c://CIT244/Third Real Estate Random/realestateproperty.dat", "rw");


        //realEstatePropertyFile.seek(0); 
        
        // Insert space for five records in the file 
        for (int recordNumberInsert = 1; recordNumberInsert < 6; ++recordNumberInsert)
        {
            //  Write out the record number        
            realEstatePropertyFile.writeInt(0);
            
            //  Write four integers to the file
            for (int i = 0; i < 4; ++i)
            {
                 realEstatePropertyFile.writeInt(i);
            }
        
            //  Write six strings to the file
            realEstatePropertyFile.writeChars("123456789012345678901234567890");
            realEstatePropertyFile.writeChars("123456789012345678901234567890");
            realEstatePropertyFile.writeChars("123456789012345678901234567890");
            realEstatePropertyFile.writeChars("123456789012345678901234567890");        
            realEstatePropertyFile.writeChars("123456789012345678901234567890");        
            realEstatePropertyFile.writeChars("123456789012345678901234567890");
    
            //  Write three doubles to the file
            for (int i = 0; i < 3; ++i)
            {
                 realEstatePropertyFile.writeDouble(0.00);
            }
        
        }

        realEstatePropertyFile.close();

        
      } catch (IOException ex) {
               ex.printStackTrace();
      } 
  
  }
}