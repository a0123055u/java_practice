/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractAndInhertance;

/**
 *
 * @author hp
 */
public abstract class Ashapes {
    protected String[] name=new String[10];
    protected int Count=0;
    
    public String[] getAShapes()
    {
        return name;
    }
    
    public abstract void setAshapes(String shape);
    
}
