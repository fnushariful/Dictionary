/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Table;

import com.RSA.Excel.DictionaryBean;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Sabuz
 */
public class TableSet implements SortTable{
    
    
    
    @Override
    public Object[][] getE2BRow(List<DictionaryBean> db)
    {
        int i,sz;
        
        sz = db.size();
        Object e2b[][] = new Object[sz][3];
        DictionaryBean dc = new DictionaryBean();
        
        for(i=0;i<sz;i++)
        {
            dc = db.get(i);
            e2b[i][0] = dc.getEnglishWord();
            e2b[i][1] = dc.getBanglaword();
            e2b[i][2] = dc.getPartsOfSpeech();
        }
        
       return e2b = sortData(e2b);
    }
    
    @Override
    public Object[][] getB2ERow(List<DictionaryBean> db)
    {
        int i,sz;
        
        sz = db.size();
        Object b2e[][] = new Object[sz][3];
        DictionaryBean dc = new DictionaryBean();
        
        for(i=0;i<sz;i++)
        {
            dc = db.get(i);
            b2e[i][0] = dc.getBanglaword();
            b2e[i][1] = dc.getEnglishWord();
            b2e[i][2] = Change_POS(dc.getPartsOfSpeech());
        }
       
       return b2e = sortData(b2e);
    }
    
    @Override
    public Object[] getE2BColumn()
    {
        Object e2b[] = new Object [3];
        
        e2b[0] = "English Word";
        e2b[1] = "Bangla Word";
        e2b[2] = "Parts Of Speech";
        
       return e2b;
    }
    
    @Override
    public Object[] getB2EColumn()
    {
        Object b2e[] = new Object[3];
        
        b2e[0] = "Bangla Word";
        b2e[1] = "English Word";
        b2e[2] = "Parts Of Speech";
        
      return b2e;
    }
    
    
    private Object[][] sortData(Object dc[][])
    {
        Arrays.sort(dc, new Comparator<Object []>(){
    
        @Override
        public int compare(Object a[], Object b[])
        {
            String x = (String) a[0];
            String y = (String) b[0];
            
           return x.compareToIgnoreCase(y);
        }
    
        });
        
        
        return dc;
    }
    
    private String Change_POS(String str)
    {
        if(str.compareToIgnoreCase("Noun")==0)
            return "বিশেষ্য";
        else if(str.compareToIgnoreCase("Pronoun")==0)
            return "সর্বনাম";
        else if(str.compareToIgnoreCase("Adjective")==0)
            return "বিশেষন";
        else if(str.compareToIgnoreCase("Verb")==0)
            return "ক্রিয়া";
        else
            return "অব্যয়";
           
    }
    
    
    
}
