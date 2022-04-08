import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static double version = 1.0;
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Monster> db = new ArrayList<Monster>(); 
        Player player1 = new Player(10, 1, 2);
        Monster zombie = new Monster("Zombie", 10, 1, 3, 1, 1);
        db.add(zombie);
        Monster vampire = new Monster("Vampire", 15, 2, 5, 2, 1);
        db.add(vampire);
        Monster witch = new Monster("Witch", 15, 4, 5, 3, 2);
        db.add(witch);
        Monster troll = new Monster("Troll", 20, 4, 5, 4, 2);
        db.add(troll);
        Monster giant = new Monster("Giant", 30, 5, 7, 6, 3);
        db.add(giant);
        Monster sorcerer = new Monster("Sorcerer", 25, 7, 9, 5, 3); 
        db.add(sorcerer);

        player1.setHelmet(1);
        player1.setChestplate(1);
        player1.setPants(1);
        player1.setBoots(1);
        player1.setGauntlets(0);
        player1.setShield(0); 

        player1.setTotalHP(player1.getHelmetNum(), player1.getChestplateNum(), player1.getPantsNum(), player1.getBootsNum(), player1.getShieldNum());

        String temp;
        String fight;
        boolean defend = false;
        boolean died = false;
        int in;
        int run = 0;
        int run2 = 0;
        int count = 0;

        System.out.println("Welcome to DUNGEON CRAWLER 1, v" + version);
        System.out.println();

        System.out.print("To open the how to play page press 1, to play press 2, to quit press 3: ");
        in = input.nextInt();
        temp = input.nextLine();
        System.out.println("");

        if(in == 1)
        {
            Main.help();
            System.out.println("");
            System.out.println("Press ENTER to begin exploring!");
            temp = input.nextLine();
            System.out.println("You wake up in a small room in a vast dungeon. You have nothing but a set of leather armor and a stone club. There's one door out of the room. You push it open and step through . . .");
        }

        else if(in == 2)
        {
            System.out.println("You wake up in a small room in a vast dungeon. You have nothing but a set of leather armor and a stone club. There's one door out of the room. You push it open and step through . . .");
        }

        else
        {
            run = 1;
        }

        while(run == 0)
        {
            if(run2 == 1)
            {
                Battle.hallWay();
            }

            run2 = 1;
            int m = 0;
            Battle.room();

            while(true)
            {
                if(Battle.monster().equals("zombie"))
                {
                    m = 0;
                    break;
                }

                else if(Battle.monster().equals("vampire"))
                {
                    m = 1;
                    break;
                }

                else if(Battle.monster().equals("witch") && count >= 3)
                {
                    m = 2;
                    break;
                }

                else if(Battle.monster().equals("troll") && count >= 5)
                {
                    m = 3;
                    break;
                }

                else if(Battle.monster().equals("giant") && count >= 8)
                {
                    m = 4;
                    break;
                }

                else if(Battle.monster().equals("sorcerer") && count >= 10)
                {
                    m = 5;
                    break;
                }
            }

            
            System.out.println("In the middle of the room stands a " + (db.get(m)).getName() + ", ready to fight.");
            
            while(true)
            {
                count++;    
                System.out.println("Will you attack or defend yourself?");
                fight = input.nextLine();
                fight.toLowerCase();

                Monster monster1 = db.get(m);
            
                if(fight.equals("attack"))
                {
                    int damage = player1.getAttack();
                    monster1.setHP(-(damage));
                    System.out.println("The " + monster1.getName() + " sustained " + damage + " damage points, bringing it's health down to " + monster1.getHP());
                    defend = false;
                }

                else if(fight.equals("defend"))
                {
                    defend = true;
                    System.out.println("You move into a defensive position and prepare to meet the " + monster1.getName() + "'s attack.");
                }

                else
                {
                    System.out.println("You freeze in fear, giving the " + monster1.getName() + " a chance to attack.");
                }

                System.out.println();

                if(monster1.getHP() <= 0 && died == false)
                {
                    count += 1;
                    System.out.println("You killed the " + monster1.getName() + "!");
                    int money = monster1.getMoney();
                    String loot[] = monster1.getLoot();

                    player1.setBal(money);

                    if(loot[0].equals("Leather"))
                    {
                        if(loot[1].equals("Helmet"))
                        {
                            player1.setHelmet(1);
                        }

                        else if(loot[1].equals("Chestplate"))
                        {
                            player1.setChestplate(1);
                        }

                        else if(loot[1].equals("Pants"))
                        {
                            player1.setPants(1);
                        }

                        else if(loot[1].equals("Boots"))
                        {
                            player1.setBoots(1);
                        }
                    }

                    else if(loot[0].equals("Brigandine"))
                    {
                        if(loot[1].equals("Helmet"))
                        {
                            player1.setHelmet(2);
                        }

                        else if(loot[1].equals("Chestplate"))
                        {
                            player1.setChestplate(2);
                        }

                        else if(loot[1].equals("Pants"))
                        {
                            player1.setPants(2);
                        }

                        else if(loot[1].equals("Boots"))
                        {
                            player1.setBoots(2);
                        }
                    }

                    else if(loot[0].equals("Chainmail"))
                    {
                        if(loot[1].equals("Helmet"))
                        {
                            player1.setHelmet(3);
                        }

                        else if(loot[1].equals("Chestplate"))
                        {
                            player1.setChestplate(3);
                        }

                        else if(loot[1].equals("Pants"))
                        {
                            player1.setPants(3);
                        }

                        else if(loot[1].equals("Boots"))
                        {
                            player1.setBoots(3);
                        }
                    }

                    else if(loot[0].equals("Plate"))
                    {
                        if(loot[1].equals("Helmet"))
                        {
                            player1.setHelmet(4);
                        }

                        else if(loot[1].equals("Chestplate"))
                        {
                            player1.setChestplate(4);
                        }

                        else if(loot[1].equals("Pants"))
                        {
                            player1.setPants(4);
                        }

                        else if(loot[1].equals("Boots"))
                        {
                            player1.setBoots(4);
                        }
                    }

                    if(loot[2].equals("Stone Club"))
                    {
                        player1.setAttack(1, 2);
                    }

                    else if(loot[2].equals("Steel Sword"))
                    {
                        player1.setAttack(2, 3);
                    }

                    else if(loot[2].equals("Mace"))
                    {
                        player1.setAttack(3, 3);
                    }

                    else if(loot[2].equals("Knightly Sword"))
                    {
                        player1.setAttack(3, 4);
                    }

                    else if(loot[2].equals("Gladius"))
                    {
                        player1.setAttack(3, 5);
                    }

                    else if(loot[2].equals("Ulfberht"))
                    {
                        player1.setAttack(4, 6);
                    }

                    else if(loot[2].equals("Scimitar"))
                    {
                        player1.setAttack(5, 7);
                    }

                    else if(loot[2].equals("Katana"))
                    {
                        player1.setAttack(7, 8);
                    }

                    System.out.print("You got ");
                    if(!(loot[1].equals("Pants")))
                    {
                        System.out.print("a ");
                    }
                    System.out.println(loot[0] + " " + loot[1] + ", a " + loot[2] + ", and made $" + money + ".");
                    System.out.println("Your total HP is now " + player1.getTotalHP() + ", your balace is $" + player1.getBal() + ", you have a " + player1.getHelmet() + ", " + player1.getChestplate() + ", " + player1.getPants() + ", and " + player1.getBoots() + ", and " + player1.getGauntlets() + " and " + player1.getShield() + ". You are armed with a " + player1.getWeapon() + ".");
                    
                    System.out.println();

                    //store
                    if(player1.getTotalHP() > 0 && (player1.getShieldNum() == 0 || player1.getGauntletsNum() == 0))
                    {
                        String price;
                        System.out.println("Welcome to the shop! Buy any necessary upgrades in between battles here! Your current balance is: $" + player1.getBal());
                        System.out.println("Available items:");

                        if(player1.getGauntletsNum() == 0)
                        {
                            System.out.println("- Gauntlets (+1 attack damage), $200");
                        }
                        
                        if(player1.getShieldNum() == 0)
                        {
                            System.out.println("- Shield (+2 protection), $300");
                        }

                        if(!(player1.getShieldNum() == 0 || player1.getGauntletsNum() == 0))
                        {
                            System.out.println("No available items!");
                        }

                        System.out.println("");
                        System.out.print("Please input the name of any item within your balance you'd like to buy, or enter \"Leave Shop\": ");
                        price = input.nextLine();
                        price.toLowerCase();

                        if(!(price.equals("shield")) && !(price.equals("gauntlets")) && !(price.equals("leave shop")))
                        {
                            System.out.println("Invalid input. Purchase something next time!");
                        }

                        else if(price.equals("leave shop")){}

                        else if(price.equals("shield"))
                        {
                            if(player1.getBal() >= 300)
                            {
                                player1.setShield(1);
                                player1.setBal(-300);
                                System.out.println("Shield bought and equipted!");
                            }

                            else
                            {
                                System.out.println("You can't afford a shield. Try again when you have an additional $" + (300 - player1.getBal()) + ".");
                            }
                        }

                        else if(price.equals("gauntlets"))
                        {
                            if(player1.getBal() >= 200)
                            {
                                player1.setGauntlets(1);
                                player1.setBal(-200);
                                System.out.println("Gauntlets bought and equipted!");
                            }

                            else
                            {
                                System.out.println("You can't afford gauntlets. Try again when you have an additional $" + (200 - player1.getBal()) + ".");
                            }
                        }

                        System.out.println();
                    }

                    break;
                }

                if(count % monster1.getAttackSpeed() == 0)
                {
                    System.out.print("The " + monster1.getName() + " begins it's attack. You ");

                    if(defend == false)
                    {
                        int damage = monster1.getAttack();
                        player1.setCollectiveHP(-(damage));
                        System.out.println("sustain " + damage + " damage points, bringing your HP to " + player1.getTotalHP());
                    }

                    else if(defend == true)
                    {
                        int damage = monster1.getAttack();
                        player1.setCollectiveHP(-(damage) + 1);

                        if(player1.getHP() < (player1.getHelmetNum() + player1.getChestplateNum() + player1.getPantsNum() + player1.getBootsNum() + player1.getShieldNum() + player1.getHP()))
                        {
                            int regen = (int)(Math.random() * (1+1) + 1);
                            player1.setCollectiveHP(regen);
                            System.out.println("defend yourself, and take " + (damage - 1) + " damage points, instead of " + damage + " damage points. Your brief respite also allows you to regain " + regen + " HP. Your HP is " + player1.getTotalHP() + ".");
                        }

                        else
                        {
                            System.out.println("defend yourself, and take " + (damage - 1) + " damage points, instead of " + damage + " damage points. Your HP is " + player1.getTotalHP() + ".");
                        }
                    }

                    if(player1.getTotalHP() <= 0)
                    {
                        System.out.println();
                        System.out.println("YOU DIED. \nYou have lost everything except for your leather armor and stone club.");
                        System.out.println();
                        
                        player1.setHP(10);
                        player1.setHelmet(1);
                        player1.setChestplate(1);
                        player1.setPants(1);
                        player1.setBoots(1);
                        player1.setGauntlets(0);
                        player1.setShield(0);
                        player1.setTotalHP(player1.getHelmetNum(), player1.getChestplateNum(), player1.getPantsNum(), player1.getBootsNum(), player1.getShieldNum());

                        run2 = 0;
                        count = 0;

                        break;
                    }
                }

                else if(count % monster1.getAttackSpeed() != 0)
                {
                    if(defend == true && player1.getHP() < (player1.getHelmetNum() + player1.getChestplateNum() + player1.getPantsNum() + player1.getBootsNum() + player1.getShieldNum() + player1.getHP()))
                    {
                        int regen = (int)(Math.random() * (1+1) + 1);
                        player1.setCollectiveHP(regen);
                        System.out.println("The " + monster1.getName() +  "is too slow to attack right away. In your preparations to defend yourself, you had a brief moment to regain " + regen + " HP. Your HP is now " + player1.getTotalHP() + ".");
                    }
                    
                    else
                    {
                        System.out.print("The " + monster1.getName() +  "is too slow to attack right away. ");
                    }

                    System.out.println("You can now attack, should you choose.");
                }
            }
        }

        if(run == 1)
        {
            System.out.println("We're sorry to see you go. Come again another time!");
        }

        else
        {
            System.out.println("Thanks for playing! Come play some other time!");
        }

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
        System.out.println("- Sorcerer: 25 HP, 7-9 attack damage, 1/3 attack speed");
        System.out.println("");
        System.out.println("From each monster you will be able to collect loot after killing, including money, armor, or weapons. The four types of armor, from least protection to greatest are as follows:");
        System.out.println("- Leather Armor, +1 protection per piece");
        System.out.println("- Brigandine Armor, +2 protection per piece");
        System.out.println("- Chainmail Armor, +3 protection per piece");
        System.out.println("- Plate Armor, +4 protection per piece");
        System.out.println("");
        System.out.println("All types of armor have a helmet, a chestplate, pants, and boots. In the armor category are shields and gauntlets as well. Shields add +2 protection, while gauntlets add +1 to attack damage. Shields and guantlets are only accessable through the shop. When you gain a higher tier armor-piece than the one currently equiped, the game will automaticall equip it for you.");
        System.out.println("In the game there are 8 different types of weapons. The following list is all in-game weapons and their attack damage:");
        System.out.println("- Stone Club, 1-2 attack damage");
        System.out.println("- Steel Sword, 2-3 attack damage");
        System.out.println("- Mace, 3 attack damage");
        System.out.println("- Knightly Sword, 3-4 attack damage");
        System.out.println("- Gladius, 3-5 attack damage");
        System.out.println("- Ulfberht (Viking Sword), 4-6 attack damage");
        System.out.println("- Scimitar, 5-7 attack damage");
        System.out.println("- Katana, 7-8 attack damage");
        System.out.println("");
        System.out.println("At the beginning of each session, you will spawn in with full leather armor and a stone club. As you kill more monsters, you'll be able to get better armor and weapons through their loot. However, if you die you'll lose everything, so be careful! To help prevent dying, try defending during your turn instead of attacking! You'll reduce the monster's damage, and you can even regain some health back!");
        System.out.println("Now go off and explore your dungeon!");
    }
}