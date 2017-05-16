/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.the.dungeon;

import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Player;
import byui.cit260.searchTheDungeon.model.Map;
import byui.cit260.searchTheDungeon.model.Riddle;
import byui.cit260.searchTheDungeon.model.Scene;

/**
 *
 * @author Gibran Millan, Paul Darr, Les Aycock
 */
public class SearchTheDungeon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //player instance test
        Player playerOne = new Player();
        
        playerOne.setName("Fred");
        playerOne.setPowerLevel(20);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Game instance test
        Game gameOne = new Game();
        
        gameOne.setNoPeople(1);
        
        String gameInfo = gameOne.toString();
        System.out.println(gameInfo);
        
        //Actor instance test
        Actor wizard = new Actor();
        
        wizard.setName("Usidore");
        wizard.setDescription("A weird wizard");
        wizard.setCoordinates("A5");
        wizard.setPowerLevel(20);
        
        String actorInfo = wizard.toString();
        System.out.println(actorInfo);
        
                //Riddle instance test
        Riddle riddle = new Riddle();
        
        riddle.setRiddle("How many sides are in a pentagon?");
        riddle.setAnswer1(5); //correct answer
        riddle.setAnswer2(10);
        riddle.setAnswer3(8);
        riddle.setAnswer4(7);
        riddle.setCorrectAnswerNumber(1);
        
        String riddleInfo = riddle.toString();
        System.out.println(riddleInfo);
     
        //inventoryItem instance test
        InventoryItem inventoryItem = new InventoryItem();
        
        inventoryItem.setDescription("Axe");
        inventoryItem.setItemType("handheld");
        inventoryItem.setPowerLevel(15);
        inventoryItem.setAmount(1);
        
        String InventoryItemInfo = inventoryItem.toString();
        System.out.println(InventoryItemInfo);
        
        //Map instance test
        Map mapOne = new Map();
        
        mapOne.setDescription("Map of the game.");
        mapOne.setRowCount(5);
        mapOne.setColumnCount(5);
        mapOne.setCurrentRow("A");
        mapOne.setCurrentColumn("5");
        mapOne.setCurrentScene("A5");
        
        String mapInfo = mapOne.toString();
        System.out.println(mapInfo);
        
        //Location instance test
        Location roomOne = new Location();
        
        roomOne.setRow("A");
        roomOne.setColumn("5");
        roomOne.setVisited("yes");
        roomOne.setAmountRemaining(16);
        
        String roomInfo = roomOne.toString();
        System.out.println(roomInfo);
        
        //Scene instance test
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("Scene description.");
        sceneOne.setRow("A");
        sceneOne.setColumn("5");
        sceneOne.setVisited("yes");
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
    }
    
}
