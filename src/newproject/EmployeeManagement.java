package newproject;

import java.util.Scanner;


public class EmployeeManagement {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        char a;
			do {
	        System.out.println("Company: Siram");
	        System.out.println("Branch: Pune");


	        System.out.println("\nEnter Full-Time Employee Details:");
	        System.out.print("Name: ");
	        String ftName = sc.nextLine();
	        System.out.print("Employee ID: ");
	        String ftID = sc.nextLine();
	        System.out.print("Age: ");
	        int ftAge = sc.nextInt();
	        sc.nextLine(); 
	        System.out.print("Working Role: ");
	        String ftRole = sc.nextLine();
	        System.out.print("Salary: ");
	        double ftSalary = sc.nextDouble();
	        sc.nextLine(); 

	        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(ftName, ftID, ftAge, ftRole, ftSalary);

	        
	        System.out.println("\nEnter Part-Time Employee Details:");
	        System.out.print("Name: ");
	        String ptName = sc.nextLine();
	        System.out.print("Employee ID: ");
	        String ptID = sc.nextLine();
	        System.out.print("Age: ");
	        int ptAge = sc.nextInt();
	        System.out.print("Working Hours per Day: ");
	        String ptHours = sc.nextLine();
	        sc.nextLine();
	        System.out.print("In Time: ");
	        String inTime = sc.nextLine();
	        System.out.print("Out Time: ");
	        String outTime = sc.nextLine();
	        System.out.print("Working Role: ");
	        String ptRole = sc.nextLine();

	        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(ptName, ptID, ptAge, ptRole, ptHours, inTime, outTime);

	        fullTimeEmployee.displayDetails();
	        partTimeEmployee.displayDetails();

	        sc.nextLine();
	        System.out.println("add one more y/n");
	         a=sc.next().charAt(0);
				
			} while (a =='y');
	  

	    }
	}


