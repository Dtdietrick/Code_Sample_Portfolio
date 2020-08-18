package realestatemultilist;

import java.io.*;

public class RealEstateMultiListPropertyRecord 
             extends RealEstateMultiListProperty
{
    public static final int REAL_ESTATE_PROPERTY_RECORD_SIZE = 
                  (Integer.BYTES * 5)
                   + (6 * (Character.BYTES * 30) 
                   + (Double.BYTES * 3));
            
    
    public RealEstateMultiListPropertyRecord()
    {
        this(0,0,0,0,0,
             "123456789012345678901234567890",
             "123456789012345678901234567890",
             "123456789012345678901234567890",
             "123456789012345678901234567890",
             "123456789012345678901234567890",
             "123456789012345678901234567890",
              0.0,0.0,0.0);
    } 
    
    public RealEstateMultiListPropertyRecord
                    (int    realEstateRecordNumber,
                     int    realEstateCompanyNumber,
                     int    realEstateListingAgentNumber,
                     int    realEstateMultiListNumber,
                     int    realEstateParcelNumber,
                     String realEstateParcelIdentification,
                     String realEstatePropertyType,
                     String realEstatePropertyAddress,
                     String realEstatePropertyCity,
                     String realEstatePropertyState,
                     String realEstatePropertyZip,
                     double realEstateAskingPrice,
                     double realEstateLandValue,
                     double realEstateBuildingValue)
                              
    {    
        super(realEstateRecordNumber,
              realEstateCompanyNumber, 
              realEstateListingAgentNumber,
              realEstateMultiListNumber,
              realEstateParcelNumber,
              realEstateParcelIdentification,
              realEstatePropertyType,
              realEstatePropertyAddress,
              realEstatePropertyCity,
              realEstatePropertyState,
              realEstatePropertyZip,
              realEstateAskingPrice,
              realEstateLandValue,
              realEstateBuildingValue);
    }
    
    public void readFromTheFile(RandomAccessFile realEstatePropertyFile)
                throws IOException
    {
        
        setRealEstateRecordNumber(realEstatePropertyFile.readInt()); 
        setRealEstateCompanyNumber(realEstatePropertyFile.readInt()); 
        setRealEstateListingAgentNumber(realEstatePropertyFile.readInt()); 
        setRealEstateMultiListNumber(realEstatePropertyFile.readInt());         
        setRealEstateParcelNumber(realEstatePropertyFile.readInt()); 
        
        setRealEstateParcelIdentification(readTheString(realEstatePropertyFile));
        
        setRealEstatePropertyType(readTheString(realEstatePropertyFile)); 
         
        setRealEstatePropertyAddress(readTheString(realEstatePropertyFile));
        
        setRealEstatePropertyCity(readTheString(realEstatePropertyFile));
        
        setRealEstatePropertyState(readTheString(realEstatePropertyFile));
        
        setRealEstatePropertyZip(readTheString(realEstatePropertyFile));
        
        setRealEstateAskingPrice(realEstatePropertyFile.readDouble());
        setRealEstateLandValue(realEstatePropertyFile.readDouble());
        setRealEstateBuildingValue(realEstatePropertyFile.readDouble());
    }
      
    public void writeToTheFile(RandomAccessFile realEstatePropertyFile)  
                throws IOException
    {
        realEstatePropertyFile.writeInt(getRealEstateRecordNumber());
        realEstatePropertyFile.writeInt(getRealEstateCompanyNumber());
        realEstatePropertyFile.writeInt(getRealEstateListingAgentNumber());
        realEstatePropertyFile.writeInt(getRealEstateMultiListNumber());
        realEstatePropertyFile.writeInt(getRealEstateParcelNumber());
                                          
        writeTheString(realEstatePropertyFile,getRealEstateParcelIdentification());
        
        writeTheString(realEstatePropertyFile,getRealEstatePropertyType());
        
        writeTheString(realEstatePropertyFile,getRealEstatePropertyAddress());
        
        writeTheString(realEstatePropertyFile,getRealEstatePropertyCity());
        
        writeTheString(realEstatePropertyFile,getRealEstatePropertyState());
        
        writeTheString(realEstatePropertyFile,getRealEstatePropertyZip());
        
        realEstatePropertyFile.writeDouble(getRealEstateAskingPrice());
        realEstatePropertyFile.writeDouble(getRealEstateLandValue());
        realEstatePropertyFile.writeDouble(getRealEstateBuildingValue());                                                                                    
  
    }                  

    
    private String readTheString(RandomAccessFile realEstatePropertyFile)
                   throws IOException
    {
        char[] holdingString = new char[30];
        for (int index = 0; index < holdingString.length; index++)
        {
             holdingString[index]  = realEstatePropertyFile.readChar();
        }
        return new String(holdingString).replace('\0', ' ');
    }
    
    
    private void writeTheString(RandomAccessFile realEstatePropertyFile, String inputString)
                 throws IOException
    {
        StringBuffer bufferArea = null;

        if (inputString != null)
        {
           bufferArea = new StringBuffer(inputString);
        }
        else   
        {
           bufferArea = new StringBuffer(30);
        }
        bufferArea.setLength(30);
        realEstatePropertyFile.writeChars(bufferArea.toString());
  
    }
    

} // End of class                           