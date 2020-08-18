/*Update Statements*/
USE SimpleInventory
GO

/*Useless Guy Killed*/
UPDATE PLAYER
SET Health -= 100
WHERE PlayerID = 6

/*Healed Injured Pesant*/
UPDATE PLAYER
SET Health = 100
WHERE PlayerID = 9

/*Face Smasher Injured*/
UPDATE PLAYER
SET Health -= 25
WHERE PlayerID = 2

/*Excalibur Damaged*/
UPDATE MELEE
SET Damage = 9
WHERE MeleeID = 8

/*Agile Crossbow Upgraded*/
UPDATE RANGED
SET Damage += 6, Range += 8
WHERE RangedID = 7
