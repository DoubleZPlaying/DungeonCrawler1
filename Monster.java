public class Monster
{
    int hp = 0;
    int attack1 = 0;
    int attack2 = 0;
    int loot = 0;
    int speed = 0;
    int money = 0;

    public Monster(int hp, int attack1, int attack2, int loot, int speed)
    {
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.loot = loot;
        this.speed = speed;
    }

    public void setHP(int hp)
    {
        this.hp += hp;
    }

    public int getHP()
    {
        return hp;
    }

    public void setAttack(int attack1, int attack2)
    {
        this.attack1 = attack1;
        this.attack2 = attack2;
    }

    public int getAttack()
    {
        int attackDamage = (int)(Math.random() * ((attack2-attack1) + 1) + attack1);
        return attackDamage;
    }

    public void setAttackSpeed(int speed)
    {
        this.speed = speed;
    }

    public int getAttackSpeed()
    {
        return speed;
    }

    public int getMoney()
    {
        if(loot == 1)
        {
            money = (int)(Math.random() * (10 + 1) + 10);
            return money;
        }

        else if(loot == 2)
        {
            money = (int)(Math.random() * (10 + 1) + 20);
            return money;
        }

        else if(loot == 3)
        {
            money = (int)(Math.random() * (15 + 1) + 20);
            return money;
        }

        else if(loot == 4)
        {
            money = (int)(Math.random() * (15 + 1) + 35);
            return money;
        }

        else if(loot == 5)
        {
            money = (int)(Math.random() * (20 + 1) + 50);
            return money;
        }

        else //if(loot == 6)
        {
            money = (int)(Math.random() * (20 + 1) + 50);
            return money;
        }
    }

    public String getLoot()
    {
        String armorType = "";
        String weaponType = "";
        int armorRoll = 0;
        int weaponRoll = 0;
        int armorPiece = 0;

        //zombie loot
        if(loot == 1)
        {
            armorRoll = (int)(Math.random() * (1 + 1) + 1);
            weaponRoll = (int)(Math.random() * (1 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Leather";
            }
            else if(armorRoll == 2)
            {
                armorType = "Brigandine";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Steel Sword";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Mace";
            }
        }

        //vampire loot
        else if(loot == 2)
        {
            armorRoll = (int)(Math.random() * (1 + 1) + 1);
            weaponRoll = (int)(Math.random() * (1 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Brigandine";
            }
            else if(armorRoll == 2)
            {
                armorType = "";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Steel Sword";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Knightly Sword";
            }
        }

        //witch loot
        else if(loot == 3)
        {
            armorRoll = (int)(Math.random() * (1 + 1) + 1);
            weaponRoll = (int)(Math.random() * (1 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Chainmail";
            }
            else if(armorRoll == 2)
            {
                armorType = "";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Knightly Sword";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Gladius";
            }
        }

        //troll loot
        else if(loot == 4)
        {
            armorRoll = (int)(Math.random() * (1 + 1) + 1);
            weaponRoll = (int)(Math.random() * (2 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Chainmail";
            }
            else if(armorRoll == 2)
            {
                armorType = "";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Knightly Sword";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Mace";
            }

            else if(weaponRoll == 3)
            {
                weaponType = "Ulfberht";
            }
        }

        //giant loot
        else if(loot == 5)
        {
            armorRoll = (int)(Math.random() * (1 + 1) + 1);
            weaponRoll = (int)(Math.random() * (1 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Chainmail";
            }
            else if(armorRoll == 2)
            {
                armorType = "Plate";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Ulfberht";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Scimitar";
            }
        }

        //sorcerer loot
        else
        {
            armorRoll = (int)(Math.random() * (2 + 1) + 1);
            weaponRoll = (int)(Math.random() * (1 + 1) + 1);

            if(armorRoll == 1)
            {
                armorType = "Chainmail";
            }
            else if(armorRoll == 2)
            {
                armorType = "Plate";
            }

            else if(armorRoll == 3)
            {
                armorType = "Shield";
            }

            if(weaponRoll == 1)
            {
                weaponType = "Scimitar";
            }

            else if(weaponRoll == 2)
            {
                weaponType = "Katana";
            }
        }

        armorPiece = (int)(Math.random() * (3 + 1) + 1);

        if(armorPiece == 1) //helmet
        {
            return armorType + " Helmet, and a " + weaponType;
        }
        
        else if(armorPiece == 2) //chestplate
        {
            return armorType + " Chestplate, and a " + weaponType;
        }

        else if(armorPiece == 3) //pants
        {
            return armorType + " Pants, and a " + weaponType;
        }

        else//if(armorPiece == 4) //boots
        {
            return armorType + " Boots, and a " + weaponType;
        }
    }
}
