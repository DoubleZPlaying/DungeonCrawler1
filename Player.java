public class Player
{
    int hp = 0;
    int attack1 = 0;
    int attack2 = 0;
    int armor = 0;
    int helmet = 0;
    int chestplate = 0;
    int pants = 0;
    int boots = 0;
    int gauntlets = 0;
    int totalHP = 0;

    public Player(int hp, int attack1, int attack2, int armor)
    {
        this.hp = hp;
        this.attack1 = attack1;
        this.attack2 = attack2;
        this.armor = armor;

        this.totalHP = this.hp + this.armor;
    }

    public void setHP(int hp)
    {
        this.hp += hp;
    }

    public int getHP()
    {
        return hp;
    }

    public int getArmor()
    {
        return armor;
    }

    public void setTotalHP(int armor)
    {
        this.armor = armor;
        totalHP = hp + armor;
    }

    public int getTotalHP()
    {
        return totalHP;
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

    public void setHelmet(int helmet)
    {
        if(helmet > this.helmet)
        {
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

    public void setChestplate(int chestplate)
    {
        if(chestplate > this.chestplate)
        {
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

    public void setPants(int pants)
    {
        if(pants > this.pants)
        {
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

    public void setBoots(int boots)
    {
        if(boots > this.boots)
        {
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
}
