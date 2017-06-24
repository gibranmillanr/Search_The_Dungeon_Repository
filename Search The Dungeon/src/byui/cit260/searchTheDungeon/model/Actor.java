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
public class Actor implements Serializable {
    
    // Class instance Variables
    private String name;
    private final String description;
    private double coordinates;
    public double powerLevel;
    private boolean enemy;
    private double coordinants;
 
//    public Actor() {
//    }


public boolean isEnemy() {
        return enemy;
    }

    /**
     *
     * @param enemy
     */
    public void setEnemy(boolean enemy) {
        this.enemy = enemy;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public double getCoordinants() {
        return coordinants;
    }

    public void setCoordinants(double coordinants) {
        this.coordinants = coordinants;
    }

    public double getpowerLevel() {
        return powerLevel;
    }

    public void setpowerLevel(double powerLevel) {
        this.powerLevel = powerLevel;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name);
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.coordinants) ^ (Double.doubleToLongBits(this.coordinants) >>> 32));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.powerLevel) ^ (Double.doubleToLongBits(this.powerLevel) >>> 32));
        return hash;
    }

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
        final Actor other = (Actor) obj;
        if (Double.doubleToLongBits(this.coordinants) != Double.doubleToLongBits(other.coordinants)) {
            return false;
        }
        if (Double.doubleToLongBits(this.powerLevel) != Double.doubleToLongBits(other.powerLevel)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return Objects.equals(this.description, other.description);
    }

    @Override
    public String toString() {
        return "Actor{" + "name=" + name + ", description=" + description + ", coordinants=" + coordinants + ", powerLevel=" + powerLevel + '}';
    }

    public void setDescription(String lots_of_trouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setPowerLevel(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}