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
public class MergeSort {
    
    int[] Array1;
     int[] Temp;
    public int[] MergeSort(int[] b)
    {
        Array1=b;
        int Length=b.length;
        Temp= new int[Length];
        Split(0,Length-1);
        
        
       return Temp;
    }
    private void Split(int lower,int higher)
        {
            if(lower<higher){
            int middle= lower+(higher-lower)/2;
            Split(lower,middle);
            Split(middle+1, higher);
            DoMerge(lower, middle, higher);
            }
            
        }
    private void DoMerge(int lower,int middle,int higher)
    {
        for(int i=lower;i<higher;i++)
        {
            Temp[i]=Array1[i];
        }
        int i=lower;
       int j=middle+1;
       int k=lower;
        while(i<=middle&&j<=higher)
        {
            if(Array1[i]<Array1[j])
            {
                Temp[k]=Array1[i];
                i++;
            }
            else
            {
                Temp[k]=Array1[j];
                j++;
            }
            k++;
            while(i<=j)
            {
                Temp[k]=Array1[i];
                i++;
                k++;
            }
        }
        
    }
}
