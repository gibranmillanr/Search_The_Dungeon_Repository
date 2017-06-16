/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import java.util.Scanner;

/**
 *
 * @author Les and Sue
 */
public class GameMenuView extends View {

    public GameMenuView(){
        
        super("\n"
                  +"***********************************************"
                  +"\n*                  GAME MENU                  *"
                  +"\n***********************************************"
                  +"\n*                                             *"
                  +"\n* You have entered the dungeon! it is cold    *"
                  +"\n* and dark. You should hurry and explore a    *"
                  +"\n* new room. you can take a look at your       *"
                  +"\n* items too.                                  *"
                  +"\n* What will you do now?                       *"
                  +"\n*                                             *"
                  +"\n* M - Go to the map and choose a room         *"
                  +"\n* I - Review the items in your inventory      *"
                  +"\n* S - Save your current game                  *"
                  +"\n* Q - Quit                                    *"
                  +"\n*                                             *"
                  +"\n* The following options do not belong in this *"
                  +"\n*  menu and will be removed later             *"
                  +"\n*                                             *"
                  +"\n* F - Fight Menu                              *"
                  +"\n* P - Player menu                             *"
                  +"\n* C - Fairies control                         *"
                  +"\n* T - Trap Control                            *"
                  +"\n* D - Dragon Control                          *"
                  +"\n* A - add or remove item view                 *"
                  +"\n***********************************************");      
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "M": // Go to the map and choose a room
               this.displayMap();
               break;
           case "I": // Review the items in your inventory  
               this.displayInventory();
               break;
           case "S": // Save your current game 
               this.saveGame();
               break;
           case "C": // Fairie Control
               this.displayFarieControl();
               break;
           case "F": // fight menu
               this.displayFightMenu();
               break;
           case "P": // Player View
               this.displayPlayerView();
               break;
           case "T": // Trap View
               this.displayTrapView();
               break;
           case "D": // Dragon View
               this.displayDragonView();
               break;
           case "A": // add or remove item View
               this.displayAddOrRemoveItemView();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }

    private void displayMap() {
        System.out.println("*** displayMap function called ***");
    }

    private void displayInventory() {
        System.out.println("*** displayInventory function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayFarieControl() {
       FairiesView fairiesView = new FairiesView();
        fairiesView.display();
    }

    private void displayFightMenu() {
       FightMenuView fightMenu = new FightMenuView();
        fightMenu.display();
    }

    private void displayPlayerView() {
      PlayerView playerView = new PlayerView();
        playerView.display();
    }

    private void displayTrapView() {
       TrapView trapView = new TrapView();
        trapView.display();  
    }
    
    private void displayDragonView() {
       DragonView dragonView = new DragonView();
        dragonView.display();  
    }

    private void displayAddOrRemoveItemView() {
        AddOrRemoveItemView addOrRemoveItemView = new AddOrRemoveItemView();
        addOrRemoveItemView.display();
    }
}
