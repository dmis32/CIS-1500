
package project.pkg3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Project3 {

    
    public static void main(String[] args) {
     
        List<powerBall> ticketsPurchased = new ArrayList<>();
        List<powerBall> winningTickets = new ArrayList<>();
        
        Scanner keyboard = new Scanner(System.in);
                 double amountWon = 0.0;
        double amountSpent = 0.0;
        final powerBall WINNER = new powerBall();
        
        System.out.println("Welcome to Gambling! This is a healthy fun game that will improve your life!");
        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("1. Purchase a possible winning ticket for only $3.00");
            System.out.println("2. See amount won");
            System.out.println("3. See amount spent");
            System.out.println("4. See losses");
            System.out.println("5. Quit playing");
            
            int userSelection = keyboard.nextInt();
            
            switch (userSelection) {
                case 1:
                    System.out.println("Enter 1 to pick your own numbers or 2 for random pick");
                    userSelection = keyboard.nextInt();
                    powerBall ticket;
                    if (userSelection == 1) {
                        int[] whiteNums = new int[5];
                        for (int index = 0; index < 5; index++) {
                            whiteNums[index] = numRange(1, 69, keyboard);
                        }
                        int redNumber = numRange(1,26, keyboard);
                        ticket = new powerBall(whiteNums, redNumber);
                    } else {
                        ticket = new powerBall();
                    }
                    amountSpent += 5.0;
                    ticketsPurchased.add(ticket);
                    double winnings = ticket.getWinnings(WINNER);
                    if (winnings > 0.0) {
                        winningTickets.add(ticket);
                        amountWon += winnings;
                        System.out.println("WOOHOO! You just won a whopping $" + winnings);
                    } else {
                        System.out.println("Sorry, you are not a winner.");
                    }
                    break;
                case 2:
                    System.out.println("Hey! You just won $" + amountWon);
                    break;
                case 3:
                    System.out.println("You've spent  $" + amountSpent);
                    break;
                case 4:
                    System.out.println("You have lost $" + (amountWon - amountSpent));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid. Try again.");     
            }         
        }
    }
    public static int numRange(int lowB, int upB, Scanner keyboard) {
        int toReturn = -1;
        
        do {
            System.out.println("Enter a number between " + lowB + " and " + upB + ".");
            toReturn = keyboard.nextInt();
            if (toReturn < lowB || toReturn > upB) {
                System.out.println("Wrong! Try again!");
            }
        } while (toReturn < lowB || toReturn > upB);
   
        return toReturn;

    }
    
    }
