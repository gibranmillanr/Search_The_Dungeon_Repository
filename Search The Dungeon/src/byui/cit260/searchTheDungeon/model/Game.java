/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.model;
import java.io.Serializable;
//import java.util.Objects;

/**
 *
 * @author Gibran Millan
 */
public class Game implements Serializable {
    
    // Class instance Variables
//    private int noPeople;
    private boolean gameOver;
    private Player player;
    private Map map;
    private Actor actor; // enum
    private InventoryItem[] inventory;
    private BackPack[] backpack;
    //Default Constructor

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public BackPack[] getBackpack() {
        return backpack;
    }

    public void setBackpack(BackPack[] backpack) {
        this.backpack = backpack;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    
    public InventoryItem[] getInventory() {
        return inventory;
    }
    
    public void setInventory (InventoryItem[] inventory) {
        this.inventory = inventory;
    }

    public Game() {
        gameOver=false;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
    
    //Getter and Setter

//    public int getNoPeople() {
//        return noPeople;
//    }
//
//    public void setNoPeople(int noPeople) {
//        this.noPeople = noPeople;
//    }
    
    //hashcode
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 97 * hash + Objects.hashCode(this.noPeople);
//        return hash;
//    }
//    
//    //toString
//    @Override
//    public String toString() {
//        return "Game{" + "noPeople=" + noPeople + '}';
//    }
//    
//
//    //equals
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Game other = (Game) obj;
//        if (!Objects.equals(this.noPeople, other.noPeople)) {
//            return false;
//        }
//        return true;
//    }
}
