package project.one1;

import java.util.Random;
import java.util.Scanner;

public class PROJECTONE1 {

    public static void main(String[] args) {
    
          Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        String[] enemies = {"Bear", "Cougar", "Mountain Lion"};
        int fullEnemyHealth  = 75;
        int enemyAttack = 25; 
        
        int health = 100;
        int punchDamage = 50;
        int kickDamage = 40;
        int sleepHeal = 2;
        int sleepHealAmount = 100;
        
        boolean running = true;
        
        System.out.println("Greetings! Welcome to the Forest Adventure!");
        
        GAME:
        while(running){
            System.out.println("---------------------------------------------");
            
             int enemyHealth = rand.nextInt(fullEnemyHealth);
        String enemy = enemies[rand.nextInt(enemies.length)];
            System.out.println("A wild "  + enemy +  " appeared!");
            
            while(enemyHealth > 0) {
                 System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Punch");
                System.out.println("\t2. Kick");
                System.out.println("\t3. Sleep");
                System.out.println("\t4. Run");
                
                String input = keyboard.nextLine();
                if(input.equals("1")) {
                int damageGiven = punchDamage;
                int damageTaken =  enemyAttack;
                        
                  enemyHealth -= damageGiven;
                  health -= damageTaken;
                  
                    System.out.println("\t> You punched the " + enemy + " for " + damageGiven + " damage.");
                    System.out.println("\t> You recieved " + damageTaken + " damage from retaliation");
            }
                
                
                
                
            }
            
            
        }
            
        
          
       
        
    }
    
}
