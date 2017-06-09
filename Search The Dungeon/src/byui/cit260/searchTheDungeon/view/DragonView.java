/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.RiddleControl;
import java.util.Scanner;

/**
 *
 * @author Paul Darr
 */
public class DragonView {
        private String promptMessage;
    
    public DragonView() {
    
    this.promptMessage = "\nWhat are two numbers whose product is 48 and sum is 14? (enter 0 to quit) ";
    // display the banner when view is created
    this.displayBanner();
    }

    private void displayBanner() {
       System.out.println(
       "\n***********************************************"
      +"\n*                                             *" 
      +"\n*             The Dragon!                    *" 
      +"\n*                                             *" 
      +"\n* Hello human, you have defeated many         *"
      +"\n* enemies but are you wise? If you            *"
      +"\n* can answer my question, I might             *"
      +"\n* decide to allow you to leave this           *"
      +"\n* room without being made into a              *"
      +"\n* toasted treat. What are two numbers         *"
      +"\n* whose product is 48 and sum is 14?          *"
      +"\n***********************************************"
       );
    }

    public void displayDragonView() {
        
        boolean done = false; // set flag to not done
        do{
           // prompt for and get integers
           int numberOne = this.getNumberOne();
           if (numberOne == 0) //User wants to quit
               return; //exit the game
           
           // do the requested action and display the next view
           done = this.doAction(numberOne);
           numberOne = 0;
        } while (!done);
    }

    private int getNumberOne() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        int value = 0; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);
            
            value = keyboard.nextInt(); //get next line typed on keyboard

            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(int numberOne) {
        if (numberOne > 8) {
            System.out.println("\n That is too high of a number, try again");
            return false;
        }
       // call checkRooms() control function
       boolean half = FairiesControl.checkRooms(numberRooms);
       
       if (!half) {  //if usuccessful
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*            Less than HALF?                  *" 
        +"\n*                                             *" 
        +"\n* You are one lazy traveller! You still have  *"
        +"\n* so much to explore and learn! You have      *"
        +"\n* brought upon yourself the 'Weak Item'       *"
        +"\n* damnation! NOW GET OUT OF OUR ROOM!         *"
        +"\n***********************************************"
       );
       }
       else {
        System.out.println(
            "\n***********************************************"
            +"\n*                                             *" 
            +"\n*             Over HALF!                      *" 
            +"\n*                                             *" 
            +"\n* You have found grace in our sight,          *"
            +"\n* traveller! You have explored more than half *"
            +"\n* of this dungeon. You are definately one     *"
            +"\n* hard worker! Accept this powerful item      *"
            +"\n* as a gift to you.                           *"
            +"\n* Now go and continue exploring!              *"
            +"\n***********************************************"
            );
       }
       return true; // success!
    }
}