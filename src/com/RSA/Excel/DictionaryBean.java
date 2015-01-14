/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Excel;

/**
 *
 * @author Sabuz
 */
public class DictionaryBean {
    
    String engword;
    String bangword;
    String partsofspeech;
    
    public void setEnglishWord(String engword)
    {
        this.engword=engword;
    }
    
    public void setBanglaWord(String bangword)
    {
        this.bangword=bangword;
    }
    
    public void setPartsOfSpeech(String partsofspeech)
    {
        this.partsofspeech=partsofspeech;
    }
    
    public String getEnglishWord()
    {
        return engword;
    }
    
    public String getBanglaword()
    {
        return bangword;
    }
    
    public String getPartsOfSpeech()
    {
        return partsofspeech;
    }
    
}
