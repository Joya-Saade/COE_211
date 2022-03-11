
package lab6;


    import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = scanCalc.nextInt();
        System.out.println("Insert the operator:");
        String s= scanCalc.next();
        System.out.print("Input the second number: ");
        int num2 = scanCalc.nextInt();
        scanCalc.close();
      switch (s)
              {
                  case "+" :
                  System.out.println(num1+s+num2+"="+add(num1,num2));
                  break;
                  case "-":
                  System.out.println(num1+s+num2+"="+subtract(num1,num2));    
                  break;
                  case "/":
                  System.out.println(num1+s+num2+"="+multiply(num1,num2));
                  break;
                  case "*":
                  System.out.println(num1+s+num2+"="+divide(num1,num2));
              }
    }

    public String add(int a, int b) {
        int result = num1+num2;
return num1 + "+" + num2 + "=" + result;
    }

    public String subtract(int a, int b) {
       int result = num1-num2;
return num1 + "-" + num2 + "=" + result;
    }

    public String multiply(int a, int b) {
       int result = num1*num2;
return num1 + "*" + num2 + "=" + result;

    }

    public String divide(int a, int b) {
       if(a%b == 0) {
return( a + "/" + b + "=" + (a/b) );
} else {
double e = a/(double)b;
return( a + "/" + b + "=" + (a/(double)b) );
    }
    }
}

