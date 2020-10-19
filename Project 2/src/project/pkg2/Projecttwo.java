
package project.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Projecttwo {

    
    public static void main(String[] args) throws  FileNotFoundException, IOException {
       
        System.out.println("Hello! Welcome to the build your own game!");
        System.out.println("Would you like to play or create?");
        System.out.println("Enter 'Play' to play or 'create' to create.");
        
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        if(input.equalsIgnoreCase("create")){}
        System.out.println("Create the beginning of your game.");
            try (PrintWriter writer1 = new PrintWriter("GameIntroduction.txt")) {
                input = keyboard.nextLine();
                writer1.println(input);
            }    
            
            do{
        System.out.println("Create commands for the player to have, for example, wound.");    
        System.out.println("You MUST create a command to heal the player");
                input = keyboard.nextLine();
                PrintWriter writer2 = new PrintWriter(input + ".txt");
        System.out.println("Is this command wounding the player?");
                input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Yes")) {
                    writer2.println("Ouch! You have been wounded!");
                } else {
                    writer2.println(" ");
                }
        System.out.println("Is this command healing the player?");
                input = keyboard.nextLine();
                if (input.equalsIgnoreCase("yes")) {
                                writer2.println("You have been healed. Your health has been restored.");
                }
        System.out.println("Enter what this command will do.");
                input = keyboard.nextLine();
                writer2.println(input);
                writer2.close();
            
        System.out.println("Would you like to create another command?");
                input = keyboard.nextLine();
            } while (input.equalsIgnoreCase("yes"));

        System.out.println("Please enter in the secret escape word for your game.");
            input = keyboard.nextLine();
            PrintWriter writer3 = new PrintWriter("GameEscapeWord.txt");
            writer3.println(input);
            writer3.close();
            System.out.println("Congratulations! You have finished your game!");
            System.out.println("Would you like to play it? If so, press 'O.'");
            input = keyboard.nextLine();
            
        if  (input.equalsIgnoreCase("O")) {
            File Intro = new File("GameIntroduction.txt");
            Scanner introReader = new Scanner(Intro);
            while (introReader.hasNext()) {
                System.out.println(introReader.nextLine());
            }
        }
     System.out.println("Please enter a command.");
            System.out.println("Press 'X' when you want to enter the escape word.");
             while (input.equalsIgnoreCase(input)) {
                input = keyboard.nextLine();
                File nextCommand = new File(input + ".txt");
                FileWriter trackWriter = new FileWriter("commandTracker.txt", true);
                PrintWriter trackFile = new PrintWriter(trackWriter);
                trackFile.println(input);
                if (nextCommand.exists()) {
                    Scanner nextCommandReader = new Scanner(nextCommand);
                    while (nextCommandReader.hasNext()) {
                        System.out.println(nextCommandReader.nextLine());
                    }
                    trackWriter.close();
                }

                while (!nextCommand.exists()) {
                    System.out.println("That is an invalid command. Please try again.");
                    input = keyboard.nextLine();
                    File tryAgain = new File(input + ".txt");
                    if (tryAgain.exists()) {
                        FileWriter nonErrorCommands = new FileWriter("commandTracker.txt", true);
                        PrintWriter tracker = new PrintWriter(nonErrorCommands);
                        tracker.println(input);
                        tracker.close();
                        Scanner tryAgainReader = new Scanner(tryAgain);
                        while (tryAgainReader.hasNext()) {
                            System.out.println(tryAgainReader.nextLine());
                        }
                        break;
                    }
                }
             }
    

    }
    }
 

