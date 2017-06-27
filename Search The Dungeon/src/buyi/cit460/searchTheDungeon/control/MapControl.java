/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;
import buyi.cit460.searchTheDungeon.control.InventoryControl.ItemType;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import byui.cit260.searchTheDungeon.model.Map;
import byui.cit260.searchTheDungeon.model.Scene;
import search.the.dungeon.SearchTheDungeon;

/**
 *
 * @author Gibran Millan
 */
public class MapControl {
    static Map createMap() {
        // create the map
        Map map = new Map(5, 5);
        // create teh scenes for the game
        Scene[] scenes = createScenes();
        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        return map;        
    }
    
    private static Scene[] createScenes() {
        Scene[] scenes = new Scene[SceneType.values().length];
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        Scene startScene = new Scene();
        startScene.setDescription(
            "You will enter the dungeon with nothing but three items: your armor, "
           +"your weapon, and your shield. You won't be happy to find out that your "
           +"initial items are not very powerful. Hurry and search the dungeon for "
           +"better gear before you encounter something dangerous. ");
        startScene.setMapSymbol("ST");
        startScene.setItem(inventory[InventoryControl.ItemType.dagger.ordinal()]);
        scenes[SceneType.start.ordinal()] = startScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations! You have completed the dungeon! What will you do next?");
        finishScene.setMapSymbol("FN");
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene room1Scene = new Scene();
        room1Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room1Scene.setMapSymbol(" 1");
        scenes[SceneType.room1.ordinal()] = room1Scene;

        Scene room2Scene = new Scene();
        room2Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room2Scene.setMapSymbol(" 2");
        scenes[SceneType.room2.ordinal()] = room2Scene;        
        
        Scene room3Scene = new Scene();
        room3Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room3Scene.setMapSymbol(" 3");
        scenes[SceneType.room3.ordinal()] = room3Scene;
        
        Scene room4Scene = new Scene();
        room4Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room4Scene.setMapSymbol(" 4");
        scenes[SceneType.room4.ordinal()] = room4Scene;
        
        Scene room5Scene = new Scene();
        room5Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room5Scene.setMapSymbol(" 5");
        scenes[SceneType.room5.ordinal()] = room5Scene;
        
        Scene room6Scene = new Scene();
        room6Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room6Scene.setMapSymbol(" 6");
        scenes[SceneType.room6.ordinal()] = room6Scene;
        
        Scene room7Scene = new Scene();
        room7Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room7Scene.setMapSymbol(" 7");
        scenes[SceneType.room7.ordinal()] = room7Scene;
        
        Scene room8Scene = new Scene();
        room8Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room8Scene.setMapSymbol(" 8");
        scenes[SceneType.room8.ordinal()] = room8Scene;
        
        Scene room9Scene = new Scene();
        room9Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room9Scene.setMapSymbol(" 9");       
        scenes[SceneType.room9.ordinal()] = room9Scene;
        
        Scene room10Scene = new Scene();
        room10Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room10Scene.setMapSymbol("10");
        room10Scene.setItem(inventory[InventoryControl.ItemType.sword.ordinal()]);
        scenes[SceneType.room10.ordinal()] = room10Scene;
        
        Scene room11Scene = new Scene();
        room11Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room11Scene.setMapSymbol("11");        
        scenes[SceneType.room11.ordinal()] = room11Scene;
        
        Scene room12Scene = new Scene();
        room12Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room12Scene.setMapSymbol("12");
        scenes[SceneType.room12.ordinal()] = room12Scene;
        
        Scene room13Scene = new Scene();
        room13Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room13Scene.setMapSymbol("13");        
        scenes[SceneType.room13.ordinal()] = room13Scene;
        
        Scene room14Scene = new Scene();
        room14Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room14Scene.setMapSymbol("14");        
        scenes[SceneType.room14.ordinal()] = room14Scene;
        
        Scene room15Scene = new Scene();
        room15Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room15Scene.setMapSymbol("15");        
        scenes[SceneType.room15.ordinal()] = room15Scene;
        
        Scene room16Scene = new Scene();
        room16Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room16Scene.setMapSymbol("16");       
        scenes[SceneType.room16.ordinal()] = room16Scene;
        
        Scene room17Scene = new Scene();
        room17Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room17Scene.setMapSymbol("17");       
        scenes[SceneType.room17.ordinal()] = room17Scene;

        Scene room18Scene = new Scene();
        room18Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room18Scene.setMapSymbol("18"); 
        scenes[SceneType.room18.ordinal()] = room18Scene;
        
        Scene room19Scene = new Scene();
        room19Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room19Scene.setMapSymbol("19");        
        scenes[SceneType.room19.ordinal()] = room19Scene;
        
        Scene fairiesScene = new Scene();
        fairiesScene.setDescription("You have entered the fairies domain!");
        fairiesScene.setMapSymbol("20");
        scenes[SceneType.fairies.ordinal()] = fairiesScene;
        
        Scene blueWizardScene = new Scene();
        blueWizardScene.setDescription("You have entered the realm of the Blue Wizard!");
        blueWizardScene.setMapSymbol("21");
        scenes[SceneType.blueWizard.ordinal()] = blueWizardScene;
        
        Scene trapScene = new Scene();
        trapScene.setDescription("You have fallen for a TRAP!");
        trapScene.setMapSymbol("22");
        scenes[SceneType.trap.ordinal()] = trapScene;
        
        Scene dragonScene = new Scene();
        dragonScene.setDescription("You have entered the Dragon's Lair!");
        dragonScene.setMapSymbol("23");
        scenes[SceneType.dragon.ordinal()] = dragonScene;

        return scenes;
    }
    
    public enum SceneType{
        start,
        blueWizard,
        trap,
        dragon,
        room1,
        room2,
        room3,
        room4,
        room5,
        room6,
        room7,
        room8,
        room9,
        room10,
        room11,
        room12,
        room13,
        room14,
        room15,
        room16,
        room17,
        room18,
        room19,
        fairies,
        finish;
    }
    
    public static void movePlayerToStartingLocation(Map map) {
        // If starting location is not supposed to be 0,0 then use the correct values here.
        movePlayer(map, 0, 0); // or instead of 0,0 you can select a different starting location
    }

    public static void movePlayer(Map map, int row, int column) {
        map.setCurrentRow(row);
        map.setCurrentColumn(column);
        map.getCurrentLocation().setVisited(true);

    } 
        
}
