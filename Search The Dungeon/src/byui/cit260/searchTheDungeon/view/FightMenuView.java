/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.FightControl;
import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Player;
import search.the.dungeon.SearchTheDungeon;
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
           case "A": // Player Chose to Fight
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
        Player player=SearchTheDungeon.getPlayer();
        Actor tempActor = new Actor();
        tempActor.powerLevel = 12;
        boolean winFight = FightControl.winFight(player, tempActor);
        if (!winFight) {
            System.out.println("\n You’ve lost the game!");
        }
        else {
            System.out.println("\n You WON! The room has been cleared!");
        }
    }

    @SuppressWarnings("UnusedAssignment")
    private void displayRun() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\nAre you sure you want to Run Away? (Y or N): ");
        String verifyRunAway = keyboard.nextLine();
        verifyRunAway = verifyRunAway.toUpperCase();
        if ("Y".equals(verifyRunAway)) {
            GameMenuView.gameMenuView();
        }
        else displayFight();
    }
}
