/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpatterrn;

import java.util.Arrays;

/**
 *
 * @author hp
 */
public class ArrayBasics {
     String[] a ={"are","you","ready","now"};
    public void ArrayMethods()
    {
        //String[] a ={"are","you","ready","now"};
       
        for(String temp:a)
        {
            System.out.println(temp);
        }
    }

    public void extendedArraySize(String[] a) {
      
       
        String[] a1;
      //  a1= new String[15];
         //extended the size of a to 15
          a1=Arrays.copyOf(a,15);
          for(String temp:a1)
        {
            System.out.println(temp);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
