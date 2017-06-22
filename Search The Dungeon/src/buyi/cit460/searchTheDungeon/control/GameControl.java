/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.Player;
import search.the.dungeon.SearchTheDungeon;


/**
 *
 * @author Gibran Millan
 */
public class GameControl {

    public static Player createPlayer(String name) {
       
        if (name == null){
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        SearchTheDungeon.setPlayer(player); // save the player
        return  player;
    }

    public static void createNewGame(Player player) {

        Game game = new Game();
        SearchTheDungeon.setCurrentGame(game);
        
        game.setPlayer(player);
        
        // create inventory
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        BackPack[] backPack = new Backpack();
        game.setBackpack(backPack);
        
        map map = MapControl.createMap(); // create and initialize new map
        game.setMap(map); // save map in game
        
        // move player to starting position
        MapControl.moveActorsToStartingLocation(map);        
    }
    
    public static InventoryItem[] createInventoryList() {
        System.out.println("*** called createInventoryList() in GameControl ***");
        return null;
    }
}
