package project0;

import java.util.Scanner;

public class Project0 {

    public static void main(String[] args) {
               String name;
        
        System.out.println("Hello, I am the degree cost calculator. What is your name?");
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.nextLine();
        
        System.out.println("My name is " + name + ". nice to meet you" );
    }
    
}
