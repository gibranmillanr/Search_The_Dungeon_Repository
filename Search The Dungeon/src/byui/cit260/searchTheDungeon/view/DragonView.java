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

public class DragonView extends View  {
    private String banner;
    
    public DragonView(){
    
     super("\nWhat are two numbers whose product is 48 and sum is 14? \nWhat is your first number (or Q to quit): ");
    
     this.banner = "\n"
      +"\n***********************************************"
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
      +"\n***********************************************";
       
       
       this.displayBanner();
    }
    
    private void displayBanner() {
        
        System.out.println("\n" + this.banner);
    }
    
      @Override
      public boolean doAction(String value) {
          double numberOne = Double.parseDouble(value);
          this.displayMessage="\nWhat is your second number? ";
          String numberTwoRaw = getInput();
          double numberTwo = Double.parseDouble(numberTwoRaw); 
          double mathDragon = 0; 
           
          double mathDrag = RiddleControl.calcDragon(numberOne,numberTwo);
          if (numberOne == 0) //User wants to quit

              return false; //exit the game
        
       if (mathDrag == -1) {  //incorrect
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       Foolish human, you have lost.         *" 
        +"\n*                                             *" 
        +"\n***********************************************"
       );
        }
       
        else {
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*   Well done! The numbers six and eight      *" 
        +"\n*   are the answer to my riddle.              *"
        +"\n*                                             *" 
        +"\n***********************************************"
       );    
        
       // return true;
        }
        return true;   
    }
}