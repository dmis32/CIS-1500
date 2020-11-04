
package project.pkg3;

import java.util.Random;


public class powerBall {
    
    private final double GRAND_PRIZE = 100000000000.0;
    private int[] whiteNumbers;
    private int[] whiteBalls;
    private int redBall;
  
    public powerBall(){
        Random rng = new Random();
        whiteBalls = new int[5];  
        for (int index = 0; index < 5; index++){
            boolean keepGoing = true;
            int candidate = -1;
            while(keepGoing) {
                boolean anyMatch = false;
                candidate = rng.nextInt(69) + 1;
                for (int j = 0; j < index; j++) {
                    if (candidate == whiteBalls[j]) {
                        anyMatch = true;
                    }
                }
                if (!anyMatch) {
                    keepGoing = false;
                }
            }
            whiteBalls[index] = candidate;
        }        
        redBall = rng.nextInt(26) + 1;
    }
    public powerBall(int[] whiteBalls, int redNumber){
        if (whiteBalls.length != 5){
           throw new IllegalArgumentException("5 numbers must be passed in for the white numbers");
        }     
        for (int index = 0; index < 5; index++) {
            if (whiteBalls[index] < 1 || whiteBalls[index] > 69) {
                throw new IllegalArgumentException("Invalid white number: " + whiteBalls[index]);
            }
        }      
        if (redBall < 1 || redBall > 26) {
            
        }    
        this.whiteBalls = whiteBalls;
        this.redBall = redBall;
    }  
    public double getWinnings(powerBall winningTicket) {
        int whiteMatches = 0;
         int whiteBallMatch = 0;
        for (int whiteNum : whiteBalls) {
            if (winningTicket.hasWhiteNumber(whiteNum)){
                whiteBallMatch++;
            }
        }
        boolean redMatches = redBall == winningTicket.getRedBall();       
        double toReturn = 0.0;        
        if (redMatches) {
            switch (whiteBallMatch) {
                case 0:
                case 1:
                    toReturn = 4.0;
                    break;
                case 2:
                    toReturn = 7.0;
                    break;
                case 3:
                    toReturn = 100.0;
                    break;
                case 4:
                    toReturn = 50000.0;
                    break;
                case 5:
                    toReturn = 1000000.0;
                    break;
                case 6:
                    toReturn = GRAND_PRIZE;
                    break;    
                default:
                    toReturn = 0.0;
                    break;
            }
        } else {
            switch (whiteMatches) {
                case 3:
                    toReturn = 7.0;
                    break;
                case 4:
                    toReturn = 100.0;
                    break;
                case 5:
                    toReturn = 1000000;
                    break;
                default:
                    toReturn = 0.0;
                    break;
            }
        }    
        return toReturn;
    }
    public int[] getWhiteBalls() {
        return this.whiteBalls;
    }  
    public double getRedBall() {
        return this.redBall;
    }
    public boolean hasWhiteNumber(int num) {
        boolean toReturn = false;
        for (int whiteBalls : whiteBalls) {
            if (whiteBalls == num) {
                toReturn = true;
                break;
            }
        }
        return toReturn;
    }
    public String toString() {
        String toReturn = "";
        toReturn += "WHITE BALLS: ";
        for (int whiteNumber : whiteBalls) {
            toReturn += whiteNumber + " ";
        }
        toReturn += "\nPOWERFUL BALL: " + redBall;      
        return toReturn;
    }
}
