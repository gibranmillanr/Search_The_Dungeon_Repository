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
    public boolean checkRooms(double numberRooms) {
        if (numberRooms < 13) {
            return false; }
            else {
            return true;
        }
    }
}
