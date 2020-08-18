USE SimpleInventory
Go

CREATE TABLE PLAYER(
  PlayerID              Int         NOT NULL IDENTITY(1,1),
  PlayerName            Char(25)    NOT NULL,
  Class                 Char(15)    NOT NULL,
  Health                Int         NOT NULL,
  Strength              Int         NOT NULL,
  Intelligence          Int         NOT NULL,
  CONSTRAINT        PlayerIDPK      PRIMARY KEY(PlayerID),
  CONSTRAINT        PlayerAK        UNIQUE(PlayerName),
  CONSTRAINT        StatsCheck      CHECK
                      (Strength <= 20 AND Intelligence <= 20),
  CONSTRAINT        HealthValue     CHECK
                      (Health >= 0 AND Health <= 100),
  CONSTRAINT        ClassTypeValue  CHECK
                      (Class IN ('Mage', 'Warrior', 'Rogue', 'Necromancer',
                        'Paladin', 'NPC'))
);

CREATE TABLE ARMOR(
  ArmorID               Int               NOT NULL IDENTITY(1,1),
  Defense               Int               NOT NULL,
  ItemType              Char(15)          NOT NULL,
  Description           Char(50)          NOT NULL,
  CONSTRAINT          ArmorIDPK           PRIMARY KEY(ArmorID),
  CONSTRAINT          ArmorAK             UNIQUE(Description),
  CONSTRAINT          DefenseValue          CHECK
                        (Defense >= 0 AND Defense <= 10),
  CONSTRAINT          ArmorTypeValue      CHECK
                          (ItemType IN ('Ring', 'Helm','Chest','Waist',
                            'Boots', 'Legs', 'Hands', 'Shield', 'Cloak'))
);

CREATE TABLE MELEE(
  MeleeID               Int              NOT NULL IDENTITY(1,1),
  Damage                Int              NOT NULL,
  ItemType              Char(15)         NOT NULL,
  Description           Char(50)         NOT NULL,
  CONSTRAINT          MeleeIDPK          PRIMARY KEY(MeleeID),
  CONSTRAINT          MeleeAK            UNIQUE(Description),
  CONSTRAINT          MeleeDamageValue   CHECK
                        (Damage >= 0 AND Damage <= 20),
  CONSTRAINT          MeleeTypeValue     CHECK
                          (ItemType IN ('Wood Sword', 'Steel Sword', 'Hammer',
                            'Dagger','Mace', 'Axe', 'Staff', 'Other'))
);

CREATE TABLE RANGED(
  RangedID              Int               NOT NULL IDENTITY(1,1),
  Damage                Int               NOT NULL,
  Range                 Int               NOT NULL,
  ItemType              Char(15)          NOT NULL,
  Description           Char(50)          NOT NULL,
  CONSTRAINT          RangedIDPK          PRIMARY KEY(RangedID),
  CONSTRAINT          RangedAK            UNIQUE(Description),
  CONSTRAINT          RangedDamageValue   CHECK
                        (Damage >= 0 AND Damage <= 20),
  CONSTRAINT          RangedTypeValue     CHECK
                          (ItemType IN ('Bow', 'Wand', 'Magic','Crossbow',
                            'Water Balloon','Sling Shot', 'Musket', 'Other'))
);

CREATE TABLE SIMPLE_INVENTORY_INT(
  PlayerID     Int        NOT NULL,
  ArmorID      Int        NOT NULL,
  MeleeID      Int        NOT NULL,
  RangedID     Int        NOT NULL,


  CONSTRAINT InventoryPK PRIMARY KEY(PlayerID, ArmorID, MeleeID, RangedID),

  CONSTRAINT Inventory_PlayerFK FOREIGN KEY(PlayerID)
          REFERENCES PLAYER(PlayerID)
    ON UPDATE NO ACTION
    ON DELETE CASCADE,

    CONSTRAINT  Inventory_ArmorIDFK FOREIGN KEY(ArmorID)
          REFERENCES ARMOR(ArmorID)
      ON UPDATE NO ACTION
      ON DELETE CASCADE,

  CONSTRAINT Inventory_MeleeFK FOREIGN KEY(MeleeID)
        REFERENCES MELEE(MeleeID)
    ON UPDATE NO ACTION
    ON DELETE CASCADE,

  CONSTRAINT  Inventory_RangedFK FOREIGN KEY(RangedID)
        REFERENCES RANGED(RangedID)
    ON UPDATE NO ACTION
    ON DELETE CASCADE
);
