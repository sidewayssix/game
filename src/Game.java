/* Jacob Wilson, Semester Project

This will be a text based game that tells a simple story. It will include decision making, and basic combat.

The main thing that I didn't get around to adding was more than 1 enemy, I honestly wasn't sure how exactly to do this, I know I needed to create a
    second enemy object, but i wasn't sure how to go about making all the functions that controlled enemies
    trigger for both the enemies.

*/

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Player player1 = new Player(100, 100);
        Enemy enemy1 = new Enemy("Goblin",50, 5, 5);
        Items item = new Items(player1, enemy1, 0, 0);
        Combat combat = new Combat(player1, enemy1, item);

        Scanner input = new Scanner(System.in);
        int weaponValue = 0;
        int shieldValue = 0;

        System.out.println("Welcome Hero, to the city of Astavar, what is your name?");
        String playerName = input.nextLine();

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
                "\"We're all gonna die if you don't get your ass out here soon.\"" + " You hear from the other side of the door.");

        System.out.println("Press \"Enter\" to continue");
        input.nextLine();

        System.out.println("You grab a few rocks off the floor and two potions off the table just before you reach the door\n" +
                "\"Best to be prepared\"" + " You say to yourself.\n" + "Potion +2, Rock +5");
        item.setPotions(2); item.setRocks(0);

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
        
        System.out.println("After defeating the Goblin, you look down and notice the sword he has is better than yours.");
        System.out.println("Pick up Sword? (-Yes- or -No-)");
        
        String userInput = input.nextLine();
        boolean validInput = false;
        
        while (!validInput)
        if (userInput.equalsIgnoreCase("Yes")) {
            weaponValue = 15;
            System.out.println("Attack increased to 15");
            validInput = true;
        }
        //don't need to change anything if "No" is typed
        if (userInput.equalsIgnoreCase("No")) {
            validInput = true;
        }
            
        System.out.println("You look up to see that the rest of the Goblins have started to run away.\n" + 
                           "\"I guess I just scared them off, well seems my work here is done, think I'll go Finish that nap!\"\n" + 
                            "you say to no one in particular as you step back into your house and close the door.");    
        
        System.out.println("Press \"Enter\" to continue");
        input.nextLine();
                           
        System.out.println("You've beaten the current content of this Game, I hope you enjoyed the short\n" + 
                           "experience, and i hope to continue to build on this");
    }
}
