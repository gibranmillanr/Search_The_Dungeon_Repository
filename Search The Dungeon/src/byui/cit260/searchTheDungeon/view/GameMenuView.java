/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.control.MapControl;
import byui.cit260.searchTheDungeon.exceptions.MapControlException;
import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Map;
import java.io.IOException;
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
                  +"\n* L - Look for trouble                        *"  
                  +"\n* S - Search for treasure                     *"                  
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
            try {
                this.move(); // Go to the map and choose a room
                break;                              
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(),
                    "\n*** You must enter a value *** ");
            }
           }
           case "R": // View Reports 
               this.viewReports();
               break;
           case "L": // Look for trouble
               this.lookForTrouble();
               break;
           case "S": // Search for treasure
               this.searchForTreasure();
               break;                  
           case "F": // Fairies View
               this.displayFairiesView();
               break;
           case "T": // Trap View
               this.displayTrapView();
               break;
           case "D": // Dragon View
               this.displayDragonView();
               break;
           case "W": // Wizard View
               this.displayWizardView();
               break;

           default:
               ErrorView.display(this.getClass().getName(),
                       "\n***Invalid selection *** Try again\n");
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
        this.console.print("  |");
        for( int column = 0; column < locations[0].length; column++){
        // print col numbers to side of map
        this.console.print("  " + column + " |"); 
    }
    // Now build the map.  For each row, show the column information
        this.console.println();
        for( int row = 0; row < locations.length; row++){
        this.console.print(row + " "); // print row numbers to side of map
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
                this.console.print("|"); // start map with a |
                if (location.getScene() == null) {
                    // No scene assigned here so use ?? for the symbol
                    this.console.print(leftIndicator + "??" + rightIndicator);
                } else {
                    this.console.print(leftIndicator + location.getScene().getMapSymbol() + rightIndicator);
                }
            }
     this.console.println("|");
    }
        this.console.println(""+map.getCurrentLocation().getScene().getDescription());
        if (map.getCurrentLocation().getScene().getItem()!=null){
            this.console.println("There is something here! "+map.getCurrentLocation().getScene().getItem().getDescription());
        }
 }

    private void viewReports() {
        ReportsView reportsView = new ReportsView();
        reportsView.display();
    }
    private void lookForTrouble() {       
        Game game = SearchTheDungeon.getCurrentGame(); // retreive the game
        Map map = game.getMap(); // retreive the map from game
    }
    private void searchForTreasure() {       
        FairiesView fairiesView = new FairiesView();
        fairiesView.display(); 
    }    
    private void displayFairiesView() {       
        FairiesView fairiesView = new FairiesView();
        fairiesView.display(); 
    }
    private void displayDragonView() {
       DragonView dragonView = new DragonView();
        dragonView.display();  
    }
    private void displayTrapView() {
       TrapView trapView = new TrapView();
        trapView.display();  
    }
    private void displayWizardView() {
       WizardView wizardView = new WizardView();
        wizardView.display();  
    }    
    
    private void move() throws IOException{ 
        try {
            Game game = SearchTheDungeon.getCurrentGame(); // retreive the game
            Map map = game.getMap(); // retreive the map from game
            displayMap();
            int row = getIntInput("Enter row: ",0,4);
            if (row == -999)
                return;
            int column = getIntInput ("Enter column: ",0,4);
            if (column == -999)
                return;
            MapControl.movePlayer(SearchTheDungeon.getCurrentGame().getMap(), row, column);
            displayMap();
        } catch (MapControlException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
