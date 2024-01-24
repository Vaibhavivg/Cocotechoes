// Online Java Compiler
// Use this editor to write, compile and run your Java code online
    
import java.util.Scanner;



public class EmployeeRecords {

    public static void main(String[] args) {
        // Number of employees
        int numEmployees = 100;

        // Create an array to store employee records
        Employee[] employees = new Employee[numEmployees];

        // Generate and populate employee records
        generateEmployeeRecords(employees);

        // Display employee records
        displayEmployeeRecords(employees);
    }

    // Employee class to store individual records
    static class Employee {
        String name;
        double[] commissions;

        Employee(String name, double[] commissions) {
            this.name = name;
            this.commissions = commissions;
        }
    }

    // Method to generate and populate employee records
    private static void generateEmployeeRecords(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            String name = "Employee" + (i + 1);
            double[] commissions = generateCommissionArray(); // Use your logic to set commission values
            employees[i] = new Employee(name, commissions);
        }
    }

    // Method to generate an array of commission values
    private static double[] generateCommissionArray() {
        // Use your logic to set commission values for each month
        double[] commissions = {1500, 2000, 1800, 2500, 3000, 2200, 4000, 3500, 2800, 2000, 3200, 1800};
        return commissions;
    }

    // Method to display employee records
    private static void displayEmployeeRecords(Employee[] employees) {
        System.out.println("Employee Records:");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.name);
            System.out.println();
            
      int n;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of commissions in a year");
      n=sc.nextInt();
      int[] array= new int[12];
      System.out.println("Enter the elements in array");
      
      for(int i=0; i<n;i++){
          array[i]=sc.nextInt();
      }
      System.out.println("Following are the array elements");
       for(int i=0; i<n;i++){
           System.out.println(array[i]);
       }
       
       // getting array length
        int length = array.length;
 
        // default sium value.
        int sum = 0;
 
        // sum of all values in array using for loop
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
 
        double average = sum / length;
 
        System.out.println("Average of  : " + employee.name +" " + average);
        }
    }
}
