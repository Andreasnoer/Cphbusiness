
package app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ImportFromFile {
    
    public static boolean importPizzaPopularity(String filename) throws MyException{
        boolean retVal = false;
        /*
        1, 1. Vesuvio: tomatsauce, ost, skinke og oregano, 57, 2019-10-22, 10:02
        1, 2. Amerikaner: tomatsauce, ost, oksefars og oregano, 53, 2019-10-22, 10:02
        1, 3. Cacciatore: tomatsauce, ost, pepperoni og oregano, 57, 2019-10-22, 10:02
        2, 3. Cacciatore: tomatsauce, ost, pepperoni og oregano, 57, 2019-10-23, 13:14
        */
        FileReader fr = null;
        String line = "";
        String test = "";
        
        File file = new File(filename);
        try {
            fr = new FileReader(file);
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        try {
            BufferedReader bw = new BufferedReader(fr);
            // Læse en linje ad gangen:
            while ((line = bw.readLine()) != null){
                System.out.println("Line: " + line);
                String[] myArr = line.split(",");
                // rarity er hvor ofte navnet bliver brugt, fx Bella = 110
                int rarity = Integer.parseInt(myArr[1]);
                if (rarity <100){
                    throw new MyException("");
                }
            }
        } catch (Exception e){
                System.out.println("Error: " + e.toString());
        }
        
        return retVal;
        
    }
}
