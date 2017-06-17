/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

/**
 *
 * @author Les and Sue
 */
public class WinGameView extends View{
    private String banner;
    
    public WinGameView() {
        
        super ("\nEnter N to start a New Game, or E to Exit the Game: ");
        
        this.banner = "\n"
        +"\n***********************************************"
        +"\n*            The BLACK Dragon!                *" 
        +"\n***********************************************" 
        +"\n*                                             *" 
        +"\n* CONGRATULATIONS! You have successfully      *"
        +"\n* defeated the dreaded Black Dragon!          *"
        +"\n* You have conquered the Dungeon!             *"
        +"\n* What are you going to do now?               *"
        +"\n*                                             *"
        +"\n***********************************************";
       
       
       this.displayBanner();
    }
    
    private void displayBanner() {   
        System.out.println("\n" + this.banner);
    }
    
 @Override
 public boolean doAction(String choice) {
    choice = choice.toUpperCase(); //convert choice to uppsercase
    
    switch (choice) {
        case "E": // Exit the game
            System.exit(0);
            break;
        case "N": // Starting a new game
            // start a new game
            StartProgramView();
            break;
        default:
            return false;
        }
    return false;
    }

    private void StartProgramView() {
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
    }
}
