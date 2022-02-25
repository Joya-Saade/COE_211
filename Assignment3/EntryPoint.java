

import java.util.*;

public class EntryPoint{



public static void main(String[] args){
    int age;
String firstname, lastname;
double salary;
int n=0 , i1;
Random generator= new Random();
i1= generator.nextInt(10)+1;
while(n<i1){
System.out.println("You have "+ (i1-n++) + "insertions left")


Scanner scan = new Scanner(System.in);

System.out.println("Please input the employee's first name:");

firstname= scan.nextLine();


System.out.println("Please input the employee's last name:");
lastname= scan.nextLine();

System.out.println("Please input the employee's age:");
age= scan.nextInt();

System.out.println("Please input the employee's salary:");
salary= scan.nextDouble();


Employee e1= new Employee ( firstname, lastname, salary, age);
System.out.println("Employee information:"+ e1.getFirstName()+" "+ e1.getLastName()+", "+ e1.getAge()+ ", "+ e1.getSalary());
}
}
}