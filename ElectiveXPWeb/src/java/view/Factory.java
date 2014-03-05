/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import backend.DummyBackend;
import java.util.HashMap;
import electivexp.ElectiveManager;

/**
 *
 * @author Thomas
 */
public class Factory {
    private static Factory instance = null;
    
    private final HashMap<String, Command> commands = new HashMap<>();

    private ElectiveManager manager = new DummyBackend();
    
    public Factory() {
    }
    
    public static Factory getInstance(){
        if (instance == null) {
            instance = new Factory();
        }
         return instance;
    }
    
}
