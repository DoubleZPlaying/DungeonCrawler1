public class Player
{
    int hp = 0;
    int attack1 = 0;
    int attack2 = 0;
    int helmet = -1;
    int chestplate = -1;
    int pants = -1;
    int boots = -1;
    int gauntlets = -1;
    int shield = -1;
    int totalHP = 0;
    int bal = 0;

    public Player(int hp, int attack1, int attack2)
    {
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
    }

    public void setHP(int hp)
    {
        this.hp = hp;
    }

    public int getHP()
    {
        return hp;
    }

    public void setCollectiveHP(int totalHP)
    {
        this.totalHP += totalHP;
    }

    public void setTotalHP(int helemet, int chestplate, int pants, int boots, int shield)
    {
        totalHP = hp + helmet + chestplate + pants + boots + shield;
    }

    public int getTotalHP()
    {
        return totalHP;
    }

    public void setAttack(int attack1, int attack2)
    {
        if(attack1 >= this.attack1 && attack2 >= this.attack2)
        {
            this.attack1 = attack1;
            this.attack2 = attack2;
        }
    }

    public int getAttack()
    {
        int attackDamage = (int)(Math.random() * ((attack2-attack1) + 1) + attack1);
        return attackDamage;
    }

    public void setHelmet(int helmet)
    {
        if(helmet > this.helmet)
        {
            totalHP -= this.helmet;
            totalHP += helmet;
            this.helmet = helmet;
        }
    }

    public String getHelmet()
    {
        if(helmet == 1)
        {
            return "Leather Helmet";
        }

        else if(helmet == 2)
        {
            return "Brigandine Helmet";
        }

        else if(helmet == 3)
        {
            return "Chainmail Helmet";
        }

        else //if(helmet == 4)
        {
            return "Plate Helmet";
        }
    }

    public int getHelmetNum()
    {
        return helmet;
    }

    public void setChestplate(int chestplate)
    {
        if(chestplate > this.chestplate)
        {
            totalHP -= this.chestplate;
            totalHP += chestplate;
            this.chestplate = chestplate;
        }
    }

    public String getChestplate()
    {
        if(chestplate == 1)
        {
            return "Leather Chestplate";
        }

        else if(chestplate == 2)
        {
            return "Brigandine Chestplate";
        }

        else if(chestplate == 3)
        {
            return "Chainmail Chestplate";
        }

        else //if(chestplate == 4)
        {
            return "Plate Chestplate";
        }
    }

    public int getChestplateNum()
    {
        return chestplate;
    }

    public void setPants(int pants)
    {
        if(pants > this.pants)
        {
            totalHP -= this.pants;
            totalHP += pants;
            this.pants = pants;
        }
    }

    public String getPants()
    {
        if(pants == 1)
        {
            return "Leather Pants";
        }

        else if(pants == 2)
        {
            return "Brigandine Pants";
        }

        else if(pants == 3)
        {
            return "Chainmail Pants";
        }

        else //if(pants == 4)
        {
            return "Plate Pants";
        }
    }

    public int getPantsNum()
    {
        return pants;
    }

    public void setBoots(int boots)
    {
        if(boots > this.boots)
        {
            totalHP -= this.boots;
            totalHP += boots;
            this.boots = boots;
        }
    }

    public String getBoots()
    {
        if(boots == 1)
        {
            return "Leather Boots";
        }

        else if(boots == 2)
        {
            return "Brigandine Boots";
        }

        else if(boots == 3)
        {
            return "Chainmail Boots";
        }

        else //if(boots == 4)
        {
            return "Plate Boots";
        }
    }

    public int getBootsNum()
    {
        return boots;
    }

    public void setGauntlets(int gauntlets)
    {
        if(gauntlets > this.gauntlets)
        {
            totalHP += gauntlets;
            this.gauntlets = gauntlets;
        }
    }

    public String getGauntlets()
    {
        if(gauntlets == 0)
        {
            return "don't have gauntlets";
        }

        else //if(gauntlets == 1)
        {
            return "do have gauntlets";
        }
    }

    public int getGauntletsNum()
    {
        return gauntlets;
    }

    public void setShield(int shield)
    {
        if(shield > this.shield)
        {
            this.shield = shield;
        }
    }

    public String getShield()
    {
        if(shield == 0)
        {
            return "don't have a shield"; 
        }

        else //if(shield == 2)
        {
            return "do have a shield";
        }
    }

    public int getShieldNum()
    {
        return shield;
    }

    public void setBal(int bal)
    {
        this.bal += bal;
    }

    public int getBal()
    {
        return bal;
    }

    public String getWeapon()
    {
        if(attack1 == 1 && attack2 == 2)
        {
            return "Stone Club";
        }

        else if(attack1 == 2 && attack2 == 3)
        {
            return "Steel Sword";
        }

        else if(attack1 == 3 && attack2 == 3)
        {
            return "Mace";
        }

        else if(attack1 == 3 && attack2 == 4)
        {
            return "Knightly Sword";
        }

        else if(attack1 == 3 && attack2 == 5)
        {
            return "Gladius";
        }

        else if(attack1 == 4 && attack2 == 6)
        {
            return "Ulfberht";
        }

        else if(attack1 == 5 && attack2 == 7)
        {
            return "Scimitar";
        }

        else //if(attack1 == 7 && attack2 == 8)
        {
            return "Katana";
        }
    }
}
