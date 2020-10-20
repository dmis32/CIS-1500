package project.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ProjectTwo {

   
    public static void main(String[] args) throws IOException,FileNotFoundException {
       
        System.out.println("Enter CREATE if you want to create your own game"); 
        System.out.println("Enter PLAY if you want to play your own game");
        
        
        Scanner keyboard = new Scanner(System.in);
        String CREATE = keyboard.nextLine();
        if (CREATE.equalsIgnoreCase(CREATE)) 
            System.out.println("Create a Start for your game");  
            File file1 = new File("GameIntroduction.txt");
            PrintWriter writer1 = new PrintWriter("GameIntroduction.txt");
            String input = keyboard.nextLine();
            writer1.close();
            
     
            
        
            
       
        
        
    }
    
}

