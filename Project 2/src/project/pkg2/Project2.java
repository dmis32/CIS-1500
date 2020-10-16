
package project.pkg2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class Project2 {

    
    public static void main(String[] args) throws fileNotFound, FileNotFoundException {
 
        System.out.println("Hello! Welcome to the build your own game!");
        System.out.println("Would you like to play or create?");
        System.out.println("Enter 'Play' to play or 'create' to create.");
        
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        if(input.equalsIgnoreCase("create")){
        System.out.println("Create the beginning of your game.");
            PrintWriter writer1 = new PrintWriter("GameIntroduction.txt");
            input = keyboard.nextLine();
            writer1.println(input);
            writer1.close();    
        
            do{
                System.out.println("Create commands for the player to have, for example, wound.");    
                System.out.println("You MUST create a command to heal the player");
                input = keyboard.nextLine();
                PrintWriter writer 2 = new PrintWriter(input + ".txt");
                System.out.println("Does this command wound the player?");
            
        
        
        
        
        
        
           
        
    
    
    
    public static void createGameEscapeWordFile()
    {
        
    }
    
    public static void createSingleCommandFile(String commandName)
    {
        // When creating a command, ask if user if this command will wound the player, 
        //  if the answer is yes, write the first line of file as WOUNDED or some similar trigger. 
        //  If the answer is no, write an empty line.

    }
    
    public static void createGameCommandFiles()
    {
        // FIX ME
        String command = "";
        while ( !command.equalsIgnoreCase("quitCreateMode") )
        {
           createSingleCommandFile(command); 
        }
    }
    
    public static void createGameIntroFile()
    {
          
  

            
        
    }

    private static class fileNotFound extends Exception {

        public fileNotFound() {
        }
    }
    
}
