USE SimpleInventory
GO

SET IDENTITY_INSERT dbo.MELEE OFF
SET IDENTITY_INSERT dbo.RANGED OFF
SET IDENTITY_INSERT dbo.ARMOR OFF
SET IDENTITY_INSERT dbo.PLAYER OFF

SET IDENTITY_INSERT dbo.PLAYER ON

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  1, 'Freezy Boy', 'Mage', 100, 2, 9);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  2, 'Face Smasher', 'Warrior', 50, 7, 2);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  3, 'Helpful Hodor', 'NPC', 100, 20, 0);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  4, 'Big Lady', 'Paladin', 70, 11, 5);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  5, 'The Talker', 'Rogue', 80, 6, 7);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  6, 'Useless Guy', 'Warrior', 100, 1, 1);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  7, 'The Cleanser', 'Paladin', 95, 9, 3);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  8, 'Creepy Guy', 'Necromancer', 95, 1, 10);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  9, 'Injured Pesant', 'NPC', 10, 3, 2);

INSERT INTO PLAYER
  (PlayerID, PlayerName, Class, Health, Strength, Intelligence)
VALUES(
  10, 'Seenontv', 'Rogue', 100, 20, 20);

SET IDENTITY_INSERT dbo.PLAYER OFF

SET IDENTITY_INSERT dbo.ARMOR ON

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  1, 1, 'Ring', 'The One Ring');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  2, 10, 'Chest', 'Breastplate of Valor');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  3, 7, 'Helm', 'Helm of the Deep');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  4, 3, 'Boots', 'Quickspeed Boots');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  5, 0, 'Waist', 'Loincloth of Smelly');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  6, 10, 'Shield', 'Unbreakable Guard');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
    7, 4, 'Shield', 'Wooden Door');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  8, 0, 'Cloak', 'Cloak of Invisibility');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  9, 2, 'Helm', 'Tin Bucket');

INSERT INTO ARMOR
  (ArmorID, Defense, ItemType, Description)
VALUES(
  10, 5, 'Waist', 'Faulds of Glory');

SET IDENTITY_INSERT dbo.ARMOR OFF

SET IDENTITY_INSERT dbo.MELEE ON

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  1, 5, 'Hammer', 'Angry Hammer of Smashing');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  2, 1, 'Wood Sword', 'Practice Sword');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  3, 7, 'Mace', 'Morningstar');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  4, 4, 'Dagger', 'The Stabber');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
   5, 1, 'Other', 'Straw Umbrella');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
   6, 2, 'Staff', 'Walking Stick');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  7, 0, 'Other', 'Pretty Flower');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  8, 10, 'Steel Sword', 'Excalibur');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  9, 3, 'Axe', 'Axe of Johnny');

INSERT INTO MELEE
  (MeleeID, Damage, ItemType, Description)
VALUES (
  10, 9, 'Staff', 'Rod of Power');

SET IDENTITY_INSERT dbo.MELEE OFF

SET IDENTITY_INSERT dbo.RANGED ON

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  1, 3, 6, 'Bow', 'Bow Of Reckoning');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  2, 7, 8, 'Wand', 'Pottamus Wandamus');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  3, 1, 4, 'Sling Shot', 'Leather Sling Shot');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  4, 0, 2, 'Water Balloon', 'Plastic Waterballoon');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  5, 6, 10, 'Magic', 'Spicy Fireball');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  6, 10, 15, 'Musket', 'Old Two Bore Rifle');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  7, 5, 7, 'Crossbow', 'Agile Crossbow');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  8, 4, 3, 'Other', 'Shuriken');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  9, 4, 12, 'Magic', 'Frosty Bolt');

INSERT INTO RANGED
  (RangedID, Damage, Range, ItemType, Description)
VALUES(
  10, 8, 13, 'Bow', 'Sturdy Long Bow');

SET IDENTITY_INSERT dbo.RANGED OFF


INSERT INTO SIMPLE_INVENTORY_INT VALUES(1, 1, 5, 5)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(2, 3, 1, 3)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(3, 7, 7, 3)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(4, 2, 3, 3)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(5, 8, 4, 1)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(6, 5, 2, 4)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(7, 10, 9, 7)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(8, 4, 10, 2)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(9, 9, 6, 6)
INSERT INTO SIMPLE_INVENTORY_INT VALUES(10, 2, 8, 10)
