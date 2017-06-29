/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

/**
 *
 * @author Gibran Millan, Paul Darr, Les Aycock
 */
public class RiddleControl {
    
    /**
    * 
    * @author Paul Darr
    * @param numberOne
    * @param numberTwo
    * @param numberThree
    * @return 
    */
    
    public static double calcWizard ( double numberOne, double numberTwo, double numberThree){ 
       
        if (numberOne <= 0){ 
            return -1;
        }
        if (numberTwo <= 0){ 
            return -1;
        }
        if (numberThree <= 0){ 
            return -1;
        }
 
        double addedNumber = numberOne + numberTwo + numberThree;
        double multipliedNumber = numberOne * numberTwo * numberThree;
        
        if ((addedNumber == 6) && (multipliedNumber == 6)){    
             return 1 ;
        }
        
    return -1;
    }

    /**
    * 
    * @author Les Aycock
     * @param sizeOfMap
     * @param howManyRooms
     * @return 
    */
    public int calcFaries (int sizeOfMap, int howManyRooms){
        if (sizeOfMap<=0){
                return -1;
        }
        if (howManyRooms <= 0) {
            return -1;
        }
        if (sizeOfMap !=26) {
            return -1;
        }
        if (howManyRooms > 26){
            return -1;
        }
        int percentageRooms = (howManyRooms * 100) / sizeOfMap;
        return percentageRooms;
    }
    
    /**
     * @author Gibran Millan
     * @param radius
     * @param height
     * @return 
    */
    public static double calcTrap ( double radius, double height ){ 
       
        if (radius <= 0){ 
            return -1;
        }
        if (height <= 0){ 
            return -1;
        }
       
        double volumeNotRounded = ( Math.PI * Math.pow(radius, 2) * height );
        double volume = Math.round(volumeNotRounded*100.0)/100.0;
        if ( volume >= 3141.59 && volume <= 10602.88){    
             return volume ;
        }
        
        return -1;
    }
    
    /**
    * 
    * @author Paul Darr
    * @param numberOne
    * @param numberTwo
    * @return 
    */
    public static double calcDragon ( double numberOne, double numberTwo){ 
       
        if (numberOne <= 0){ 
            return -1;
        }
        if (numberTwo <= 0){ 
            return -1;
        }
 
        double addedNumber = numberOne + numberTwo;
        double multipliedNumber = numberOne * numberTwo;
        
        if ((addedNumber == 14) && (multipliedNumber == 48)){    
             return 1;
        }
        
    return -1;
    }
}   
