/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import byui.cit260.searchTheDungeon.model.Game;
import byui.cit260.searchTheDungeon.model.InventoryItem;
import byui.cit260.searchTheDungeon.model.Location;
import byui.cit260.searchTheDungeon.model.Map;
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
                  +"\n* M - Go to the map and choose a room         *"
                  +"\n* I - Review the items in your inventory      *"
                  +"\n* S - Save your current game                  *"
                  +"\n* Q - Quit                                    *"
                  +"\n*                                             *"
                  +"\n* The following options do not belong in this *"
                  +"\n*  menu and will be removed later             *"
                  +"\n*                                             *"
                  +"\n* F - Fight Menu                              *"
                  +"\n* P - Player menu                             *"
                  +"\n* C - Fairies control                         *"
                  +"\n* T - Trap Control                            *"
                  +"\n* D - Dragon Control                          *"
                  +"\n* A - add or remove item view                 *"
                  +"\n* W - Win Game Scenario                       *"
                  +"\n* L - Lose Game Scenario                      *"                
                  +"\n***********************************************");      
    }
    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to uppsercase

       switch (choice) {
           case "M": // Go to the map and choose a room
               this.displayMap();
               break;
           case "I": // Review the items in your inventory  
               this.displayInventory();
               break;
           case "S": // Save your current game 
               this.saveGame();
               break;
           case "C": // Fairie Control
               this.displayFarieControl();
               break;
           case "F": // fight menu
               this.displayFightMenu();
               break;
           case "P": // Player View
               this.displayPlayerView();
               break;
           case "T": // Trap View
               this.displayTrapView();
               break;
           case "D": // Dragon View
               this.displayDragonView();
               break;
           case "A": // add or remove item View
               this.displayAddOrRemoveItemView();
               break;
           case "W":
               this.displayWinGameView();
               break;
           case "L":
               this.displayLoseGameView();
           default:
               System.out.println("\n***Invalid selection *** Try again");
               break;
       }
       return false;
    }

//    private void displayMap() {
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
//                else if (location.visited) {
//                    // Set < > indicators to show this location has been visited.
//                    leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
//                    rightIndicator = "<"; // same as above
//                }
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
 }

    private void displayInventory() {
        StringBuilder line;
        
        Game game = SearchTheDungeon.getCurrentGame();
        InventoryItem[] inventory = game.getInventory();
        
        System.out.println("\n        LIST OF INVENTORY ITEMS");
        line = new StringBuilder("                                              ");
        line.insert(0,"DESCRIPTION");
        line.insert(20, "LEVEL");
        line.insert(30, "# EQUIPPED");
        System.out.println(line.toString());
        
        //for each inventory item
        for (InventoryItem item : inventory) {
            line = new StringBuilder("                                              ");
            line.insert(0, item.getDescription());
            line.insert(23, item.getPowerLevel());
            line.insert(33, item.getAmount());
            
            //DISPLAY the line
            System.out.println(line.toString());
        }
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayFarieControl() {
       FairiesView fairiesView = new FairiesView();
        fairiesView.display();
    }

    private void displayFightMenu() {
       FightMenuView fightMenu = new FightMenuView();
        fightMenu.display();
    }

    private void displayPlayerView() {
      PlayerView playerView = new PlayerView();
        playerView.display();
    }

    private void displayTrapView() {
       TrapView trapView = new TrapView();
        trapView.display();  
    }
    
    private void displayDragonView() {
       DragonView dragonView = new DragonView();
        dragonView.display();  
    }

    private void displayAddOrRemoveItemView() {
        AddOrRemoveItemView addOrRemoveItemView = new AddOrRemoveItemView();
        addOrRemoveItemView.display();
    }

    private void displayWinGameView() {
        WinGameView winGameView = new WinGameView();
        winGameView.display();
    }

    private void displayLoseGameView() {
        LoseGameView loseGameView = new LoseGameView();
        loseGameView.display();
    }
}
