/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author hp
 */
public class Thread2 extends Thread {
    public static int Value=0;
    public void run()
    {
        
        synchronized(this){
        for(int i=0;i<=150;i++)
        {
            Value=i+Value;
            //System.out.println(i);
        }
        }
        System.out.println("Notifying the calling method from Thread2 Class");
        this.notifyAll();
        
    }
    
}
