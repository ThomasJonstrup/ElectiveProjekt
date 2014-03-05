/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.HashMap;

/**
 *
 * @author Thomas
 */
public class Factory {
    private static Factory instance = null;
    
    private final HashMap<String, Command> commands = new HashMap<>();

    
            
            
    public Factory() {
    }
    
    
}
