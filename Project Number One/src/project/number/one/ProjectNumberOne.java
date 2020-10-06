package project.number.one;

import java.util.Random;
import java.util.Scanner;

public class ProjectNumberOne {

 
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
                    
                    if(health < 1) {
                        System.out.println("\t> You have taken too much damage. You have been defeated.");
                        break;
                    }
                    
            }
                else if(input.equals("2")) {
                     int damageGiven = kickDamage;
                int damageTaken =  enemyAttack;
                        
                  enemyHealth -= damageGiven;
                  health -= damageTaken;
                  
                    System.out.println("\t> You punched the " + enemy + " for " + damageGiven + " damage.");
                    System.out.println("\t> You recieved " + damageTaken + " damage from retaliation");
                    
                    if(health < 1) {
                        System.out.println("\t> You have taken too much damage. You have been defeated.");
                        break;
                    }
                    
                }
                
                else if(input.equals("3")) {
                    if(sleepHeal > 0) {
                     health+=  sleepHealAmount;
                     sleepHeal--;
                        System.out.println("You slept and regained your health back to " + health + ".");
                        System.out.println("You now have " + sleepHeal + " remaining.");
                        
                    }
                    else {
                        System.out.println("You can't sleep anymore! You will havae to fight!");
                    }
                }  
                
                else if(input.equals("4")) {
                    System.out.println("\tYou ran away from the " + enemy + ".");
                    continue GAME;  
                }
                else {
                    System.out.println("\tInvalid Command!");
                }
            }
          if(health < 1) {
              System.out.println("You have moved on to the next part of the forest");
              break;
          }
          
            System.out.println("---------------------------------------------");
            System.out.println("The " + enemy + " was defeated!");
            System.out.println("You now have " + health + " HP");
            System.out.println("");
            
            System.out.println("---------------------------------------------");
            System.out.println("Which direction of the forest would you like to go now?");
            System.out.println("1. North");
            System.out.println("2. South");
            System.out.println("3. East");
            System.out.println("4. West");
            System.out.println("5. Exit");
            
            String input = keyboard.nextLine();
            
            while(!input.equals("1") && !input.equals("2") && !input.equals("3") && !input.equals("4") && !input.equals("5")) {
                System.out.println("Invalid command!"); 
                input = keyboard.nextLine();
       
               }
           
            if(input.equals("1")) {
                System.out.println("\tYou went North");
            }
           else if(input.equals("2")) {
                System.out.println("\tYou went South");
           }
           else if(input.equals("3")) {
                System.out.println("\tYou went East");
           }
           else if(input.equals("4")) {
                System.out.println("\tYou went West"); 
           }
           else if(input.equals("5")) {
                System.out.println("\tYou Have exited the forest. A successful adventure.");
                
                break;
           }
           
        }
            
        System.out.println("\tThank you for playing!");
          
       
        
    }
    
}
