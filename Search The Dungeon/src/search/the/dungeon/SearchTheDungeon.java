/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.the.dungeon;

//import byui.cit260.searchTheDungeon.model.Actor;
//import byui.cit260.searchTheDungeon.model.Game;
//import byui.cit260.searchTheDungeon.model.InventoryItem;
//import byui.cit260.searchTheDungeon.model.Location;
//import byui.cit260.searchTheDungeon.model.Player;
//import byui.cit260.searchTheDungeon.model.Map;
//import byui.cit260.searchTheDungeon.model.Riddle;
//import byui.cit260.searchTheDungeon.model.Scene;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.Player;
import byui.cit260.searchTheDungeon.view.StartProgramView;

/**
 *
 * @author Gibran Millan, Paul Darr, Les Aycock
 */
public class SearchTheDungeon {

    /**
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        SearchTheDungeon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        SearchTheDungeon.player = player;
    }
    public static void main(String[] args) {
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
    }
    
}
