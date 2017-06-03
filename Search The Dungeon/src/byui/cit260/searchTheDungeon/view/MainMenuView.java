/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.GameControl;
import java.util.Scanner;
import search.the.dungeon.SearchTheDungeon;

/**
 *
 * @author Gibran Millan
 */
public class MainMenuView {
    private String menu;
    private String promptMessage;
    
    public MainMenuView(){
        
        this.promptMessage = "\nPlease choose an option: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*                  MAIN MENU                  *"
                  +"\n***********************************************"
                  +"\n* N - Start new game                          *"
                  +"\n* G - Get and start saved game                *"
                  +"\n* H - Get help on how to play the game        *"
                  +"\n* S - Save Game                               *"
                  +"\n* Q - Quit                                    *"
                  +"\n***********************************************";
           
    }

    public void displayMainMenuView() {
       
        boolean done = false; // set flag to not done

        do {
            // prompt for and get players name
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

    private boolean doAction(String menuOption) {
       menuOption = menuOption.toUpperCase(); //convert choice to uppsercase

       switch (menuOption) {
           case "N": // create and start a new game
               this.startNewGame();
               break;
           case "G": // get and start an existing game
               this.startExistingGame();
               break;
           case "H": // display the help menu
               this.displayHelpMenu();
               break;
           case "S": // save current game
               this.saveGame();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }
    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(SearchTheDungeon.getPlayer());
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        // Display the help menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
}
