import java.util.Scanner;

public class Combat {

    private Player player;
    private Enemy enemy;
    private Items item;

    public Combat(Player player) {
        this.player = player;
    }


    public void combat(int weaponValue, int shieldValue) {

        Scanner input = new Scanner(System.in);
        double value = Math.random() * 6;
        int damage = 0;
        int damageDealt = 0;

        System.out.println("A " + enemy.getName() + " stands before you.");
        System.out.println("-Attack-");
        System.out.println("-Throw Stone-");
        System.out.println("-Use Potion-");

        while (true) {
            if (enemy.getHp() <= 0) {
                System.out.println("You've won the Battle!");
                player.setHp(player.getMaxHp);
                break;
            }

            if (player.getHp() <= 0) {
                System.out.println("You lost the battle, Game Over");
                System.out.println("-Restart- or" + " -Exit the Game-");
				
	            boolean validInput = false;
                while (!validInput) {
                   String userCommand = input.nextLine();
                   if (userCommand.equals("Restart") {
                        validInput = true;
	                    game.main(); 
                   }
	               if (userCommand.equals("Exit the Game") {
	                    System.exit();
	               }
                }
            }

            boolean validInput = false;
            while (!validInput)
            {
                System.out.println("What do you do?");
                String userCommand = input.nextLine();
                if (userCommand.equals("Attack"))
                {
                    validInput = true;
                    if (value == 0)
                    {
                        damage = 0;
                    } else if (value >= 1 || value <= 4)
                    {
                        damage = weaponValue;
                    } else
                    {
                        damage = weaponValue * 2;
                    }
                    
                    int dmgDealt= weaponValue - enemy.getDef();
                    System.out.println("You attack the " + enemy.getName() + " for " + dmgDealt " Damage.");
                    enemy.setHp(weaponValue - enemy.getDef());
                    
                    int dmgReceived = enemy.getAtt() - shieldValue;
                    System.out.println("The enemy attack you for " + dmgReceived + " Damage");
                    player.setHp(enemy.getAtt() - shieldValue);
                }

                if (userCommand.equals("Throw Rock"))
                {
                    validInput = true;
                    item.useRock();
                }

                if (userCommand.equals("Use Potion"))
                {
                    validInput = true;
                    item.usePotion();
                }
        }
    }
