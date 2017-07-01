/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.control;

import byui.cit260.searchTheDungeon.control.*;
import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Player;


/**
 *
 * @author Les Aycock
 */
public class FightControl {
    public static boolean winFight(Player player, Actor actor) {
        int playerLevel = player.powerLevel; // retrieve player power level
        double monsterLevel = actor.powerLevel; // retrieve power level of monster
        return playerLevel >= monsterLevel;
    }
}

