/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpatterrn;

import java.util.StringTokenizer;

/**
 *
 * @author hp
 */
public class CheckingString {
    
    public void Operation1(String a)
    {
       char check= a.charAt(3);
       if(a.contentEquals("Thiruvalluvan"))
       {
           System.out.println("passed the contentEqualMethod");
       }
           StringTokenizer st = new StringTokenizer("test test test");
          int NoofToken= st.countTokens();
          while(st.hasMoreTokens())
          {
              System.out.println(st.nextToken());
          }
                         
          System.out.println("Printing tokens in a String(test test test) "+NoofToken);
       
       
        System.out.println("Printing char fuctions"+ check);
    }
    
}
