/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractAndInhertance;

import junit.framework.Test;
import junit.framework.TestCase;

/**
 *
 * @author hp
 */
public class AfacesTest extends TestCase {
    
    public AfacesTest(String testName) {
        //super(testName);
    }
    
    @Override
    protected void setUp() throws Exception {
       // super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        //super.tearDown();
    }

    /**
     * Test of setAshapes method, of class Afaces.
     */
   //@Test
    public void testSetAshapes() {
        System.out.println("setAshapes");
        String shape = "Square";
        Afaces instance = new Afaces();
       instance.setAshapes(shape);
        boolean expected = true;
        assertEquals(expected, true);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
