/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import java.util.Scanner;

/**
 *
 * @author Paul Darr
 */

public class HelpMenuView {
    private String menu;
    private String promptMessage;
    
    public HelpMenuView(){
        
        this.promptMessage = "\nPlease choose an option: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*                   HELP MENU                 *"
                  +"\n***********************************************"
                  +"\n* G - What is the goal of the game?           *"
                  +"\n* M - How to move to a new room?              *"
                  +"\n* E - How to Explore a room?                  *"
                  +"\n* V - How to view gear in inventory?          *"
                  +"\n* A - How to add gear to inventory?           *"
                  +"\n* F - Fighting enemies                        *"
                  +"\n* I - Game interactions                       *"
                  +"\n* Q - Quit                                    *"
                  +"\n***********************************************";
           
    }

    public void displayHelpMenuView() {
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
           case "G": // What is the goal of the game?
               this.displayGame();
               break;
           case "M": // How to move to a new room
               this.displayMove();
               break;
           case "E": // How to explore a room
               this.displayExplore();
               break;
           case "V": // How to view gear in inventory
               this.displayView();
               break;
           case "A": // How to add gear to inventory
               this.displayAdd();
               break;
           case "F": // Fighting enemies
               this.displayFight();
               break;
           case "I": // Game interactions
               this.displayInteractions();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }
    private void displayGame() {
        System.out.println("*** What is the goal of the game? ***");
    }

    private void displayMove() {
        System.out.println("\n*** How to move to a new room ***");
    }

    private void displayExplore() {
        System.out.println("\n*** How to explore a room ***");
    }

    private void displayView() {
        System.out.println("\n*** How to view gear in inventory ***");
    }

    private void displayAdd() {
        System.out.println("\n*** How to add gear to inventory ***");
    }
    
    private void displayFight() {
        System.out.println("\n*** Fighting enemies ***");
    }
    
    private void displayInteractions() {
        System.out.println("\n*** Game interactions ***");
    }
}
