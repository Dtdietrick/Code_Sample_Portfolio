/*Equal Damage Items*/
USE SimpleInventory
GO

SELECT MELEE.Damage, MELEE.ItemType, MELEE.Description, RANGED.ItemType, RANGED.Description
FROM MELEE JOIN RANGED
ON MELEE.Damage = RANGED.DAMAGE
ORDER BY Melee.Damage DESC
