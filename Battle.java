import java.util.Scanner;

public class Battle
{
    static Scanner input = new Scanner(System.in);

    public static void room()
    {
        int room = (int)(Math.random() * (4 + 1) + 1);

        if(room == 1)
        {
            Battle.room1();
        }

        else if(room == 2)
        {
            Battle.room2();
        }

        else if(room == 3)
        {
            Battle.room3();
        }

        else if(room == 4)
        {
            Battle.room4();
        }

        else if(room == 5)
        {
            Battle.room5();
        }
    }

    public static String room1()
    {
        return "You are in a small, square room made of stone bricks. Below you puddles form from dripping cracks in the ceiling. The only light is from a few torches resting in sconces. ";
    }

    public static String room2()
    {
        return "You are in a room with wooden flooring and walls made of strong oak. While the room isn't very wide, it stretches hundreds of feet outwards into gloomy shadow. Strong wooden pillars hold the heavy stone ceiling up, and some of the closer ones hold torches in sconces. ";
    }

    public static String room3()
    {
        return "You find yourself on a raised platform at one end of a heavily embellished room. Tapastries and colorful paintings adorn the well-lit room's walls, and a chandelier dripping with diamonds is hung from the center of the room. ";
    }

    public static String room4()
    {
        return "You walk into a half-flooded room. Random pieces of furnitures and parts of suits of armor float amongst other, smaller detritus. The only light comes from a singular candle still upright on a floating candle plate. ";
    }

    public static String room5()
    {
        return "You find yourself in a room made of packed dirt. Your head is sprinkled with dust from the low ceiling where you can hear insects crawling. A lantern on the floor aluminates the entire room except for the shadowy corners. ";
    }

    public static String monster()
    {
        int monster = (int)(Math.random() * (5 + 1) + 1);

        if(monster == 1)
        {
            return "zombie";
        }

        else if(monster == 2)
        {
            return "vampire";
        }

        else if(monster == 3)
        {
            return "witch";
        }

        else if(monster == 4)
        {
            return "troll";
        }

        else if(monster == 5)
        {
            return "giant";
        }

        else //if(monster == 6)
        {
            return "sorcerer";
        }
    }
}