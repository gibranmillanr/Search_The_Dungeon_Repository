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
 * @author Gibran Millan
 */
public class StartProgramView extends View {
    
        private String banner;
    
    public StartProgramView() {
        
        super("\nWhat's your name?");
    
      this.banner = "\n"
      +"\n***********************************************"
      +"\n*                                             *" 
      +"\n*             SEARCH THE DUNGEON              *" 
      +"\n*                                             *" 
      +"\n* Search the Dungeon is a text based role     *"
      +"\n* playing game based on some of the classics. *"
      +"\n* This game will have you take on the role of *"
      +"\n* a courageous adventurer delving into a      *"
      +"\n* dungeon for treasure and glory. Search the  *"
      +"\n* dungeon contains adventure, survival,       *"
      +"\n* horror, and fantasy elements. It’s not an   *"
      +"\n* easy game, will you be able to survive the  *"
      +"\n* dungeon?                                    *" 
      +"\n*                                             *"
      +"\n* You will enter the dungeon with nothing but *"
      +"\n* three items: your armor, your weapon, and   *"
      +"\n* your shield. You won't be happy to find out *"
      +"\n* that your initial items are not very        *"
      +"\n* powerful. Hurry and search the dungeon for  *"
      +"\n* better gear before you encounter something  *"
      +"\n* dangerous.                                  *"
      +"\n*                                             *"                         
      +"\n***********************************************";
    
    this.displayBanner();
    }
    private void displayBanner() {
        
        System.out.println("\n" + this.banner);
    }

    @Override
    public boolean doAction(String playersName) {
        
       if (playersName.length() < 2) {
        System.out.println("\nInvalid players name: "
                + "The name must be greater than one character in length");
        return false;
    }
       
       // call createPlayer() control function
       Player player = GameControl.createPlayer(playersName);
       
       if (player == null) { //if usuccessful
           System.out.println("\nError creating the player");
        return false;   
       }
       
       // display next view
       this.displayNextView(player);
       
       return true; // success!
    }

    private void displayNextView(Player player) {
        
        //display a custom welcome message
         System.out.println("\n***********************************************"
                           +"\n  Welcome to the game " + player.getName() 
                           +"\n  Try not to die!                              "
                           +"\n***********************************************"
                           );
         
         // Create MainMenuView object
         MainMenuView mainMenuView = new MainMenuView();
                 
         // Display the main menu view
         mainMenuView.display();
    }
}