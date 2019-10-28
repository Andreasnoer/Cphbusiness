/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author miade
 */
public class ImportFromFileTest {
    
    public ImportFromFileTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of importPizzaPopularity method, of class ImportFromFile.
     */
    @Test
    public void testImportPizzaPopularity() throws Exception {
        System.out.println("importPizzaPopularity");
        String filename = "";
        boolean expResult = false;
        boolean result = ImportFromFile.importPizzaPopularity(filename);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
