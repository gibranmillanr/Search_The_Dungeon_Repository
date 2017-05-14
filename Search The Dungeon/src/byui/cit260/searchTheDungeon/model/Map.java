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
 * @author Paul Darr
 */
public class Map implements Serializable {
    
    // Class instance Variables
    private String description;
    private int rowCount;
    private int columnCount;
    private String currentRow;
    private String currentColumn;
    private String currentScene;

    //Default Constructor
    public Map() {
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

    public String getCurrentRow() {
        return currentRow;
    }

    public void setCurrentRow(String currentRow) {
        this.currentRow = currentRow;
    }

    public String getCurrentColumn() {
        return currentColumn;
    }

    public void setCurrentColumn(String currentColumn) {
        this.currentColumn = currentColumn;
    }

    public String getCurrentScene() {
        return currentScene;
    }

    public void setCurrentScene(String currentScene) {
        this.currentScene = currentScene;
    }

    //hashcode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.description);
        hash = 37 * hash + this.rowCount;
        hash = 37 * hash + this.columnCount;
        hash = 37 * hash + Objects.hashCode(this.currentRow);
        hash = 37 * hash + Objects.hashCode(this.currentColumn);
        hash = 37 * hash + Objects.hashCode(this.currentScene);
        return hash;
    }

    //toString
    @Override
    public String toString() {
        return "Map{" + "description=" + description + ", rowCount=" + rowCount + ", columnCount=" + columnCount + ", currentRow=" + currentRow + ", currentColumn=" + currentColumn + ", currentScene=" + currentScene + '}';
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
        if (!Objects.equals(this.currentScene, other.currentScene)) {
            return false;
        }
        return true;
    }

}
