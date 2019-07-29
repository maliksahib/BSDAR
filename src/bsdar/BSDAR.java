/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
package bsdar;

import GraphicalUserInterface.BSDARMainFrame;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Administrator
 */
public class BSDAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                
                    try {
                    try {
                        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName().toString());
                    } catch (InstantiationException ex) {
                        Logger.getLogger(BSDAR.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IllegalAccessException ex) {
                        Logger.getLogger(BSDAR.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (UnsupportedLookAndFeelException ex) {
                        Logger.getLogger(BSDAR.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(BSDAR.class.getName()).log(Level.SEVERE, null, ex);
                    } 
                } 
                
            
        });
        
         java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new BSDARMainFrame().setVisible(true);
            }
        });
        
    }
}
