/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.control.RiddleControl;
import byui.cit260.searchTheDungeon.exceptions.RiddleControlException;
import java.util.Scanner;


/**
 *
 * @author Gibran Millan
 */
public class TrapView extends View {
    private String banner;
    

    public TrapView(){
        
        super("\nEnter the radius, hit the Enter key, and then enter the height: ");
        
        this.banner = "\n"
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
        
        this.displayBanner();
        
    }
    
    private void displayBanner() {
        
        this.console.println("\n" + this.banner);
    }
    
//    public void displayTrapView() {
//        
//        boolean done = false; // set flag to not done
//        do{
//           this.console.println("\n" + this.menu);
//           // prompt for and get players name
//           this.console.println("\n enter radius: ");
//           double radius = this.getinput();
//           this.console.println("\n enter height: ");
//           double height = this.getinput();
//           double volumeOfHole = 0; 
//           if (radius == 0) //User wants to quit
//               return; //exit the game
//           
//           // do the requested action and display the next view
//           done = this.doAction(radius,height,volumeOfHole);
//          
//        } while (!done);
//        
//    } 
//
//    private double getinput() {
//        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
//        double value = 1; //value to be returned
//        boolean valid = false; //initialize to not valid
//        
//        while (!valid) { // loop while an invalid value is entered
//            //this.console.println("\n" + this.menu);
//            //this.console.println("\n" + this.promptMessage);
//            
//            
//            value = keyboard.nextDouble(); //get next line typed on keyboard
//
//            
//            break; //end the loop
//        }
//        
//        return value; //return the value entered
//    }

   // private boolean doAction(double radius,double height,double volumeOfHole) {
    @Override
    public boolean doAction(String value) {
        String radiusRaw = getInput();
        double radius = 0;
        try{
        radius =Double.parseDouble(radiusRaw);
        } catch (NumberFormatException nf) {
              ErrorView.display(this.getClass().getName(),"\n You must enter a valid number." 
                      + "Try again or enter Q to quit");
          
          }
        this.displayMessage="\nNow enter the height! ";
        
        String heightRaw = getInput();
        double height= 0;
        try{
        height= Double.parseDouble(heightRaw); 
        }catch (NumberFormatException nf) {
              ErrorView.display(this.getClass().getName(),"\n You must enter a valid number." 
                      + "Try again or enter Q to quit");
          
          }
        try{
        double volumeOfH = RiddleControl.calcTrap(radius,height);
        
        if (radius == 0) //User wants to quit

              return false; //exit the game
        
        if (volumeOfH < 3141.59) {  //if too small
        this.console.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       It Is either too big or too small     *" 
        +"\n*  Your feet is traped! you loose the game    *" 
        +"\n***********************************************");
        
        this.displayLoseGameView();
       }
        else if (volumeOfH > 10602.88) {
        this.console.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       It Is either too big or too small     *" 
        +"\n*   Your are traped! you loose the game       *" 
        +"\n***********************************************");
        
        this.displayLoseGameView();
       }
        else
        this.console.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*   The hole is not too big nor too small     *" 
        +"\n*        You have escaped the trap            *" 
        +"\n***********************************************"
       );    
        } catch (RiddleControlException we) {
        ErrorView.display(this.getClass().getName(),we.getMessage());
        }
        return true;
    }
    
        private void displayLoseGameView() {
        LoseGameView loseGameView = new LoseGameView();
        loseGameView.display();
    }
    
}
