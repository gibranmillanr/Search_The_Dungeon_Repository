/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.FairiesControl;
import java.util.Scanner;

/**
 *
 * @author Les and Sue
 */
public class FairiesView {
        private String promptMessage;
    
    public FairiesView() {
    
    this.promptMessage = "\nHow many rooms have you explored so far? (enter 0 to quit) ";
    // display the banner when view is created
    this.displayBanner();
    }

    private void displayBanner() {
       System.out.println(
       "\n***********************************************"
      +"\n*                                             *" 
      +"\n*             The Fairies!                    *" 
      +"\n*                                             *" 
      +"\n* Hello traveler! We are fairies, lots of     *"
      +"\n* fairies! We might look like tiny winged     *"
      +"\n* humans, but we are not. We are mythical,    *"
      +"\n* Metaphysical, and magical tree spirits!     *"
      +"\n*                                             *"
      +"\n* We love and reward hardworking travelers    *"
      +"\n* and hate and curse lazy travellers!         *"
      +"\n***********************************************"
       );
    }

    public void displayFairiesView() {
        
        boolean done = false; // set flag to not done
        do{
           // prompt for and get players name
           int numberRooms = this.getNumberRooms();
           if (numberRooms == 0) //User wants to quit
               return; //exit the game
           
           // do the requested action and display the next view
           done = this.doAction(numberRooms);
           numberRooms = 0;
        } while (!done);
    }

    private int getNumberRooms() {
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

    private boolean doAction(int numberRooms) {
        if (numberRooms > 26) {
            System.out.println("\n There are only so many rooms! Try again!");
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
