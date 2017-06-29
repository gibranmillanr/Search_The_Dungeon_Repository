/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import buyi.cit460.searchTheDungeon.control.MapControl;
import byui.cit260.searchTheDungeon.exceptions.MapControlException;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import search.the.dungeon.SearchTheDungeon;

/**
 *
 * @author Les and Sue
 */
public class GameMenuView extends View {

    public GameMenuView(){
        
        super("\n"
                  +"***********************************************"
                  +"\n*                  GAME MENU                  *"
                  +"\n***********************************************"
                  +"\n*                                             *"
                  +"\n* You have entered the dungeon! it is cold    *"
                  +"\n* and dark. You should hurry and explore a    *"
                  +"\n* new room. you can take a look at your       *"
                  +"\n* items too.                                  *"
                  +"\n* What will you do now?                       *"
                  +"\n*                                             *"
                  +"\n* V - View the Map                            *"
                  +"\n* M - Move to new location                    *"                  
                  +"\n* R - Report View (Items, Enemies, ect.)      *"
                  +"\n* Q - Quit                                    *"                
                  +"\n***********************************************");      
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "V": // Go to the map and choose a room
               this.displayMap();
               break;
           case "M": {
                this.move(); // Go to the map and choose a room
                break;                              
           }
           case "R": // View Reports 
               this.viewReports();
               break;
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }

    public void displayMap() {
        String leftIndicator;
        String rightIndicator;

        Game game = SearchTheDungeon.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
        Location[][] locations = map.getLocations(); // retreive the locations from map
        // Build the heading of the map
        System.out.print("  |");
        for( int column = 0; column < locations[0].length; column++){
        // print col numbers to side of map
        System.out.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
        System.out.println();
        for( int row = 0; row < locations.length; row++){
        System.out.print(row + " "); // print row numbers to side of map
            for (Location location : locations[row]) {
                // set default indicators as blanks
                leftIndicator = " ";
                rightIndicator = " ";
                if (location == map.getCurrentLocation()) {
                    // Set star indicators to show this is the current location.
                    leftIndicator = "*";
                    rightIndicator = "*";
                } 
                else if (location.visited) {
                    // Set < > indicators to show this location has been visited.
                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                    rightIndicator = "<"; // same as above
                }
                System.out.print("|"); // start map with a |
                if (location.getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    System.out.print(leftIndicator + "??" + rightIndicator);
                } else {
                    System.out.print(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
                }
            }
     System.out.println("|");
    }
        System.out.println(""+map.getCurrentLocation().getScene().getDescription());
        if (map.getCurrentLocation().getScene().getItem()!=null){
            System.out.println("There is something here! "+map.getCurrentLocation().getScene().getItem().getDescription());
        }
 }

    private void viewReports() {
        ReportsView reportsView = new ReportsView();
        reportsView.display();
    }
    
    private void move(){ 
        try {
            Game game = SearchTheDungeon.getCurrentGame(); // retreive the game
            Map map = game.getMap(); // retreive the map from game
            displayMap();
            int row = getIntInput("Enter row: ",4,4);
            if (row == -999)
                return;
            int column = getIntInput ("Enter column: ",4,4);
            if (column == -999)
                return;
            MapControl.movePlayer(SearchTheDungeon.getCurrentGame().getMap(), row, column);
            displayMap();
        } catch (MapControlException ex) {
            Logger.getLogger(GameMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
