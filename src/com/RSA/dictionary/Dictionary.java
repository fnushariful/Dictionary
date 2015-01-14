/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.dictionary;

/**
 *
 * @author Sabuz
 */
public class Dictionary {
    
    
    public static void main(String[] args) {
        
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    new RSA_Dictionary().setVisible(true);
                    break;
                }
            }
        } catch (Exception ex) {
            
        } 
        
    }
}
