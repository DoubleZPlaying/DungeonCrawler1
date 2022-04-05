public class Monster
{
    int hp = 0;
    int attack1 = 0;
    int attack2 = 0;
    int loot = 0;
    int speed = 0;

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

    public void getMoney()
    {
        if(loot == 1)
        {
            System.out.println((int)(Math.random() * (10 + 1) + 10));
        }

        if(loot == 2)
        {
            System.out.println((int)(Math.random() * (10 + 1) + 20));
        }

        if(loot == 3)
        {
            System.out.println((int)(Math.random() * (15 + 1) + 20));
        }

        if(loot == 4)
        {
            System.out.println((int)(Math.random() * (15 + 1) + 35));
        }

        if(loot == 5)
        {
            System.out.println((int)(Math.random() * (20 + 1) + 50));
        }

        if(loot == 6)
        {
            System.out.println((int)(Math.random() * (20 + 1) + 50));
        }
    }

    public String getLoot()
    {
        
    }
}
