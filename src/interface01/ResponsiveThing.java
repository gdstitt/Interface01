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
public class ResponsiveThing implements Responsive {
    static final String[] FUNCTIONS = {
        "getName",
        "getFunctions"
    };
    
    /**
     * Returns an internal list of all functions implemented by this class and its superclasses
     * @return 
     */
    @Override
    public String[] getFunctions() {
        return FUNCTIONS;
    }
    
}
