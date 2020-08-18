
package inventoryproduct;

import java.io.DataOutputStream;

public class TestWriteInventoryProduct 
{
    static DataOutputStream outputInventoryRecord;

    public static void main(String[] args) 
    {
        outputInventoryRecord = ClassSequentialInventoryProduct.
                                openOutputStream(outputInventoryRecord);
        
    ClassSequentialInventoryProduct.writeOutputStream(outputInventoryRecord);
    
    ClassSequentialInventoryProduct.closeOutputStream(outputInventoryRecord);
    }
    
}
