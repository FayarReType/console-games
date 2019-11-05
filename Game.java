package Game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author fayarretype.com
 */
public class Game {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        
        ModelContainer mc = ModelContainer.create();
        BaseModel pComputerM, pUserM;
        int rndNumber, uSelection;
       
        while (Player.Computer.score != 3 && Player.User.score != 3) {
            
            rndNumber = rnd.nextInt(3) + 1;
            pComputerM = mc.getModel(rndNumber);
        
            System.out.println("Stone(1), Paper(2), Scissors(3) select...");
            uSelection = scn.nextInt();
            pUserM = mc.getModel(uSelection);
            
            System.out.println("Computer selection : " +
                    pComputerM.getNameValue());  
            System.out.println("User selection : " +
                    pUserM.getNameValue());
        
            if (Comparison.Compare(pComputerM.getName()) == pUserM.getName())
                Player.Computer.score++;
            if (Comparison.Compare(pUserM.getName()) == pComputerM.getName())
                Player.User.score++;
            
            System.out.println("-----Score-----\nComputer :"
                    + Player.Computer.score
                    + " - " + Player.User.score + ": You");
        }
        
        if (Player.Computer.score > Player.User.score)
            System.out.println("Computer is win");
        else System.out.println("You is win");
        
    }
    
}
