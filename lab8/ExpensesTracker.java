import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExpensesTracker {
    public static void main(String[] args)  throws IOException{
      Scanner scan= new Scanner(System.in);
      File file1=new File("expenses.txt");
      FileWriter fw1=new FileWriter(file1,true);
      PrintWriter output=new PrintWriter(fw1);
      Scanner fileScan = new Scanner(file1);
      String name,purchase,answer, answer2;
      double payment;
      
            do{
           System.out.println("Input your name:");
           name=scan.nextLine();
           System.out.println("What did you purchase?");
           purchase=scan.nextLine();
           System.out.println("How much did you pay?");
           payment= scan.nextDouble();
           System.out.println();
           output.println(name+" purchased "+purchase+" for "+payment+" US Dollars.");
           System.out.println("Would you like to log another purchase? (y/n)");
           answer= scan.next();
           System.out.println();
       }while (answer.equalsIgnoreCase("y"));
        if(answer.equalsIgnoreCase("n"))
            System.out.println("Would you like to read a summary of your purchases?");
            answer2= scan.next();
             output.close();
             if(answer2.equalsIgnoreCase("y"))
                 
              while (fileScan.hasNext())
            System.out.println(" " + fileScan.nextLine());
        System.out.println();
     
      
    }
    
}
