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
public class FightMenuView {
    private String menu;
    private String promptMessage;
    
    public FightMenuView(){
        
        this.promptMessage = "\nWhat do we do? ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*                FIGHT MENU                 *"
                  +"\n*********************************************"
                  +"\n* A - Attack                                *"
                  +"\n* R - Run Away                              *"
                  +"\n* Q - Quit                                  *"
                  +"\n*********************************************";
           
    }

    public void displayFightMenuView() {
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
                System.out.println("\nInvalid option. Either fight or retreat!");
                continue;
            }
            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(String choice) {
       choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "F": // Player Chose to Fight
               this.displayFight();
               break;
           case "R": // Run Away
               this.displayRun();
               break;
           default:
               System.out.println("\n***Invalid option. Either fight or retreat!");
               break;
       }
       return false;
    }
    private void displayFight() {
        System.out.println("*** Player chose to fight ***");
    }

    private void displayRun() {
        System.out.println("*** Player chose to Run ***");
    }
}
