/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

/**
 *
 * @author Gibran Millan
 */
public class MainMenuView {
    private String menu;
    
    public MainMenuView(){
        
        this.menu = "\n"
                  + "*******************************************"
                  +"\n Main Menu                               |"
                  +"\n******************************************"
                  +"\nN - Start new game "
                  +"\nG - Get and start saved game"
                  +"\nH - Get help on how to play the game"
                  +"\nS - Save Game"
                  +"\nQ - Quit"
                  +"\n******************************************";
           
    }

    public void displayMainMenuView() {
       
        boolean done = false; // set flag to not done
        do {
            // prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) // user wants to quit
                return; // exit the game
            
            // do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
       System.out.println("\n*** getMenuOption called ***");
       return "N";
    }

    private boolean doAction(String menuOption) {
       System.out.println("\n*** doAction called ***");
       return true;
    }
    
}
