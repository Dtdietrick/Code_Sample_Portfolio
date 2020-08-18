/*Weapon Inventory*/
USE SimpleInventory
GO

SELECT Damage, ItemType, Description FROM RANGED
UNION ALL
SELECT Damage, ItemType, Description FROM MELEE
ORDER BY Damage DESC
