/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.RiddleControl;

/**
 *
 * @author Les and Sue
 */
public class FairiesView extends View{    
    private String banner;
    
    public FairiesView() {
    
      super("\nHow many rooms have you explored so far? (enter 0 to quit) ");
              
      this.banner = "\n"
      +"\n***********************************************"
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
      +"\n***********************************************";    
    
    this.displayBanner();
    }
    private void displayBanner() {
        
        System.out.println("\n" + this.banner);
    }

//    private int getNumberRooms() {
//        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//        int value = 0; //value to be returned
//        boolean valid = false; //initialize to not valid
//        
//        while (!valid) { // loop while an invalid value is entered
//            System.out.println("\n" + this.banner);        
//            value = keyboard.nextInt(); //get next line typed on keyboard
//            break; //end the loop
//        }
//        
//        return value; //return the value entered
//    }
    
    @Override
    public boolean doAction(String value) {
        String numberRoomsRaw = getInput();
        int numberRooms = 0;
        try{
        numberRooms = Integer.parseInt(numberRoomsRaw);
        
        } catch (NumberFormatException nf) {
              System.out.println("\n You must enter a valid number." 
                      + "Try again or enter Q to quit");
          
        }
        
        if (numberRooms > 26) {
            System.out.println("\n There are only so many rooms! Try again!");
            return false;
        }
       // call checkRooms() control function
       boolean half = RiddleControl.calcFairies(numberRooms);
       
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