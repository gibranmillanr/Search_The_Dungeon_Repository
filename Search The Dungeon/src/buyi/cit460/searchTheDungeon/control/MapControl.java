/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Map;
import byui.cit260.searchTheDungeon.model.Scene;

/**
 *
 * @author Gibran Millan
 */
public class MapControl {
    private static Map createMap() {
        
        // create the map
        Map map = new Map(5, 5);
        
        // create teh scenes for the game
        Scene[] scenes = createScenes();

        // assign scenes to locations
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;        
    }
    
    public static ActorsToStartingLocation moveActorsToStartingLocation() {
        System.out.println("\n*** ActorsToStartingLocation() called ***");
        
        return ActorsToStartingLocation;
    }
    
    private static Scene[] createScenes() {
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startScene = new Scene();
        startScene.setDescription(
            "You will enter the dungeon with nothing but three items: your armor, "
           +"your weapon, and your shield. You won't be happy to find out that your "
           +"initial items are not very powerful. Hurry and search the dungeon for "
           +"better gear before you encounter something dangerous. ");
        startScene.setMapSymbol(" ST ");
        startScene.setBlocked(false);
        scenes[SceneType.start.ordinal()] = startScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription("Congratulations! You have completed the dungeon! What will you do next?");
        finishScene.setMapSymbol(" FN ");
        finishScene.setBlocked(false);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        Scene room1Scene = new Scene();
        room1Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room1Scene.setMapSymbol=(" R1 ");
        room1Scene.setBlocked(false);
        scenes[SceneType.room1.ordinal()] = room1Scene;

        Scene room2Scene = new Scene();
        room2Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room2Scene.setMapSymbol=(" R2 ");
        room2Scene.setBlocked(false);
        scenes[SceneType.room2.ordinal()] = room2Scene;        
        
        Scene room3Scene = new Scene();
        room3Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room3Scene.setMapSymbol=(" R3 ");
        room3Scene.setBlocked(false);
        scenes[SceneType.room3.ordinal()] = room3Scene;
        
        Scene room4Scene = new Scene();
        room4Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room4Scene.setMapSymbol=(" R4 ");
        room4Scene.setBlocked(false);
        scenes[SceneType.room4.ordinal()] = room4Scene;
        
        Scene room5Scene = new Scene();
        room5Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room5Scene.setMapSymbol=(" R5 ");
        room5Scene.setBlocked(false);
        scenes[SceneType.room5.ordinal()] = room5Scene;
        
        Scene room6Scene = new Scene();
        room6Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room6Scene.setMapSymbol=(" R6 ");
        room6Scene.setBlocked(false);
        scenes[SceneType.room6.ordinal()] = room6Scene;
        
        Scene room7Scene = new Scene();
        room7Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room7Scene.setMapSymbol=(" R7 ");
        room7Scene.setBlocked(false);
        scenes[SceneType.room7.ordinal()] = room7Scene;
        
        Scene room8Scene = new Scene();
        room8Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room8Scene.setMapSymbol=(" R8 ");
        room8Scene.setBlocked(false);
        scenes[SceneType.room8.ordinal()] = room8Scene;
        
        Scene room9Scene = new Scene();
        room9Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room9Scene.setMapSymbol=(" R9 ");
        room9Scene.setBlocked(false);        
        scenes[SceneType.room9.ordinal()] = room9Scene;
        
        Scene room10Scene = new Scene();
        room10Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room10Scene.setMapSymbol=(" R10 ");
        room10Scene.setBlocked(false);
        scenes[SceneType.room10.ordinal()] = room10Scene;
        
        Scene room11Scene = new Scene();
        room11Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room11Scene.setMapSymbol=(" R11 ");
        room11Scene.setBlocked(false);        
        scenes[SceneType.room11.ordinal()] = room11Scene;
        
        Scene room12Scene = new Scene();
        room12Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room12Scene.setMapSymbol=(" R12 ");
        room12Scene.setBlocked(false);
        scenes[SceneType.room12.ordinal()] = room12Scene;
        
        Scene room13Scene = new Scene();
        room13Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room13Scene.setMapSymbol=(" R13 ");
        room13Scene.setBlocked(false);        
        scenes[SceneType.room13.ordinal()] = room13Scene;
        
        Scene room14Scene = new Scene();
        room14Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room14Scene.setMapSymbol=(" R14 ");
        room14Scene.setBlocked(false);        
        scenes[SceneType.room14.ordinal()] = room14Scene;
        
        Scene room15Scene = new Scene();
        room15Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room15Scene.setMapSymbol=(" R15 ");
        room15Scene.setBlocked(false);        
        scenes[SceneType.room15.ordinal()] = room15Scene;
        
        Scene room16Scene = new Scene();
        room16Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room16Scene.setMapSymbol=(" R16 ");
        room16Scene.setBlocked(false);        
        scenes[SceneType.room16.ordinal()] = room16Scene;
        
        Scene room17Scene = new Scene();
        room17Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room17Scene.setMapSymbol=(" R17 ");
        room17Scene.setBlocked(false);        
        scenes[SceneType.room17.ordinal()] = room17Scene;

        Scene room18Scene = new Scene();
        room18Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room18Scene.setMapSymbol=(" R18 ");
        room18Scene.setBlocked(false);   
        scenes[SceneType.room18.ordinal()] = room18Scene;
        
        Scene room19Scene = new Scene();
        room19Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room19Scene.setMapSymbol=(" R19 ");
        room19Scene.setBlocked(false);        
        scenes[SceneType.room19.ordinal()] = room19Scene;
        
        Scene fairiesScene = new Scene();
        fairiesScene.setDescription("You have entered the fairies domain!");
        fairiesScene.setMapSymbol = (" R20 ");
        fairiesScene.setBlocked(false);
        scenes[SceneType.fairies.ordinal()] = room20Scene;
        
        Scene blueWizardScene = new Scene();
        blueWizardScene.setDescription("You have entered the realm of the Blue Wizard!");
        blueWizardScene.setMapSymbol = (" R21 ");
        blueWizardScene.setBlocked(false);
        scenes[SceneType.blueWizard.ordinal()] = blueWizardScene;
        
        Scene trapScene = new Scene();
        trapScene.setDescription("You have fallen for a TRAP!");
        trapScene.setMapSymbol = (" R22 ");
        trapScene.setBlocked(false);
        scenes[SceneType.trap.ordinal()] = trapScene;
        
        Scene dragonScene = new Scene();
        dragonScene.setDescription("You have entered the Dragon's Lair!");
        dragonScene.setMapSymbol = (" R23 ");
        dragonScene.setBlocked(false);
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
    
    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        
        locations[0][0].setScene(scenes[SceneType.startScene.ordinal()]);
        locations[0][1].setScene(scenes[SceneType.room1Scene.ordinal()]);
        locations[0][2].setScene(scenes[SceneType.room2Scene.ordinal()]);
        locations[0][3].setScene(scenes[SceneType.room3Scene.ordinal()]);
        locations[0][4].setScene(scenes[SceneType.room4Scene.ordinal()]);
        locations[1][0].setScene(scenes[SceneType.room5Scene.ordinal()]);
        locations[1][1].setScene(scenes[SceneType.room6Scene.ordinal()]);
        locations[1][2].setScene(scenes[SceneType.fairiesScene.ordinal()]);
        locations[1][3].setScene(scenes[SceneType.room7Scene.ordinal()]);
        locations[1][4].setScene(scenes[SceneType.room8Scene.ordinal()]);
        locations[2][0].setScene(scenes[SceneType.room9Scene.ordinal()]);
        locations[2][1].setScene(scenes[SceneType.blueWizardScene.ordinal()]);
        locations[2][2].setScene(scenes[SceneType.room10Scene.ordinal()]);
        locations[2][3].setScene(scenes[SceneType.room11Scene.ordinal()]);
        locations[2][4].setScene(scenes[SceneType.trapScene.ordinal()]);
        locations[3][0].setScene(scenes[SceneType.room12Scene.ordinal()]);
        locations[3][1].setScene(scenes[SceneType.room13Scene.ordinal()]);
        locations[3][2].setScene(scenes[SceneType.room14Scene.ordinal()]);
        locations[3][3].setScene(scenes[SceneType.room15Scene.ordinal()]);
        locations[3][4].setScene(scenes[SceneType.room16Scene.ordinal()]);
        locations[4][0].setScene(scenes[SceneType.room17Scene.ordinal()]);
        locations[4][1].setScene(scenes[SceneType.room18Scene.ordinal()]);
        locations[4][2].setScene(scenes[SceneType.room19Scene.ordinal()]);
        locations[4][3].setScene(scenes[SceneType.dragonScene.ordinal()]);
        locations[4][4].setScene(scenes[SceneType.finishScene.ordinal()]);
    }
        
}
