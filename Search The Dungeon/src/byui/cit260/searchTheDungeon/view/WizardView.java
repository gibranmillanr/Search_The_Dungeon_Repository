/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.RiddleControl;

/**
 *
 * @author Paul Darr
 */

public class WizardView extends View  {
    private String banner;
    
    public WizardView(){
    
     super("\n what 3 positive numbers give the same result when multiplied and added together? \n What is your first number (or Q to quit): ");
    
     this.banner = "\n"
      +"\n***********************************************"
      +"\n*            The Blue Wizard!                 *" 
      +"\n***********************************************" 
      +"\n*                                             *" 
      +"\n* Today I will aid your quest by              *"
      +"\n* giving you the great armor of Ephysiyies    *"
      +"\n* if you are smart enough to solve my riddle. *"
      +"\n*                                             *"
      +"\n* To Quit use Q                               *"
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

          this.displayMessage="\nWhat is your third number? ";
          String numberThreeRaw = getInput();
          double numberThree = Double.parseDouble(numberThreeRaw); 
          
//          double mathWizard = 0; 
           
          double mathWiz = RiddleControl.calcWizard(numberOne,numberTwo,numberThree);
          if (numberOne == 0) //User wants to quit

              return false; //exit the game
        
       if (mathWiz == -1) {  //incorrect
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*       Incorrect                             *" 
        +"\n*                                             *" 
        +"\n***********************************************");
           
        this.displayLoseGameView();
        }
       
        else {
        System.out.println(
        "\n***********************************************"
        +"\n*                                             *" 
        +"\n*   Correct                                   *" 
        +"\n*                                             *"
        +"\n*                                             *" 
        +"\n***********************************************");
        
        this.displayWinGameView();
        }
        return true;   
    }
      
        private void displayLoseGameView() {
        LoseGameView loseGameView = new LoseGameView();
        loseGameView.display();
    }
        
        private void displayWinGameView() {
        WinGameView winGameView = new WinGameView();
        winGameView.display();
    }

}