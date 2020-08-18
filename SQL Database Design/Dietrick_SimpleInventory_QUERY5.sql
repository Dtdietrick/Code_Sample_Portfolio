/*Melee vs Defense*/
USE SimpleInventory
GO

SELECT MELEE.Damage, MELEE.ItemType, MELEE.Description, ARMOR.ItemType, ARMOR.Description
FROM MELEE JOIN ARMOR
ON MELEE.Damage = ARMOR.Defense
ORDER BY Melee.Damage DESC
