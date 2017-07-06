/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.searchTheDungeon.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import search.the.dungeon.SearchTheDungeon;

/**
 *
 * @author pauldarr
 */
public abstract class View implements ViewInterface {

    protected String displayMessage;

    protected final BufferedReader keyboard = SearchTheDungeon.getInFile();
    protected final PrintWriter console = SearchTheDungeon.getOutFile();

    public View() {
    }

    public View(String message) {
        this.displayMessage = message;
    }

    @Override
    public void display() {

        boolean done = false;
        do {
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) {
                return;
            }
            // do the requested action and display the next view
            done = this.doAction(value);
        } while (!done); // exit the view when done == true
    }

    @Override
    public String getInput() {

        boolean valid = false;
        String value = null;
        try {
            // while a valid name has not been retrived
            while (!valid) {

                // prompt for the player's name
                System.out.println("\n" + this.displayMessage);

                // get the value entered from the keyboard
                value = keyboard.readLine();
                value = value.trim();

                if (value.length() < 1) {
                    System.out.println("\n*** You must enter a value *** ");
                    continue;
                }
                break;
            }
        } catch (Exception e) {
            System.out.println("\n*** You must enter a value *** ");
            // System.out.println("Error reading input: " + e.getMessage());
        }
        return value; // return the name
    }

    public int getIntInput(String prompt, int min, int max) throws IOException {

        boolean valid = false;
        String value;
        int returned = 0;
        // while a valid name has not been retrived
        while (!valid) {

            // prompt for the player's name
            System.out.println("\n" + prompt + "(enter Q to Quit): ");

            // get the value entered from the keyboard
            value = keyboard.readLine();
            value = value.trim();

            if (value.length() < 1) {
                System.out.println("\n*** You must enter a value *** ");
                continue;
            }
            if (value.toUpperCase().equals("Q")) {
                return -999; // player wants to quit
            }
            try {
                returned = Integer.parseInt(value);
                if (returned < min || returned > max) {
                    System.out.println("Invalid entry. Entry needs to be between " + min + " and " + max + ". Try again.");
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid entry. Entry needs to be a NUMBER between " + min + " and " + max + ". Try again.");
            }
        }
        return returned; // return the name
    }
}
