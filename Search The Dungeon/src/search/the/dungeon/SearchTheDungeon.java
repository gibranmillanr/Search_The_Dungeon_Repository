/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.the.dungeon;

import byui.cit260.searchTheDungeon.model.Actor;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Player;
import byui.cit260.searchTheDungeon.model.Riddle;

/**
 *
 * @author Gibran Millan
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
        
        //Actor instance test
        Actor wizard = new Actor();
        
        wizard.setName("Usidore");
        wizard.setDescription("A weird wizard");
        wizard.setCoordinates("A5");
        wizard.setPowerLevel(20);
        
        //Location instance test
        Location roomOne = new Location();
        
        roomOne.setRow("A");
        roomOne.setColumn("5");
        roomOne.setVisited("yes");
        roomOne.setAmountRemaining(16);
        
        //Riddle instance test
        Riddle riddle = new Riddle();
        
        riddle.setRiddle("How many sides are in a pentagon?");
        riddle.setAnswer1(5); //correct answer
        riddle.setAnswer2(10);
        riddle.setAnswer3(8);
        riddle.setAnswer4(7);
        riddle.setCorrectAnswerNumber(5);
        
        String riddleInfo = riddle.toString();
        System.out.println(riddleInfo);
        
    }
}