/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Excel;

import java.util.List;

/**
 *
 * @author Sabuz
 */
public interface ExcelConnection {
    
    public List<DictionaryBean> getAllData();
    public void saveData(DictionaryBean db, int position);
    
}
