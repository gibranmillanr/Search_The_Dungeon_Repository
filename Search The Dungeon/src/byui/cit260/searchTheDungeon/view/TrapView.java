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
 * @author Gibran Millan
 */
public class TrapView {
    
    private String menu;
    private String promptMessage; 

    public TrapView(){
        
        this.promptMessage = "\nEnter the radius, hit the Enter key, and then enter the height: ";
        
        this.menu = "\n"
                  +"***********************************************"
                  +"\n*       THERE IS A TRAP IN THIS ROOM          *"
                  +"\n***********************************************"
                  +"\n*                                             *"
                  +"\n* There is a hole on the floor! you can think *"
                  +"\n* of it as a cylinder. If the hole is too     *"
                  +"\n* big, you will fall on it and won't be able  *"
                  +"\n* to get out. If it is too small, you will    *"
                  +"\n*  get stuck on it, and you'll be trapped.    *"
                  +"\n* it, and you'll be trapped. In both cases,   *"
                  +"\n* you will instantly lose the game.           *"
                  +"\n*                                             *"
                  +"\n* You can save yourself by entering the       *"
                  +"\n* radius and the height of the hole to        *"
                  +"\n* determine its volume                        *"
                  +"\n*                                             *"
                  +"\n* 0 - to Quit use the number 0                *"
                  +"\n*                                             *"
                  +"\n***********************************************";      
    }
    
    public void displayTrapView() {
        
        boolean done = false; // set flag to not done
        do{
           System.out.println("\n" + this.menu);
           // prompt for and get players name
           System.out.println("\n enter radius: ");
           double radius = this.getinput();
           System.out.println("\n enter height: ");
           double height = this.getinput();
           double volumeOfHole = 0; 
           if (radius == 0) //User wants to quit
               return; //exit the game
           
           // do the requested action and display the next view
           done = this.doAction(radius,height,volumeOfHole);
          
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

    private boolean doAction(double radius,double height,double volumeOfHole) {
        double volumeOfH = RiddleControl.calcTrap(radius,height);
        
        if (volumeOfH < 3141.59) {  //if too small
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       It Is either too big or too small     *" 
        +"\n*  Your feet is traped! you loose the game    *" 
        +"\n***********************************************"
       );
       
       }
        else if (volumeOfH > 10602.88) {
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       It Is either too big or too small     *" 
        +"\n*   Your are traped! you loose the game       *" 
        +"\n***********************************************"
       );
        
       }
        else
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*   The hole is not too big nor too small     *" 
        +"\n*        You have escaped the trap            *" 
        +"\n***********************************************"
       );    
        
        return true;
    }
    
}
