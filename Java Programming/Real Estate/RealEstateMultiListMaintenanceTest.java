package realestatemultilist;

import java.io.*;

//  Major rewrite of this GUI for sure!

//  Delete the realestateproperty.dat file before rerunning this program
public class RealEstateMultiListMaintenanceTest
{
    public static void main(String[] args) throws IOException

    {
        RealEstateMultiListMaintenance realEstateMultiListMaintenance =
            new RealEstateMultiListMaintenance();

        realEstateMultiListMaintenance.openTheFile(
            "c://CIT244/Third Real Estate Random/realestateproperty.dat"); 
            
        System.out.println("Going to execute adding three records ");          
        
        realEstateMultiListMaintenance.insertTheRecord
        (new RealEstateMultiListPropertyRecord(1, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              30000.00, 10000.00, 10000.00)); 
              
        realEstateMultiListMaintenance.insertTheRecord
        (new RealEstateMultiListPropertyRecord(2, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              40000.00, 5000.00, 5000.00));
              
        realEstateMultiListMaintenance.insertTheRecord
        (new RealEstateMultiListPropertyRecord(3, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              50000.00, 7000.00, 7000.00));               
              
        System.out.println("Show all of the records in the file ");
              
        realEstateMultiListMaintenance.showAllOfTheRecords();              
              
        System.out.println("Going to execute a successful update next");              
              
        realEstateMultiListMaintenance.updateTheRecord
        (new RealEstateMultiListPropertyRecord(1, 7, 7, 7, 7,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              30000, 11000.00, 11000.00));
              
        System.out.println("Show all of the records in the file ");
              
        realEstateMultiListMaintenance.showAllOfTheRecords(); 
              
        System.out.println("Going to execute a successful delete next");                
              
        realEstateMultiListMaintenance.deleteTheRecord
        (new RealEstateMultiListPropertyRecord(2, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              40000.00, 5000.00, 5000.00)); 
              
        System.out.println("Show all of the records in the file ");
              
        realEstateMultiListMaintenance.showAllOfTheRecords();   
        
        System.out.println("Going to execute an unsuccessful add next");                           
              
        realEstateMultiListMaintenance.insertTheRecord
        (new RealEstateMultiListPropertyRecord(3, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              50000.00, 7000.00, 7000.00)); 
           
        System.out.println("Show all of the records contained in the file");  
            
        realEstateMultiListMaintenance.showAllOfTheRecords();
        
        System.out.println("Going to execute an unsuccessful delete next");  
        
        realEstateMultiListMaintenance.deleteTheRecord
        (new RealEstateMultiListPropertyRecord(2, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              40000.00, 5000.00, 5000.00));
              
        System.out.println("Show all of the records contained in the file");  
            
        realEstateMultiListMaintenance.showAllOfTheRecords();

        System.out.println("Going to execute an unsuccessful update next");  
        
        realEstateMultiListMaintenance.updateTheRecord
        (new RealEstateMultiListPropertyRecord(2, 1, 1, 1, 1,
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
             "123456789012345678901234567890","123456789012345678901234567890",
              40000.00, 5000.00, 5000.00));
              
        System.out.println("Show all of the records contained in the file");  
            
        realEstateMultiListMaintenance.showAllOfTheRecords();
        
        realEstateMultiListMaintenance.closeTheFile();
    }
    
}