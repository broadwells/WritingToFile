/**
 * Created by broadwells on 4/24/17.
 */
import java.nio.file.*;
import java.io.*;
import java.util.Scanner;

public class CountriesTextFile {
    public static void createDirectory(String dirString) {
        Path dirPath = Paths.get(dirString);

        if (Files.notExists(dirPath)) {
            try {
                Files.createDirectories(dirPath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }
        }
    }

    public static void createFile(String dirString, String fileString) {
        Path filePath = Paths.get(dirString, fileString);
        if (Files.notExists(filePath)){
            try {
                Files.createFile(filePath);
            } catch (IOException e) {
                System.out.println("There was an error: " + e);
            }
        }
    }

    public static void writeToFile(Scanner s) {
        System.out.println("Please enter name of Country: ");
        String newCountry = s.nextLine();
        System.out.println("This country has been saved!");

        Country nameCountry = new Country(newCountry);
        Path textPath = Paths.get("files/countries.txt");
        File textFiles = textPath.toFile();

        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(textFiles, true));
            out.println(nameCountry.toString());
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void readFromFile() {
        Path filePath = Paths.get("files/countries.txt");
        File textFile = filePath.toFile();
        try {
            FileReader r = new FileReader(textFile);
            BufferedReader reader = new BufferedReader(r);
            try {
                String line = reader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = reader.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
