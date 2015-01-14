/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Table;

import com.RSA.Excel.DictionaryBean;
import java.util.List;

/**
 *
 * @author Sabuz
 */
public interface SortTable {
    
    public Object[][] getE2BRow(List<DictionaryBean> db);
    public Object[][] getB2ERow(List<DictionaryBean> db);
    
    public Object[] getE2BColumn();
    public Object[] getB2EColumn();
    
    
}
