/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andreas
 */
public class statistikTest {
    
    String filename;
    String filename2;
    Statistik myStat;
    
    @Before
    public void setUp() {
        /*
        1. Vesuvio: tomatsauce, ost, skinke og oregano 57,-
        2. Amerikaner: tomatsauce, ost, oksefars og oregano 53,-
        3. Cacciatore: tomatsauce, ost, pepperoni og oregano 57,-
        */
        filename = "Data/allOrders.txt";
        filename2 = "Data/Statistiks.txt";
        myStat = new Statistik();        
        // Lav ny fil statistik
        // Find pizza hyppigheden
        // Orderhandler
        
    }

    @Test
    public void testcomputeFrequency() throws FileNotFoundException, IOException {
        int expected = 3;
        int actual = St
        
        assertEquals(expected, actual);
        /*
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String allOrders = null;
        while ((allOrders = br.readLine()) != null) {
            System.out.println(allOrders);
        }
        }
        assertEquals;
        */
    }
    
    
}
