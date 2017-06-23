/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;


import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
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
    
        // created array (list) of inventory items
        InventoryItem[] inventory = new InventoryItem[6];
        
        // created list of items
        InventoryItem sword = new InventoryItem();
        sword.setDescription("Sword");
        sword.setItemType("Weapon");
        sword.setPowerLevel(2);
        sword.setAmount(0);
        
        InventoryItem dagger = new InventoryItem();
        dagger.setDescription("Dagger");
        dagger.setItemType("Weapon");
        dagger.setPowerLevel(1);
        dagger.setAmount(1);
        
        InventoryItem basicShield = new InventoryItem();
        basicShield.setDescription("Basic Shield");
        basicShield.setItemType("Shield");
        basicShield.setPowerLevel(1);
        basicShield.setAmount(1);

        InventoryItem powerShield = new InventoryItem();
        powerShield.setDescription("Advanced Shield");
        powerShield.setItemType("Shield");
        powerShield.setPowerLevel(2);
        basicShield.setAmount(0);
        
        InventoryItem basicArmor = new InventoryItem();
        basicArmor.setDescription("Basic Armor");
        basicArmor.setItemType("Armor");
        basicArmor.setPowerLevel(1);
        basicShield.setAmount(1);
        
        InventoryItem powerArmor = new InventoryItem();
        powerArmor.setDescription("Power Armor");
        basicArmor.setItemType("Armor");
        powerArmor.setPowerLevel(2);
        basicShield.setAmount(0);
        
        return inventory;
    }
}
