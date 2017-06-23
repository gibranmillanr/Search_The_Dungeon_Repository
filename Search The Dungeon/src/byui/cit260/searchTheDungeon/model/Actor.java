/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.model;
import java.io.Serializable;
import java.awt.Point;

/**
 *
 * @author Gibran Millan
 */
public enum Actor implements Serializable {
 
    Ash("He is the hero of this game"),
    BlueWizard("He might be helpful"),
    Dragon("The dreaded dragon"),
    Troll("A common enemy in the dungeon"),  
    Orc("A common enemy in the dungeon");     
 
    // Class instance Variables
    private String name;
    private final String description;
    private final Point coordinates;
    public int powerLevel;
   
    private Game game;
 
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
   
    public String getDescription() {
        return description;
    }
 
    public Point getCoordinates() {
        return coordinates;
    }
 
    public int getPowerLevel() {
        return powerLevel;
    }
 
    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }
   
    public Game getGame() {
        return game;
    }
 
    public void setGame(Game game) {
        this.game = game;
    }
 
    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + ", powerLevel=" + powerLevel + '}';
    }      
}