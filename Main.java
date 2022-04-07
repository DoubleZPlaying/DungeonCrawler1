import java.util.Scanner;

public class Main
{
    public static double version = 1.0;
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(10, 1, 2, 5);
        Monster zombie = new Monster(10, 1, 3, 1, 1);
        Monster vampire = new Monster(15, 2, 5, 2, 1);
        Monster witch = new Monster(15, 4, 5, 3, 2);
        Monster troll = new Monster(20, 4, 5, 4, 2);
        Monster giant = new Monster(30, 5, 7, 6, 3);
        Monster sorcerer = new Monster(25, 7, 9, 5, 3); 

        String temp;
        int in;

        System.out.println("Welcome to DUNGEON CRAWLER 1, v" + version);
        System.out.println("");
        System.out.print("To open the how to play page press 1, to play press 2, to quit press 3: ");
        in = input.nextInt();
        temp = input.nextLine();

        input.close();
    }

    public static void help()
    {
        System.out.println("HOW TO PLAY");
        System.out.println("Welcome to Dungeon Crawler 1, version " + version + ".");
        System.out.println("In this game, you, the player, are an explorer in a long-hidden in the dungeon. In this dungeon are monsters you will have to fight to gain loot and money.");
        System.out.println("Monster Stats:");
        System.out.println("- Zombie: 10 HP, 1-3 attack damage, 1/1 attack speed");
        System.out.println("- Vampire: 15 HP, 2-5 attack damage, 1/1 attack speed");
        System.out.println("- Witch: 15 HP, 4-5 attack damage, 1/2 attack speed");
        System.out.println("- Troll: 20 HP, 4-6 attack damage, 1/2 attack speed");
        System.out.println("- Giant: 30 HP, 5-7 attack damage, 1/3 attack speed");
        System.out.println("- Sorcerer: 25 HP ")

    }
}