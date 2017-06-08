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
    private String menu;
    private String promptMessage;
    
    public GameMenuView(){
        
        this.promptMessage = "\nPlease choose an option: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*                  GAME MENU                  *"
                  +"\n***********************************************"
                  +"\n* M - Move                                    *"
                  +"\n* I - View Inventory                          *"
                  +"\n* H - Get help on how to play the game        *"
                  +"\n* F - Fight Menu                              *"                
                  +"\n* Q - Quit                                    *"
                  +"\n***********************************************";
           
    }

    void displayMenu() {
       
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
           case "M": // Move
               this.movePlayer();
               break;
           case "I": // view inventory
               this.viewinventory();
               break;
           case "H": // display the help menu
               this.displayHelpMenu();
               break;
           case "F": // fight menu
               this.displayFightMenu();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }

    private void movePlayer() {
        System.out.println("*** Player wants to move ***");
    }

    private void viewinventory() {
        System.out.println("*** Player wants to see his inventory ***");
    }

    private void displayHelpMenu() {
        // calls the Main Help Menu
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayHelpMenuView();
    }

    private void displayFightMenu() {
        FightMenuView fightMenu = new FightMenuView();
        fightMenu.displayFightMenuView();
    }
}