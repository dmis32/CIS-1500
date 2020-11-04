package pkg4th.project;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Dylan
 */
public class Project {

     private static String nums; 
   private static Scanner console = new Scanner(System.in);
    
    public static void main(String[] args) {
        
      Random x = new Random();
      
        System.out.println("Would you like to play a game of powerball? It cost $2.00 each game."); 
        String lottery = console.next(); 
        System.out.println("Will you pick your own numbers or do you want a quick pick ticket? Respond with numbers or quick"); 
        nums = console.next(); 
        String yes = null;
        if (lottery.equalsIgnoreCase(yes)) {
            power();
        }
        
        
        if (nums.equalsIgnoreCase("numbers")) {
           System.out.println("Please enter 6 numbers that obey PowerBall rules (first 5 numbers are unique and between 1 and 69 and last number between 1 and 26)");
           int i1 = console.nextInt(); 
           int i2 = console.nextInt(); 
           int i3 = console.nextInt(); 
           int i4 = console.nextInt(); 
           int i5 = console.nextInt(); 
           int i6 = console.nextInt(); 
           int[] input = new int[]{i1, i2, i3, i4, i5, i6}; 
           PowerBall power = new PowerBall(input); 
        power.run(input);          
        }
        if (nums.equals("quick")) {
            PowerBall power = new PowerBall();
            int[] choices = new int[power.getPicks().size()]; 
            for (int i = 0; i < choices.length; i++) {
                choices[i] = power.getPicks().get(i); 
            }
            power.run(choices); 
        }
    }

    private static void power() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
       
        
        }     

 
         
     
    
            
    
    
