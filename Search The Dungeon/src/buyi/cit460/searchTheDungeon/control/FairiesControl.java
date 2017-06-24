/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

/**
 *
 * @author Les and Sue
 */
public class FairiesControl {
    public static boolean checkRooms(int numberRooms) {
        int totalRooms = 25; // 26 rooms in the dungeon
        int halfRooms = totalRooms / 2; // getting half the number of rooms
        return numberRooms >= halfRooms; // returning if user explored half or not
    }
}