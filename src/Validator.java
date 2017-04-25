import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by broadwells on 4/24/17.
 */
public class Validator {
    public Validator() {
    }

    public int checkInput (Scanner s, int userChoice){
        //prompting for a number between 1 and 3, if input is outside of the range or a string, user will receive an
        //error message and be prompted for another entry
        boolean correct = false;
        while (!correct) {
            try {
                System.out.println("1 - See list of countries \n2 - Add country \n3 - Exit");
                userChoice = s.nextInt();
                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid entry. Please enter a number between 1 and 3.");
                    correct = false;
                }
                else {
                    correct = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid entry. Please enter a number, only.");
                correct = false;
                s.nextLine();
            }
        }
        return userChoice;
    }

}
