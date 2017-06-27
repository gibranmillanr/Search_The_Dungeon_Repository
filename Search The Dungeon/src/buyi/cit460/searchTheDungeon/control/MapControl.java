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
        room1Scene.setDescription("Rats inside the room shriek when they hear the door open, then they run in all directions from a putrid corpse lying in the center of the floor. As these creatures crowd around the edges of the room, seeking to crawl through a hole in one corner, they fight one another. The stinking corpse in the middle of the room looks human, but the damage both time and the rats have wrought are enough to make determining its race by appearance an extremely difficult task at best. ");
        room1Scene.setMapSymbol(" 1");
        scenes[SceneType.room1.ordinal()] = room1Scene;

        Scene room2Scene = new Scene();
        room2Scene.setDescription("The strong, sour-sweet scent of vinegar assaults your nose as you enter this room. Sundered casks and broken bottle glass line the walls of this room. Clearly this was someone's wine cellar for a time. The shards of glass are somewhat dusty, and the spilled wine is nothing more than a sticky residue in some places. Only one small barrel remains unbroken amid the rubbish. ");
        room2Scene.setMapSymbol(" 2");
        scenes[SceneType.room2.ordinal()] = room2Scene;        
        
        Scene room3Scene = new Scene();
        room3Scene.setDescription("A chill wind blows against you as you open the door. Beyond it, you see that the floor and ceiling are nothing but iron grates. Above and below the grates the walls extend up and down with no true ceiling or floor within your range of vision. It's as though the chamber is a bridge through the shaft of a great well. Standing on the edge of this shaft, you feel a chill wind pass down it and over your shoulder into the hall beyond. ");
        room3Scene.setMapSymbol(" 3");
        scenes[SceneType.room3.ordinal()] = room3Scene;
        
        Scene room4Scene = new Scene();
        room4Scene.setDescription("You gaze into the room and hundreds of skulls gaze coldly back at you. They're set in niches in the walls in a checkerboard pattern, each skull bearing a half-melted candle on its head. The grinning bones stare vacantly into the room, which otherwise seems empty. ");
        room4Scene.setMapSymbol(" 4");
        scenes[SceneType.room4.ordinal()] = room4Scene;
        
        Scene room5Scene = new Scene();
        room5Scene.setDescription("You have entered an empty room as the rusty door creaks shut!");
        room5Scene.setMapSymbol(" 5");
        scenes[SceneType.room5.ordinal()] = room5Scene;
        
        Scene room6Scene = new Scene();
        room6Scene.setDescription("The reek of garbage assaults your nose. Looking inside, you see a pile of refuse and offal that nearly reaches the ceiling. In the ceiling above it is a small hole that is roughly as wide as two human hands. No doubt some city dweller high above disposes of his rubbish without ever thinking about where it goes. ");
        room6Scene.setMapSymbol(" 6");
        scenes[SceneType.room6.ordinal()] = room6Scene;
        
        Scene room7Scene = new Scene();
        room7Scene.setDescription("Many doors fill the room ahead. Doors of varied shape, size, and design are set in every wall and even the ceiling and floor. Barely a hand's width lies between one door and the next. All the doors but the one you entered by are shut, and many have obvious locks.");
        room7Scene.setMapSymbol(" 7");
        scenes[SceneType.room7.ordinal()] = room7Scene;
        
        Scene room8Scene = new Scene();
        room8Scene.setDescription("A skeleton dressed in moth-eaten garb lies before a large open chest in the rear of this chamber. The chest is empty, but you note two needles projecting from the now-open lock. Dust coats something sticky on the needles' points. ");
        room8Scene.setMapSymbol(" 8");
        scenes[SceneType.room8.ordinal()] = room8Scene;
        
        Scene room9Scene = new Scene();
        room9Scene.setDescription("Stinking smoke wafts up from braziers made of skulls set around the edges of this room. The walls bear scratch marks and lines of soot that form crude pictures and what looks like words in some language [Goblin]. To the left lies a pile of rubbish and rubble heaped into a crude dais. The dais has upon it an ironbound chest that has been painted with a goblinlike face. Furs and skins of unknown origin are strewn haphazardly about the floor before the dais. ");
        room9Scene.setMapSymbol(" 9");       
        scenes[SceneType.room9.ordinal()] = room9Scene;
        
        Scene room10Scene = new Scene();
        room10Scene.setDescription("This room looks like it was designed by drow. Rusted metal tiles create a huge mosaic of a spider in the floor, and someone set up rusted gratings like draperies of webs. At the far end of the chamber, the carving of a spider squats on the floor. It's about 3 feet tall and seems molded into the floor. Beyond it stands tall double doors of stone, their surface covered in a glittering web of gold. ");
        room10Scene.setMapSymbol("10");
        room10Scene.setItem(inventory[InventoryControl.ItemType.sword.ordinal()]);
        scenes[SceneType.room10.ordinal()] = room10Scene;
        
        Scene room11Scene = new Scene();
        room11Scene.setDescription("The manacles set into the walls of this room give you the distinct impression that it was used as a prison and torture chamber, although you can see no evidence of torture devices. One particularly large set of manacles -- big enough for an ogre -- have been broken open. ");
        room11Scene.setMapSymbol("11");        
        scenes[SceneType.room11.ordinal()] = room11Scene;
        
        Scene room12Scene = new Scene();
        room12Scene.setDescription("Rounded green stones set in the floor form a snake's head that points in the direction of the doorway you stand in. The body of the snake flows back and toward the wall to go round about the room in ever smaller circles, creating a spiral pattern on the floor. Similar green-stone snakes wend along the walls, seemingly at random heights, and their long bodies make wave shapes.");
        room12Scene.setMapSymbol("12");
        scenes[SceneType.room12.ordinal()] = room12Scene;
        
        Scene room13Scene = new Scene();
        room13Scene.setDescription("You open the door to a long narrow room with a high ceiling. Three thick circles of wood rest on wooden stands. You're not certain what they are because you came into the room behind them. ");
        room13Scene.setMapSymbol("13");        
        scenes[SceneType.room13.ordinal()] = room13Scene;
        
        Scene room14Scene = new Scene();
        room14Scene.setDescription("Huge rusted metal blades jut out of cracks in the walls, and rusting spikes project down from the ceiling almost to the floor. This room may have once been trapped heavily, but someone triggered them, apparently without getting killed. The traps were never reset and now seem rusted in place. ");
        room14Scene.setMapSymbol("14");        
        scenes[SceneType.room14.ordinal()] = room14Scene;
        
        Scene room15Scene = new Scene();
        room15Scene.setDescription("You enter a small room and your steps echo. Looking about, you're uncertain why, but then a wall vanishes and reveals an enormous chamber. The wall was an illusion and whoever cast it must be nearby! ");
        room15Scene.setMapSymbol("15");        
        scenes[SceneType.room15.ordinal()] = room15Scene;
        
        Scene room16Scene = new Scene();
        room16Scene.setDescription("This room is hung with hundreds of dusty tapestries. All show signs of wear: moth holes, scorch marks, dark stains, and the damage of years of neglect. They hang on all the walls and hang from the ceiling to brush against the floor, blocking your view of the rest of the room. ");
        room16Scene.setMapSymbol("16");       
        scenes[SceneType.room16.ordinal()] = room16Scene;
        
        Scene room17Scene = new Scene();
        room17Scene.setDescription("This room holds six dry circular basins large enough to hold a man and a dry fountain at its center. All possess chipped carvings of merfolk and other sea creatures. It looks like this room once served some group of people as a bath. ");
        room17Scene.setMapSymbol("17");       
        scenes[SceneType.room17.ordinal()] = room17Scene;

        Scene room18Scene = new Scene();
        room18Scene.setDescription("A dozen statues stand or kneel in this room, and each one lacks a head and stands in a posture of action or defense. All are garbed for battle. It's difficult to tell for sure without their heads, but two appear to be dwarves, one might be an elf, six appear human, and the rest look like they might be orcs.");
        room18Scene.setMapSymbol("18"); 
        scenes[SceneType.room18.ordinal()] = room18Scene;
        
        Scene room19Scene = new Scene();
        room19Scene.setDescription("This tiny room holds a curious array of machinery. Winches and levers project from every wall, and chains with handles dangle from the ceiling. On a nearby wall, you note a pictogram of what looks like a scythe on a chain. ");
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
