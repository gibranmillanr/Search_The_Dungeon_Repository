/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.model;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gibran Millan
 */
public class Game implements Serializable {
    
    // Class instance Variables
    private int noPeople;
    
    //Default Constructor

    public Game() {
    }
    
    
    //Getter and Setter

    public int getNoPeople() {
        return noPeople;
    }

    public void setNoPeople(int noPeople) {
        this.noPeople = noPeople;
    }
    
    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.noPeople);
        return hash;
    }
    
    //toString
    @Override
    public String toString() {
        return "Game{" + "noPeople=" + noPeople + '}';
    }
    

    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (!Objects.equals(this.noPeople, other.noPeople)) {
            return false;
        }
        return true;
    }
    
    
    
}
