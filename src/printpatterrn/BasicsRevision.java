/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printpatterrn;

/**
 *
 * @author hp
 */
public class BasicsRevision {
    public void BasicRevision()
    {
        System.out.println("The default constructor is called first");
        System.out.println("I am going to call other two constructor from default constuctors ...ref val is 10");
        this.BasicRevision(10);
        this.BasicRevision(10, 10);
    }
    
    public void BasicRevision(int a)
    {
        System.out.println("you have passed value thorough constructor1"+"\t"+a);
    }
    public void BasicRevision(int a,int b)
    {
        //c# will have flexiblity to call the other constructor where it is declared...here we have it inside the constructor....we use this to invoke related objects
        System.out.println("I am going call the constructor2 with one arguments twise from constructor 3");
        this.BasicRevision(a);
        this.BasicRevision(b);
        System.out.println("you have passed 2 values through constructor2 "+"\t"+a+"\t"+b);
    }
    
    
    //revision of getterrs and setters
    //go to refator encapsulate fields will provide the getters and setters
    
    private int a,b;

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
        //you can pass value to overide constructors any time
        System.out.println(a);
        this.BasicRevision(a);
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }
    public static void PrintValue(int a)
    {
        System.out.println("Value printed using static method "+a);
    }
   
}
 