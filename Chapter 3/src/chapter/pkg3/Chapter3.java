
package chapter.pkg3;

import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);
        int magicNumber = 42;
        
        System.out.println("Guess a number from 1-100");
        int guess = keyboard.nextInt();
        
        if ( guess < magicNumber ) {
            System.out.println("Too low!");
        }
        else if ( guess > magicNumber ) {
            System.out.println("Too high!");
        }
        else {
            System.out.println("You got it! You probably cheated!");
        }
        
        // essentially the same, but not forced to be mutually exclusive
        if ( guess < magicNumber ) {
            System.out.println("Too low!");
        }
        if ( guess > magicNumber ) {
            System.out.println("Too high!");
        }
        if ( guess == magicNumber ) {
            System.out.println("You got it! You probably cheated!");
        }
        
        // an example of a nested if statement
        if ( guess != magicNumber ) {
            if ( guess < magicNumber ) {
            System.out.println("Too low!");
            }
            else {
                System.out.println("Too high!");
            }
        }
        else {
            System.out.println("You got it! You probably cheated!");
        }
        
        
        // if you want to delcare first, that's ok
        // int score;
        System.out.println("Enter your percentage score as a whole number 1-100");
        int score = keyboard.nextInt();
        
        /*
        if ( score < 63 ) {
            System.out.println("F");
        }
        // can't use this math syntax - 63 <= score < 67
        // this why a chain is helpful
        if ( score < 67 && score >= 63 )
        {
            System.out.println("D");
        }
        */
        
        
        // using a chain of mutually exclusive branches
        if ( score < 63 ) {
            System.out.println("F");
        }
        else if ( score < 67 ) {
            System.out.println("D");
        }
        else if ( score < 70 ) {
            System.out.println("D+");
        } 
        else if ( score < 73 ) {
            System.out.println("C-");
        }
        else if ( score < 77 ) {
            System.out.println("C");
        }
        else if ( score < 80 ) {
            System.out.println("C+");
        }
        else if ( score < 83 ) {
            System.out.println("B-");
        }
        else if ( score < 87 ) {
            System.out.println("B");
        }
        else if ( score < 90 ) {
            System.out.println("B+");
        }
        else if ( score < 93 ) {
            System.out.println("A-");
        }
        else if ( score <= 100 ) {
            System.out.println("A");
        }
        else {
            System.out.println("Invalid score!");
        }       
        
        // gets the previous enter key from when we used nextInt()
        keyboard.nextLine();
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        
        System.out.println("Is it time for a break?");
        String timeForBreak = keyboard.nextLine();
        
        // when comparing strings, don't use == operator -  this is case sensitive!
        // to check if a string is not equal, use ! and .equals()
        if ( name.equals("Eric C") ) {
            System.out.println("Hi there Prof!");
            // nested if statement
            // use equalsIgnoreCase if you don't care about upper vs lower case
            if ( timeForBreak.equalsIgnoreCase("yes")) {
                System.out.println("Go take a break!");
            }
        }
        else {
            System.out.println("You must be new here, welcome!");
        }
        
        // TODO for Thursday - conditional operator and on
        
        
    }    
    
    }
