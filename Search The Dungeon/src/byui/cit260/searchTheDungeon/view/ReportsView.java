/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import java.util.ArrayList;
import search.the.dungeon.SearchTheDungeon;
import static search.the.dungeon.SearchTheDungeon.player;

/**
 *
 * @author Paul Darr, Gibran Milan, Les Aycock
 */
public class ReportsView extends View {
    
    public ReportsView() {
        
    super("\n"
        + "\n***************************************"
        + "\n* Which report would you like to see? *"
        + "\n***************************************"
        + "\n* I - List all items in game          *"
        + "\n* C - List all in your backpack       *" 
        + "\n* A - List all actors in game         *" 
        + "\n* E - List all enemies in game        *"
        + "\n* Q - Quit                            *"
        + "\n--------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "I": // List all items in game
                this.displayInventory();
                break;
            case "C": // List all items carried
                this.displayInventoryCarried();
                break;
            case "A": // List all actors in game
                this.displayActors();
                break;
            case "E": // List all enemies in game
                this.displayEnemies();
                break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
        }
        return false;
    }

    private void displayInventory() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n LIST OF GAME INVENTORY ITEMS");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        System.out.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
    }
    
    private void displayInventoryCarried() {
        StringBuilder line;
        
        //Retrieve list of items
        Game game = SearchTheDungeon.getCurrentGame();
        ArrayList<InventoryItem> backpack=game.getBackpack();
        
        System.out.println("\n LIST OF INVENTORY ITEMS\n");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        System.out.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : backpack) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
    }
    
    private void displayActors() {
        StringBuilder line;
        
        //retrieve list of actors
        Game game = SearchTheDungeon.getCurrentGame();
        Actor[] actors = game.getActors();
        ArrayList<InventoryItem> backpack=game.getBackpack();
        int playerStrength=0;
        
        System.out.println("\n   LIST OF ACTORS IN GAME\n");
        line = new StringBuilder("                                                 ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        System.out.println(line.toString());
        
        //for each actor
        for (Actor actor : actors) {
            line = new StringBuilder("                                                 ");
            line.insert(0, actor.getName());
            line.insert(24, actor.getPowerLevel());
            
            //Display line
            System.out.println(line.toString());
        }
        for (InventoryItem item : backpack) {
            playerStrength = playerStrength+item.getPowerLevel();
        }
            line = new StringBuilder("                                                 ");
            line.insert(0, player.getName());
            line.insert(24, playerStrength);
            
            System.out.println(line.toString());
    }

    private void displayEnemies() {
        StringBuilder line;
        
        //retrieve list of actors
        Game game = SearchTheDungeon.getCurrentGame();
        Actor[] actors = game.getActors();        
        
        System.out.println("\n   LIST OF ENEMIES IN GAME\n");
        line = new StringBuilder("                                                 ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        System.out.println(line.toString());
        
        //for each actor
        for (Actor actor : actors) {
            if (actor.isEnemy()!=false) {
                line = new StringBuilder("                                                 ");
                line.insert(0, actor.getName());
                line.insert(24, actor.getPowerLevel());
                System.out.println(line.toString());
            }
        }
    }        
}
