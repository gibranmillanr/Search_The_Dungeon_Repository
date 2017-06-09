/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.GameControl;
import byui.cit260.searchTheDungeon.model.Player;
import java.util.Scanner;


/**
 *
 * @author pauldarr
 */
public class PlayerView {
    private String menu;
    private String promptMessage;
    
    public PlayerView(){
        
        this.promptMessage = "\nPlease choose an option: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*          Player Information                 *"
                  +"\n***********************************************"
                  +"\n* N - Display player name                     *"
                  +"\n* T - Display best time                       *"
                  +"\n* P - Display Power level                     *"
                  +"\n* Q - Quit                                    *"
                  +"\n***********************************************";
           
    }

    public void displayPlayerView() {
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
           case "N": // Name
               this.displayName();
               break;
           case "T": // Best time
               this.displayTime();
               break;
           case "P": // How to explore a room
               this.displayPowerLevel();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }
    private void displayName() {
        System.out.println("\n player.getName()");
    }

    private void displayTime() {
        System.out.println("\n Display Time");
    }

    
    private void displayPowerLevel() {
        System.out.println("\n Display Power Level");
    }
}

