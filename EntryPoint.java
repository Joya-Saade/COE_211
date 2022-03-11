 
package lab6;

import java.util.Scanner;
public class EntryPoint {
   public static void main (String[] args) {
        System.out.println("Which service would you like to use?\n" +
"[1]: Basic week visualizer\n" +
"[2]: Advanced week visualizer\n" +
"[3]: Basic calculator\n" +
"[4]: Employee repertoire");
        
  Scanner scan= new Scanner(System.in);
  int y= scan.nextInt();
 BasicWeek bw = new BasicWeek() ;
 
 AdvancedWeek aw = new AdvancedWeek();
 

 

  switch (y)
  {
      case 1:
      System.out.println(bw);
            
      break;
      case 2:
      System.out.println(aw);
      break;
      case 3:
      Calculator ca = new Calculator () ;
      System.out.println(ca);
      break;
      case 4 :
      Employee em = new Employee ()  ;
       System.out.println(em);
      break;
      default:
          System.out.println("Please make sure you pick a number between 1 and 4");

  }
}
}
    