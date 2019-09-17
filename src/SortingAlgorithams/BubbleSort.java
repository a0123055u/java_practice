/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortingAlgorithams;

/**
 *
 * @author hp
 */
public class BubbleSort {
    
    
    public int[] BubbleSort(int[] a)
    {
        int LengthofArray=a.length;
        LengthofArray--;
        for(int i=0;i<LengthofArray;i++)
        {
            for(int j=0;j<LengthofArray;j++)
            {
                if(a[i]<a[j])
                {
                    
                }
                else
                {
                    int Temp=a[i];
                    a[i]=a[j];
                    a[j]=Temp;
                }
            }
        }
        return a;
        
    }
    
}
