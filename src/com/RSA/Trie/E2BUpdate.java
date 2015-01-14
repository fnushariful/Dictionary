/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Trie;

/**
 *
 * @author Sabuz
 */

public class E2BUpdate {
    
    private E2BUpdate next[];
    private int index;
    
    public E2BUpdate(int n)
    {
        next = new E2BUpdate[205];
        index = n;
    }
    
    public void insertData(String str, int n)
    {
        int i,k,sz = str.length();;
        E2BUpdate cur = this;
        
           for(i=0; i<sz; i++)     
           {
               k = str.charAt(i);
               
                 if(cur.next[k] == null)
                     cur.next[k] = new E2BUpdate(n);
                 
                 cur = cur.next[k];
           }
        
    }
    
    public int searchData(String str)
    {
        int i,k,sz = str.length();
        E2BUpdate cur = this;
        
           for(i=0; i<sz; i++)     
           {
               k = str.charAt(i);
               
                 if(cur.next[k] == null)
                     return -1;
                 
                 cur = cur.next[k];
           }
        
        return cur.index;
        
    }
    
}
