/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.IIOException;

/**
 *
 * @author hp
 */
public class BufferFileReader {
   public void FileReader1(String Location)throws FileNotFoundException, IOException{
 // try  {
      String Line;
        FileReader read = new FileReader(Location);
        if(read==null)
        {
            throw new  FileNotFoundException();
        }
        BufferedReader reader = new BufferedReader(read);
        while((Line=reader.readLine())!=null) 
        {
            
            // if we use read line again to print the it will call the method again so it is better to work with storing temp in a string
            System.out.println(Line);
        }
       
  //  }catch(Exception e)
//    {
//        System.out.println("Error is  "+e);
//    }
   }
}
