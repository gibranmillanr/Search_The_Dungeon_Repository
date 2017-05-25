/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buyi.cit460.searchTheDungeon.control;

/**
 *
 * @author Gibran Millan
 */
public class RiddleControl {
    
    public int calcWizard ( int numberOne, int numberTwo, int numberThree){ 
       
        if (numberOne <= 0){ 
            return -1;
        }
        if (numberTwo <= 0){ 
            return -1;
        }
        if (numberThree <= 0){ 
            return -1;
        }
 
        int addedNumber = numberOne + numberTwo + numberThree;
        int multipliedNumber = numberOne * numberTwo * numberThree;
        
        if ((addedNumber == 6) && (multipliedNumber == 6)){    
             return 1 ;
        }
        
    return -1;
    }
}
