import java.util.Scanner;

public class Main
{
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        Player player1 = new Player(10, 1, 2, 5);
        Monster zombie = new Monster(10, 1, 3, 1, 1);
        Monster vampire = new Monster(15, 2, 5, 2, 1);
        Monster witch = new Monster(15, 4, 5, 3, 2);
        Monster troll = new Monster(20, 4, 5, 4, 2);
        Monster giant = new Monster(30, 5, 7, 6, 4);
        Monster sorcerer = new Monster(20, 5, 7, 5, 3);


        input.close();
    }
}