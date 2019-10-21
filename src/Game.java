// This will be a text based game that tells a simple story. It will include decision making, and basic combat.

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        int waitTime;
        int weaponValue = 5;
        double damage = 0;

        //create scanner to read user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome Hero, to the city of Astavar, what is your name?");
        String playerName = input.next();

        waitTime = 2000;
        System.out.println("\nWelcome " + playerName + " Your adventure awaits!\n");

        Wait(waitTime);

        System.out.println("You awaken to loud pounding on your door. "
                + playerName + " Wake up!\n" + "You start to come to as the pounding continues.\n" +
                "\"Who could it be at this hour?\" you say to yourself.\n\"Get up " + playerName +
                " the town is under attack and it's already 3pm!!!\"");

        damage = Combat(weaponValue);
        // double damage = Math.random() * 6;
        System.out.printf("damage: %.0f%n", damage);

       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        double value = Math.random() * 6;
        System.out.printf("stuff %.2f%n", value);  */
    }

    private static void Wait(int waitTime) {

        try {
            Thread.sleep(waitTime);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static double Combat(int weaponValue) {

        double damage = 0;
        double value = Math.random() * 6;

        if (value == 0) {
            damage = 0;
        } else if (value >= 1 || value <= 4) {
            damage = weaponValue;
        } else {
            damage = weaponValue * 1.5;
        }

        return damage;
    }
}