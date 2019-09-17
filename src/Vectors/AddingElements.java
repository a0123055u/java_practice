/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vectors;

import java.util.Vector;

/**
 *
 * @author hp
 */
public class AddingElements 
{
    public void VectorTest()
    {
    Vector  v =new Vector(3,3);
    System.out.println("Size"+v.size());
     System.out.println("Capacity"+v.capacity());
     v.addElement(new Integer(2));
     v.addElement(new Integer(3));
     v.addElement(new Integer(6));
     v.addElement(new Integer(4));
      v.addElement(new Integer(41));
       v.addElement(new Integer(42));
        v.addElement(new Integer(43));
        //removing using indexing
        v.remove(3);
        //removing using object
        v.remove(new Integer(41));
       boolean c= v.contains(41);
        System.out.println(c);
        
      System.out.println("Size"+v.size());
     System.out.println("Capacity"+v.capacity());
     
    }
}
