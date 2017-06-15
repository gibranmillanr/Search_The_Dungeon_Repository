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

public class DragonView  {
    private String promptMessage;
    
    public DragonView(){
    
    this.promptMessage = "\nWhat are two numbers whose product is 48 and sum is 14? Enter the first number, hit the Enter key, and then enter the second number. ";
    this.displayBanner();
    }
    
     private void displayBanner() {
       System.out.println(
       "\n***********************************************"
      +"\n*            The Dragon!                      *" 
      +"\n***********************************************" 
      +"\n*                                             *" 
      +"\n* Hello human, you have defeated many         *"
      +"\n* enemies but are you wise? If you            *"
      +"\n* can answer my question, I might             *"
      +"\n* decide to allow you to leave this           *"
      +"\n* room without being made into a              *"
      +"\n* toasted treat. What are two numbers         *"
      +"\n* whose product is 48 and sum is 14?          *"
      +"\n*                                             *"
      +"\n* To Quit use the number 0                    *"
      +"\n*                                             *"
      +"\n***********************************************"
       );
    }

    public void displayDragonView() {
       
        boolean done = false; // set flag to not done
        do{
           // prompt for and get numbers
           System.out.println("\n enter first number: ");
           double numberOne = this.getinput();
           System.out.println("\n enter second number: ");
           double numberTwo = this.getinput();
           double mathDragon = 0; 
           if (numberOne == 0) //User wants to quit
               return; //exit the game
           
           // do the requested action and display the next view
           done = this.doAction(numberOne,numberTwo,mathDragon);
          
        } while (!done);
        
    } 

    private double getinput() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        double value = 1; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { // loop while an invalid value is entered
            //System.out.println("\n" + this.menu);
            //System.out.println("\n" + this.promptMessage);
            
            
            value = keyboard.nextDouble(); //get next line typed on keyboard

            
            break; //end the loop
        }
        
        return value; //return the value entered
    }

    private boolean doAction(double numberOne,double numberTwo,double mathDragon) {
        double mathDrag = RiddleControl.calcDragon(numberOne,numberTwo);
        
        if (mathDrag == -1) {  //incorrect
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       Foolish human, you have lost.         *" 
        +"\n*                                             *" 
        +"\n***********************************************"
       );
       
       }

        else
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*   Well done! The numbers six and eight      *" 
        +"\n*   are the answer to my riddle.              *"
        +"\n*                                             *" 
        +"\n***********************************************"
       );    
        
        return true;
    }
    
}
