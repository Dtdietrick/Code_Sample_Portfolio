package inventoryproduct;

import java.io.*;

public class InventoryProductMaintenanceTest
{
public static void main(String[] args) throws IOException

    {
        // bitcoin inventory product test data
        BitcoinInventoryProductMaintenance 
            bitcoinInventoryProductMaintenance = 
            new BitcoinInventoryProductMaintenance();
        
        bitcoinInventoryProductMaintenance.openInventoryFile(
                "c://cit244/Product Inventory/product.dat");
        
        System.out.println("Adding five bitcoin records ");
        
        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(0,1,"Bitcoin",
            10000.00,100,7,4));
        
        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(1,1,"Bitcoin",
            11000.00,150,20,10));
        
        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(2,1,"Bitcoin",
            12000.00,200,35,14));

        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(3,1,"Bitcoin",
            13300.00,250,70,40));

        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(4,1,"Bitcoin",
            12000.00,200,19,8));        
              
        System.out.println("Show all Inventory Product files ");
        
        bitcoinInventoryProductMaintenance.showAllInventoryRecords();

        
        System.out.println("Executing a successful update next");            
        
        bitcoinInventoryProductMaintenance.updateInventoryRecord
        (new BitcoinInventoryProductRecord(1,1,"Bitcoin Updated",
            10000.00,0,0,0)); 
              
        System.out.println("Show all Inventory Product files ");
              
        bitcoinInventoryProductMaintenance.showAllInventoryRecords();
              
        System.out.println("Executing a successful delete next");                
              
        bitcoinInventoryProductMaintenance.deleteInventoryRecord
        (new BitcoinInventoryProductRecord(2,1,"Bitcoin",
            12000.00,200,35,14));
              
        System.out.println("Show all Inventory Product files ");
              
        bitcoinInventoryProductMaintenance.showAllInventoryRecords();   
        
        System.out.println("Executing an unsuccessful add next");                           
              
        bitcoinInventoryProductMaintenance.insertInventoryRecord
        (new BitcoinInventoryProductRecord(3,1,"Bitcoin",
            13300.00,250,70,40));
           
        System.out.println("Show all Inventory Product files ");
              
        bitcoinInventoryProductMaintenance.showAllInventoryRecords(); 
        
        System.out.println("Executing an unsuccessful delete next");  

        bitcoinInventoryProductMaintenance.deleteInventoryRecord
        (new BitcoinInventoryProductRecord(2,1,"Bitcoin",
            12000.00,200,35,14));
              
        System.out.println("Show all Inventory Product files ");
              
        bitcoinInventoryProductMaintenance.showAllInventoryRecords(); 

        System.out.println("Executing an unsuccessful update next");  
        
        bitcoinInventoryProductMaintenance.deleteInventoryRecord
        (new BitcoinInventoryProductRecord(2,1,"Bitcoin",
            12000.00,200,35,14));
              
        System.out.println("Show all Inventory Product files ");
              
        bitcoinInventoryProductMaintenance.showAllInventoryRecords();      

        bitcoinInventoryProductMaintenance.closeInventoryFile();        
    
        
// ethereum inventory product test data
        EthereumInventoryProductMaintenance 
            ethereumInventoryProductMaintenance = 
            new EthereumInventoryProductMaintenance();
        
        ethereumInventoryProductMaintenance.openInventoryFile(
                "c://cit244/Product Inventory/product.dat");
        
        System.out.println("Adding five ethereum records ");
        
        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(0,2,"Ethereum",
            100.00,100,7,4));
        
        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(1,2,"Ethereum",
            110.00,150,20,10));
        
        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(2,2,"Ethereum",
            120.00,200,35,14));

        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(3,2,"Ethereum",
            133.00,250,70,40));

        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(4,2,"Ethereum",
            120.00,200,19,8));        
              
        System.out.println("Show all Inventory Product files ");
        
        ethereumInventoryProductMaintenance.showAllInventoryRecords();

        
        System.out.println("Executing a successful update next");            
        
        ethereumInventoryProductMaintenance.updateInventoryRecord
        (new EthereumInventoryProductRecord(1,2,"Ethereum Updated",
            110.00,150,20,10));
              
        System.out.println("Show all Inventory Product files ");
              
        ethereumInventoryProductMaintenance.showAllInventoryRecords();
              
        System.out.println("Executing a successful delete next");                
              
        ethereumInventoryProductMaintenance.deleteInventoryRecord
        (new EthereumInventoryProductRecord(2,2,"Ethereum",
            120.00,200,35,14));
        
        System.out.println("Show all Inventory Product files ");
              
        ethereumInventoryProductMaintenance.showAllInventoryRecords();   
        
        System.out.println("Executing an unsuccessful add next");                           
              
        ethereumInventoryProductMaintenance.insertInventoryRecord
        (new EthereumInventoryProductRecord(3,2,"Ethereum",
            133.00,250,70,40));
        
        System.out.println("Show all Inventory Product files ");
              
        ethereumInventoryProductMaintenance.showAllInventoryRecords(); 
        
        System.out.println("Executing an unsuccessful delete next");  

        ethereumInventoryProductMaintenance.deleteInventoryRecord
        (new EthereumInventoryProductRecord(2,2,"Ethereum",
            120.00,200,35,14));
              
        System.out.println("Show all Inventory Product files ");
              
        ethereumInventoryProductMaintenance.showAllInventoryRecords(); 

        System.out.println("Executing an unsuccessful update next");  
        
        ethereumInventoryProductMaintenance.deleteInventoryRecord
        (new EthereumInventoryProductRecord(2,2,"Ethereum",
            120.00,200,35,14));
              
        System.out.println("Show all Inventory Product files ");
              
        ethereumInventoryProductMaintenance.showAllInventoryRecords();      

        ethereumInventoryProductMaintenance.closeInventoryFile();        

        
        // monero inventory product test data
        MoneroInventoryProductMaintenance 
            moneroInventoryProductMaintenance = 
            new MoneroInventoryProductMaintenance();
        
        moneroInventoryProductMaintenance.openInventoryFile(
                "c://cit244/Product Inventory/product.dat");
        
        System.out.println("Adding five monero records ");
        
        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(0,3,"Monero",
            50.00,10,8,4));
        
        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(1,3,"Monero",
            60.00,15,2,1));
        
        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(2,3,"Monero",
            70.00,20,3,1));

        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(3,3,"Monero",
            80.00,25,7,4));

        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(4,3,"Monero",
            70.00,20,1,1));        
              
        System.out.println("Show all Inventory Product files ");
        
        moneroInventoryProductMaintenance.showAllInventoryRecords();

        
        System.out.println("Executing a successful update next");            
        
        moneroInventoryProductMaintenance.updateInventoryRecord
        (new MoneroInventoryProductRecord(1,3,"Monero",
            70.00,0,0,0));
        
        System.out.println("Show all Inventory Product files ");
              
        moneroInventoryProductMaintenance.showAllInventoryRecords();
              
        System.out.println("Executing a successful delete next");                
              
        moneroInventoryProductMaintenance.deleteInventoryRecord
        (new MoneroInventoryProductRecord(2,3,"Monero",
            70.00,20,3,1));
              
        System.out.println("Show all Inventory Product files ");
              
        moneroInventoryProductMaintenance.showAllInventoryRecords();   
        
        System.out.println("Executing an unsuccessful add next");                           
              
        moneroInventoryProductMaintenance.insertInventoryRecord
        (new MoneroInventoryProductRecord(3,3,"Monero",
            80.00,25,7,4));
           
        System.out.println("Show all Inventory Product files ");
              
        moneroInventoryProductMaintenance.showAllInventoryRecords(); 
        
        System.out.println("Executing an unsuccessful delete next");  

        moneroInventoryProductMaintenance.deleteInventoryRecord
        (new MoneroInventoryProductRecord(2,3,"Monero",
            70.00,20,3,1));
        
        System.out.println("Show all Inventory Product files ");
              
        moneroInventoryProductMaintenance.showAllInventoryRecords(); 

        System.out.println("Executing an unsuccessful update next");  
        
        moneroInventoryProductMaintenance.deleteInventoryRecord
        (new MoneroInventoryProductRecord(2,3,"Monero",
            70.00,20,3,1));
              
        System.out.println("Show all Inventory Product files ");
              
        moneroInventoryProductMaintenance.showAllInventoryRecords();      

        moneroInventoryProductMaintenance.closeInventoryFile();        
        
 
        // stellar inventory product test data
        StellarInventoryProductMaintenance 
            stellarInventoryProductMaintenance = 
            new StellarInventoryProductMaintenance();
        
        stellarInventoryProductMaintenance.openInventoryFile(
                "c://cit244/Product Inventory/product.dat");
        
        System.out.println("Adding five stellar records ");
        
        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(0,4,"Stellar",
            .10,1000,700,400));
        
        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(1,4,"Stellar",
            .12,1500,200,100));
        
        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(2,4,"Stellar",
            .14,2000,350,140));

        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(3,4,"Stellar",
            .17,2500,700,40));

        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(4,4,"Stellar",
            .14,2000,190,80));        
              
        System.out.println("Show all Inventory Product files ");
        
        stellarInventoryProductMaintenance.showAllInventoryRecords();

        
        System.out.println("Executing a successful update next");            
        
        stellarInventoryProductMaintenance.updateInventoryRecord
        (new StellarInventoryProductRecord(1,4,"Stellar Updated",
            .10,0,0,0)); 
              
        System.out.println("Show all Inventory Product files ");
              
        stellarInventoryProductMaintenance.showAllInventoryRecords();
              
        System.out.println("Executing a successful delete next");                
              
        stellarInventoryProductMaintenance.deleteInventoryRecord
        (new StellarInventoryProductRecord(2,4,"Stellar",
            .14,2000,350,140));
              
        System.out.println("Show all Inventory Product files ");
              
        stellarInventoryProductMaintenance.showAllInventoryRecords();   
        
        System.out.println("Executing an unsuccessful add next");                           
              
        stellarInventoryProductMaintenance.insertInventoryRecord
        (new StellarInventoryProductRecord(3,4,"Stellar",
            .17,2500,700,40));
           
        System.out.println("Show all Inventory Product files ");
              
        stellarInventoryProductMaintenance.showAllInventoryRecords(); 
        
        System.out.println("Executing an unsuccessful delete next");  

        stellarInventoryProductMaintenance.deleteInventoryRecord
        (new StellarInventoryProductRecord(2,4,"Stellar",
            .14,2000,350,140));
              
        System.out.println("Show all Inventory Product files ");
              
        stellarInventoryProductMaintenance.showAllInventoryRecords(); 

        System.out.println("Executing an unsuccessful update next");  
        
        stellarInventoryProductMaintenance.deleteInventoryRecord
        (new StellarInventoryProductRecord(2,4,"Stellar",
            .14,2000,350,140));
              
        System.out.println("Show all Inventory Product files ");
              
        stellarInventoryProductMaintenance.showAllInventoryRecords();      

        stellarInventoryProductMaintenance.closeInventoryFile();        
        

        // ripple inventory product test data
        RippleInventoryProductMaintenance 
            rippleInventoryProductMaintenance = 
            new RippleInventoryProductMaintenance();
        
        rippleInventoryProductMaintenance.openInventoryFile(
                "c://cit244/Product Inventory/product.dat");
        
        System.out.println("Adding five ripple records ");
        
        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(0,5,"Ripple",
            .10,1000,80,40));
        
        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(1,5,"Ripple",
            .11,1500,200,100));
        
        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(2,5,"Ripple",
            .12,2000,350,140));

        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(3,5,"Ripple",
            .13,2500,700,400));

        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(4,5,"Ripple",
            .10,2000,190,80));        
              
        System.out.println("Show all Inventory Product files ");
        
        rippleInventoryProductMaintenance.showAllInventoryRecords();

        
        System.out.println("Executing a successful update next");            
        
        rippleInventoryProductMaintenance.updateInventoryRecord
        (new RippleInventoryProductRecord(1,1,"Ripple Updated",
            .10,0,0,0)); 
              
        System.out.println("Show all Inventory Product files ");
              
        rippleInventoryProductMaintenance.showAllInventoryRecords();
              
        System.out.println("Executing a successful delete next");                
              
        rippleInventoryProductMaintenance.deleteInventoryRecord
        (new RippleInventoryProductRecord(2,5,"Ripple",
            .12,2000,350,140));
              
        System.out.println("Show all Inventory Product files ");
              
        rippleInventoryProductMaintenance.showAllInventoryRecords();   
        
        System.out.println("Executing an unsuccessful add next");                           
              
        rippleInventoryProductMaintenance.insertInventoryRecord
        (new RippleInventoryProductRecord(3,5,"Ripple",
            .13,2500,700,400));
           
        System.out.println("Show all Inventory Product files ");
              
        rippleInventoryProductMaintenance.showAllInventoryRecords(); 
        
        System.out.println("Executing an unsuccessful delete next");  

        rippleInventoryProductMaintenance.deleteInventoryRecord
        (new RippleInventoryProductRecord(2,5,"Ripple",
            .12,2000,350,140));
              
        System.out.println("Show all Inventory Product files ");
              
        rippleInventoryProductMaintenance.showAllInventoryRecords(); 

        System.out.println("Executing an unsuccessful update next");  
        
        rippleInventoryProductMaintenance.deleteInventoryRecord
        (new RippleInventoryProductRecord(2,5,"Ripple",
            .12,2000,350,140));
        
        System.out.println("Show all Inventory Product files ");
              
        rippleInventoryProductMaintenance.showAllInventoryRecords();      

        rippleInventoryProductMaintenance.closeInventoryFile();        
                
    }    
}