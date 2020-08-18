/*Inventory Descriptions*/
USE SimpleInventory
GO

SELECT ItemType, Description FROM RANGED
UNION ALL
SELECT ItemType, Description FROM MELEE
UNION ALL
SELECT ItemType, Description FROM ARMOR
ORDER BY ItemType 
