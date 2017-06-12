/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import java.util.Scanner;

/**
 *
 * @author Les and Sue
 */
public class GameMenuView {

    static void gameMenuView() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String menu;
    private String promptMessage; 

    public GameMenuView(){
        
        this.promptMessage = "\nPlease choose an option: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*                  GAME MENU                  *"
                  +"\n***********************************************"
                  +"\n*                                             *"
                  +"\n* You have entered the dungeon! it is cold    *"
                  +"\n* and dark. You should hurry and explore a    *"
                  +"\n* new room. you can take a look at your       *"
                  +"\n* items too.                                  *"
                  +"\n* What will you do now?                       *"
                  +"\n*                                             *"
                  +"\n* M - Go to the map and choose a room         *"
                  +"\n* I - Review the items in your inventory      *"
                  +"\n* S - Save your current game                  *"
                  +"\n* Q - Quit                                    *"
                  +"\n*                                             *"
                  +"\n* The following options do not belong in this *"
                  +"\n*  menu and will be removed later             *"
                  +"\n*                                             *"
                  +"\n* F - Fight Menu                              *"
                  +"\n* P - Player menu                             *"
                  +"\n* C - Fairies control                         *"
                  +"\n* T - Trap Control                            *"
                  +"\n* D - Dragon Control                          *"
                  +"\n***********************************************";      
    }
    
    public void displayGameMenuView() {
        boolean done = false; // set flag to not done
        do {
            // Get menu option
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))  // user wants to quit
                return; // exit the game

            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.menu); // promptMessage in assignment
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "M": // Go to the map and choose a room
               this.displayMap();
               break;
           case "I": // Review the items in your inventory  
               this.displayInventory();
               break;
           case "S": // Save your current game 
               this.saveGame();
               break;
           case "C": // Fairie Control
               this.displayFarieControl();
               break;
           case "F": // fight menu
               this.displayFightMenu();
               break;
           case "P": // Player View
               this.displayPlayerView();
               break;
           case "T": // Trap View
               this.displayTrapView();
               break;
           case "D": // Dragon View
               this.displayDragonView();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }

    private void displayMap() {
        System.out.println("*** displayMap function called ***");
    }

    private void displayInventory() {
        System.out.println("*** displayInventory function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayFarieControl() {
       FairiesView fairiesView = new FairiesView();
        fairiesView.displayFairiesView();
    }

    private void displayFightMenu() {
       FightMenuView fightMenu = new FightMenuView();
        fightMenu.displayFightMenuView();
    }

    private void displayPlayerView() {
      PlayerView playerView = new PlayerView();
        playerView.displayPlayerView();
    }

    private void displayTrapView() {
       TrapView trapView = new TrapView();
        trapView.displayTrapView();  
    }
    
    private void displayDragonView() {
       DragonView dragonView = new DragonView();
        dragonView.displayDragonView();  
    }
}
