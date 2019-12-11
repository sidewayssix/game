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
        boolean win = false;
        double value = Math.random() * 6;
        int damage = 0;
        int damageDealt = 0;

        System.out.println("A " + enemy.getName() + " stands before you.");
        System.out.println("-Attack-");
        System.out.println("-Throw Stone-");
        System.out.println("-Use Potion-");

        while (true) {
            if (enemy.getHp() <= 0) {// enemy is dead
                win = true;
                break;
            }

            if (player.getHp() <= 0) {// player is dead
                win = false;
                break;
            }

            System.out.println("What do you do?");
            if (input.equals("Attack")) {
                if (value == 0) {
                    damage = 0;
                } else if (value >= 1 || value <= 4) {
                    damage = weaponValue;
                } else {
                    damage = weaponValue * 2;
                }

                enemy.setHp(weaponValue - enemy.getDef());
            }
            if (input.equals("Throw Rock")) {
                item.useRock();
                }
            }
            if (input.equals("Use Potion")) {
                item.usePotion();
            }
        }
    }
