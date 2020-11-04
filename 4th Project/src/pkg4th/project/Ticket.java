
package pkg4th.project;

import java.util.List;

public abstract class Ticket {
      private String name;
    private int ticketNumber;
    private List<Integer> picks;
    private int numVals;
    private int maxVal;

    public Ticket(String name, int numVals, int maxVal, int number) {
        ticketNumber++; 
        this.name = name;
        this.maxVal = maxVal;
        this.numVals = numVals;
        for (int input = 1; input <= numVals; input++)
            picks.add(pickUniqueVal());
        this.ticketNumber = number; 
        

    }

    public Ticket(String name, int numVals, int maxVal, int[] choices, int number) {
        ticketNumber++; 
        this.name = name;
        this.maxVal = maxVal;
        this.numVals = numVals;
        for (int input = 0; input < numVals; input++) {
         picks.add(choices[input]);
        }
       
        this.ticketNumber = number;
    }

   
    
    private int pickUniqueVal() {
        
        int val = (int)(Math.random() * maxVal) + 1; // 1..maxVal
        while (picks.contains(val))
            val = (int)(Math.random() * maxVal) + 1;
        return val;
        
    }
    public boolean grandPrizeWinner(Ticket winningTicket) {
   
        for (int input = 0; input < numVals; input++) {
            if (!(winningTicket.picks.contains(picks.get(input)))) {
                return false; 
            }
        }
        return true; 
    }

    public String getName() {
        return name;
    }
    
    public String toString() {
        return "ticket number " + ticketNumber + ", #s  " + picks.toString();
    }

    public int getTicketNumber() {
        return ticketNumber;
    }
    
    public List<Integer> getPicks() {
        return picks; 
    }
 
    public abstract double  ticketsSold();
}
