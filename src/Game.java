// This will be a text based game that tells a simple story. It will include decision making, and basic combat.

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player(100, 100);
        Enemy goblin = new Enemy("goblin",40, 5, 5);
        Items item = new Items(player1,0, 0);
        Combat combat = new Combat(player1);

        Scanner input = new Scanner(System.in);
        int weaponValue = 0;
        int shieldValue = 0;

        System.out.println("Welcome Hero, to the city of Astavar, what is your name?");
        String playerName = input.next();

        System.out.println("\nWelcome " + playerName + " Your adventure awaits!\n");

        System.out.println("You awaken to loud pounding on your door. "
                + playerName + " Wake up!\n" + "You start to come to as the pounding continues.\n" +
                "\"Who could it be at this hour?\" you say to yourself.\n\"Get up " + playerName +
                " the town is under attack and it's already 3pm!!!\"");

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("You start getting out of bed.\n" + "\"Who the hell is attacking at 3 pm on a Wednesday?\"\n" +
                "You yell as you slide your pants on, and grab your boots.\n" +
                "After you slide into your boots, you grab the old sword and shield off the wall and reach the door.\n" +
                "Attack increased by 10, Defense increased by 2");
        weaponValue = 10; shieldValue = 2;

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("After equiping your sword and shield you head for the door just as the pounding starts up again.\n" +
                "\"We're all gonna die if you don't get your ass out here soon.\"" + "You hear from the other side of the door.");

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("you grab a few rocks off the floor and two potions off the table just before you reach the door\n" +
                "\"Best to be prepared\"" + "You say to yourself.");
        item.setPotions(2); item.setRocks(5);

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("You grab the door handle and just as your about to pull it open, you feel it push against you,\n" +
                "and your neighbor Gwen falls through the open door into your living room.\n" +
                "\"It's about damn time you got ready, now will you kill that thing\"");

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("You look through the now open door and see a Goblin with a small knife standing there\n" +
                "\"All right, All right\"" + "You say as you charge towards the Goblin.\n");

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("\n" + "  \"Beginning Combat\"");
        combat.combat(weaponValue, shieldValue);
    }
}