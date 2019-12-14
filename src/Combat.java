import java.util.Scanner;
import java.util.Random;

public class Combat {

    private Player player1;
    private Enemy enemy1;
    private Items item;
    private Game game;

    public Combat(Player player1, Enemy enemy1, Items item) {
        this.player1 = player1;
        this.enemy1 = enemy1;
        this.item = item;
    }

    public void combat(int weaponValue, int shieldValue) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();


        int damage = 0;
        int damageDealt = 0;

        System.out.println("A " + enemy1.getName() + " stands before you.");
        System.out.println("-Attack-");
        System.out.println("-Throw Stone-");
        System.out.println("-Use Potion-");

        while (true) {
            //Since we check for Enemy HP first, should both player and enemy both die, the fight will count as a win.
            if (enemy1.getHp() <= 0) {
                System.out.println("You've won the Battle!");
                player1.setHp(player1.getMaxHp());
                break;
            }

            if (player1.getHp() <= 0) {
                System.out.println("You lost the battle, Game Over");
                System.out.println("-Restart- or" + " -Exit the Game-");

                boolean validInput = false;
                while (!validInput) {

                    System.out.println("What do you do?");
                    String userCommand = input.nextLine();

                    if (userCommand.equalsIgnoreCase("Restart")) {
                        validInput = true;
                        game.main(null);
                    }
                    if (userCommand.equalsIgnoreCase("Exit the Game")) {
                        System.exit(1);
                    }
                }
            }

            boolean validInput = false;
            while (!validInput) {

                int value = random.nextInt(6);

                System.out.println("What do you do?");
                String userCommand = input.nextLine();

                if (userCommand.equalsIgnoreCase("Attack")) {

                    int dmgDealt = 0;
                    validInput = true;

                    if (value == 0) {
                        damage = 0;
                        System.out.println("You attack the " + enemy1.getName() + " for 0 Damage, You missed.");
                    } else if (value > 0 && value < 5) {
                        damage = weaponValue;
                        dmgDealt = damage - enemy1.getDef();

                        System.out.println("You attack the " + enemy1.getName() + " for " + dmgDealt + " Damage.");

                        enemy1.setHp(enemy1.getHp() - dmgDealt);
                    } else {
                        damage = weaponValue * 2;
                        dmgDealt = damage - enemy1.getDef();

                        System.out.println("You attack the " + enemy1.getName() + " for " + dmgDealt + " Damage, Critical Hit.");

                        enemy1.setHp(enemy1.getHp() - dmgDealt);
                    }

                    int dmgReceived = enemy1.getAtt() - shieldValue;
                    System.out.println("The enemy attacks you for " + dmgReceived + " Damage");
                    player1.setHp(player1.getHp() - dmgReceived);
                    System.out.println("You have " + player1.getHp() + "HP left");
                }

                if (userCommand.equalsIgnoreCase("Throw Rock")) {
                    validInput = true;
                    item.useRock();
                }

                if (userCommand.equalsIgnoreCase("Use Potion")) {
                    validInput = true;
                    item.usePotion();
                }
            }
        }
    }
}