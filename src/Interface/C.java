/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author hp
 */
public class C implements A,B{
    
    
    String Value;
    public void setA(String a)
    {
        Value=a;
    }
    
    public String getA()
    {
        return Value;
    }
    
}
