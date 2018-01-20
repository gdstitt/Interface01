/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface01;

/**
 *
 * @author Greg
 */
public interface Responsive {
    //Constant declarations
    
    //Default method
    
    //Static methods
    public static String getName() {    //cannot override static toString() in Object with static here
        return "Responsive";
    }
    
    /*
    public static String toString() {
        return "Responsive";
    }
*/
    
    //Abstract method signatures
    public String[] getFunctions();
    
}
