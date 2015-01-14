/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Translate;

import com.RSA.dictionary.RSA_Dictionary;
import java.awt.Font;

/**
 *
 * @author Sabuz
 */
public class DictionaryDataSet implements ChangeDictionary{
    
    @Override
    public void B2E(RSA_Dictionary parent)
    {
        parent.setB2EDictionary();
        parent.lblSearch.setText("Enter Bangla Word");
        parent.txtSearch.setFont(new Font("SutonnyOMJ" , Font.PLAIN , 18));
    }
    
    @Override
    public void E2B(RSA_Dictionary parent)
    {
        parent.setE2BDictionary();
        parent.lblSearch.setText("Enter English Word");
        parent.txtSearch.setFont(new Font("Constantia" , Font.PLAIN , 18));
    }
    
}
