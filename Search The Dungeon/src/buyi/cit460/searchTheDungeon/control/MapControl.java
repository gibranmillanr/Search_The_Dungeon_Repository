/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

import byui.cit260.searchTheDungeon.model.Map;

/**
 *
 * @author Gibran Millan
 */
public class MapControl {
    public static Map createMap() {
        //create the map
        Map map = null;
        
        System.out.println("\n*** createMap() called ***");
        
        return map;
    }
    
    public static ActorsToStartingLocation moveActorsToStartingLocation() {
        System.out.println("\n*** ActorsToStartingLocation() called ***");
        
        return ActorsToStartingLocation;
    }
}
