/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.FightControl;
import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Player;
import search.the.dungeon.SearchTheDungeon;
import java.util.Scanner;

/**
 *
 * @author Les and Sue
 */
public class FightMenuView extends View{
    
    public FightMenuView(){
              
        super("\n"
                  +"***********************************************"
                  +"\n*                FIGHT MENU                 *"
                  +"\n*********************************************"
                  +"\n* A - Attack                                *"
                  +"\n* R - Run Away                              *"
                  +"\n* Q - Quit                                  *"
                  +"\n*********************************************");
           
    }

    @Override
    public boolean doAction(String choice) {
       choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "A": // Player Chose to Fight
               this.displayFight();
               break;
           case "R": // Run Away
               this.displayRun();
               break;
           default:
               System.out.println("\n***Invalid option. Either fight or retreat!");
               break;
       }
       return false;
    }
    private void displayFight() {
        Player player=SearchTheDungeon.getPlayer();
        Actor tempActor = new Actor();
        tempActor.powerLevel = 12;
        boolean winFight = FightControl.winFight(player, tempActor);
        if (!winFight) {
            System.out.println("\n You’ve lost the game!");
        }
        else {
            System.out.println("\n You WON! The room has been cleared!");
        }
    }

    // @SuppressWarnings("UnusedAssignment")
    public void displayRun() {
        return;
    }
}
