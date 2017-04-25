//author: Stephanie Broadwell
//lab #15
import java.util.Scanner;

/**
 * Created by broadwells on 4/24/17.
 */
public class CountriesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String dirString = "files";
        String fileString = "countries.txt";

        CountriesTextFile.createDirectory(dirString);
        CountriesTextFile.createFile(dirString, fileString);

        System.out.println("Welcome to the Countries Maintenance Application!");
        int userChoice = 0;

        Validator validInput = new Validator();
        userChoice = validInput.checkInput(scan, userChoice);

        while (userChoice != 3) {
            if (userChoice == 1) {  //calling redFromFile method to list all countries saved in countries.txt file
                CountriesTextFile.readFromFile();
                System.out.println();
                userChoice = validInput.checkInput(scan, userChoice);
            }
            else if (userChoice == 2) { //call writeToFile method to add country from user input
                scan.nextLine();
                CountriesTextFile.writeToFile(scan);
                userChoice = validInput.checkInput(scan, userChoice);
            }
            else if (userChoice == 3){  //exits the program
            }
        }
        System.out.println("Thanks for maintaining our Countries! See you next time!");
    }
}
