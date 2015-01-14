/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.RSA.Trie;

/**
 *
 * @author Sabuz
 */
public class B2EUpdate {
    
    private B2EUpdate next[];
    private int index;
    
    public B2EUpdate(int n)
    {
        next = new B2EUpdate[3005];
        index = n;
    }
    
    public void insertData(String str, int n)
    {
        int i,k,sz = str.length();;
        B2EUpdate cur = this;
        
           for(i=0; i<sz; i++)     
           {
               k = str.charAt(i);
               
                 if(cur.next[k] == null)
                     cur.next[k] = new B2EUpdate(n);
                 
                 cur = cur.next[k];
           }
        
    }
    
    public int searchData(String str)
    {
        int i,k,sz = str.length();;
        B2EUpdate cur = this;
        
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
