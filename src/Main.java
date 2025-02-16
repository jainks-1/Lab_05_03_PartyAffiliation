// Kaden Jain
// Computer Programming 1 - Spring 2025
/* (This task uses Strings:) A program that prompts
the user for their party affiliation (Democrat, Republican,
or Independent) they respond with the first letter, and the
program responds accordingly with a Donkey, Elephant, Person,
or Other. (i.e. "You get a Democratic Donkey.")

Notes: create a menu so the user chooses D, R, or I and assume
that any other choice will be Other.
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // declare variables
        Scanner in = new Scanner(System.in);
        String userParty = "";

        // get input
        System.out.println("D-Democrat\t R-Republican\t I-Independent\t \nPlease Enter your party affiliation: ");
        // in.hasNext();
        userParty = in.next();
        in.nextLine();

            // determine party affiliation if/else
            if (userParty.equalsIgnoreCase("D")){

                System.out.println("You get a Democratic donkey!");

            }
            else if (userParty.equalsIgnoreCase("R")) {

                System.out.println("You get a Republican elephant!");

            }
            else if (userParty.equalsIgnoreCase("I")) {

                System.out.println("You are an Independent person!");

            }
            else {

                System.out.println("You chose an 'other' party. You get a thumbs up.");

            }
    }
}