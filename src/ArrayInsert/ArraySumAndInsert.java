/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayInsert;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author hp
 */
public class ArraySumAndInsert {
    
    public int sumAndDercremnt(int[] a){
        int sum=0;
        Integer index=0;
        Queue que= new LinkedList();
       ArrayList<Integer> aa = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            que.add(a);
            aa.add(a[i]);
            sum+=a[i];
           
        }
        int z=2;
        for(int j=0;j<a.length/2;j++){
             for(int i=0;i<z;i++){
                 index+=aa.get(i);
           aa.remove(i);
          
        }
              aa.add(index);
             //z--;
            
        }
       for(Integer y:aa){
            System.out.println(y);
            
       }
       
        
       
        return index+sum;
    }
    
}
