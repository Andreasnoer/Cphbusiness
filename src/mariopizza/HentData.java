package mariopizza; 
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HentData {
    public char menuKort() throws FileNotFoundException {
       char Retry = 'y';
        Scanner in = new Scanner(System.in);
         System.out.println("Menukort?: y/n");
       while(Retry != 'n'){ 
         Retry = in.next().charAt(0);
       if (Retry == 'y'){
          String menu = in.nextLine();
          String filename = "Data/PizzaMenukort.csv";
         ImportFromFile.importPizzaNames(filename);
         System.out.println("Menukort?: y/n");     
     } else if (Retry == 'y'){
         assert true;
    }     
  }
        return 0;
}
}