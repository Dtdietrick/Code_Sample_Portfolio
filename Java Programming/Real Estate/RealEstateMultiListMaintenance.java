package realestatemultilist;

import java.io.*;
public class RealEstateMultiListMaintenance extends RealEstateMultiListPropertyRecord
{
    RandomAccessFile realEstatePropertyFile;

    public void openTheFile(String fileString)
           throws IOException
           
    {
        realEstatePropertyFile = new RandomAccessFile(fileString, "rw");
        realEstatePropertyFile.seek(0);
        System.out.println("Length of file " + realEstatePropertyFile.length());
    }
    
    public void closeTheFile() throws IOException
    {
        if (realEstatePropertyFile != null)
            realEstatePropertyFile.close();

    }
       
    public void insertTheRecord(RealEstateMultiListPropertyRecord realEstatePropertyRecord)
           throws IllegalArgumentException, IOException
    {
        if (getTheRecord(realEstatePropertyRecord.
                getRealEstateRecordNumber()).getRealEstateRecordNumber()
                != 0)
        {
            System.out.println("The record cannot be added because it already exists");
        }
        else
        {
            realEstatePropertyFile.seek(
                    (realEstatePropertyRecord.getRealEstateRecordNumber() - 1 )
                * RealEstateMultiListPropertyRecord.REAL_ESTATE_PROPERTY_RECORD_SIZE);
            realEstatePropertyRecord.writeToTheFile(realEstatePropertyFile);
        }
     }
     
    public void updateTheRecord(RealEstateMultiListPropertyRecord realEstatePropertyRecord)
           throws IllegalArgumentException, IOException
    {
        if (getTheRecord(realEstatePropertyRecord.getRealEstateRecordNumber()).getRealEstateRecordNumber()
            == 0)
        {
            System.out.println("The record cannot be updated for it is not in the file");
        }
        else
        {
            realEstatePropertyFile.seek((realEstatePropertyRecord.getRealEstateRecordNumber() - 1 )
                * RealEstateMultiListPropertyRecord.REAL_ESTATE_PROPERTY_RECORD_SIZE);
            realEstatePropertyRecord.writeToTheFile(realEstatePropertyFile);
        }
     }
     
     public void deleteTheRecord(RealEstateMultiListPropertyRecord realEstatePropertyRecord)
           throws IllegalArgumentException, IOException
     {
         if (getTheRecord(realEstatePropertyRecord.getRealEstateRecordNumber()).getRealEstateRecordNumber()
             == 0)
         {
             System.out.println("The record cannot be deleted for it is not in the file");
         }
         else
         {
            realEstatePropertyFile.seek((realEstatePropertyRecord.getRealEstateRecordNumber() - 1 )
                * RealEstateMultiListPropertyRecord.REAL_ESTATE_PROPERTY_RECORD_SIZE);
            realEstatePropertyRecord = new RealEstateMultiListPropertyRecord();    
            realEstatePropertyRecord.writeToTheFile(realEstatePropertyFile);
         }
     }
     
     
    public RealEstateMultiListPropertyRecord getTheRecord(int recordNumber)
           throws IOException
    {
        RealEstateMultiListPropertyRecord realEstatePropertyRecord = new
            RealEstateMultiListPropertyRecord();
            
        if (recordNumber < 1)
        {
            throw new IllegalArgumentException("Invalid Record Number");
        }
        System.out.println(" Record number is " + recordNumber);
        
        realEstatePropertyFile.seek((recordNumber - 1) * 
            RealEstateMultiListPropertyRecord.REAL_ESTATE_PROPERTY_RECORD_SIZE);
        realEstatePropertyRecord.readFromTheFile(realEstatePropertyFile);
        return realEstatePropertyRecord;
            
    }

    public void showAllOfTheRecords()
    {    
         RealEstateMultiListPropertyRecord realEstatePropertyRecord = new
             RealEstateMultiListPropertyRecord();
              
         try
         {
              realEstatePropertyFile.seek(0);
              while (true)
              {
                     do
                     {
                          realEstatePropertyRecord.readFromTheFile(realEstatePropertyFile);
                     } 
                     while (realEstatePropertyRecord.getRealEstateRecordNumber() == 0);
    
                     System.out.println(realEstatePropertyRecord.toString());
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
    
} // End of the class