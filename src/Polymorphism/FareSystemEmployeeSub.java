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
public class FareSystemEmployeeSub extends EmployeeSuper {
    
    private String Department;
    private String Designnation;
    private int Experience;
    public FareSystemEmployeeSub()
    {
        //even if you don't specify the default constructor is called 
        System.out.println(super.getSalary(100,100));
        System.out.println("Entered Sub Class");  

        
    }
    @Override
    public float getSalary(float value,float bonus)
    {
        float NewOldSalary=value*12+bonus+value;
        return NewOldSalary;
       
    }
    public float getTotalAnnualSalary(int Exp, float basic,float bonus,String TypeofSlab)
    {
         
         float temp=0;
        if(TypeofSlab=="New"){
        temp= getSalary(basic, bonus);
        temp= (temp)+(Exp*basic/12);
        }
        else if(TypeofSlab=="Old"){
        temp=super.getSalary(basic, bonus);
       
       temp= (temp)+(Exp*basic/12);
        }
       return temp;
    }
    
}
