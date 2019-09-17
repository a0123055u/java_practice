/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StacksAndQues;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Stack {
    
    private int stackSize;
    private int[] Array;
    private int top;
    private boolean result;
    public Stack(int size)
    {
        this.stackSize=size;
        this.Array = new int [size];
        this.top=-1;
    }
    
    public boolean push(int a) throws Exception{
        if(checkIsFull()){
            result=false;
            return result;
        }
         this.Array[++top]=a;
         if(top!=-1){
             result =true;            
         }
            System.out.println("Added"+Array[top]);
            return result;       
         
    }
    public int pop(){
        if(checkIsEmpty()){
            
            return -1;
        }
       int entry= this.Array[top--];
       System.out.println("Removed"+entry);
        return entry;
    }
    public int peek(){
        
         System.out.println("Peek"+Array[top]);
         return Array[top];
    }
    
    public boolean checkIsFull(){
        return ((stackSize-1)==top );
    }
    
     public boolean checkIsEmpty(){
        return (top==-1 );
    }
    
}
