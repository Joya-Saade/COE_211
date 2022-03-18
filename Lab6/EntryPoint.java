 
package lab6;

import java.util.Scanner;

public class EntryPoint {
   public static void main (String[] args) {
       String another="y";
    
    Scanner scan = new Scanner(System.in);
 while (another.equalsIgnoreCase("y"))
 {     
        System.out.println("Which service would you like to use?\n" +
"[1]: Basic week visualizer\n" +
"[2]: Advanced week visualizer\n" +
"[3]: Basic calculator\n" +
"[4]: Employee repertoire");
        
  
  int n= scan.nextInt();
 BasicWeek bw = new BasicWeek() ;
 String m=bw.PrintDays();
 AdvancedWeek aw = new AdvancedWeek();
 String s=aw.printDays();



  switch (n)
  {
      case 1:
      System.out.println(m);
            
      break;
      case 2:
      System.out.println(s);
      break;
      case 3:
      Calculator ca = new Calculator () ;
      System.out.println(ca);
      System.out.println();
      break;
      case 4 :
       Employee em = new Employee ()  ;
       System.out.println(em);
      break;
      default:
          System.out.println("Please make sure you pick a number between 1 and 4");
          
  }
  System.out.println("Would you like to perform another operation? (y/n)");
 another= scan.next();
 }  
  
       
    
}
}
