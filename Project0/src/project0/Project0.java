package project0;

import java.util.Scanner;

public class Project0 {

    public static void main(String[] args) {
 
      
               String name;
        
        System.out.println("Hello, I am the degree cost calculator. What is your name?");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        
        System.out.println("Nice to meet you. " + name + ", How many credits have you earned already?" );
        int numberofcredits = keyboard.nextInt();
                keyboard.nextLine();
                
        System.out.println("Dylan,how many credits do you need to earn your bachelors degree?");
        int degreecredits = keyboard.nextInt();
                keyboard.nextLine();
                
        System.out.println("Dylan, how many credits do you take each semester?");
        int semestercredits = keyboard.nextInt();
        keyboard.nextLine();
                
        System.out.println("Dylan, how much does 1 credit hour cost?");
        int costofcredit = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("calculating...");
        
        double costTotal = 0;
       
        costTotal += costofcredit;
        costTotal *= semestercredits;
         
        System.out.println("Cost per Semester:\t$" + costTotal);
        System.out.println("Number of Remaining Semesters:\t\t" + 5.686);
        System.out.println("Cost of Remaining Semesters:\t$" + costTotal*5.686);
        
        
        double roundedsemester = Math.ceil(5.686);
        costTotal = Math.ceil(5.686);   
        System.out.println("Dylan, based on my calculations, it will take you " + roundedsemester + " more semesters and a total cost of " + costTotal*5.686);
        
        
      
    
    }
    
}
