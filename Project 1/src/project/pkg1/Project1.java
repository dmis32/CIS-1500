package project.pkg1;

import java.util.Random;
import java.util.Scanner;


public class Project1 {

    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        
        
        System.out.println("---------------------------------------------");
            
        int enemyHealth = rand.nextInt(fullEnemyHealth);
        String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("A wild"  + enemy +  "appeared!");
            
           
            while(enemyHealth > 0) {
                System.out.println("\tYour HP" + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Punch");
                System.out.println("\t2. Kick");
                System.out.println("\t3. Sleep");
                System.out.println("\t4. Run");
        
        
    }
    
}
