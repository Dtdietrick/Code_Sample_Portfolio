/*Possible Companions*/
USE SimpleInventory
GO

Select PLAYER.PlayerName, PLAYER.Health, PLAYER.Class,
       PLAYER.Strength, PLAYER.Intelligence
FROM PLAYER
WHERE Health > 50 AND Class != 'NPC'
ORDER BY Health DESC
