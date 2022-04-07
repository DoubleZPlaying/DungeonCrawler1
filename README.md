# Game1

Ideas:
- Collection system
- Random chance
- Choose which direction to go in dungeon (doesn't make any difference)
- Randomly generates a monster (monsters have set HP and attack power and have different loot that can drop (also by chance))
- Battle against monster
- Hits can have different attack damage based on luck
- Can upgrade gear with money gained from kills or gain loot
- Weapons and armor automatically are slotted with best one

Monster Stats:
HP, Attack Damage, Loot, Attack Speed (mob attack/player attack)

Monsters:
- Zombie
  - 10, 1-3, $10-20 (1), 1/1 (1)
- Vampire
  - 15, 2-5, $20-30 (2), 1/1 (1)
- Witch
  - 15, 4-5, $20-35 (3), 1/2 (2)
- Troll
  - 20, 4-6, $35-50 (4), 1/2 (2)
- Giant
  - 30, 5-7, $50-70 (6), 1/3 (4)
- Sorcerer
  - 25, 7-9, $50-70 (5), 1/3 (3)

Player Stats:
HP, Attack Damage, Armor Points (all default)
10, 1-2, 5, 

NOTES:
Armor points add onto your health (ex: HP = 10, armor points = 10, total HP = 25)
Attack damage is diretly correlated to the weapon (if one weapon has 5, and you get a new one with 7 your attack damage will only be 7, not 12)

Armor Tiers:
- Leather Armor (+1 per piece)
- Brigandine armor (+2 per piece)
- Chainmail armor (+3 per piece)
- Plate armor (+4 per piece)
- Shield (adds +2 armor, marked as 5 in armorType in Monster.getLoot())
- Gauntlets (adds +1 to attack damage)

Weapon Tiers:
- Stone Club (1, 2 attack)
- Steel Sword (2, 3 attack)
- Mace (2, 3 attack)
- Knightly Sword (3, 4 attack)
- Gladius (3, 5 attack)
- Ulfberht (4, 6 attack)
- Scimitar (5, 7 attack)
- Katana (7, 8 attack)

All armor has helmet, chestplate, pants, and boots

Loot:
- Zombie: Leather, brigandine, steel sword, mace
- Vampire: brigandine, steel sword, knightly sword
- Witch: chainmail, knightly sword, gladius
- Troll: chainmail, mace, knightly sword, ulfberht
- Giant: chainmail, plate, ulfbehrt, scimitar
- Sorcerer: chainmail, plate, shield, scimitar, katana
