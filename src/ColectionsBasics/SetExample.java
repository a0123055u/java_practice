/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColectionsBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author hp
 */
public class SetExample {
    
    public void setValueHashSet(Collection<Integer>  a)
    {
        int Value;
        Set<Integer> S1=new HashSet<Integer>();
        //Collection<Integer> S1= new HasSet<Integer>();//Collection is the super class of all 
        
            S1.addAll(a);
        
        for (Iterator<Integer> I1=S1.iterator();I1.hasNext();)
        {
//            if(I1.hasNext()!=false)
            System.out.println("Vaues using HashSet"+I1.next());
            
            
        }
        System.out.println(S1);
    }
    public void SetValueSortedTreeSet(Collection<Integer> a)
    {
        Set<Integer> S2 =new TreeSet<Integer>();
         //Collection<Integer> S2= new TreeSet<Integer>();
        S2.addAll(a);
        
        for(Iterator<Integer>I2=S2.iterator();I2.hasNext();)
        {
//            if(I2.hasNext())
//                    {
                        System.out.println("Values now sorted using TreeSet"+I2.next());
//                    }
            
            
        }
        System.out.println(S2);
    }
    public void setArrayList(ArrayList<String> a)
    {
        List<String> L1= new ArrayList<String>();
        
        L1.addAll(a);
        for(Iterator<String> I3=L1.iterator();I3.hasNext();)
        {
            System.out.println("String values"+I3.next());
        }
        System.out.println(L1);
        
        
    }
    public void setLinkedList(LinkedList<String> L1)
    {
        List<String> L2 = new LinkedList<String>();
        L2.addAll(L2);
        L2.remove(0);
         for(Iterator<String> I3=L1.iterator();I3.hasNext();)
        {
            System.out.println("String values"+I3.next());
        }
        System.out.println(L1);
    }
    public void setHashMap(int[] a, String[] b)
    {
        int Check;
        if(a.length<b.length)
        {
            Check=a.length;
        }
        else 
            Check=b.length;
         HashMap<Integer,String> HH1=new HashMap<>();
        for(int i=0;i<Check;i++)
        {
          if(b[i]!= null)
          {
              HH1.put(a[i], b[i]);
               String aa1= HH1.get(a[i]);
               System.out.println(aa1);
          }
            
        }
       
        
       // System.out.println(HH1.containsKey(1));
      
        System.out.println(HH1.size());
    }
    public void setTreeMap(int[] a,String[] b)
    {
        TreeMap<Integer,String> TM1=new TreeMap<>();
        long val1time=System.currentTimeMillis();
        System.out.println(val1time);
        int Check;
        if(a.length<b.length)
        {
            Check=a.length;
        }
        else 
            Check=b.length;
         
        for(int i=0;i<Check;i++)
        {
          if(b[i]!= null)
          {
              TM1.put(a[i], b[i]);
               
          }
            
        }
        for(int i=0;i<Check;i++)
        {
            System.out.println("Values"+TM1.get(a[i]));
        }
         System.out.println(System.currentTimeMillis()-val1time);
    }
    public  void setList(List<String> a){
        for(Iterator<String>s = a.iterator();s.hasNext();){
           
                System.out.println(s.next());
            
        
    }{
            
        }
    }
}
