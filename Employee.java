/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;
import java.util.Scanner;
public class Employee {

private String firstName;
private String lastName;
private double salary;
private int age;

public Employee(String newFirstName, String newLastName, double newSalary, int newAge){

firstName= newFirstName;
lastName= newLastName;
salary= newSalary;
age= newAge;

 }
   
 public int getAge(){
        return age;
    }
 public String getFirstName(){
        return firstName;
    }
 public String getLastName(){
        return lastName;
    
    }
 public double getSalary(){
        return salary;
 }
    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);
System.out.println("Please input the employee's first name:");

firstName= scan.nextLine();


System.out.println("Please input the employee's last name:");
lastName= scan.nextLine();

System.out.println("Please input the employee's age:");
age= scan.nextInt();

System.out.println("Please input the employee's salary:");
salary= scan.nextDouble();


Employee e1= new Employee ( firstName, lastName, salary, age);
System.out.println("Employee information:"+ e1.getFirstName()+" "+ e1.getLastName()+", "+ e1.getAge()+ ", "+ e1.getSalary());

    }

}
   

