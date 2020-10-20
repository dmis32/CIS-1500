
package project.pkg2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Projecttwo {

    
    public static void main(String[] args) throws  FileNotFoundException, IOException {
       
       
        
        System.out.println("Enter CREATE if you want to create your own game"); 
        System.out.println("Enter PLAY if you want to play your own game");
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
            if(input.equalsIgnoreCase("CREATE")){
        System.out.println("Create the beginning of your game.");
            try (PrintWriter writer1 = new PrintWriter("GameIntroduction.txt")) {
                input = keyboard.nextLine();
                writer1.println(input);
            }    
            
            do{
            boolean isWounded = false;
                
        System.out.println("Create commands for the player");    
        System.out.println("You MUST create a sleep option");
                input = keyboard.nextLine();
                PrintWriter writer2 = new PrintWriter(input + ".txt");
                
        System.out.println("Is this wounding the player?");
                input = keyboard.nextLine();
            if (input.equalsIgnoreCase("Yes") && !isWounded) {
                    writer2.println("Ouch! You have been wounded!");
                    isWounded = true;
                } else {
                    writer2.println(" ");
                }
        System.out.println("Will this make the player sleep?");
                input = keyboard.nextLine();
            if (input.equalsIgnoreCase("yes") && !isWounded) {
                        writer2.println("You have slept. Your health has been restored.");
                        isWounded = false;
                                      
                }
        System.out.println("Enter what this command will do.");
                input = keyboard.nextLine();
                writer2.println(input);
                writer2.close();
            
        System.out.println("Create another command?");
                input = keyboard.nextLine();
            } while (input.equalsIgnoreCase("yes"));

        System.out.println("Please enter in the secret escape word for your game.");
            input = keyboard.nextLine();
            PrintWriter writer3 = new PrintWriter("GameEscapeWord.txt");
            writer3.println(input);
            writer3.close();
            
        System.out.println("You have finished your own game");
        
             
        
        System.out.println("If you want to play, enter PLAY");
            input = keyboard.nextLine();
        }    
            if  (input.equalsIgnoreCase("PLAY")) {
            File Intro = new File("GameIntroduction.txt");
            Scanner introReader = new Scanner(Intro);
            while (introReader.hasNext()) {
        System.out.println(introReader.nextLine());
            }
        }
        System.out.println("Enter a command.");
        System.out.println("Enter the escape word if you want to exit the game.");
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
        System.out.println("Invalid command. Try again.");
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
 

