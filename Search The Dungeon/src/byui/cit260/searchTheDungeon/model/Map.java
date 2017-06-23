/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.model;
import buyi.cit460.searchTheDungeon.control.GameControl;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Gibran Millan, Paul Darr, Les Aycock
 */

public class Map implements Serializable {

    private static Scene[] createScenes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Class instance Variables
    private String description;
    private int rowCount;
    private int columnCount;
    private int currentRow;
    private int currentColumn;
    private String scene;

    private Location[][] locations;
    
       private Game game;
    
    public Map(int rowCount, int columnCount) {
        
        if(rowCount < 1 || columnCount < 1) {
            System.out.println("The number of rows and colums must be > zero");
            return;
        }
        
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row < rowCount; row++) {
            for(int column = 0; column < columnCount; column++) {
                
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }
    
    private static Map createMap() {
        
        Map map = new Map(20, 20);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;        
    }
    
    //Getter and Setter
     public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(int currentRow) {
        this.currentRow = currentRow;
    }

    public int getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(int currentColumn) {
        this.currentColumn = currentColumn;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    //Default Constructor
    public Map() {
    }

    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + this.currentRow;
        hash = 37 * hash + this.currentColumn;
        hash = 37 * hash + Objects.hashCode(this.scene);
        return hash;
    }

    //toString
    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", scene=" + scene + '}';
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
        final Map other = (Map) obj;
        if (this.rowCount != other.rowCount) {
            return false;
        }
        if (this.columnCount != other.columnCount) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.currentRow, other.currentRow)) {
            return false;
        }
        if (!Objects.equals(this.currentColumn, other.currentColumn)) {
            return false;
        }
        return Objects.equals(this.scene, other.scene);
    }

}
