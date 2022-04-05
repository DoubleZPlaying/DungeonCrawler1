public class Player
{
    int hp = 0;
    int attack1 = 0;
    int attack2 = 0;
    int armor = 0;
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

    public void getAttack()
    {
        int attackDamage = (int)(Math.random() * (attack2 + 1) + attack1);
    }
}
