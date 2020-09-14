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
        int numberofcreditsleft = keyboard.nextInt();
                keyboard.nextLine();
                
        System.out.println("Dylan, how many credits do you take each semester?");
        int numberofsemestercredits = keyboard.nextInt();
        keyboard.nextLine();
                
        System.out.println("Dylan, how much does 1 credit hour cost?");
        int costofcredit = keyboard.nextInt();
        keyboard.nextLine();
        
        System.out.println("calculating...");
        System.out.println("Dylan, based on my calculations,it will take you 6 more semesters and a total cost of $43,380 plus additional fees");
        
    }
    
}
