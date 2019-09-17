/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author hp
 */
public class EmployeeSuper {
    private String EmpId;
    private String Name;
    private float Salary;
    public EmployeeSuper(){
        System.out.println("Entered");
    }
    
    public float getSalary(float amount,float bonus)
    {
        Salary=(amount*12)+bonus;
        return Salary;
    }    
}
