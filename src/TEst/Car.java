/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TEst;

/**
 *
 * @author hp
 */
public class Car extends Vehicle {
    public  String tank="full";
    public void Acc(){
        tank= "empty";
        System.out.println("SWOOCH");
    }
    
}
